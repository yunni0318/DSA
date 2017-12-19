/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
import java.awt.BorderLayout;
/**
 *
 * @author YUNNI
 */
public class HRMenu extends javax.swing.JFrame {

    /**
     * Creates new form HR
     */
    public HRMenu() {
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

        jPanel1 = new javax.swing.JPanel();
        btndeliveryman = new javax.swing.JButton();
        btnpending = new javax.swing.JButton();
        btndaily = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HR");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btndeliveryman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btndeliveryman.setText("Maintain Delivery Man");
        btndeliveryman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeliverymanActionPerformed(evt);
            }
        });

        btnpending.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnpending.setText("View Pending List");
        btnpending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpendingActionPerformed(evt);
            }
        });

        btndaily.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btndaily.setText("Daily Report");
        btndaily.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndailyActionPerformed(evt);
            }
        });

        btnreport.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnreport.setText("Deliveryman Summary Report");
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(255, 255, 255));
        btnHome.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnpending)
                            .addComponent(btndeliveryman)
                            .addComponent(btndaily)
                            .addComponent(btnreport))))
                .addContainerGap(165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btndeliveryman)
                .addGap(18, 18, 18)
                .addComponent(btnpending)
                .addGap(18, 18, 18)
                .addComponent(btndaily)
                .addGap(18, 18, 18)
                .addComponent(btnreport)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btndeliverymanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeliverymanActionPerformed
        AddDeliveryMan Delivery = new AddDeliveryMan();
        Delivery.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndeliverymanActionPerformed

    private void btnpendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpendingActionPerformed
        PendingDeliveries Pending = new PendingDeliveries();
        Pending.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnpendingActionPerformed

    private void btndailyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndailyActionPerformed
        DailyReport Daily = new DailyReport();
        Daily.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btndailyActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        SummaryReport Summary = new SummaryReport();
        Summary.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnreportActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        FRestaurant Pending = new FRestaurant();
        Pending.setVisible(true);
        this.dispose();
        //can't put new
    }//GEN-LAST:event_btnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(HRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HRMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btndaily;
    private javax.swing.JButton btndeliveryman;
    private javax.swing.JButton btnpending;
    private javax.swing.JButton btnreport;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
