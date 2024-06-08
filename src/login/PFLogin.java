package login;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import UI.FMenuManager;
import UI.FMenuStaff;
import UI.JFmenuResident;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Label;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import swing.EventLogin;


public class PFLogin extends PanelCustom {
   
    private EventLogin eventLogin;
    private static final String ERROR_EMPTY_USERNAME = "*Chưa nhập tài khoản.";
    private static final String ERROR_EMPTY_PASSWORD = "*Chưa nhập mật khẩu.";
    private static final String ERROR_INVALID_USERNAME = "*Tài khoản không tồn tại";
    private static final String ERROR_INCORRECT_PASSWORD = "*Mật khẩu không đúng";


    public PFLogin() {
        initComponents();
        setAlpha(1);
    }
    
    public void setEventLogin(EventLogin event) {
        this.eventLogin = event;
    }
    
    private boolean validateInput() {
        if (txtUserName.getText().isEmpty() && txtPassWord.getText().isEmpty()) {
            lbTaikhoan.setText(ERROR_EMPTY_USERNAME);
            lbTaikhoan.setForeground(Color.red);
            lbMatkhau.setText(ERROR_EMPTY_PASSWORD);
            lbMatkhau.setForeground(Color.red);
            Border RedLine = BorderFactory.createLineBorder(Color.red);
            txtUserName.setBorder(RedLine);
            txtPassWord.setBorder(RedLine);
            return false;
        } else if (txtUserName.getText().isEmpty()) {
            lbTaikhoan.setText(ERROR_EMPTY_USERNAME);
            lbTaikhoan.setForeground(Color.red);
            Border RedLine = BorderFactory.createLineBorder(Color.red);
            txtUserName.setBorder(RedLine);
            return false;
        } else if (txtPassWord.getText().isEmpty()) {
            lbMatkhau.setText(ERROR_EMPTY_PASSWORD);
            lbMatkhau.setForeground(Color.red);
            Border RedLine = BorderFactory.createLineBorder(Color.red);
            txtPassWord.setBorder(RedLine);
            return false;
        }
        return true;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUserName = new swing.TextField();
        txtPassWord = new swing.Password();
        btnDangNhap = new swing.Button();
        lbTaikhoan = new javax.swing.JLabel();
        lbMatkhau = new javax.swing.JLabel();

        setBackground(new java.awt.Color(58, 58, 58));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG NHẬP");

        txtUserName.setForeground(new java.awt.Color(242, 242, 242));
        txtUserName.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtUserName.setHint("USERNAME");
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserNameMouseClicked(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUserNameKeyPressed(evt);
            }
        });

        txtPassWord.setForeground(new java.awt.Color(242, 242, 242));
        txtPassWord.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtPassWord.setHint("PASSWORD");
        txtPassWord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPassWordMouseClicked(evt);
            }
        });
        txtPassWord.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassWordKeyPressed(evt);
            }
        });

        btnDangNhap.setBackground(new java.awt.Color(86, 142, 255));
        btnDangNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnDangNhap.setText("ĐĂNG NHẬP");
        btnDangNhap.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbMatkhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        try {
            if (!validateInput()) {
                return; // Nếu dữ liệu không hợp lệ, không thực hiện kiểm tra đăng nhập
            }
            if (txtUserName.getText().equals("") && txtPassWord.getText().equals("")) {
                lbTaikhoan.setText("*Chưa nhập tài khoản.");
                lbTaikhoan.setForeground(Color.red);
                lbMatkhau.setText("*Chưa nhập mật khẩu.");
                lbMatkhau.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtUserName.setBorder(RedLine);
                txtPassWord.setBorder(RedLine);
            } else if (txtUserName.getText().equals("")) {
                lbTaikhoan.setText("*Chưa nhập tài khoản.");
                lbTaikhoan.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtUserName.setBorder(RedLine);
            } else if (txtPassWord.getText().equals("")) {
                lbMatkhau.setText("*Chưa nhập mật khẩu.");
                lbMatkhau.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtPassWord.setBorder(RedLine);
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                AccountDTO tk = dn.CheckUser(txtUserName.getText());
                AccountDTO tk1 = dn.CheckPass(txtPassWord.getText(), txtUserName.getText());

                if (tk == null) {
                        lbTaikhoan.setText("*Tài khoản không tồn tại");
                        txtUserName.setText("");
                        lbTaikhoan.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtUserName.setBorder(RedLine);
                } else {
                    if (tk1 != null) {
                        if (dn.checkNhanVien(tk.getId())==1) {
                            new FMenuManager(txtUserName.getText(),tk.getId()).setVisible(true);
                            EventQueue.invokeLater(() -> {
                                Window window = SwingUtilities.getWindowAncestor(this);
                                if (window != null) {
                                    window.setVisible(false); // Ẩn cửa sổ chính
                                }
                            });
                        } else if (dn.checkNhanVien(tk.getId())==2) {
                             new FMenuStaff(txtUserName.getText(),tk.getId()).setVisible(true);
                            EventQueue.invokeLater(() -> {
                            Window window = SwingUtilities.getWindowAncestor(this);
                            if (window != null) {
                            window.setVisible(false); // Ẩn cửa sổ chính
                            }
                        });
                        }else if (dn.checkNhanVien(tk.getId())==0) {
                             new JFmenuResident(txtUserName.getText(),tk.getId()).setVisible(true);
                            EventQueue.invokeLater(() -> {
                            Window window = SwingUtilities.getWindowAncestor(this);
                            if (window != null) {
                            window.setVisible(false); // Ẩn cửa sổ chính
                            }
                        });
                        } else {
                            lbMatkhau.setText("*Mật khẩu không đúng");
                            txtPassWord.setText("");
                            lbMatkhau.setForeground(Color.red);
                            Border RedLine = BorderFactory.createLineBorder(Color.red);
                            txtPassWord.setBorder(RedLine);
                        }
                    } else {
                        lbMatkhau.setText(ERROR_INCORRECT_PASSWORD);
                        txtPassWord.setText("");
                        lbMatkhau.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtPassWord.setBorder(RedLine);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi trong quá trình đăng nhập. Vui lòng thử lại sau.");
            e.printStackTrace(); // In lỗi ra console cho mục đích ghi nhật ký
        }
         
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (!validateInput()) {
                    return; // Nếu dữ liệu không hợp lệ, không thực hiện kiểm tra đăng nhập
                }
                if (txtUserName.getText().equals("") && txtPassWord.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    lbMatkhau.setText("*Chưa nhập mật khẩu.");
                    lbMatkhau.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtUserName.setBorder(RedLine);
                    txtPassWord.setBorder(RedLine);
                } else if (txtUserName.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtUserName.setBorder(RedLine);
                } else if (txtPassWord.getText().equals("")) {
                    lbMatkhau.setText("*Chưa nhập mật khẩu.");
                    lbMatkhau.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtPassWord.setBorder(RedLine);
                } else {
                    DangNhapDAO dn = new DangNhapDAO();
                    AccountDTO tk = dn.CheckUser(txtUserName.getText());
                    AccountDTO tk1 = dn.CheckPass(txtPassWord.getText(), txtUserName.getText());

                    if (tk == null) {
                        lbTaikhoan.setText("*Tài khoản không tồn tại");
                        txtUserName.setText("");
                        lbTaikhoan.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtUserName.setBorder(RedLine);
                    } else {
                        if (tk1 != null) {
                            if (dn.checkNhanVien(tk.getId())==1) {
                                new FMenuManager(txtUserName.getText(),tk.getId()).setVisible(true);
                                EventQueue.invokeLater(() -> {
                                Window window = SwingUtilities.getWindowAncestor(this);
                                if (window != null) {
                                    window.setVisible(false); // Ẩn cửa sổ chính
                                }
                            });
                        } else if (dn.checkNhanVien(tk.getId())==2) {
                             new FMenuStaff(txtUserName.getText(),tk.getId()).setVisible(true);
                            EventQueue.invokeLater(() -> {
                            Window window = SwingUtilities.getWindowAncestor(this);
                            if (window != null) {
                            window.setVisible(false); // Ẩn cửa sổ chính
                            }
                        });
                        }else if (dn.checkNhanVien(tk.getId())==0) {
                             new JFmenuResident(txtUserName.getText(),tk.getId()).setVisible(true);
                            EventQueue.invokeLater(() -> {
                            Window window = SwingUtilities.getWindowAncestor(this);
                            if (window != null) {
                            window.setVisible(false); // Ẩn cửa sổ chính
                            }
                        });
                        } else {
                            lbMatkhau.setText("*Mật khẩu không đúng");
                            txtPassWord.setText("");
                            lbMatkhau.setForeground(Color.red);
                            Border RedLine = BorderFactory.createLineBorder(Color.red);
                            txtPassWord.setBorder(RedLine);
                        }
                    } else {
                        lbMatkhau.setText(ERROR_INCORRECT_PASSWORD);
                        txtPassWord.setText("");
                        lbMatkhau.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtPassWord.setBorder(RedLine);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi trong quá trình đăng nhập. Vui lòng thử lại sau.");
            e.printStackTrace(); // In lỗi ra console cho mục đích ghi nhật ký
        }
        }
    }//GEN-LAST:event_txtUserNameKeyPressed

    private void txtPassWordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassWordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (!validateInput()) {
                    return; // Nếu dữ liệu không hợp lệ, không thực hiện kiểm tra đăng nhập
                }
                if (txtUserName.getText().equals("") && txtPassWord.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    lbMatkhau.setText("*Chưa nhập mật khẩu.");
                    lbMatkhau.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtUserName.setBorder(RedLine);
                    txtPassWord.setBorder(RedLine);
                } else if (txtUserName.getText().equals("")) {
                    lbTaikhoan.setText("*Chưa nhập tài khoản.");
                    lbTaikhoan.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtUserName.setBorder(RedLine);
                } else if (txtPassWord.getText().equals("")) {
                    lbMatkhau.setText("*Chưa nhập mật khẩu.");
                    lbMatkhau.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    txtPassWord.setBorder(RedLine);
                } else {
                    DangNhapDAO dn = new DangNhapDAO();
                    AccountDTO tk = dn.CheckUser(txtUserName.getText());
                    AccountDTO tk1 = dn.CheckPass(txtPassWord.getText(), txtUserName.getText());

                    if (tk == null) {
                        lbTaikhoan.setText("*Tài khoản không tồn tại");
                        txtUserName.setText("");
                        lbTaikhoan.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtUserName.setBorder(RedLine);
                    } else {
                        if (tk1 != null) {
                            if (dn.checkNhanVien(tk.getId())==1) {
                            new FMenuManager(txtUserName.getText(),tk.getId()).setVisible(true);
                            EventQueue.invokeLater(() -> {
                                Window window = SwingUtilities.getWindowAncestor(this);
                                if (window != null) {
                                    window.setVisible(false); // Ẩn cửa sổ chính
                                }
                            });
                        } else if (dn.checkNhanVien(tk.getId())==2) {
                             new FMenuStaff(txtUserName.getText(),tk.getId()).setVisible(true);
                            EventQueue.invokeLater(() -> {
                            Window window = SwingUtilities.getWindowAncestor(this);
                            if (window != null) {
                            window.setVisible(false); // Ẩn cửa sổ chính
                            }
                        });
                        }else if (dn.checkNhanVien(tk.getId())==0) {
                             new JFmenuResident(txtUserName.getText(),tk.getId()).setVisible(true);
                            EventQueue.invokeLater(() -> {
                            Window window = SwingUtilities.getWindowAncestor(this);
                            if (window != null) {
                            window.setVisible(false); // Ẩn cửa sổ chính
                            }
                        });
                        } else {
                            lbMatkhau.setText("*Mật khẩu không đúng");
                            txtPassWord.setText("");
                            lbMatkhau.setForeground(Color.red);
                            Border RedLine = BorderFactory.createLineBorder(Color.red);
                            txtPassWord.setBorder(RedLine);
                        }
                    } else {
                        lbMatkhau.setText(ERROR_INCORRECT_PASSWORD);
                        txtPassWord.setText("");
                        lbMatkhau.setForeground(Color.red);
                        Border RedLine = BorderFactory.createLineBorder(Color.red);
                        txtPassWord.setBorder(RedLine);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi trong quá trình đăng nhập. Vui lòng thử lại sau.");
            e.printStackTrace(); // In lỗi ra console cho mục đích ghi nhật ký
        }
        }
    }//GEN-LAST:event_txtPassWordKeyPressed

    private void txtUserNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMouseClicked
        // TODO add your handling code here:
        lbTaikhoan.setText("");
        txtUserName.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtUserName.setPreferredSize(txtUserName.getSize());
    }//GEN-LAST:event_txtUserNameMouseClicked

    private void txtPassWordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassWordMouseClicked
        // TODO add your handling code here:
        lbMatkhau.setText("");
        txtPassWord.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtPassWord.setPreferredSize(txtPassWord.getSize());
    }//GEN-LAST:event_txtPassWordMouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbMatkhau;
    private javax.swing.JLabel lbTaikhoan;
    private swing.Password txtPassWord;
    private swing.TextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
