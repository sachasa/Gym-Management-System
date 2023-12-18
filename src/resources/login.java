
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VCT
 */
public class login extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        jlab_Incorrect.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtn_LogClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jlab_Incorrect = new javax.swing.JLabel();
        jtxt_User = new javax.swing.JTextField();
        jtxt_Pass = new javax.swing.JPasswordField();
        jbtn_login = new javax.swing.JButton();
        Chec_Pass = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(1366, 833));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn_LogClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon-close-button-vector-20409198__2_-removebg-preview.png"))); // NOI18N
        jbtn_LogClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_LogCloseActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_LogClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 0, 40, 40));

        jLabel1.setFont(new java.awt.Font("Bungee Inline", 1, 80)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("LOGIN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 130, -1, -1));

        jlab_Incorrect.setFont(new java.awt.Font("Russo One", 1, 14)); // NOI18N
        jlab_Incorrect.setForeground(new java.awt.Color(204, 51, 0));
        jlab_Incorrect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/error-removebg-preview (1).png"))); // NOI18N
        jlab_Incorrect.setText("Incorrect Username or Password");
        getContentPane().add(jlab_Incorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 240, -1, -1));

        jtxt_User.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jtxt_User.setText("Enter Username");
        jtxt_User.setSelectionColor(new java.awt.Color(0, 0, 0));
        jtxt_User.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_UserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxt_UserFocusLost(evt);
            }
        });
        getContentPane().add(jtxt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, 303, 31));

        jtxt_Pass.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jtxt_Pass.setText("Enter Password");
        jtxt_Pass.setSelectionColor(new java.awt.Color(0, 0, 0));
        jtxt_Pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxt_PassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxt_PassFocusLost(evt);
            }
        });
        getContentPane().add(jtxt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 350, 303, 30));

        jbtn_login.setFont(new java.awt.Font("Quicksand Medium", 1, 18)); // NOI18N
        jbtn_login.setForeground(new java.awt.Color(0, 204, 0));
        jbtn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login (1).png"))); // NOI18N
        jbtn_login.setText("Login");
        jbtn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtn_loginMouseClicked(evt);
            }
        });
        jbtn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jbtn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 410, -1, -1));

        Chec_Pass.setBackground(javax.swing.UIManager.getDefaults().getColor("CheckBox.light"));
        Chec_Pass.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        Chec_Pass.setText("Show Password");
        Chec_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Chec_PassActionPerformed(evt);
            }
        });
        getContentPane().add(Chec_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 430, -1, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginImage (1).jpeg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1366, 763));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 890));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 140, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_UserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_UserFocusGained
        // TODO add your handling code here:
        jlab_Incorrect.setVisible(false);
        if(jtxt_User.getText().equals("Enter Username"))
        {
            jtxt_User.setText("");
            jtxt_User.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxt_UserFocusGained

    private void jtxt_UserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_UserFocusLost
        // TODO add your handling code here:
        jlab_Incorrect.setVisible(false);
        if(jtxt_User.getText().equals(""))
        {
            jtxt_User.setText("Enter Username");
            jtxt_User.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxt_UserFocusLost

    private void jtxt_PassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_PassFocusGained
        // TODO add your handling code here:
        jlab_Incorrect.setVisible(false);
        if(jtxt_Pass.getText().equals("Enter Password"))
        {
            jtxt_Pass.setText("");
            jtxt_Pass.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxt_PassFocusGained

    private void jtxt_PassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxt_PassFocusLost
        // TODO add your handling code here:
         jlab_Incorrect.setVisible(false);
        if(jtxt_Pass.getText().equals(""))
        {
            jtxt_Pass.setText("Enter Password");
            jtxt_Pass.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jtxt_PassFocusLost

    private void jbtn_LogCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_LogCloseActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null,"Do you want to exit","Select",JOptionPane.YES_NO_OPTION);
        if (a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtn_LogCloseActionPerformed

    private void jbtn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_loginActionPerformed
        // TODO add your handling code here:
        
        
        
       
       
        
    }//GEN-LAST:event_jbtn_loginActionPerformed

    private void Chec_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Chec_PassActionPerformed
        // TODO add your handling code here:
        if(Chec_Pass.isSelected())
        {  
            jtxt_Pass.setEchoChar((char)0);
        }
        else
        {
            jtxt_Pass.setEchoChar('*');
        }
    }//GEN-LAST:event_Chec_PassActionPerformed

    private void jbtn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtn_loginMouseClicked
      
        if(jtxt_User.getText().equals("sas") && jtxt_Pass.getText().equals("12345"))
        {
            setVisible(false);
            new home().setVisible(true);
        }
        else
            jlab_Incorrect.setVisible(true);
        
    }//GEN-LAST:event_jbtn_loginMouseClicked
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Chec_Pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtn_LogClose;
    private javax.swing.JButton jbtn_login;
    private javax.swing.JLabel jlab_Incorrect;
    private javax.swing.JPasswordField jtxt_Pass;
    private javax.swing.JTextField jtxt_User;
    // End of variables declaration//GEN-END:variables

   
}
