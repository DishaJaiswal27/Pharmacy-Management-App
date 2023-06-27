
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Disha
 */
public class Profile extends javax.swing.JFrame {
     public String emailPattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
    public String mobileNumberPattern = "^[0-9]*$";
    private String username = "";
    
    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
    }
        public Profile(String tempusername) {
        initComponents();
        username = tempusername;
        setLocationRelativeTo(null);
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
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmobile = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtadd = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROFILE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 157, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 87, 1500, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1398, 21, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 195, -1, 133));

        txtusername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtusername.setText("Username");
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(364, 346, 89, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 148, 53, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 195, 300, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Mobile Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 243, 118, -1));

        txtmobile.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtmobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobileActionPerformed(evt);
            }
        });
        getContentPane().add(txtmobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 281, 300, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 335, 61, -1));

        txtemail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 378, 300, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 442, 80, -1));

        txtadd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddActionPerformed(evt);
            }
        });
        getContentPane().add(txtadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 490, 300, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(794, 552, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paper-background.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1530, 840));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddActionPerformed

    private void txtmobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobileActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String name = txtname.getText();
        String mobile = txtmobile.getText();
        String email = txtemail.getText();
        String address = txtadd.getText();
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name field is required");
        }else if (mobile.equals("")) {
            JOptionPane.showMessageDialog(null, "Mobile Number field is required");
        } else if (!mobile.matches(mobileNumberPattern) || mobile.length() != 10) {
            JOptionPane.showMessageDialog(null, "Mobile Number field is invalid");
        } else if (email.equals("")) {
            JOptionPane.showMessageDialog(null, "Email field is required");
        } else if (!email.matches(emailPattern)) {
            JOptionPane.showMessageDialog(null, "Email field is invalid");
        }else if (address.equals("")) {
            JOptionPane.showMessageDialog(null, "Address field is required");
        }else{
            try {
                Connection con = dao.ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update appuser set name=?,mobileNumber=?,email=?,address= ? where userName=?");
                ps.setString(1,name);
                ps.setString(2, mobile);
                ps.setString(3, email);
                ps.setString(4, address);
                ps.setString(5, username);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Profile Updated successfully");
                setVisible(false);
                new Profile(username).setVisible(true);
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        try{
            Connection con = dao.ConnectionProvider.getCon();
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("select * from appuser where username='"+ username+"'");
            while(rs.next()){
                txtname.setText(rs.getString("name"));
                txtmobile.setText(rs.getString("mobileNumber"));
                txtemail.setText(rs.getString("email"));
                txtadd.setText(rs.getString("address"));
                txtusername.setText(username);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtadd;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmobile;
    private javax.swing.JTextField txtname;
    private javax.swing.JLabel txtusername;
    // End of variables declaration//GEN-END:variables
}