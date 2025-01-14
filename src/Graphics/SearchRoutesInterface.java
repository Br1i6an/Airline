/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics;

import airline.logic.Airline;

/**
 *
 * @author ADMIN
 */
public class SearchRoutesInterface extends javax.swing.JFrame {

    private Airline airline;
    public SearchRoutesInterface(Airline airline) {
        this.airline=airline;
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonGoRute = new javax.swing.JButton();
        jButtonExit5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("SEARCH ROUTES");

        jButtonGoRute.setText("Back");
        jButtonGoRute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoRuteActionPerformed(evt);
            }
        });

        jButtonExit5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jButtonExit5.setForeground(new java.awt.Color(0, 0, 0));
        jButtonExit5.setText("X");
        jButtonExit5.setToolTipText("");
        jButtonExit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExit5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(jButtonGoRute)
                .addContainerGap(384, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExit5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addComponent(jButtonExit5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                .addComponent(jButtonGoRute)
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGoRuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoRuteActionPerformed
        RouteInterface r = new RouteInterface(airline);
        r.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGoRuteActionPerformed

    private void jButtonExit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExit5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExit5ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit4;
    private javax.swing.JButton jButtonExit5;
    private javax.swing.JButton jButtonGoRute;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
