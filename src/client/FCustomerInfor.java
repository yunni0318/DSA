/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.CustomerLinkedQueue;
import adt.DeliverymanLinkedList;
import adt.OrderLinkedList;
import static client.MainMenu.afList;
import static client.MainMenu.dList;
import com.sun.glass.events.KeyEvent;
import entity.Customer;
import entity.Deliveryman;
import entity.OrderDelivery;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import static client.MainMenu.cusList;

/**
 *
 * @author Tea Evon
 */
public class FCustomerInfor extends javax.swing.JFrame {

    OrderLinkedList<OrderDelivery> odList = new OrderLinkedList<>();

    int orderID;

    /**
     * Creates new form customerRegistrationF
     */
    public FCustomerInfor() {
        initComponents();
    }

    public FCustomerInfor(OrderLinkedList<OrderDelivery> odList, int orderID) {
        this.odList = odList;
        this.orderID = orderID;

        initComponents();
        lblTotal.setText("RM " + String.valueOf(getTotal(orderID)) + "0");
    }

    public Customer storeCustomer() {
        Customer cus = new Customer(txtName.getText(), txtPhone.getText(), txtAddress.getText(), txtCity.getText(), txtState.getText(), String.valueOf(cbPostcode.getSelectedItem()));
        cusList.add(cus);
        return cus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btGroupPay = new javax.swing.ButtonGroup();
        jpCus = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        lblPostcode = new javax.swing.JLabel();
        cbPostcode = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        jbtConfirm = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        lblPayMethod = new javax.swing.JLabel();
        lblTotalA = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblCardNo = new javax.swing.JLabel();
        txtCardNo = new javax.swing.JTextField();
        txtSecurityCode = new javax.swing.JTextField();
        lblSecurityCode = new javax.swing.JLabel();
        lblOwner = new javax.swing.JLabel();
        txtOwner = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setText("Name :");

        lblAddress.setText("Address :");

        lblCity.setText("City :");

        lblState.setText("State :");

        lblPostcode.setText("Postcode :");

        cbPostcode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "53000", "53100", "53300" }));
        cbPostcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPostcodeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Information");

        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        lblPhone.setText("Phone Number :");

        jbtConfirm.setText("Make Payment");
        jbtConfirm.setToolTipText("");
        jbtConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtConfirmActionPerformed(evt);
            }
        });

        btGroupPay.add(jRadioButton1);
        jRadioButton1.setText("Master Card");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btGroupPay.add(jRadioButton2);
        jRadioButton2.setText("Visa");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblPayMethod.setText("Payment Method :");

        lblTotalA.setText("Total Payment :");

        lblTotal.setText("0.00");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Make Payment");

        lblCardNo.setText("Card Number :");

        txtCardNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCardNoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCardNoKeyTyped(evt);
            }
        });

        txtSecurityCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSecurityCodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSecurityCodeKeyTyped(evt);
            }
        });

        lblSecurityCode.setText("Security Code :");

        lblOwner.setText("Owner Name :");

        txtOwner.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOwnerKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jpCusLayout = new javax.swing.GroupLayout(jpCus);
        jpCus.setLayout(jpCusLayout);
        jpCusLayout.setHorizontalGroup(
            jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpCusLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCusLayout.createSequentialGroup()
                        .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPostcode)
                            .addComponent(lblState))
                        .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpCusLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(cbPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCusLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpCusLayout.createSequentialGroup()
                        .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jpCusLayout.createSequentialGroup()
                                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCusLayout.createSequentialGroup()
                                        .addComponent(lblCardNo)
                                        .addGap(22, 22, 22)
                                        .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCusLayout.createSequentialGroup()
                                        .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSecurityCode)
                                            .addComponent(lblOwner))
                                        .addGap(18, 18, 18)
                                        .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtOwner)
                                            .addComponent(txtSecurityCode))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtConfirm))
                            .addGroup(jpCusLayout.createSequentialGroup()
                                .addComponent(lblTotalA)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCusLayout.createSequentialGroup()
                        .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddress)
                            .addComponent(lblCity)
                            .addComponent(lblPhone)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addComponent(txtPhone)
                            .addComponent(txtCity)
                            .addComponent(txtAddress)))
                    .addGroup(jpCusLayout.createSequentialGroup()
                        .addComponent(lblPayMethod)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpCusLayout.setVerticalGroup(
            jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCusLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbPostcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPostcode))
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalA)
                    .addComponent(lblTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPayMethod)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCardNo)
                    .addComponent(txtCardNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSecurityCode)
                    .addComponent(txtSecurityCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtConfirm))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneKeyPressed

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)) {
            JOptionPane.showMessageDialog(null, "Invalid input. Only accept number, such as 0123456789", "Warning", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
        if (txtPhone.getText().length() >= 11) {
            String str = txtPhone.getText().substring(0, 10);
            txtPhone.setText(str);
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private double getTotal(int orderID) {
        double ttl = 0.00;
        for (int i = 1; i <= odList.getNumberOfEntries(); i++) {
            if (odList.getEntry(i).getOdID() == orderID) {
                ttl = odList.getEntry(i).getTotal();
            }
        }
        return ttl;
    }

    private void jbtConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtConfirmActionPerformed
        // TODO add your handling code here:
        String name = txtName.getText();
        String phone = txtPhone.getText();

        GregorianCalendar cal = new GregorianCalendar();
        int currentHour = cal.get(GregorianCalendar.HOUR_OF_DAY);
        int currentMinute = cal.get(GregorianCalendar.MINUTE);
        String odTime = (currentHour < 10 ? "0" : "") + currentHour + ":" + (currentMinute < 10 ? "0" : "") + currentMinute;

        //Calculate distance
        OrderDelivery od = null;
        String resPostcode = "";
        String cusPostcode = (String) cbPostcode.getSelectedItem();
        double distance = 0;
        for (int i = 1; i <= odList.getNumberOfEntries(); i++) {
            if (odList.getEntry(i).getOdID() == orderID) {
                od = odList.getEntry(i);
            }
        }
        for (int i = 1; i <= afList.getNumberOfEntries(); i++) {
            if (afList.getEntry(i).getAfName().equals(od.getAfName())) {
                resPostcode = afList.getEntry(i).getAfPostcode();
            }
        }

        if (resPostcode.equals("53000")) {
            if (cusPostcode.equals("53000")) {
                distance = 6;
            } else if (cusPostcode.equals("53100")) {
                distance = 7;
            } else if (cusPostcode.equals("53300")) {
                distance = 8;
            }
        } else if (resPostcode.equals("53100")) {
            if (cusPostcode.equals("53000")) {
                distance = 7;
            } else if (cusPostcode.equals("53100")) {
                distance = 6;
            } else if (cusPostcode.equals("53300")) {
                distance = 8;
            }
        }

        //Assign deliveryman
        dList.sortByNoOfTask();
        Deliveryman d = dList.getEntry(1);
        String deliverymanName = d.getdName();
        d.setdNoOfTask(d.getdNoOfTask() + 1);
        d.setdStatus("Delivery");

        for (int i = 1; i <= odList.getNumberOfEntries(); i++) {
            if (odList.getEntry(i).getOdID() == orderID) {
                odList.getEntry(i).setCusName(name);
                odList.getEntry(i).setCusPhone(phone);
                odList.getEntry(i).setOdTime(odTime);
                odList.getEntry(i).setDistance(distance);
                odList.getEntry(i).setdName(deliverymanName);
                System.out.println(odList.getEntry(i));
            }
        }

        storeCustomer();
        JOptionPane.showMessageDialog(null, "Thank You =) \nYour order and payment have been successfully completed. \nPlease Come Again!!!", "Congratulations", JOptionPane.INFORMATION_MESSAGE);
        FRestaurant home = new FRestaurant();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbtConfirmActionPerformed

    private void txtCardNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCardNoKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtCardNoKeyPressed

    private void txtCardNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCardNoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)) {
            JOptionPane.showMessageDialog(null, "Invalid input. Only accept number.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
        if (txtCardNo.getText().length() >= 16) {
            txtCardNo.setText(txtCardNo.getText().substring(0, 15));
        }
    }//GEN-LAST:event_txtCardNoKeyTyped

    private void txtSecurityCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityCodeKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSecurityCodeKeyPressed

    private void txtSecurityCodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSecurityCodeKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE) || c == KeyEvent.VK_DELETE)) {
            JOptionPane.showMessageDialog(null, "Invalid input. Only accept number.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
        if (txtSecurityCode.getText().length() >= 3) {
            txtSecurityCode.setText(txtSecurityCode.getText().substring(0, 2));
        }
    }//GEN-LAST:event_txtSecurityCodeKeyTyped

    private void txtOwnerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c))) {
            JOptionPane.showMessageDialog(null, "Invalid input. Only accept alphabetic.", "Warning", JOptionPane.INFORMATION_MESSAGE);
            evt.consume();
        }
    }//GEN-LAST:event_txtOwnerKeyTyped

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

    private void cbPostcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPostcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPostcodeActionPerformed

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
            java.util.logging.Logger.getLogger(FCustomerInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCustomerInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCustomerInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCustomerInfor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCustomerInfor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroupPay;
    private javax.swing.JComboBox<String> cbPostcode;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton jbtConfirm;
    private javax.swing.JPanel jpCus;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCardNo;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOwner;
    private javax.swing.JLabel lblPayMethod;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPostcode;
    private javax.swing.JLabel lblSecurityCode;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotalA;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCardNo;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOwner;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSecurityCode;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
