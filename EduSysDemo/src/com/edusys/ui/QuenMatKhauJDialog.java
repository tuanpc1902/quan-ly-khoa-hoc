/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.dao.NhanVienDAO;
import com.edusys.utils.MsgBox;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;
import com.edusys.entity.NhanVien;
import javax.mail.Transport;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



/**
 *
 * @author tuanp
 */
public class QuenMatKhauJDialog extends javax.swing.JDialog {

    /**
     * Creates new form QuenMatKhauJDialog
     */
    public QuenMatKhauJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnGui = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Lấy Lại Mật Khẩu");
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("QUÊN MẬT KHẨU");

        jLabel2.setText("Tên đăng nhập");

        txtTenDangNhap.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtTenDangNhap.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtTenDangNhapMouseMoved(evt);
            }
        });
        txtTenDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTenDangNhapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTenDangNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTenDangNhapMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTenDangNhapMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTenDangNhapMouseReleased(evt);
            }
        });
        txtTenDangNhap.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtTenDangNhapInputMethodTextChanged(evt);
            }
        });
        txtTenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenDangNhapKeyReleased(evt);
            }
        });

        jLabel3.setText("Email");

        txtEmail.setEditable(false);
        txtEmail.setForeground(new java.awt.Color(255, 102, 0));

        btnGui.setText("Gửi đến Email");
        btnGui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuiActionPerformed(evt);
            }
        });
        jPanel1.add(btnGui);

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtTenDangNhap)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuiActionPerformed
        if(!validates()){
            return;
        }
        try{
            guiMail();
        }
        catch(Exception e){
            MsgBox.alert(this, "Sai tên đăng nhập!");
        }
    }//GEN-LAST:event_btnGuiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void txtTenDangNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenDangNhapMouseExited
        // TODO add your handling code here:
//        reload();
    }//GEN-LAST:event_txtTenDangNhapMouseExited

    private void txtTenDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenDangNhapMouseEntered
        // TODO add your handling code here:
//        reload();
    }//GEN-LAST:event_txtTenDangNhapMouseEntered

    private void txtTenDangNhapInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtTenDangNhapInputMethodTextChanged
        // TODO add your handling code here:
//        reload();
    }//GEN-LAST:event_txtTenDangNhapInputMethodTextChanged

    private void txtTenDangNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenDangNhapMouseClicked
        // TODO add your handling code here:
//        reload();
    }//GEN-LAST:event_txtTenDangNhapMouseClicked

    private void txtTenDangNhapMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenDangNhapMouseMoved
        // TODO add your handling code here:
//        reload();
    }//GEN-LAST:event_txtTenDangNhapMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
//        reload();
    }//GEN-LAST:event_formMouseMoved

    private void txtTenDangNhapMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenDangNhapMousePressed
        // TODO add your handling code here:
//        reload();
    }//GEN-LAST:event_txtTenDangNhapMousePressed

    private void txtTenDangNhapMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTenDangNhapMouseReleased
        // TODO add your handling code here:
//        reload();
    }//GEN-LAST:event_txtTenDangNhapMouseReleased

    private void txtTenDangNhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenDangNhapKeyReleased
        // TODO add your handling code here:
        reload();
    }//GEN-LAST:event_txtTenDangNhapKeyReleased

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
            java.util.logging.Logger.getLogger(QuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuenMatKhauJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                QuenMatKhauJDialog dialog = new QuenMatKhauJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGui;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables

    NhanVienDAO dao = new NhanVienDAO();
    
    boolean validates(){
        String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txtEmail.getText());
        if(txtTenDangNhap.getText().equals("")){
            MsgBox.alert(this,"Vui lòng nhập tên đăng nhập!");
            txtTenDangNhap.requestFocus();
            return false;
        }
        if (txtEmail.getText().length() > 0) {
            if (matcher.find() == false) {
                MsgBox.alert(this, "Email sai định dạng !");
                txtEmail.requestFocus();
                return false;
            }
        }
        return true;
    }
    void reload(){
        String tdn = txtTenDangNhap.getText();
        String from = "tuanpcps14046@fpt.edu.vn";
        NhanVien nv = dao.selectById(tdn);
        String email = nv.getEmail();
        txtEmail.setText(email);
    }
    void guiMail() {
        String tdn = txtTenDangNhap.getText();

        String from = "tuanpcps14046@fpt.edu.vn";
        NhanVien nv = dao.selectById(tdn);
        String email = nv.getEmail();
//        txtEmail.setText(email);
        String name = nv.getHoTen();
        String pass = nv.getMatKhau();
        
        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", 587);
        Session s = Session.getInstance(p,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("tuanpcps14046@fpt.edu.vn", "AbcXyzQwe");
            }
        });
        try {
            Message msg = new MimeMessage(s);
            msg.setFrom(new InternetAddress(from));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
            msg.setSubject("Forget PassWord !"); 
            msg.setText("Hello !!! " + name +"\nPassword for " + tdn + " is " + pass);
            Transport.send(msg);
            MsgBox.alert(this,"Chúng tôi đã gửi mật khẩu đến Email của bạn.\nVui lòng kiểm tra hộp thư của bạn!");
            this.dispose();
        } catch (MessagingException e) {
//            throw new RuntimeException(e);
            MsgBox.alert(this,"Gửi mail thất bại!");
        }
    }
}
