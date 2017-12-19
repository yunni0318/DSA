/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import adt.OrderItemLinkedList;
import adt.OrderLinkedList;
import javax.swing.JOptionPane;
import entity.OrderDelivery;
import entity.OrderItem;
import java.util.GregorianCalendar;


/**
 *
 * @author Tea Evon
 */
public class FMenuItem extends javax.swing.JFrame {    

    FConfirm orderConfirmF = new FConfirm();
    
    /**
     * Creates new form JFMenuItem
     */
    public FMenuItem() {
        initComponents();   
    }
    
    OrderItemLinkedList<OrderItem> oiList = new OrderItemLinkedList<>();
    OrderLinkedList<OrderDelivery> odList = new OrderLinkedList<>();
    
    OrderItem order1;
    OrderItem order2;
    OrderItem order3;
    OrderItem order4;
    int qua1 = 0;
    int qua2 = 0;
    int qua3 = 0;
    int qua4 = 0;
    int id = generateOrderID();
    String idStr = String.valueOf(generateOrderID());
    
    public void setRes(String res)
    {
        this.jlResName.setText(res);
    }
    public String getRes()
    {
        return this.jlResName.getText();
    }

    public void getMenu(String res)
    {       
        String resN = jlResName.getText();
        if(resN=="Homemade Chinese Restaurant")
        {
            lblItem1.setText("Spicy Dry Noodle");
            jlPrise1.setText("10.00");
            jLabel2.setText("Fried Rice with Chinese Sausage");
            jlPrise2.setText("11.00");
            jLabel3.setText("Special Dumping Soup (4 pcs)");
            jlPrise3.setText(" 8.00");
            jLabel4.setText("Lo Han Guo Herba Tea");
            jlPrise4.setText(" 4.00");   
        }
        else if(resN=="Delicious Sushi Restaurant")
        {
            lblItem1.setText("Sushi Set (salmon, maguro, ebi,anago)");
            jlPrise1.setText("22.00");
            jLabel2.setText("Ramen Soup");
            jlPrise2.setText("18.00");
            jLabel3.setText("Chicken Teriyaki Bento");
            jlPrise3.setText("20.00");
            jLabel4.setText("Tropicana Twister Orange Juice");
            jlPrise4.setText(" 6.00");
        }
        
        else if(resN=="Kenny Roaster Restaurant")
        {
            lblItem1.setText("Honey Roaster Chicken");
            jlPrise1.setText("20.00");
            jLabel2.setText("Spicy Roaster Chicken");
            jlPrise2.setText("20.00");
            jLabel3.setText("Glutinous Oil Rice");
            jlPrise3.setText(" 4.00");
            jLabel4.setText("Pepsi");
            jlPrise4.setText(" 5.00");
        }
        
        else if(resN=="Bukit Bintang Nasi Lemak ")
        {
            lblItem1.setText("Nasi Lemak with Egg");
            jlPrise1.setText("10.00");
            jLabel2.setText("Nasi Lemak with Fried Chicken");
            jlPrise2.setText("12.00");
            jLabel3.setText("Nasi Lemak with Currry Chicken");
            jlPrise3.setText("15.00");
            jLabel4.setText("Bentong Cincau");
            jlPrise4.setText(" 5.00");
        }
        
        else if(resN=="All Noodle Restaurant")
        {
         lblItem1.setText("Special Dry Noodle");
            jlPrise1.setText(" 8.00");
            jLabel2.setText("Special Noodle Soup");
            jlPrise2.setText(" 9.00");
            jLabel3.setText("Spicy Noodle Soup");
            jlPrise3.setText("10.00");
            jLabel4.setText("Honey Lemon Tea");
            jlPrise4.setText(" 4.00");   
        }
        
        else if(resN=="Rice Tong Restaurant")
        {
            lblItem1.setText("Salted Fish Pork Rice");
            jlPrise1.setText("12.00");
            jLabel2.setText("Shrimp Fried Rice");
            jlPrise2.setText("11.00");
            jLabel3.setText("Sweet and Sour Pork Rice");
            jlPrise3.setText(" 8.00");
            jLabel4.setText("Chinese Tea");
            jlPrise4.setText(" 3.00");
        }
        
        else if(resN=="Special Spaghetti Restaurant")
        {
            lblItem1.setText("Special Spaghetti");
            jlPrise1.setText("11.00");
            jLabel2.setText("Baked Cheese Spaghetti");
            jlPrise2.setText("15.00");
            jLabel3.setText("Spaghetti Bolognese");
            jlPrise3.setText("13.00");
            jLabel4.setText("Lemon Tea");
            jlPrise4.setText(" 5.00");
        }
        
        else if(resN=="Homemade Western Food")
        {
            lblItem1.setText("Homemade Pork Chop");
            jlPrise1.setText("15.00");
            jLabel2.setText("Black Peper Chicken Chop");
            jlPrise2.setText("13.00");
            jLabel3.setText("Fried Rice");
            jlPrise3.setText(" 7.00");
            jLabel4.setText("Red Tea");
            jlPrise4.setText(" 4.00");
        }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbtAdd1 = new javax.swing.JButton();
        jbtAdd2 = new javax.swing.JButton();
        jbtAdd3 = new javax.swing.JButton();
        jbtAdd4 = new javax.swing.JButton();
        jlPrise1 = new javax.swing.JLabel();
        jlPrise2 = new javax.swing.JLabel();
        jlPrise3 = new javax.swing.JLabel();
        jlPrise4 = new javax.swing.JLabel();
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

        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 210, 30));

        jLabel3.setText("jLabel2");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 210, 30));

        jLabel4.setText("jLabel2");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 210, 30));

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

        jlPrise1.setText("jLabel2");
        jPanel2.add(jlPrise1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 70, 30));

        jlPrise2.setText("jLabel2");
        jPanel2.add(jlPrise2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 70, 30));

        jlPrise3.setText("jLabel2");
        jPanel2.add(jlPrise3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 70, 30));

        jlPrise4.setText("jLabel2");
        jPanel2.add(jlPrise4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 70, 30));

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

    public int generateOrderID()
    {
        int orderID=1001;
        int count = odList.getNumberOfEntries();
        orderID = orderID + count;
        return orderID;
    }
    
    private void jbGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGoBackActionPerformed
        // TODO add your handling code here:
        FRestaurant resFrame = new FRestaurant();
        resFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbGoBackActionPerformed
    
    
    private void jbtAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAdd1ActionPerformed
        // TODO add your handling code here:
        
        String item = lblItem1.getText();
        qua1 ++;
        lblQua1.setText(String.valueOf(qua1));

        double price = Double.parseDouble(jlPrise1.getText());
        price = price * qua1; 
        order1 = new OrderItem(id, item, qua1, price);
    }//GEN-LAST:event_jbtAdd1ActionPerformed

    private void jbtAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAdd2ActionPerformed
        // TODO add your handling code here:
        String item = jLabel2.getText();
        qua2++;
        lblQua2.setText(String.valueOf(qua2));

        double price = Double.parseDouble(jlPrise2.getText());
        price = price * qua2;
        order2 = new OrderItem(id, item, qua2, price);
    }//GEN-LAST:event_jbtAdd2ActionPerformed

    private void jbtAdd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAdd3ActionPerformed
        // TODO add your handling code here:
        String item = jLabel3.getText();
        
        qua3++;
        lblQua3.setText(String.valueOf(qua3));

        double price = Double.parseDouble(jlPrise3.getText());
        price = price * qua3;
        order3 = new OrderItem(id, item, qua3, price);

    }//GEN-LAST:event_jbtAdd3ActionPerformed

    private void jbtAdd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAdd4ActionPerformed
        // TODO add your handling code here:
        String item = jLabel4.getText();
        qua4++;
        lblQua4.setText(String.valueOf(qua4));

        double price = Double.parseDouble(jlPrise4.getText());
        price = price * qua4;        
        order4 = new OrderItem(id, item, qua4, price);

    }//GEN-LAST:event_jbtAdd4ActionPerformed

    private void jbOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOrderActionPerformed
        // TODO add your handling code here:
        double subTotal=0;
        
        if(order1!=null){
            oiList.add(order1);
            subTotal += order1.getOiPrice();
        }
        if(order2!=null){
            oiList.add(order2);
            subTotal += order2.getOiPrice();
        }
        if(order3!=null){
            oiList.add(order3);
            subTotal += order3.getOiPrice();
        }
        if(order4!=null){
            oiList.add(order4);
            subTotal += order4.getOiPrice();
        }
        
        GregorianCalendar cal = new GregorianCalendar();
        int date = cal.get(GregorianCalendar.DATE);
        String odDate = String.valueOf(date);

        OrderDelivery newEntry = new OrderDelivery(id, "",odDate, "", "", subTotal, 0, 0, "", jlResName.getText(), 0, "");
        odList.add(newEntry);
        FConfirm orderCon = new FConfirm(odList, oiList, id);
        orderCon.setRes(jlResName.getText());
        orderCon.setVisible(true);
        
        this.setVisible(false);
        
    }//GEN-LAST:event_jbOrderActionPerformed

    private void jbtDe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDe1ActionPerformed
        // TODO add your handling code here:
        if(qua1<=0)
        {
            JOptionPane.showMessageDialog(this,"No item can be deducted.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String item = lblItem1.getText();
            qua1 --;
            lblQua1.setText(String.valueOf(qua1));

            double price = Double.parseDouble(jlPrise1.getText());
            price = price * qua1;
            order1 = new OrderItem(id, item, qua1, price);     
        }
    }//GEN-LAST:event_jbtDe1ActionPerformed

    private void jbtDe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDe2ActionPerformed
        // TODO add your handling code here:
        if(qua2<=0)
        {
            JOptionPane.showMessageDialog(this,"No item can be deducted.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            String item = jLabel2.getText();
            qua2--;
            lblQua2.setText(String.valueOf(qua2));

            double price = Double.parseDouble(jlPrise2.getText());
            price = price * qua2;
            order2 = new OrderItem(id, item, qua2, price);
        }
    }//GEN-LAST:event_jbtDe2ActionPerformed

    private void jbtDe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDe3ActionPerformed
        // TODO add your handling code here:
        if(qua3<=0)
        {
            JOptionPane.showMessageDialog(this,"No item can be deducted.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String item = jLabel3.getText();
            qua3--;
            lblQua3.setText(String.valueOf(qua3));

            double price = Double.parseDouble(jlPrise3.getText());
            price = price * qua3;
            order3 = new OrderItem(id, item, qua3, price);
        }
    }//GEN-LAST:event_jbtDe3ActionPerformed

    private void jbtDe4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDe4ActionPerformed
        // TODO add your handling code here:
        if(qua4<=0)
        {
            JOptionPane.showMessageDialog(this,"No item can be deducted.", "Warning", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            String item = jLabel4.getText();
            qua4--;
            lblQua4.setText(String.valueOf(qua4));

            double price = Double.parseDouble(jlPrise4.getText());
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jlPrise1;
    private javax.swing.JLabel jlPrise2;
    private javax.swing.JLabel jlPrise3;
    private javax.swing.JLabel jlPrise4;
    private javax.swing.JLabel jlResName;
    private javax.swing.JLabel lblItem1;
    private javax.swing.JLabel lblQua1;
    private javax.swing.JLabel lblQua2;
    private javax.swing.JLabel lblQua3;
    private javax.swing.JLabel lblQua4;
    // End of variables declaration//GEN-END:variables

    private void orderConfirm(OrderLinkedList<OrderDelivery> orderL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
