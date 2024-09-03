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
public class RouteInterface extends javax.swing.JFrame {

    private Airline airline;

    public RouteInterface(Airline airline) {
        this.airline = airline;
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

        jButtonGoWorker = new javax.swing.JButton();
        jButtonBackMenu = new javax.swing.JButton();
        jButtonGoFlight = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAddRoutes = new javax.swing.JButton();
        jButtonShowRoutes = new javax.swing.JButton();
        jButtonSearchRoutes = new javax.swing.JButton();
        jButtonExit4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButtonGoWorker.setText("Worker");
        jButtonGoWorker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoWorkerActionPerformed(evt);
            }
        });

        jButtonBackMenu.setText("Menu");
        jButtonBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackMenuActionPerformed(evt);
            }
        });

        jButtonGoFlight.setText("Flight");
        jButtonGoFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoFlightActionPerformed(evt);
            }
        });

        jLabel1.setText("ROUTES");

        jButtonAddRoutes.setText("Add");
        jButtonAddRoutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddRoutesActionPerformed(evt);
            }
        });

        jButtonShowRoutes.setText("Show");
        jButtonShowRoutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowRoutesActionPerformed(evt);
            }
        });

        jButtonSearchRoutes.setText("Search");
        jButtonSearchRoutes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchRoutesActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonGoWorker)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonBackMenu)
                                        .addGap(242, 242, 242)
                                        .addComponent(jButtonGoFlight))
                                    .addComponent(jButtonAddRoutes))
                                .addGap(0, 23, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonExit4))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonShowRoutes, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSearchRoutes, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(330, 330, 330))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1))
                    .addComponent(jButtonExit4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addComponent(jButtonAddRoutes)
                .addGap(85, 85, 85)
                .addComponent(jButtonShowRoutes)
                .addGap(92, 92, 92)
                .addComponent(jButtonSearchRoutes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGoWorker)
                    .addComponent(jButtonBackMenu)
                    .addComponent(jButtonGoFlight))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGoWorkerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoWorkerActionPerformed
        WorkerInterface w = new WorkerInterface(airline);
        w.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGoWorkerActionPerformed

    private void jButtonBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackMenuActionPerformed
        MenuInterface mi = new MenuInterface();
        mi.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonBackMenuActionPerformed

    private void jButtonGoFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoFlightActionPerformed
        FlightInterface f = new FlightInterface(airline);
        f.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGoFlightActionPerformed

    private void jButtonAddRoutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddRoutesActionPerformed
        AddRoutesInterface ar = new AddRoutesInterface();
        ar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAddRoutesActionPerformed

    private void jButtonShowRoutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowRoutesActionPerformed
        ShowRoutesInterface sr = new ShowRoutesInterface(airline);
        sr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonShowRoutesActionPerformed

    private void jButtonSearchRoutesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchRoutesActionPerformed
        SearchRoutesInterface se = new SearchRoutesInterface(airline);
        se.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSearchRoutesActionPerformed

    private void jButtonExit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExit4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExit4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddRoutes;
    private javax.swing.JButton jButtonBackMenu;
    private javax.swing.JButton jButtonExit4;
    private javax.swing.JButton jButtonGoFlight;
    private javax.swing.JButton jButtonGoWorker;
    private javax.swing.JButton jButtonSearchRoutes;
    private javax.swing.JButton jButtonShowRoutes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}