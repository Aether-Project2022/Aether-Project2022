/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.AetherVoyages.view;

/**
 *
 * @author ggpin
 */
public class PromoInternational extends javax.swing.JInternalFrame {

    /**
     * Creates new form PromoInternational
     */
    public PromoInternational() {
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

        jpTabs = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lblAetherVoyages = new javax.swing.JLabel();
        jpBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpScroll = new javax.swing.JPanel();
        jpsBackground = new javax.swing.JPanel();

        setBorder(null);
        setClosable(true);
        setTitle("Aether Voyages - Promo International");

        jpTabs.setBackground(new java.awt.Color(0, 51, 204));
        jpTabs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        lblAetherVoyages.setFont(new java.awt.Font("PMingLiU-ExtB", 3, 24)); // NOI18N
        lblAetherVoyages.setText("Aether Voyages");

        javax.swing.GroupLayout jpTabsLayout = new javax.swing.GroupLayout(jpTabs);
        jpTabs.setLayout(jpTabsLayout);
        jpTabsLayout.setHorizontalGroup(
            jpTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jpTabsLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lblAetherVoyages)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jpTabsLayout.setVerticalGroup(
            jpTabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabsLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(lblAetherVoyages)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jpsBackground.setBackground(new java.awt.Color(255, 255, 255));
        jpsBackground.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jpsBackgroundLayout = new javax.swing.GroupLayout(jpsBackground);
        jpsBackground.setLayout(jpsBackgroundLayout);
        jpsBackgroundLayout.setHorizontalGroup(
            jpsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 657, Short.MAX_VALUE)
        );
        jpsBackgroundLayout.setVerticalGroup(
            jpsBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 517, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpScrollLayout = new javax.swing.GroupLayout(jpScroll);
        jpScroll.setLayout(jpScrollLayout);
        jpScrollLayout.setHorizontalGroup(
            jpScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpScrollLayout.createSequentialGroup()
                .addComponent(jpsBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpScrollLayout.setVerticalGroup(
            jpScrollLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpsBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jpScroll);

        javax.swing.GroupLayout jpBackgroundLayout = new javax.swing.GroupLayout(jpBackground);
        jpBackground.setLayout(jpBackgroundLayout);
        jpBackgroundLayout.setHorizontalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        jpBackgroundLayout.setVerticalGroup(
            jpBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpTabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpTabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel jpBackground;
    private javax.swing.JPanel jpScroll;
    private javax.swing.JPanel jpTabs;
    private javax.swing.JPanel jpsBackground;
    private javax.swing.JLabel lblAetherVoyages;
    // End of variables declaration//GEN-END:variables
}
