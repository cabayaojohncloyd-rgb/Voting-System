import java.sql.*;
import java.util.ArrayList;

/**
 * Database-backed data layer.
 * Replaces all static ArrayLists and HashMaps with MySQL queries via XAMPP.
 */
public class ElectionData {

    // ------------------------------------------------------------------ //
    //  VOTERS                                                              //
    // ------------------------------------------------------------------ //

    public static boolean voterExists(String voterID) {
        String sql = "SELECT id FROM voters WHERE voter_id = ?";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, voterID);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) { e.printStackTrace(); return false; }
    }

    public static boolean loginVoter(String username, String voterID, String password) {
        String sql = "SELECT id FROM voters WHERE username=? AND voter_id=? AND password=?";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, voterID);
            ps.setString(3, password);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) { e.printStackTrace(); return false; }
    }

    public static boolean registerVoter(String fullName, String voterID, String password, int age, String sex) {
        if (voterExists(voterID)) return false;
        String sql = "INSERT INTO voters (full_name, voter_id, username, password, age, sex) VALUES (?,?,?,?,?,?)";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, fullName);
            ps.setString(2, voterID);
            ps.setString(3, fullName);   // username = full name (same as original)
            ps.setString(4, password);
            ps.setInt(5, age);
            ps.setString(6, sex);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) { e.printStackTrace(); return false; }
    }

    /** Returns list of "Username: X\nPassword: Y\n---" strings for admin panel */
    public static String getAllVotersText() {
        StringBuilder sb = new StringBuilder();
        String sql = "SELECT username, password, voter_id FROM voters ORDER BY id";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                sb.append("Username: ").append(rs.getString("username")).append("\n");
                sb.append("Voter ID: ").append(rs.getString("voter_id")).append("\n");
                sb.append("Password: ").append(rs.getString("password")).append("\n");
                sb.append("----------------------\n");
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return sb.toString();
    }

    // ------------------------------------------------------------------ //
    //  CANDIDATES                                                          //
    // ------------------------------------------------------------------ //

    public static ArrayList<String> getCandidates(String position) {
        ArrayList<String> list = new ArrayList<>();
        String sql = "SELECT name FROM candidates WHERE position=? ORDER BY id";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, position);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) list.add(rs.getString("name"));
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }

    public static boolean addCandidate(String position, String name) {
        String sql = "INSERT INTO candidates (position, name, votes) VALUES (?,?,0)";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, position);
            ps.setString(2, name);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) { e.printStackTrace(); return false; }
    }
    
    public static boolean candidateExists(String position,String name) {

        String sql =
            "SELECT id FROM candidates " +
            "WHERE position = ? " +
            "AND LOWER(TRIM(name)) = LOWER(TRIM(?))";

        try (Connection c = DatabaseConnection.getConnection();
            PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, position);
            ps.setString(2, name);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException e) {

            e.printStackTrace();
            return false;
        }
    }

    public static boolean updateCandidate(String oldPosition, String oldName, String newPosition, String newName) {
        // preserve existing vote count
        int votes = getVotes(oldPosition, oldName);
        String del = "DELETE FROM candidates WHERE position=? AND name=?";
        String ins = "INSERT INTO candidates (position, name, votes) VALUES (?,?,?)";
        try (Connection c = DatabaseConnection.getConnection()) {
            try (PreparedStatement ps = c.prepareStatement(del)) {
                ps.setString(1, oldPosition); ps.setString(2, oldName);
                ps.executeUpdate();
            }
            try (PreparedStatement ps = c.prepareStatement(ins)) {
                ps.setString(1, newPosition); ps.setString(2, newName); ps.setInt(3, votes);
                ps.executeUpdate();
            }
            return true;
        } catch (SQLException e) { e.printStackTrace(); return false; }
    }

    public static boolean deleteCandidate(String position, String name) {
        String sql = "DELETE FROM candidates WHERE position=? AND name=?";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, position); ps.setString(2, name);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) { e.printStackTrace(); return false; }
    }

    // ------------------------------------------------------------------ //
    //  VOTING                                                              //
    // ------------------------------------------------------------------ //

    public static boolean hasVoted(String voterName) {
        String sql = "SELECT id FROM votes WHERE voter_name=?";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, voterName);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException e) { e.printStackTrace(); return false; }
    }

    public static boolean submitVote(String voterName, String president, String vicePresident,
                                     String secretary, String treasurer, String auditor, String pio) {
        String insVote = "INSERT INTO votes (voter_name, president_vote, vp_vote, secretary_vote, treasurer_vote, auditor_vote, pio_vote) VALUES (?,?,?,?,?,?,?)";
        String updVote = "UPDATE candidates SET votes = votes + 1 WHERE position=? AND name=?";
        try (Connection c = DatabaseConnection.getConnection()) {
            c.setAutoCommit(false);
            try (PreparedStatement ps = c.prepareStatement(insVote)) {
                ps.setString(1, voterName);
                ps.setString(2, president);
                ps.setString(3, vicePresident);
                ps.setString(4, secretary);
                ps.setString(5, treasurer);
                ps.setString(6, auditor);
                ps.setString(7, pio);
                ps.executeUpdate();
            }
            String[][] pairs = {
                {"President", president},
                {"Vice President", vicePresident},
                {"Secretary", secretary},
                {"Treasurer", treasurer},
                {"Auditor", auditor},
                {"PIO", pio}
            };
            try (PreparedStatement ps = c.prepareStatement(updVote)) {
                for (String[] p : pairs) {
                    ps.setString(1, p[0]); ps.setString(2, p[1]);
                    ps.executeUpdate();
                }
            }
            c.commit();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // ------------------------------------------------------------------ //
    //  RESULTS                                                             //
    // ------------------------------------------------------------------ //

    public static int getVotes(String position, String name) {
        String sql = "SELECT votes FROM candidates WHERE position=? AND name=?";
        try (Connection c = DatabaseConnection.getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, position); ps.setString(2, name);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getInt("votes");
        } catch (SQLException e) { e.printStackTrace(); }
        return 0;
    }

    // ------------------------------------------------------------------ //
    //  RESET ELECTION                                                      //
    // ------------------------------------------------------------------ //

    public static void resetElection() {
        try (Connection c = DatabaseConnection.getConnection();
             Statement st = c.createStatement()) {
            st.executeUpdate("UPDATE candidates SET votes = 0");
            st.executeUpdate("DELETE FROM votes");
        } catch (SQLException e) { e.printStackTrace(); }
    }

    // ------------------------------------------------------------------ //
    //  ADMIN LOGIN (hardcoded like original, but could be DB-backed)      //
    // ------------------------------------------------------------------ //

    public static final String adminUsername = "admin";
    public static final String adminPassword = "admin";
}
