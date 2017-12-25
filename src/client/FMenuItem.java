/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.LListAdditem;
import adt.OrderItemLinkedList;
import adt.OrderLinkedList;
import static client.MainMenu.cusList;
import static client.MainMenu.odList;
import static client.MainMenu.oiList;
import javax.swing.JOptionPane;
import entity.OrderDelivery;
import entity.OrderItem;
import java.util.GregorianCalendar;
import static client.MainMenu.iList;
import static client.MainMenu.initOrderDelivery;
import static client.MainMenu.userName;
import entity.Item;

/**
 *
 * @author Tea Evon
 */
public class FMenuItem extends javax.swing.JFrame {

    FConfirm orderConfirmF = new FConfirm();
//    String userName;

    /**
     * Creates new form JFMenuItem
     */
    public FMenuItem() {
        initComponents();
//        initOrderDelivery();
    }
    
    public FMenuItem(String userName) {
        //this.userName = userName;
        initComponents();
//        initOrderDelivery();
    }

//    OrderItemLinkedList<OrderItem> oiList = new OrderItemLinkedList<>();
//    OrderLinkedList<OrderDelivery> odList = new OrderLinkedList<>();
    
    OrderItem order1;
    OrderItem order2;
    OrderItem order3;
    OrderItem order4;
    int qua1 = 0;
    int qua2 = 0;
    int qua3 = 0;
    int qua4 = 0;
    int id = generateOrderID(odList);

    public void setRes(String res) {
        this.jlResName.setText(res);
    }

    public void getMenu(String res) {
        String resN = jlResName.getText();
        LListAdditem<Item> iTemList = new LListAdditem<>();

        for (int i = 1; i <= iList.getNumberOfEntries(); i++) {
            if (resN.equals(iList.getEntry(i).getAfName())) {
                String item = iList.getEntry(i).getItName();
                double price = iList.getEntry(i).getItPrice();
                String resName = iList.getEntry(i).getAfName();

                Item newEntry = new Item(item, price, resName);
                iTemList.add(newEntry);
            }
        }

        int c = 1;
        do {
            lblItem1.setText(iTemList.getEntry(c).getItName());
            lblPrice1.setText(String.valueOf(iTemList.getEntry(c).getItPrice()) + "0");
            c++;
            lblItem2.setText(iTemList.getEntry(c).getItName());
            lblPrice2.setText(String.valueOf(iTemList.getEntry(c).getItPrice()) + "0");
            c++;
            lblItem3.setText(iTemList.getEntry(c).getItName());
            lblPrice3.setText(String.valueOf(iTemList.getEntry(c).getItPrice()) + "0");
            c++;
            lblItem4.setText(iTemList.getEntry(c).getItName());
            lblPrice4.setText(String.valueOf(iTemList.getEntry(c).getItPrice()) + "0");
            c++;
        } while (c <= iTemList.getNumberOfEntries());
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
        jlResName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblItem1 = new javax.swing.JLabel();
        lblItem2 = new javax.swing.JLabel();
        lblItem3 = new javax.swing.JLabel();
        lblItem4 = new javax.swing.JLabel();
        jbtAdd1 = new javax.swing.JButton();
        jbtAdd2 = new javax.swing.JButton();
        jbtAdd3 = new javax.swing.JButton();
        jbtAdd4 = new javax.swing.JButton();
        lblPrice1 = new javax.swing.JLabel();
        lblPrice2 = new javax.swing.JLabel();
        lblPrice3 = new javax.swing.JLabel();
        lblPrice4 = new javax.swing.JLabel();
        jbGoBack = new javax.swing.JButton();
        jbOrder = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblQua1 = new javax.swing.JLabel();
        lblQua2 = new javax.swing.JLabel();
        lblQua3 = new javax.swing.JLabel();
        lblQua4 = new javax.swing.JLabel();
        jbtDe1 = new javax.swing.JButton();
        jbtDe2 = new javax.swing.JButton();
        jbtDe3 = new javax.swing.JButton();
        jbtDe4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(275, 53));

        jlResName.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResName, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResName, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
        );

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(lblItem1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 260, 30));

        lblItem2.setText("jLabel2");
        jPanel2.add(lblItem2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 210, 30));

        lblItem3.setText("jLabel2");
        jPanel2.add(lblItem3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 210, 30));

        lblItem4.setText("jLabel2");
        jPanel2.add(lblItem4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 210, 30));

        jbtAdd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jbtAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAdd1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 20, 20));

        jbtAdd2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jbtAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAdd2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtAdd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 20, 20));

        jbtAdd3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jbtAdd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAdd3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtAdd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 20, 20));

        jbtAdd4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jbtAdd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAdd4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtAdd4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 20, 20));

        lblPrice1.setText("jLabel2");
        jPanel2.add(lblPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 70, 30));

        lblPrice2.setText("jLabel2");
        jPanel2.add(lblPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 70, 30));

        lblPrice3.setText("jLabel2");
        jPanel2.add(lblPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 70, 30));

        lblPrice4.setText("jLabel2");
        jPanel2.add(lblPrice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 70, 30));

        jbGoBack.setText("Go Back");
        jbGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGoBackActionPerformed(evt);
            }
        });
        jPanel2.add(jbGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jbOrder.setText("Order");
        jbOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOrderActionPerformed(evt);
            }
        });
        jPanel2.add(jbOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel7.setText("RM");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 30));

        lblQua1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQua1.setText("0");
        jPanel2.add(lblQua1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 20, 30));

        lblQua2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQua2.setText("0");
        jPanel2.add(lblQua2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 20, 30));

        lblQua3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQua3.setText("0");
        jPanel2.add(lblQua3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 20, 30));

        lblQua4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQua4.setText("0");
        jPanel2.add(lblQua4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 20, 30));

        jbtDe1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jbtDe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDe1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtDe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 20, 20));

        jbtDe2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jbtDe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDe2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtDe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 20, 20));

        jbtDe3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jbtDe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDe3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtDe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 20, 20));

        jbtDe4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        jbtDe4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDe4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtDe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 20, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int generateOrderID(OrderLinkedList<OrderDelivery> odList) {
        int orderID = 1001;
        int count = 0;
        count = odList.getNumberOfEntries();//client.MainMenu.odList.getNumberOfEntries();
        //System.out.println(count);
        orderID = orderID + count;
        return orderID;
    }

    public void removeOrderItem(OrderItemLinkedList<OrderItem> oiList)
    {
        for (int i = 1; i <= oiList.getNumberOfEntries(); i++) {
            if (oiList.getEntry(i).getOdID()==id){ 
            oiList.remove(i);
            }}
    }
    
    private void jbGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGoBackActionPerformed
        // TODO add your handling code here:
        if(qua1!=0 || qua2!=0 || qua3!=0 || qua4!=0 )
        {
            removeOrderItem(oiList);
        }
        FRestaurant resFrame = new FRestaurant(userName);
        resFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbGoBackActionPerformed


    private void jbtAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAdd1ActionPerformed
        // TODO add your handling code here:

        String item = lblItem1.getText();
        qua1++;
        lblQua1.setText(String.valueOf(qua1));

        double price = Double.parseDouble(lblPrice1.getText());
        price = price * qua1;
        order1 = new OrderItem(id, item, qua1, price);
    }//GEN-LAST:event_jbtAdd1ActionPerformed

    private void jbtAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAdd2ActionPerformed
        // TODO add your handling code here:
        String item = lblItem2.getText();
        qua2++;
        lblQua2.setText(String.valueOf(qua2));

        double price = Double.parseDouble(lblPrice2.getText());
        price = price * qua2;
        order2 = new OrderItem(id, item, qua2, price);
    }//GEN-LAST:event_jbtAdd2ActionPerformed

    private void jbtAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAdd3ActionPerformed
        // TODO add your handling code here:
        String item = lblItem3.getText();

        qua3++;
        lblQua3.setText(String.valueOf(qua3));

        double price = Double.parseDouble(lblPrice3.getText());
        price = price * qua3;
        order3 = new OrderItem(id, item, qua3, price);

    }//GEN-LAST:event_jbtAdd3ActionPerformed

    private void jbtAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAdd4ActionPerformed
        // TODO add your handling code here:
        String item = lblItem4.getText();
        qua4++;
        lblQua4.setText(String.valueOf(qua4));

        double price = Double.parseDouble(lblPrice4.getText());
        price = price * qua4;
        order4 = new OrderItem(id, item, qua4, price);

    }//GEN-LAST:event_jbtAdd4ActionPerformed

    private void jbOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOrderActionPerformed
        // TODO add your handling code here:
        String phone="";
        boolean or = false;
        for (int i = 1; i <= cusList.getNumberOfEntries(); i++) {
            if (cusList.getEntry(i).getCusName()==userName){ 
                phone = cusList.getEntry(i).getCusPhone();
                or = true;
            }
        }
        if(or == true)
            getOrder(phone);
        else{
                JOptionPane.showMessageDialog(this, "Sorry, you cannot make order because you did not have an account. \nPlease Sign up or Login first.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    public void getOrder(String phone){
        double subTotal = 0;

        if (order1 != null) {
            oiList.add(order1);
            subTotal += order1.getOiPrice();
        }
        if (order2 != null) {
            oiList.add(order2);
            subTotal += order2.getOiPrice();
        }
        if (order3 != null) {
            oiList.add(order3);
            subTotal += order3.getOiPrice();
        }
        if (order4 != null) {
            oiList.add(order4);
            subTotal += order4.getOiPrice();
        }

        GregorianCalendar cal = new GregorianCalendar();
        int date = cal.get(GregorianCalendar.DATE);
        String odDate = String.valueOf(date);

        OrderDelivery newEntry = new OrderDelivery(id, "", odDate, userName, phone, subTotal, 0, 0, "", jlResName.getText(), 0, "Pending");
        odList.add(newEntry);

        FConfirm orderCon = new FConfirm(odList, oiList, id);
        orderCon.setRes(jlResName.getText());
        orderCon.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbOrderActionPerformed

    private void jbtDe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDe1ActionPerformed
        // TODO add your handling code here:
        if (qua1 <= 0) {
            JOptionPane.showMessageDialog(this, "No item can be deducted.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String item = lblItem1.getText();
            qua1--;
            lblQua1.setText(String.valueOf(qua1));

            double price = Double.parseDouble(lblPrice1.getText());
            price = price * qua1;
            order1 = new OrderItem(id, item, qua1, price);
        }
    }//GEN-LAST:event_jbtDe1ActionPerformed

    private void jbtDe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDe2ActionPerformed
        // TODO add your handling code here:
        if (qua2 <= 0) {
            JOptionPane.showMessageDialog(this, "No item can be deducted.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String item = lblItem2.getText();
            qua2--;
            lblQua2.setText(String.valueOf(qua2));

            double price = Double.parseDouble(lblPrice2.getText());
            price = price * qua2;
            order2 = new OrderItem(id, item, qua2, price);
        }
    }//GEN-LAST:event_jbtDe2ActionPerformed

    private void jbtDe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDe3ActionPerformed
        // TODO add your handling code here:
        if (qua3 <= 0) {
            JOptionPane.showMessageDialog(this, "No item can be deducted.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String item = lblItem3.getText();
            qua3--;
            lblQua3.setText(String.valueOf(qua3));

            double price = Double.parseDouble(lblPrice3.getText());
            price = price * qua3;
            order3 = new OrderItem(id, item, qua3, price);
        }
    }//GEN-LAST:event_jbtDe3ActionPerformed

    private void jbtDe4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDe4ActionPerformed
        // TODO add your handling code here:
        if (qua4 <= 0) {
            JOptionPane.showMessageDialog(this, "No item can be deducted.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String item = lblItem4.getText();
            qua4--;
            lblQua4.setText(String.valueOf(qua4));

            double price = Double.parseDouble(lblPrice4.getText());
            price = price * qua4;
            order4 = new OrderItem(id, item, qua4, price);
        }
    }//GEN-LAST:event_jbtDe4ActionPerformed

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
            java.util.logging.Logger.getLogger(FMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenuItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenuItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbGoBack;
    private javax.swing.JButton jbOrder;
    private javax.swing.JButton jbtAdd1;
    private javax.swing.JButton jbtAdd2;
    private javax.swing.JButton jbtAdd3;
    private javax.swing.JButton jbtAdd4;
    private javax.swing.JButton jbtDe1;
    private javax.swing.JButton jbtDe2;
    private javax.swing.JButton jbtDe3;
    private javax.swing.JButton jbtDe4;
    private javax.swing.JLabel jlResName;
    private javax.swing.JLabel lblItem1;
    private javax.swing.JLabel lblItem2;
    private javax.swing.JLabel lblItem3;
    private javax.swing.JLabel lblItem4;
    private javax.swing.JLabel lblPrice1;
    private javax.swing.JLabel lblPrice2;
    private javax.swing.JLabel lblPrice3;
    private javax.swing.JLabel lblPrice4;
    private javax.swing.JLabel lblQua1;
    private javax.swing.JLabel lblQua2;
    private javax.swing.JLabel lblQua3;
    private javax.swing.JLabel lblQua4;
    // End of variables declaration//GEN-END:variables

    private void orderConfirm(OrderLinkedList<OrderDelivery> orderL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
