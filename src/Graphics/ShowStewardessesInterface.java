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
public class ShowStewardessesInterface extends javax.swing.JFrame {

   private Airline airline;
    public ShowStewardessesInterface(Airline airline) {
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
        jButtonGoWorker = new javax.swing.JButton();
        jButtonExit4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("SHOW STEWARDESSES");

        jButtonGoWorker.setText("Back");
        jButtonGoWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoWorkerActionPerformed(evt);
            }
        });

        jButtonExit4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        jButtonExit4.setForeground(new java.awt.Color(0, 0, 0));
        jButtonExit4.setText("X");
        jButtonExit4.setToolTipText("");
        jButtonExit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExit4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                .addComponent(jButtonExit4))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGoWorker)
                .addGap(379, 379, 379))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButtonExit4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(jButtonGoWorker)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGoWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoWorkerActionPerformed
        WorkerInterface w = new WorkerInterface(airline);
        w.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGoWorkerActionPerformed

    private void jButtonExit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExit4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExit4ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit4;
    private javax.swing.JButton jButtonGoWorker;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
