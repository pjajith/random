import com.sun.glass.events.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.Toolkit;

public class Login extends javax.swing.JFrame {

    Connection connect = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public Login() {
        initComponents();
        
        connect = MySQLDatabase.ConnectDB();
        
        this.setLocationRelativeTo(null);
    }
       public void Close(){
           WindowEvent win = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
           Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(win);
       }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        text_loginid = new javax.swing.JTextField();
        text_password = new javax.swing.JPasswordField();
        button_login = new javax.swing.JButton();
        label_newacnt = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(235, 171, 114));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sign In");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password");

        text_loginid.setBackground(new java.awt.Color(235, 171, 114));
        text_loginid.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        text_loginid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_loginid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        text_loginid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_loginidActionPerformed(evt);
            }
        });

        text_password.setBackground(new java.awt.Color(235, 171, 114));
        text_password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        text_password.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        text_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                text_passwordKeyPressed(evt);
            }
        });

        button_login.setBackground(new java.awt.Color(235, 171, 114));
        button_login.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        button_login.setForeground(new java.awt.Color(255, 255, 255));
        button_login.setText("Log in");
        button_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        button_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_loginActionPerformed(evt);
            }
        });

        label_newacnt.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        label_newacnt.setForeground(new java.awt.Color(255, 255, 255));
        label_newacnt.setText("Create Account");
        label_newacnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label_newacntMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_loginid, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(label_newacnt)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(button_login, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(text_password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel4)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_loginid, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(text_password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_login)
                    .addComponent(label_newacnt))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void text_loginidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_loginidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_loginidActionPerformed

    private void label_newacntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_newacntMouseClicked
        CreateAccount newact = new CreateAccount();
        
        newact.setVisible(true);
        Close();
    }//GEN-LAST:event_label_newacntMouseClicked

    private void button_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_loginActionPerformed
        try {
            String sql = "select * from passenger where LoginID =? and Password =?";
            ps = connect.prepareStatement(sql);
            ps.setString(1, text_loginid.getText());
            ps.setString(2, text_password.getText());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                Booking book = new Booking(rs.getInt("UserID"));
                book.setVisible(true);
                Close();
                
            } else {
                JOptionPane.showMessageDialog(null,"Incorrect combination of Username & Password");
            }
      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_button_loginActionPerformed

    private void text_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_text_passwordKeyPressed
                if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                try {
                    String sql = "select * from passenger where LoginID =? and Password =?";
                     ps = connect.prepareStatement(sql);
                     ps.setString(1, text_loginid.getText());
                     ps.setString(2, text_password.getText());
                     rs = ps.executeQuery();
            
                    if (rs.next()) {
                    Booking book = new Booking(rs.getInt("UserID"));
                    book.setVisible(true);
                    Close();
                
                } else {
                JOptionPane.showMessageDialog(null,"Incorrect combination of Username & Password");
                }
      
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        
        
        
        
    }//GEN-LAST:event_text_passwordKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_login;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel label_newacnt;
    private javax.swing.JTextField text_loginid;
    private javax.swing.JPasswordField text_password;
    // End of variables declaration//GEN-END:variables
}
