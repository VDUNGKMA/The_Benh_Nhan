/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomerCard;

import java.awt.Font;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Base64;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
//import sun.misc.BASE64Decoder;

/**
 *
 * @author anhta
 */
public class FormLogin extends javax.swing.JFrame {

    ImageIcon icon = new ImageIcon("src/img/connect_failed.png");
    ImageIcon icon1 = new ImageIcon("src/img/icon_success.png");
    /**
     * Creates new form FormConnect
     */
    String login;
    String pin;
    String checkCard;
    SmartCardWord card = new SmartCardWord();
    RandomString str = new RandomString();
    String sign;
    byte signData[];
    boolean verify;

    public FormLogin() {
        initComponents();
        setLocationRelativeTo(null);
        
         // Kiểm tra trạng thái thẻ
        checkCard = card.checkCard();
        if (checkCard.equals("0")) {
            bt_login.setEnabled(false);
            unblock_btn.setEnabled(false);
        } else {
            init_btn.setEnabled(false);
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

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        init_btn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        unblock_btn = new javax.swing.JButton();
        txtPin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(238, 238, 238));

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(53, 66, 89), 3));
        kGradientPanel1.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1005, 600));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(53, 66, 89));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thẻ bệnh nhân");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        bt_login.setBackground(new java.awt.Color(0, 102, 102));
        bt_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_login.setText("ĐĂNG NHẬP");
        bt_login.setBorderPainted(false);
        bt_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bt_login.setPreferredSize(new java.awt.Dimension(170, 30));
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        init_btn.setBackground(new java.awt.Color(0, 102, 102));
        init_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        init_btn.setForeground(new java.awt.Color(255, 255, 255));
        init_btn.setText("KHỞI TẠO THẺ");
        init_btn.setBorderPainted(false);
        init_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        init_btn.setPreferredSize(new java.awt.Dimension(170, 30));
        init_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                init_btnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(53, 66, 89));
        jLabel2.setText("Nhập mã PIN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_key_40px_2.png"))); // NOI18N

        Right.setBackground(new java.awt.Color(0, 102, 102));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel6.setFont(new java.awt.Font("Showcard Gothic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Smart Card");

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("copyright © company name All rights reserved");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addGap(0, 84, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(40, 40, 40))
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(119, 119, 119))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel5)
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 358, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(78, 78, 78))
        );

        unblock_btn.setBackground(new java.awt.Color(0, 102, 102));
        unblock_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        unblock_btn.setForeground(new java.awt.Color(255, 255, 255));
        unblock_btn.setText("MỞ KHÓA THẺ");
        unblock_btn.setBorderPainted(false);
        unblock_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        unblock_btn.setPreferredSize(new java.awt.Dimension(170, 30));
        unblock_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unblock_btnActionPerformed(evt);
            }
        });

        txtPin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(init_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(unblock_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(318, 318, 318)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_login, init_btn});

        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel2)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtPin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(85, 85, 85)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(init_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(unblock_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 276, Short.MAX_VALUE))
        );

        kGradientPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bt_login, init_btn});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed

 UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Times New Roman", Font.BOLD, 24)));

    // Validate input
    if (txtPin.getPassword().length == 0) {
        JOptionPane.showMessageDialog(null, "Vui lòng nhập mã PIN để đăng nhập!", "", JOptionPane.INFORMATION_MESSAGE, icon);
        return;
    }

    try {
        // Retrieve the PIN from the input field
        char[] pinChars = txtPin.getPassword();
        String pin = new String(pinChars);
// Băm mã PIN bằng SHA-256
    MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
    byte[] pinHash = sha256.digest(pin.getBytes(StandardCharsets.UTF_8));
        System.out.println("check pin hash"+ bytesToHex(pinHash));
    // Gửi mã băm lên thẻ
    String loginResponse = card.login(pinHash);
    System.out.println("Check login response: " + loginResponse);

        // Handle the response
        handleLoginResponse(loginResponse);

    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, "Lỗi trong quá trình đăng nhập!", "", JOptionPane.ERROR_MESSAGE, icon);
        ex.printStackTrace();
    }
    }//GEN-LAST:event_bt_loginActionPerformed

    private static String bytesToHex(byte[] bytes) {
    StringBuilder sb = new StringBuilder();
    for (byte b : bytes) {
        sb.append(String.format("%02X", b)); // Chuyển mỗi byte thành chuỗi Hex chữ hoa
    }
    return sb.toString();
}

    private void handleLoginResponse(String response) {
    switch (response) {
        case "7":
            JOptionPane.showMessageDialog(null, "Sai mã PIN. Còn 4 lần đăng nhập!", "", JOptionPane.INFORMATION_MESSAGE, icon);
            break;
        case "6":
            JOptionPane.showMessageDialog(null, "Sai mã PIN. Còn 3 lần đăng nhập!", "", JOptionPane.INFORMATION_MESSAGE, icon);
            break;
        case "5":
            JOptionPane.showMessageDialog(null, "Sai mã PIN. Còn 2 lần đăng nhập!", "", JOptionPane.INFORMATION_MESSAGE, icon);
            break;
        case "4":
            JOptionPane.showMessageDialog(null, "Sai mã PIN. Còn 1 lần đăng nhập!", "", JOptionPane.INFORMATION_MESSAGE, icon);
            break;
        case "1":
            // Successfully logged in
            try {
                authenticateUser(); // Perform additional user authentication if needed
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Lỗi xác thực!", "", JOptionPane.ERROR_MESSAGE, icon);
            }
            break;
        case "2":
            JOptionPane.showMessageDialog(null, "Thẻ đã bị khóa!", "", JOptionPane.INFORMATION_MESSAGE, icon);
            bt_login.setEnabled(false);
            unblock_btn.setEnabled(true);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Lỗi không xác định. Vui lòng thử lại!", "", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}


    private void authenticateUser() throws Exception {
    // Generate a random text for signing
    String randomText = str.getAlphaNumericString(10);
    String randomHex = String.format("%x", new BigInteger(1, randomText.getBytes(StandardCharsets.UTF_8)));
    
    // Prepare data for signing
    String pin = new String(txtPin.getPassword());
    byte[] pinBytes = pin.getBytes(StandardCharsets.UTF_8);
    String pinHex = String.format("%x", new BigInteger(1, pinBytes));
    String data = pinHex + "03" + randomHex;
    System.out.println("Data for signing (Hex): " + data);

   // Convert data to byte array
    byte[] signData = new BigInteger(data, 16).toByteArray();

    // Transmit data to the card and get the signature
    String signatureHex = card.getSign(signData);
    System.out.println("Signature (Hex): " + signatureHex);

    // Get and validate card ID
    String cardId = card.getId();
    System.out.println("Card ID (Decoded): " + cardId);

    if (Verify_Digital_Signature(signData, card.hexStringToByteArray(signatureHex), cardId)) {
        JOptionPane.showMessageDialog(null, "Xác thực thành công!", "", JOptionPane.INFORMATION_MESSAGE, icon1);
        // Navigate to the next screen
        Patient patient = new Patient();
        patient.setLocationRelativeTo(null);
        patient.setVisible(true);
        this.setVisible(false);
    } else {
        JOptionPane.showMessageDialog(null, "Lỗi xác thực chữ ký!", "", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}

// Xử lý sự kiện nút "Khởi tạo thẻ"
    private void init_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_init_btnActionPerformed
        // TODO add your handling code here:
        UIManager.put("OptionPane.messageFont", new FontUIResource(new Font("Times New Roman", Font.BOLD, 24)));  
        checkCard = card.checkCard();
        switch (checkCard) {
            case "1":
                JOptionPane.showMessageDialog(null, "Thẻ đã được khởi tạo!", "", JOptionPane.INFORMATION_MESSAGE, icon);
//                init_btn.setEnabled(false);
                break;
            case "0":
                FormInit formInit = new FormInit();
                formInit.setVisible(true);
                formInit.setLocationRelativeTo(null);
                this.setVisible(false);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_init_btnActionPerformed

    private void unblock_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unblock_btnActionPerformed
     
        if (txtPin.getPassword().length == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập mã PIN để mở khóa thẻ!", "", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            char[] pinChars = txtPin.getPassword();
            String pinHex = String.format("%x", new BigInteger(1, new String(pinChars).getBytes(StandardCharsets.UTF_8)));

            String unblockResponse = card.unblockcard(card.hexStringToByteArray(pinHex));
            if (unblockResponse.equals("1")) {
                JOptionPane.showMessageDialog(null, "Mở khóa thành công!", "", JOptionPane.INFORMATION_MESSAGE, icon1);
                  Patient patient = new Patient();
                    patient.setLocationRelativeTo(null);
                    patient.setVisible(true);
                    this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Mở khóa thất bại!", "", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        }
    }//GEN-LAST:event_unblock_btnActionPerformed

    private void txtPinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPinActionPerformed


    // Hàm xác thực chữ ký số
public boolean Verify_Digital_Signature(byte[] input, byte[] signatureToVerify, String id) throws Exception {
    // Lấy khóa công khai từ cơ sở dữ liệu
    System.out.println("check id"+ id);
    String publicKeyStr = DBConnection.getPublicKey(id);
    if (publicKeyStr == null || publicKeyStr.isEmpty()) {
        System.err.println("Khoa cong khai khong ton tai trong co so du lieu  ID: " + id);
        return false;
    }

    System.out.println("Public Key String: " + publicKeyStr);

    // Giải mã Base64 thành byte array
    byte[] pubKeyBytes = Base64.getDecoder().decode(publicKeyStr);
    System.out.println("Public Key Bytes: " + Arrays.toString(pubKeyBytes));

    // Tạo đối tượng PublicKey
    KeyFactory keyFactory = KeyFactory.getInstance("RSA");
    PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(pubKeyBytes));

    // Khởi tạo Signature cho việc xác thực
    Signature signature = Signature.getInstance("SHA1withRSA");
    signature.initVerify(publicKey);
    signature.update(input);

    // Xác thực chữ ký
    boolean isValid = signature.verify(signatureToVerify);
    System.out.println("Kết quả xác thực: " + isValid);
    return isValid;
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
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Right;
    private javax.swing.JButton bt_login;
    private javax.swing.JButton init_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPasswordField txtPin;
    private javax.swing.JButton unblock_btn;
    // End of variables declaration//GEN-END:variables
}
