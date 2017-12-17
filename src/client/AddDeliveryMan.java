/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import entity.Deliveryman;
import adt.LListAddDeliveryMan;

/**
 *
 * @author YUNNI
 */
public class AddDeliveryMan extends javax.swing.JFrame {

    private LListAddDeliveryMan<Deliveryman> deliverymanList = new LListAddDeliveryMan<>();
    private int Position;

    public <T> void displayList(LListAddDeliveryMan<Deliveryman> dList) {
        for (int i = 1; i <= dList.getNumberOfEntries(); i++) {
            if (dList.getEntry(i).getdName().equals(txtName.getText())) {
                
                txtContact.setText(dList.getEntry(i).getdPhone());
                txtAddress.setText(dList.getEntry(i).getdAddress());
                cbReason.setSelectedItem(dList.getEntry(i).getdReason());
                String act = dList.getEntry(i).getdActive();
                if(act == "Active")
                {
                    rbYes.setSelected(true);
                    rbNo.setSelected(false);
                }
                else
                {
                    rbYes.setSelected(false);
                    rbNo.setSelected(true);
                }
                Position = i;
            }
        }
    }

    public AddDeliveryMan() {
        deliverymanList = new LListAddDeliveryMan<>();
        initComponents();

        rbNo.setSelected(false);
        cbReason.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnSearchName = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblReason = new javax.swing.JLabel();
        cbReason = new javax.swing.JComboBox();
        rbYes = new javax.swing.JRadioButton();
        rbNo = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        BtnUpdate = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblContactNo1 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        lblContactNo = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delivery Man");

        BtnSearchName.setBackground(new java.awt.Color(255, 255, 255));
        BtnSearchName.setPreferredSize(new java.awt.Dimension(1000, 730));

        lblTitle.setFont(new java.awt.Font("Franklin Gothic Book", 0, 24)); // NOI18N
        lblTitle.setText("Delivery Man");

        lblName.setText("Name :");

        lblStatus.setText("Active :");
        lblStatus.setToolTipText("");

        lblReason.setText("Reason :");

        cbReason.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "Resign", "Retire", "Others" }));

        rbYes.setSelected(true);
        rbYes.setText("Yes");
        rbYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYesActionPerformed(evt);
            }
        });

        rbNo.setSelected(true);
        rbNo.setText("No");
        rbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Add");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Search");
        jButton3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        BtnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        BtnUpdate.setText("Update");
        BtnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUpdateActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(java.awt.Color.white);
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 0, 15)); // NOI18N
        jLabel4.setText("Delivery Info.");

        lblContactNo1.setText("Status:");

        txtStatus.setEditable(false);
        txtStatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtStatusKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStatusKeyTyped(evt);
            }
        });

        jButton6.setText("View Delivery");
        jButton6.setEnabled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblContactNo1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtStatus)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactNo1)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        lblContactNo.setText("Contact No. :");

        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContactKeyTyped(evt);
            }
        });

        lblAddress.setText("Address :");

        javax.swing.GroupLayout BtnSearchNameLayout = new javax.swing.GroupLayout(BtnSearchName);
        BtnSearchName.setLayout(BtnSearchNameLayout);
        BtnSearchNameLayout.setHorizontalGroup(
            BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblContactNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblReason, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbReason, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtContact)
                                        .addComponent(txtName)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rbYes)
                                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                        .addGap(86, 86, 86)
                                        .addComponent(rbNo))))
                            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(173, 173, 173))))
        );
        BtnSearchNameLayout.setVerticalGroup(
            BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSearchNameLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BtnSearchNameLayout.createSequentialGroup()
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addGap(18, 18, 18)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContactNo)
                            .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(rbYes)
                            .addComponent(rbNo))
                        .addGap(18, 18, 18)
                        .addGroup(BtnSearchNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblReason)
                            .addComponent(cbReason, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(314, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BtnSearchName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtnSearchName, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
//        PendingDeliveries pd=new PendingDeliveries(txtName.getText());
//        pd.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtStatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStatusKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusKeyTyped

    private void txtStatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStatusKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusKeyPressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearData();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)) {
            JOptionPane.showMessageDialog(null, "Invalid input.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtContactKeyTyped

    private void txtContactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyPressed
        if (txtContact.getText().length() >= 11) {
            txtContact.setText(txtContact.getText().substring(0, 10));
        }
    }//GEN-LAST:event_txtContactKeyPressed

    private void BtnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUpdateActionPerformed

        if (txtContact.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Don't play play", "Warning", JOptionPane.INFORMATION_MESSAGE);

        } else {
            updateData();
            clearData();
        }
    }//GEN-LAST:event_BtnUpdateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter name before search.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {
            displayList(deliverymanList);
            jButton2.setEnabled(false);
            jButton6.setEnabled(txtStatus.getText().equals("Delivery"));
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int i = Validation();

        if (i == -1) {
        } else if (i == 0) {
            insertData();
            JOptionPane.showMessageDialog(null, "Insert Successful.", "Information", JOptionPane.DEFAULT_OPTION);
            clearData();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void rbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoActionPerformed
        if (rbNo.isSelected()) {
            rbYes.setSelected(false);
            cbReason.setEnabled(true);
        }
    }//GEN-LAST:event_rbNoActionPerformed

    private void rbYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYesActionPerformed
        if (rbYes.isSelected()) {
            rbNo.setSelected(false);
            cbReason.setEnabled(false);
            cbReason.setSelectedIndex(0);
        }
    }//GEN-LAST:event_rbYesActionPerformed

    public void clearData() {
        jButton2.setEnabled(true);
        txtName.setText("");
        txtContact.setText("");
        txtAddress.setText("");
        cbReason.setSelectedIndex(0);
        rbYes.setSelected(true);
        rbNo.setSelected(false);
    }

    public int Validation() {
        int re = 0;
        if (txtName.getText().isEmpty()) {
            re = -1;
        } else if (txtContact.getText().isEmpty()) {
            re = -1;
        } else if (txtAddress.getText().isEmpty()) {
            re = -1;
        }

        return re;
    }

    public void insertData() {
        String Dstatus;
        if (rbNo.isSelected()) {
            Dstatus = "In Active";
        } else {
            Dstatus = "Active";
        }
        Deliveryman dm = new Deliveryman(txtName.getText(), Dstatus, String.valueOf(cbReason.getSelectedItem()), txtContact.getText(), txtAddress.getText(), 2, "");
        deliverymanList.add(dm);
    }

    public void updateData() {
        String Dstatus;
        
        if (rbNo.isSelected()) {
            Dstatus = "In Active";
        } else {
            Dstatus = "Active";
        }
        Deliveryman dm = new Deliveryman(txtName.getText(), Dstatus, String.valueOf(cbReason.getSelectedItem()), txtContact.getText(), txtAddress.getText(), 2, "");
        deliverymanList.replace(Position,dm);
    }

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
            java.util.logging.Logger.getLogger(AddDeliveryMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddDeliveryMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddDeliveryMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddDeliveryMan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDeliveryMan().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnSearchName;
    private javax.swing.JButton BtnUpdate;
    private javax.swing.JComboBox cbReason;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblContactNo1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblReason;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbYes;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

}