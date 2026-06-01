import javax.swing.JOptionPane;
import java.util.ArrayList;

public class VoteFrame extends javax.swing.JFrame {
    public static String currentVoterID   = "";
    public static String currentVoterName = "";

    public VoteFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbPresident = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmbVpresident = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmbSecretary = new javax.swing.JComboBox();
        jlabel2 = new javax.swing.JLabel();
        cmbTreasurer = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnVote = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnVote1 = new javax.swing.JButton();
        btnResults = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        cmbAuditor = new javax.swing.JComboBox();
        cmbPIO = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtVoter = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cmbPresident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPresidentActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel1.setText("President:");

        cmbVpresident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVpresidentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel3.setText("Vice President:");

        cmbSecretary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSecretaryActionPerformed(evt);
            }
        });

        jlabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jlabel2.setText("Secretary:");

        cmbTreasurer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTreasurerActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel5.setText("Treasurer:");

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel2.setText("Voter Name:");

        btnVote.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnVote.setText("Submit Vote");
        btnVote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoteActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/_111111111111 last vote stamp 128.jpg"))); // NOI18N

        btnVote1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnVote1.setText("VOTE");
        btnVote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVote1ActionPerformed(evt);
            }
        });

        btnResults.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnResults.setText("RESULT");
        btnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultsActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        btnLogout.setText("LOG OUT");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(61, 61, 61))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVote1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(btnVote1)
                .addGap(18, 18, 18)
                .addComponent(btnResults)
                .addGap(18, 18, 18)
                .addComponent(btnLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 36)); // NOI18N
        jLabel6.setText("VOTE");

        jlabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jlabel3.setText("Auditor:");

        cmbAuditor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAuditorActionPerformed(evt);
            }
        });

        cmbPIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPIOActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel7.setText("Public Information Officer:");

        txtVoter.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        txtVoter.setText("User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(290, 290, 290)
                                .addComponent(btnBack))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbSecretary, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbPresident, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbAuditor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel7)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(83, 83, 83)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cmbTreasurer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cmbVpresident, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cmbPIO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addComponent(jlabel2)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtVoter))
                                    .addComponent(jlabel3))))
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(btnVote, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(272, 272, 272))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVoter))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbVpresident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPresident, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jlabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbTreasurer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSecretary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jlabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPIO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAuditor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnVote)
                .addGap(15, 15, 15)
                .addComponent(btnBack)
                .addGap(57, 57, 57))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        txtVoter.setText(currentVoterName);

        cmbPresident.removeAllItems();
        cmbVpresident.removeAllItems();
        cmbSecretary.removeAllItems();
        cmbTreasurer.removeAllItems();
        cmbAuditor.removeAllItems();
        cmbPIO.removeAllItems();

        for (String c : ElectionData.getCandidates("President"))      cmbPresident.addItem(c);
        for (String c : ElectionData.getCandidates("Vice President")) cmbVpresident.addItem(c);
        for (String c : ElectionData.getCandidates("Secretary"))      cmbSecretary.addItem(c);
        for (String c : ElectionData.getCandidates("Treasurer"))      cmbTreasurer.addItem(c);
        for (String c : ElectionData.getCandidates("Auditor"))      cmbAuditor.addItem(c);
        for (String c : ElectionData.getCandidates("PIO"))      cmbPIO.addItem(c);
    }//GEN-LAST:event_formWindowOpened

    private void txtVoterActionPerformed(java.awt.event.ActionEvent evt) {}
    private void cmbPresidentActionPerformed(java.awt.event.ActionEvent evt) {}
    private void cmbVpresidentActionPerformed(java.awt.event.ActionEvent evt) {}
    private void cmbSecretaryActionPerformed(java.awt.event.ActionEvent evt) {}
    private void cmbTreasurerActionPerformed(java.awt.event.ActionEvent evt) {}

    private void btnVoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoteActionPerformed
        String voter = txtVoter.getText().trim();
        if (voter.isEmpty()) { JOptionPane.showMessageDialog(this, "Enter voter name."); return; }

        if (ElectionData.hasVoted(voter)) {
            JOptionPane.showMessageDialog(this, "This voter already voted.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to submit your vote?", "Confirm Vote", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        if (cmbPresident.getItemCount() == 0 || cmbVpresident.getItemCount() == 0 ||
            cmbSecretary.getItemCount() == 0 || cmbTreasurer.getItemCount() == 0 ||
            cmbAuditor.getItemCount() == 0 || cmbPIO.getItemCount() == 0) {
            JOptionPane.showMessageDialog(this, "Some positions have no candidates yet.");
            return;
        }

        String president    = cmbPresident.getSelectedItem().toString();
        String vicePresident = cmbVpresident.getSelectedItem().toString();
        String secretary    = cmbSecretary.getSelectedItem().toString();
        String treasurer    = cmbTreasurer.getSelectedItem().toString();
        String auditor    = cmbAuditor.getSelectedItem().toString();
        String pio    = cmbPIO.getSelectedItem().toString();

        boolean ok = ElectionData.submitVote(voter, president, vicePresident, secretary, treasurer, auditor, pio);
        if (ok) {
            JOptionPane.showMessageDialog(this, "Vote submitted successfully.");
        } else {
            JOptionPane.showMessageDialog(this, "Vote submission failed. Please try again.");
        }
    }//GEN-LAST:event_btnVoteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new MenuFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnVote1ActionPerformed(java.awt.event.ActionEvent evt) { new VoteFrame().setVisible(true); this.dispose(); }
    
    private void btnCandidateActionPerformed(java.awt.event.ActionEvent evt) { new CandidateFrame().setVisible(true); this.dispose(); }
    

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Confirm Log Out", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choice == JOptionPane.YES_OPTION) {
            currentVoterID = null; currentVoterName = null;
            new LoginFrame().setVisible(true); this.dispose();
        }
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void cmbAuditorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAuditorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAuditorActionPerformed

    private void cmbPIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPIOActionPerformed

    private void btnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultsActionPerformed
        new ResultsFrame("voter").setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnResultsActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) { javax.swing.UIManager.setLookAndFeel(info.getClassName()); break; }
            }
        } catch (Exception ex) { java.util.logging.Logger.getLogger(VoteFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex); }
        java.awt.EventQueue.invokeLater(() -> new VoteFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnResults;
    private javax.swing.JButton btnVote;
    private javax.swing.JButton btnVote1;
    private javax.swing.JComboBox cmbAuditor;
    private javax.swing.JComboBox cmbPIO;
    private javax.swing.JComboBox cmbPresident;
    private javax.swing.JComboBox cmbSecretary;
    private javax.swing.JComboBox cmbTreasurer;
    private javax.swing.JComboBox cmbVpresident;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel txtVoter;
    // End of variables declaration//GEN-END:variables
}
