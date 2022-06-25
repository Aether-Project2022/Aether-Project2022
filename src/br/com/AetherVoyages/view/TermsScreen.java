
package br.com.AetherVoyages.view;

import java.awt.Color;


public class TermsScreen extends javax.swing.JInternalFrame {

    
    public TermsScreen() {
        initComponents();
        
        tabPrivacyPolicy.setBackground(Color.white);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpTabs = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAetherVoyages = new javax.swing.JLabel();
        tabPrivacyPolicy = new javax.swing.JPanel();
        lblPrivacyPolicy = new javax.swing.JLabel();
        tabTermsUser = new javax.swing.JPanel();
        lblTermsUser = new javax.swing.JLabel();
        jpMainTerms = new javax.swing.JPanel();
        jpPrivacyPolicy = new javax.swing.JPanel();
        jpTermsUse = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        setResizable(true);
        setTitle("Aether Voyages - Terms");

        jpTabs.setBackground(new java.awt.Color(0, 51, 204));
        jpTabs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lblAetherVoyages.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 24)); // NOI18N
        lblAetherVoyages.setForeground(new java.awt.Color(255, 255, 255));
        lblAetherVoyages.setText("Aether Voyages");

        tabPrivacyPolicy.setBackground(new java.awt.Color(0, 51, 204));
        tabPrivacyPolicy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabPrivacyPolicy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabPrivacyPolicyMouseClicked(evt);
            }
        });

        lblPrivacyPolicy.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblPrivacyPolicy.setForeground(new java.awt.Color(0, 0, 0));
        lblPrivacyPolicy.setText("Privacy Policy");

        javax.swing.GroupLayout tabPrivacyPolicyLayout = new javax.swing.GroupLayout(tabPrivacyPolicy);
        tabPrivacyPolicy.setLayout(tabPrivacyPolicyLayout);
        tabPrivacyPolicyLayout.setHorizontalGroup(
            tabPrivacyPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabPrivacyPolicyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPrivacyPolicy)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabPrivacyPolicyLayout.setVerticalGroup(
            tabPrivacyPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPrivacyPolicy, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        tabTermsUser.setBackground(new java.awt.Color(0, 51, 204));
        tabTermsUser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tabTermsUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTermsUserMouseClicked(evt);
            }
        });

        lblTermsUser.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        lblTermsUser.setForeground(new java.awt.Color(0, 0, 0));
        lblTermsUser.setText("Terms of Use");

        javax.swing.GroupLayout tabTermsUserLayout = new javax.swing.GroupLayout(tabTermsUser);
        tabTermsUser.setLayout(tabTermsUserLayout);
        tabTermsUserLayout.setHorizontalGroup(
            tabTermsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabTermsUserLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTermsUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabTermsUserLayout.setVerticalGroup(
            tabTermsUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTermsUser, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpTabsLayout = new javax.swing.GroupLayout(jpTabs);
        jpTabs.setLayout(jpTabsLayout);
        jpTabsLayout.setHorizontalGroup(
            jpTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jpTabsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpTabsLayout.createSequentialGroup()
                        .addGap(0, 37, Short.MAX_VALUE)
                        .addComponent(lblAetherVoyages)
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(tabPrivacyPolicy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tabTermsUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpTabsLayout.setVerticalGroup(
            jpTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabsLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblAetherVoyages)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(tabPrivacyPolicy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabTermsUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jpMainTerms.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jpPrivacyPolicy.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpPrivacyPolicyLayout = new javax.swing.GroupLayout(jpPrivacyPolicy);
        jpPrivacyPolicy.setLayout(jpPrivacyPolicyLayout);
        jpPrivacyPolicyLayout.setHorizontalGroup(
            jpPrivacyPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jpPrivacyPolicyLayout.setVerticalGroup(
            jpPrivacyPolicyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        jpTermsUse.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpTermsUseLayout = new javax.swing.GroupLayout(jpTermsUse);
        jpTermsUse.setLayout(jpTermsUseLayout);
        jpTermsUseLayout.setHorizontalGroup(
            jpTermsUseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jpTermsUseLayout.setVerticalGroup(
            jpTermsUseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpMainTermsLayout = new javax.swing.GroupLayout(jpMainTerms);
        jpMainTerms.setLayout(jpMainTermsLayout);
        jpMainTermsLayout.setHorizontalGroup(
            jpMainTermsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrivacyPolicy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpMainTermsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpMainTermsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpTermsUse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jpMainTermsLayout.setVerticalGroup(
            jpMainTermsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrivacyPolicy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpMainTermsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jpMainTermsLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jpTermsUse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpMainTerms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpMainTerms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabPrivacyPolicyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabPrivacyPolicyMouseClicked
        // TODO add your handling code here:
       jpPrivacyPolicy.setVisible(true);
       jpTermsUse.setVisible(false);
       
       tabPrivacyPolicy.setBackground(Color.white);
       tabTermsUser.setBackground(new Color(0,51,204));
        
    }//GEN-LAST:event_tabPrivacyPolicyMouseClicked

    private void tabTermsUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTermsUserMouseClicked
        // TODO add your handling code here:
       jpPrivacyPolicy.setVisible(false);
       jpTermsUse.setVisible(true);
       
       tabTermsUser.setBackground(Color.white);
       tabPrivacyPolicy.setBackground(new Color(0,51,204));
        
    }//GEN-LAST:event_tabTermsUserMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpMainTerms;
    private javax.swing.JPanel jpPrivacyPolicy;
    private javax.swing.JPanel jpTabs;
    private javax.swing.JPanel jpTermsUse;
    private javax.swing.JLabel lblAetherVoyages;
    private javax.swing.JLabel lblPrivacyPolicy;
    private javax.swing.JLabel lblTermsUser;
    private javax.swing.JPanel tabPrivacyPolicy;
    private javax.swing.JPanel tabTermsUser;
    // End of variables declaration//GEN-END:variables
}
