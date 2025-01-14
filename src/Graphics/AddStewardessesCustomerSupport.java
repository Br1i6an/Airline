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
public class AddStewardessesCustomerSupport extends javax.swing.JFrame {

    private Airline airline;

    public AddStewardessesCustomerSupport(Airline airline) {
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

        jLabel1 = new javax.swing.JLabel();
        jButtonBackAddStewardesses = new javax.swing.JButton();
        jLabelHour = new javax.swing.JLabel();
        jTextFieldHour = new javax.swing.JTextField();
        jLabelAttentionType = new javax.swing.JLabel();
        jTextFieldAttentionType = new javax.swing.JTextField();
        jLabelWorkShift = new javax.swing.JLabel();
        jTextFieldWorkShift = new javax.swing.JTextField();
        jLabelWorkRole = new javax.swing.JLabel();
        jTextFieldWorkRole = new javax.swing.JTextField();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelAge = new javax.swing.JLabel();
        jTextFieldId = new javax.swing.JTextField();
        jLabeId = new javax.swing.JLabel();
        jTextFieldAge = new javax.swing.JTextField();
        jLabelSalary = new javax.swing.JLabel();
        jTextFieldSalary = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonExit5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("CUSTOMER SUPPORT");

        jButtonBackAddStewardesses.setText("Back");
        jButtonBackAddStewardesses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackAddStewardessesActionPerformed(evt);
            }
        });

        jLabelHour.setText("Hour ");

        jTextFieldHour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHourActionPerformed(evt);
            }
        });

        jLabelAttentionType.setText("Attention Type");

        jLabelWorkShift.setText("Work Shift");

        jLabelWorkRole.setText("Work Role");

        jLabelName.setText("Name");

        jLabelLastName.setText("Last Name");

        jLabelAge.setText("Age");

        jLabeId.setText("Id");

        jLabelSalary.setText("Salary");

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
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
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelWorkShift)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelName)
                                .addComponent(jLabelWorkRole)
                                .addComponent(jLabelLastName)
                                .addComponent(jLabelAge)
                                .addComponent(jLabeId)
                                .addComponent(jLabelSalary))
                            .addGap(1, 1, 1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHour)
                            .addComponent(jLabelAttentionType))))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldHour)
                    .addComponent(jTextFieldWorkShift)
                    .addComponent(jTextFieldAttentionType)
                    .addComponent(jTextFieldWorkRole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                    .addComponent(jTextFieldSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonSave)
                .addGap(305, 305, 305)
                .addComponent(jButtonBackAddStewardesses)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonExit5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(jButtonExit5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelHour)
                    .addComponent(jTextFieldHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAttentionType)
                    .addComponent(jTextFieldAttentionType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWorkShift)
                    .addComponent(jTextFieldWorkShift, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelWorkRole)
                    .addComponent(jTextFieldWorkRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAge)
                    .addComponent(jTextFieldAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeId)
                    .addComponent(jTextFieldId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalary)
                    .addComponent(jTextFieldSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBackAddStewardesses)
                    .addComponent(jButtonSave))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackAddStewardessesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackAddStewardessesActionPerformed
        AddStewardessesInterface adsi = new AddStewardessesInterface(airline);
        adsi.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButtonBackAddStewardessesActionPerformed

    private void jTextFieldHourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHourActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        String ageno = jTextFieldAge.getText();
        int ageyes = Integer.valueOf(ageno);
        String idno = jTextFieldId.getText();
        int Idyes = Integer.valueOf(idno);
        String salaryno = jTextFieldSalary.getText();
        int salaryyes = Integer.valueOf(salaryno);
        if (evt.getSource() == jButtonSave) {
            airline.addListWorkersStewardessCustomer(jLabelWorkShift.getText(), jLabelWorkRole.getText(), jTextFieldName.getText(), jTextFieldLastName.getText(), ageyes, Idyes, salaryyes);
            System.out.println("hola si guardo");
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonExit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExit5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExit5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBackAddStewardesses;
    private javax.swing.JButton jButtonExit4;
    private javax.swing.JButton jButtonExit5;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JLabel jLabeId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelAttentionType;
    private javax.swing.JLabel jLabelHour;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelSalary;
    private javax.swing.JLabel jLabelWorkRole;
    private javax.swing.JLabel jLabelWorkShift;
    private javax.swing.JTextField jTextFieldAge;
    private javax.swing.JTextField jTextFieldAttentionType;
    private javax.swing.JTextField jTextFieldHour;
    private javax.swing.JTextField jTextFieldId;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldSalary;
    private javax.swing.JTextField jTextFieldWorkRole;
    private javax.swing.JTextField jTextFieldWorkShift;
    // End of variables declaration//GEN-END:variables
}
