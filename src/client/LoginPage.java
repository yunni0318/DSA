/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import javax.swing.JOptionPane;
import static client.MainMenu.dList;
import static client.MainMenu.userName;
import static client.MainMenu.afList;
import static client.MainMenu.cusList;
import static client.MainMenu.*;


public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
        if (isFirstRun) {
            initAffiliate();
            initItem();
            initDeliveryman();
            initOrderDelivery();
            initOrderItem();
            initCustomer();
            isFirstRun = false;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbPosition = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        btnHome1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 40)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("User Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Password :");

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserName.setToolTipText("");

        btnEnter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(255, 0, 0));
        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Position :");

        cbPosition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Delivery Man", "Affiliate", "HR" }));
        cbPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPositionActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnHome1.setBackground(new java.awt.Color(255, 255, 255));
        btnHome1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        btnHome1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        btnHome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHome1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserName)
                    .addComponent(cbPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnEnter)))
                .addGap(34, 274, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(345, 345, 345))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(btnEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnHome1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed

        if (cbPosition.getSelectedIndex() == 0) {
            Customer();
        }else if (cbPosition.getSelectedIndex() == 1) {
            DeliveryMan();
        } else if (cbPosition.getSelectedIndex() == 2) {
            Affiliate();
        } else if (cbPosition.getSelectedIndex() == 3) {
            HR();
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    private void cbPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPositionActionPerformed

    private void btnHome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHome1ActionPerformed
        FRestaurant home = new FRestaurant();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnHome1ActionPerformed

    public void Customer() {
        String pass = String.valueOf(txtPassword.getText());
        boolean cus = false;
        for (int i = 1; i <= cusList.getNumberOfEntries(); i++) {
            if (cusList.getEntry(i).getCusName().equals(txtUserName.getText()) && cusList.getEntry(i).getCusPassword().equals(pass)) {
                userName = cusList.getEntry(i).getCusName();
                cus = true;
            }         
        }
        if(cus == true)
        {
            FRestaurant fra = new FRestaurant(userName);
                fra.setVisible(true);
                this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Invalid user name or password.", "Warning", JOptionPane.OK_OPTION);
        }
          
    }
    
    public <T> void DeliveryMan() {
        String pass = String.valueOf(txtPassword.getPassword());
        for (int i = 1; i <= dList.getNumberOfEntries(); i++) {
            if (dList.getEntry(i).getDuserName().equals(txtUserName.getText()) && dList.getEntry(i).getdPassword().equals(pass)) {
                userName = dList.getEntry(i).getdName();
                DeliverymanMenu menu = new DeliverymanMenu();
                menu.setVisible(true);
                this.dispose();
            }
        }
    }

    public <T> void Affiliate() {
        String pass = String.valueOf(txtPassword.getPassword());
        for (int i = 1; i <= afList.getNumberOfEntries(); i++) {
            if (afList.getEntry(i).getAfName().equals(txtUserName.getText()) && afList.getEntry(i).getAfPassword().equals(pass)) {
                userName = afList.getEntry(i).getAfName();
                new AddItem().setVisible(true);
                dispose();
            }
        }
    }

    public void HR() {
        if (txtUserName.getText().toUpperCase().equals("HR") && String.valueOf(txtPassword.getPassword()).equals("123")) {
            HRMenu Delivery = new HRMenu();
            Delivery.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid user name or password.", "Warning", JOptionPane.OK_OPTION);
        }
    }

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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnHome1;
    private javax.swing.JComboBox<String> cbPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
