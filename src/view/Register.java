/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;

import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;


import java.util.Date;
import java.util.Properties;
import javax.mail.PasswordAuthentication;
import javax.mail.Authenticator;
import javax.mail.Message;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.awt.event.ActionListener;
//import java.net.Authenticator;
//import java.net.PasswordAuthentication;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import model.Forgot_MK;
import responsetory.Repo_Forgot;


/**
 *
 * @author RAVEN
 */
public class Register extends javax.swing.JPanel {

    Repo_Forgot FogotRepo = new Repo_Forgot();

    /**
     * Creates new form Login
     */
    public Register() {
        initComponents();
    }

    public void register() {
        txtUser.grabFocus();
    }

    public void addEventBackLogin(ActionListener event) {
        cmdBackLogin.addActionListener(event);
    

   

    
    }
        private String codeMKM = "";

    private void Gui_Email() {
//        final String username = "ngotrungkien13031977@gmail.com";
//        final String password = "dfgsdfhgsad";
         final String username = "manhcuong20054@gmail.com";
        final String password = "achp bres ntlc azxv";

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true");

        for (int i = 0; i < 6; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 9 + 1;
            int randomInt = (int) randomDouble;
            this.codeMKM += randomInt;
        }
        final String textMKM = "Đây là mã OTP của bạn: " + this.codeMKM + "\nVui lòng không chia sẻ mã này cho bất kì ai!";

        //Đăng nhập email
        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(txtmail.getText())
            );
            message.setSubject("Cửa Hàng Dép Bee: Mã OTP!");
            message.setText(textMKM);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Email đã được gửi thành công!");
            ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
            scheduler.schedule(() -> {
                // Xử lý sau khi thời gian hiệu lực hết hạn
                System.out.println("Mã OTP đã hết hạn sau 120s.");
                JOptionPane.showMessageDialog(this, "Mã OTP đã hết hạn");
                // Có thể thực hiện các hành động khác ở đây
                this.codeMKM="";
                // Đóng scheduler sau khi hoàn thành
                scheduler.shutdown();
            }, 120, TimeUnit.SECONDS);
            System.out.println("Done");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
     private boolean check_Email() {

        String checkEmail = txtmail.getText(); // Lấy email từ txtEmailTo

        if (checkEmail.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(this, "Email đang trống!");
            return false;
        }

        // Biểu thức chính quy để kiểm tra định dạng email
        String checkFormEmail = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Kiểm tra định dạng email
        if (!checkEmail.matches(checkFormEmail)) {
            JOptionPane.showMessageDialog(this, "Định dạng email không hợp lệ!");
            return false;
        }

        return true; // Trả về false nếu không tìm thấy
    }
      private boolean checkCodeMKM() {
        String code = this.txtcode.getText();
        if (!code.equalsIgnoreCase(this.codeMKM)) {
            JOptionPane.showMessageDialog(this, "Bạn đã nhập sai code! \n" + "Mời bạn nhập lại");
            return false;
        } else {
            return true;
        }
    }
      public void Rest(){
          txtUser.setText("");
          txtPass.setText("");
            txtPass1.setText("");
            txtcode.setText("");
            txtmail.setText("");
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUser = new swing.MyTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPass = new swing.MyPassword();
        jLabel3 = new javax.swing.JLabel();
        myButton1 = new swing.MyButton();
        cmdBackLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtPass1 = new swing.MyPassword();
        txtmail = new swing.MyTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcode = new swing.MyTextField();
        btnguimail = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tên Tài Khoản");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(69, 68, 68));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Forgot Passworld");
        jLabel2.setToolTipText("");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        jLabel3.setText("Mật Khẩu Mới");

        myButton1.setBackground(new java.awt.Color(125, 229, 251));
        myButton1.setForeground(new java.awt.Color(40, 40, 40));
        myButton1.setText("Lưu");
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });

        cmdBackLogin.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        cmdBackLogin.setForeground(new java.awt.Color(30, 122, 236));
        cmdBackLogin.setText("Back to Login");
        cmdBackLogin.setContentAreaFilled(false);
        cmdBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel4.setText("Xác Nhận Mật Khẩu");

        txtPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Email");

        jLabel6.setText("Code");

        btnguimail.setText("Gửi");
        btnguimail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguimailActionPerformed(evt);
            }
        });

        jButton2.setText("Xác Nhận ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(myButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdBackLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(txtPass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnguimail))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnguimail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(28, 28, 28)
                .addComponent(myButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cmdBackLogin))
        );
    }// </editor-fold>//GEN-END:initComponents


    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
              if(txtPass.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Bạn không được bỏ trống MK Mới");
            return;
        }
        if(txtPass1.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this,"Bạn không được bỏ trống XN Mật khẩu");
            return;
        }
        if(!txtPass.getText().equals(txtPass1.getText())){
            JOptionPane.showMessageDialog(this,"Mật khẩu và Xác nhận MK phải trùng khớp");
            return;
        }
        JOptionPane.showMessageDialog(this,FogotRepo.UpdateMatKhauTheoEmail(txtPass1.getText(), txtUser.getText()) );
this.Rest();
    }//GEN-LAST:event_myButton1ActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPass1ActionPerformed

    private void btnguimailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguimailActionPerformed
        // TODO add your handling code here:
         if (check_Email() == true) {
            Gui_Email();
        } else {
            JOptionPane.showMessageDialog(this,"Mời bạn thử lại");
        }
    }//GEN-LAST:event_btnguimailActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          if (check_Email() == true && checkCodeMKM() == true) {
            JOptionPane.showMessageDialog(this,"Xác nhận thành công");
            txtPass.setEnabled(true);
            txtPass1.setEnabled(true);
        }else{
            txtcode.setText("");
            JOptionPane.showMessageDialog(this,"Xác nhận thất bại");
            return;
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguimail;
    private javax.swing.JButton cmdBackLogin;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private swing.MyButton myButton1;
    private swing.MyPassword txtPass;
    private swing.MyPassword txtPass1;
    private swing.MyTextField txtUser;
    private swing.MyTextField txtcode;
    private swing.MyTextField txtmail;
    // End of variables declaration//GEN-END:variables
}
