import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class CandidateFrame extends javax.swing.JFrame {

    String selectedOldName     = "";
    String selectedOldPosition = "";
    boolean selectingFromList  = false;

    public CandidateFrame() {
        initComponents();
    }

    private void loadCandidates() {
        DefaultListModel model = new DefaultListModel();
        String position = cmbPosition.getSelectedItem().toString();
        ArrayList<String> list = ElectionData.getCandidates(position);
        
        for (String c : list) {
            model.addElement(position + " - " + c);
        }
        listCandidates.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        txtCandidate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmbPosition = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listCandidates = new javax.swing.JList();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnCandidate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnUseracc = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Add.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        txtCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCandidateActionPerformed(evt);
            }
        });
        txtCandidate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCandidateKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("Candidate:");

        cmbPosition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "President", "Vice President", "Secretary", "Treasurer", "Auditor", "PIO" }));
        cmbPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPositionActionPerformecmbPosition(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setText("Positions:");

        listCandidates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listCandidatesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listCandidates);

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setText("List of Candidates:");

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_111111111111 last vote stamp 128.jpg"))); // NOI18N

        btnCandidate.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnCandidate.setText("ADD CANDIDATE");
        btnCandidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCandidateActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnReset.setText("RESET ELECTION");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnResult.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnResult.setText("RESULT");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADMIN");

        btnUseracc.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnUseracc.setText("USER ACCOUNTS");
        btnUseracc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUseraccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(61, 61, 61))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnReset)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCandidate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUseracc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnUseracc)
                .addGap(18, 18, 18)
                .addComponent(btnCandidate)
                .addGap(18, 18, 18)
                .addComponent(btnResult)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addGap(18, 18, 18)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel5.setText("ADD CANDIDATE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jScrollPane2))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addComponent(txtCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel3)
                                        .addComponent(cmbPosition, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(41, 41, 41)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jLabel2))
                        .addContainerGap(129, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(152, 152, 152))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCandidate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Delete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        if (selectedOldName.isEmpty()) { JOptionPane.showMessageDialog(this, "Select a candidate first."); 
        return;
        }
        
        String newName     = txtCandidate.getText().trim();
        String newPosition = cmbPosition.getSelectedItem().toString();
        
        if (newName.isEmpty()) { JOptionPane.showMessageDialog(this, "Enter candidate name."); 
        return;
        }
        
        ElectionData.updateCandidate(selectedOldPosition, selectedOldName, newPosition, newName);
        selectedOldName = ""; selectedOldPosition = "";
        loadCandidates();
        txtCandidate.setText("");
        JOptionPane.showMessageDialog(this, "Candidate Updated!");
    }//GEN-LAST:event_EditActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        String candidate = txtCandidate.getText().trim();
        String position  = cmbPosition.getSelectedItem().toString();
        if (candidate.isEmpty()) { JOptionPane.showMessageDialog(this, "Enter candidate name."); return; }
        
        if (ElectionData.candidateExists(position, candidate)) {

        JOptionPane.showMessageDialog(this, "Candidate already exists in this position.");
            return;
        }

        ElectionData.addCandidate(position, candidate);

        JOptionPane.showMessageDialog(this, position + " Candidate Added!");
        loadCandidates();
        txtCandidate.setText("");
    }//GEN-LAST:event_AddActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if (selectedOldName.isEmpty()) { JOptionPane.showMessageDialog(this, "Select a candidate first."); return; }
        ElectionData.deleteCandidate(selectedOldPosition, selectedOldName);
        selectedOldName = ""; selectedOldPosition = "";
        loadCandidates();
        txtCandidate.setText("");
        JOptionPane.showMessageDialog(this, "Candidate Deleted!");
    }//GEN-LAST:event_DeleteActionPerformed

    private void cmbPositionActionPerformecmbPosition(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPositionActionPerformecmbPosition
        if (!selectingFromList) loadCandidates();
    }//GEN-LAST:event_cmbPositionActionPerformecmbPosition

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        loadCandidates();
    }//GEN-LAST:event_formWindowOpened

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirm Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            VoteFrame.currentVoterID   = null;
            VoteFrame.currentVoterName = null;
            new LoginFrame().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        new ResultsFrame("admin").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCandidateActionPerformed
        new CandidateFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCandidateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to reset all votes?", "Confirm Reset", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            ElectionData.resetElection();
            JOptionPane.showMessageDialog(this, "Election successfully reset.");
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtCandidateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCandidateKeyReleased
        String search = txtCandidate.getText().trim().toLowerCase();
        DefaultListModel model = new DefaultListModel();
        String[] positions = {"President", "Vice President", "Secretary", "Treasurer", "Auditor", "PIO"};
        for (String pos : positions) {
            for (String c : ElectionData.getCandidates(pos)) {
                if (c.toLowerCase().contains(search)) {
                    model.addElement(pos + " - " + c);
                }
            }
        }
        listCandidates.setModel(model);
        if (search.isEmpty()) loadCandidates();
    }//GEN-LAST:event_txtCandidateKeyReleased

    private void listCandidatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listCandidatesMouseClicked
        if (listCandidates.getSelectedValue() != null) {
            selectingFromList = true;
            String selected = listCandidates.getSelectedValue().toString();
            String[] parts  = selected.split(" - ", 2);
            selectedOldPosition = parts[0];
            selectedOldName     = parts[1];
            txtCandidate.setText(selectedOldName);
            cmbPosition.setSelectedItem(selectedOldPosition);
            selectingFromList = false;
        }
    }//GEN-LAST:event_listCandidatesMouseClicked

    private void txtCandidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCandidateActionPerformed
        
    }//GEN-LAST:event_txtCandidateActionPerformed

    private void btnUseraccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUseraccActionPerformed
        new AdminPanelFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUseraccActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { javax.swing.UIManager.setLookAndFeel(info.getClassName()); break; }
            }
        } catch (Exception ex) { java.util.logging.Logger.getLogger(CandidateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); }
        java.awt.EventQueue.invokeLater(() -> new CandidateFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton btnCandidate;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnUseracc;
    private javax.swing.JComboBox cmbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listCandidates;
    private javax.swing.JTextField txtCandidate;
    // End of variables declaration//GEN-END:variables
}
