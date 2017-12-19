/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import entity.OrderDelivery;
import adt.ListInterface;
import adt.OrderLinkedList;
import adt.OrderItemLinkedList;
import entity.OrderItem;
import java.util.GregorianCalendar;

/**
 *
 * @author Tea Evon
 */
public class FConfirm extends javax.swing.JFrame {
    OrderLinkedList<OrderDelivery> odList = new OrderLinkedList<>();
    OrderItemLinkedList<OrderItem> oiList = new OrderItemLinkedList<>();
    int id;
    
    /**
     * Creates new form ConOrder
     */
    public FConfirm() {
        initComponents();
    }
    
    public FConfirm(OrderLinkedList<OrderDelivery> odList, OrderItemLinkedList<OrderItem> oiList, int id) {
        initComponents();
        clearTable();
        lblOrderID.setText(String.valueOf(id));
        this.odList = odList;
        this.oiList = oiList;
        this.id = id;
        showOrderItem(id);
    }

    public void showOrderItem(int orderID)
    {
        DefaultTableModel model = (DefaultTableModel)tbOrderConfirm.getModel();
        Object[] row = new Object[3];
        
        for (int i = 1; i <= oiList.getNumberOfEntries(); i++) {
            if (oiList.getEntry(i).getOdID()==orderID){   
                row[0] = oiList.getEntry(i).getItName();
                row[1] = oiList.getEntry(i).getOiQuantity();
                row[2] = oiList.getEntry(i).getOiPrice();     
                model.addRow(row);
            }
        }
        
        for (int i = 1; i <= odList.getNumberOfEntries(); i++) {
            if (odList.getEntry(i).getOdID()==orderID){   
                odList.getEntry(i).setDeliveryFee(5.00);
                odList.getEntry(i).setTotal(odList.getEntry(i).getSubTotal()+5.00);
                
                lblSubTotal.setText("RM "+ String.valueOf(odList.getEntry(i).getSubTotal()) + "0");
                lblDeliveryFee.setText("RM "+ String.valueOf(odList.getEntry(i).getDeliveryFee()) + "0");
                lblTotal.setText("RM "+ String.valueOf(odList.getEntry(i).getTotal()) + "0");
            }
        }
        
    }
    
    public void clearTable()
    {
        DefaultTableModel dm = (DefaultTableModel)tbOrderConfirm.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
        dm.removeRow(i);
        }
    }
    
    public void setRes(String res)
    {
        this.jlResName.setText("Restaurant Name : " + res);
    }
    public String getRes()
    {
        return this.jlResName.getText();
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
        jlTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlResName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrderConfirm = new javax.swing.JTable();
        jbMenu = new javax.swing.JButton();
        jbConfirm = new javax.swing.JButton();
        lblOrderID = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        lblDeliveryFee = new javax.swing.JLabel();
        lblTotal2 = new javax.swing.JLabel();
        lblTotal3 = new javax.swing.JLabel();
        lblTotal4 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(470, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(275, 53));

        jlTitle.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jlTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitle.setText("Order Confirmation");
        jlTitle.setToolTipText("");
        jlTitle.setPreferredSize(new java.awt.Dimension(470, 43));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(470, 400));

        jlResName.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jlResName.setText("jLabel1");

        tbOrderConfirm.setAutoCreateRowSorter(true);
        tbOrderConfirm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbOrderConfirm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbOrderConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbOrderConfirmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbOrderConfirm);

        jbMenu.setText("Go Back Menu");
        jbMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbMenuActionPerformed(evt);
            }
        });

        jbConfirm.setText("Confirm ");
        jbConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmActionPerformed(evt);
            }
        });

        lblOrderID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblOrderID.setText("jLabel1");

        lblSubTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubTotal.setText("0.00");

        lblDeliveryFee.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDeliveryFee.setText("0.00");

        lblTotal2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal2.setText("Delivery Fee");

        lblTotal3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal3.setText("Sub Total");

        lblTotal4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal4.setText("Total Amount");

        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("0.00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlResName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblOrderID)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbMenu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDeliveryFee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jlResName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOrderID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeliveryFee, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbMenu)
                    .addComponent(jbConfirm))
                .addContainerGap())
        );

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbMenuActionPerformed
        // TODO add your handling code here:
        String res = jlResName.getText();
        FRestaurant resFrame = new FRestaurant();
        resFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbMenuActionPerformed

    private void jbConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,"Your order is  submited. "//Now you will process to Payment."
                , "Success", JOptionPane.INFORMATION_MESSAGE);
        FCustomerInfor cusFrame = new FCustomerInfor(odList, id);
        cusFrame.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbConfirmActionPerformed

    private void tbOrderConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbOrderConfirmMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbOrderConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(FConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FConfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FConfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbConfirm;
    private javax.swing.JButton jbMenu;
    private javax.swing.JLabel jlResName;
    private javax.swing.JLabel jlTitle;
    private javax.swing.JLabel lblDeliveryFee;
    private javax.swing.JLabel lblOrderID;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTotal2;
    private javax.swing.JLabel lblTotal3;
    private javax.swing.JLabel lblTotal4;
    private javax.swing.JTable tbOrderConfirm;
    // End of variables declaration//GEN-END:variables
}
