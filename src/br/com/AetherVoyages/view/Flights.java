package br.com.AetherVoyages.view;

import br.com.AetherVoyages.dao.FlightDAO;
import br.com.AetherVoyages.model.Flight;
import static java.lang.Double.parseDouble;


/**
 *
 * @author wslav
 */
public class Flights extends javax.swing.JFrame {

    /**
     * Creates new form Flights
     */
    public Flights() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bntUpdate = new javax.swing.JButton();
        bntNew = new javax.swing.JButton();
        bntDelete = new javax.swing.JButton();
        bntSave = new javax.swing.JButton();
        bntMain = new javax.swing.JButton();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblPilot = new javax.swing.JLabel();
        txtPilot = new javax.swing.JTextField();
        lblCopilot = new javax.swing.JLabel();
        txtCopilot = new javax.swing.JTextField();
        lblBoarding = new javax.swing.JLabel();
        txtBoarding = new javax.swing.JTextField();
        lblLanding = new javax.swing.JLabel();
        txtLanding = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblTime = new javax.swing.JLabel();
        txtTime = new javax.swing.JFormattedTextField();
        lblPrice = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        bntUpdate.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntUpdate.setForeground(new java.awt.Color(0, 0, 0));
        bntUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/cloudrefresh_icon-icons.com_54403.png"))); // NOI18N
        bntUpdate.setText("Update");
        bntUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntUpdateActionPerformed(evt);
            }
        });

        bntNew.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntNew.setForeground(new java.awt.Color(0, 0, 0));
        bntNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/address_new_1271.png"))); // NOI18N
        bntNew.setText("New");

        bntDelete.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntDelete.setForeground(new java.awt.Color(0, 0, 0));
        bntDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/recycling_recyclebin_empty_delete_trash_1771.png"))); // NOI18N
        bntDelete.setText("Delete");
        bntDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDeleteActionPerformed(evt);
            }
        });

        bntSave.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntSave.setForeground(new java.awt.Color(0, 0, 0));
        bntSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Save_37110.png"))); // NOI18N
        bntSave.setText("Save");
        bntSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bntSaveMouseClicked(evt);
            }
        });
        bntSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSaveActionPerformed(evt);
            }
        });

        bntMain.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        bntMain.setForeground(new java.awt.Color(0, 0, 0));
        bntMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/AetherVoyages/img/Login_37128.png"))); // NOI18N
        bntMain.setText("Main");
        bntMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(bntUpdate)
                .addGap(18, 18, 18)
                .addComponent(bntNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntMain)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntNew)
                    .addComponent(bntDelete)
                    .addComponent(bntSave)
                    .addComponent(bntMain, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        lblID.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setText("ID:");

        txtID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblPilot.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPilot.setForeground(new java.awt.Color(0, 0, 0));
        lblPilot.setText("Pilot:");

        txtPilot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblCopilot.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblCopilot.setForeground(new java.awt.Color(0, 0, 0));
        lblCopilot.setText("Copilot:");

        txtCopilot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblBoarding.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblBoarding.setForeground(new java.awt.Color(0, 0, 0));
        lblBoarding.setText("Boarding:");

        txtBoarding.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblLanding.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblLanding.setForeground(new java.awt.Color(0, 0, 0));
        lblLanding.setText("Landing:");

        txtLanding.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblTime.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 0, 0));
        lblTime.setText("Time:");

        txtTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        try {
            txtTime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("  ##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblPrice.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 0));
        lblPrice.setText("Price:");

        txtPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblLanding)
                    .addComponent(lblBoarding)
                    .addComponent(lblCopilot)
                    .addComponent(lblPilot)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtPilot)
                    .addComponent(txtCopilot)
                    .addComponent(txtBoarding)
                    .addComponent(txtLanding, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTime)
                    .addComponent(txtTime)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblID)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPilot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPilot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCopilot)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCopilot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblBoarding)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBoarding, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLanding)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLanding, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(lblTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bntUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntUpdateActionPerformed
        // TODO add your handling code here:
        Flight pas = new Flight();

        pas.setPilot(txtPilot.getText());
        pas.setCopilot(txtCopilot.getText());
        pas.setBoarding(txtBoarding.getText());
        pas.setLanding(txtLanding.getText());
        pas.setTime(txtTime.getText());
        pas.setPrice(parseDouble(txtPrice.getText()));

        pas.setId(Integer.parseInt(txtID.getText()));

        FlightDAO dao = new FlightDAO();
        dao.updateFlight(pas);
    }//GEN-LAST:event_bntUpdateActionPerformed

    private void bntDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDeleteActionPerformed
        // TODO add your handling code here:
        Flight pas = new Flight();

        pas.setId(Integer.parseInt(txtID.getText()));

        FlightDAO dao = new FlightDAO();
        dao.deleteOrEndFLight(pas);
    }//GEN-LAST:event_bntDeleteActionPerformed

    private void bntSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSaveActionPerformed
        // TODO add your handling code here:
        Flight fly = new Flight();
        fly.setPilot(txtPilot.getText());
        fly.setCopilot(txtCopilot.getText());
        fly.setBoarding(txtBoarding.getText());
        fly.setLanding(txtLanding.getText());
        fly.setTime(txtTime.getText());
        fly.setPrice(parseDouble(txtPrice.getText()));
        
        FlightDAO dao = new FlightDAO();
        dao.saveFlight(fly);
        
    }//GEN-LAST:event_bntSaveActionPerformed

    private void bntMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMainActionPerformed
        // TODO add your handling code here:
        MainScreen Screen = new MainScreen();
        Screen.setVisible(true);
        dispose();

    }//GEN-LAST:event_bntMainActionPerformed

    private void bntSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntSaveMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_bntSaveMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flights.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flights().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bntDelete;
    private javax.swing.JButton bntMain;
    public javax.swing.JButton bntNew;
    public javax.swing.JButton bntSave;
    public javax.swing.JButton bntUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBoarding;
    private javax.swing.JLabel lblCopilot;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLanding;
    private javax.swing.JLabel lblPilot;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblTime;
    public javax.swing.JTextField txtBoarding;
    public javax.swing.JTextField txtCopilot;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtLanding;
    public javax.swing.JTextField txtPilot;
    public javax.swing.JTextField txtPrice;
    public javax.swing.JFormattedTextField txtTime;
    // End of variables declaration//GEN-END:variables
}
