package login;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.Timer;
import javax.swing.border.Border;
import swing.EventLogin;

public class PFQuenMatKhau extends PanelCustom {

    private EventLogin event;
    private Timer timer;

    public PFQuenMatKhau() {
        initComponents();
        txtTaiKhoan.setEnabled(false);
        lbPass.setEnabled(false);
        //setAlpha(1);
        timer = new Timer(1500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            // Đặt văn bản của các thành phần về rỗng sau 3 giây
            txtTaiKhoan.setText("");
            lbPass.setText("");
            // Dừng timer sau khi đã xóa dữ liệu
            timer.stop();
        }
        });
    }

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnXacNhan = new swing.Button();
        btnLamMoi = new swing.Button();
        txtSDT = new swing.TextField();
        lbPass = new swing.TextField();
        lbSDT = new javax.swing.JLabel();
        txtTaiKhoan = new swing.TextField();

        setBackground(new java.awt.Color(247, 247, 247));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUÊN MẬT KHẨU?");

        btnXacNhan.setBackground(new java.awt.Color(86, 142, 255));
        btnXacNhan.setForeground(new java.awt.Color(255, 255, 255));
        btnXacNhan.setText("XÁC NHẬN");
        btnXacNhan.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(86, 142, 255));
        btnLamMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnLamMoi.setText("LÀM MỚI");
        btnLamMoi.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        txtSDT.setForeground(new java.awt.Color(76, 76, 76));
        txtSDT.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        txtSDT.setHint("SỐ ĐIỆN THOẠI");
        txtSDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSDTMouseClicked(evt);
            }
        });
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });
        txtSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSDTKeyPressed(evt);
            }
        });

        lbPass.setForeground(new java.awt.Color(76, 76, 76));
        lbPass.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        lbPass.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lbPass.setHint("PASSWORD");
        lbPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbPassActionPerformed(evt);
            }
        });

        txtTaiKhoan.setForeground(new java.awt.Color(76, 76, 76));
        txtTaiKhoan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTaiKhoan.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtTaiKhoan.setHint("TÀI KHOẢN");
        txtTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTaiKhoanMouseClicked(evt);
            }
        });
        txtTaiKhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaiKhoanActionPerformed(evt);
            }
        });
        txtTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaiKhoanKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(btnXacNhan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbPass, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lbPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        if (txtSDT.getText().equals("")) {
            lbSDT.setText("*Chưa nhập số điện thoại.");
            lbSDT.setForeground(Color.red);
            Border RedLine = BorderFactory.createLineBorder(Color.red);
            txtSDT.setBorder(RedLine);
        } else {
            DangNhapDAO dn = new DangNhapDAO();
            AccountDTO tk = dn.CheckPhone(txtSDT.getText());
            if (tk == null) {
                lbSDT.setText("*Tài khoản không tồn tại");
                lbSDT.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtSDT.setBorder(RedLine);
            } else {
                    System.out.println("hi");
                    txtTaiKhoan.setText(tk.getTaiKhoan());
                    lbPass.setText(tk.getMatKhau());
                    // Bắt đầu hoặc reset timer mỗi khi có dữ liệu mới
                    timer.restart();
            }
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
        txtSDT.setText("");
        txtTaiKhoan.setText("");
        lbPass.setText("");
        txtTaiKhoan.setEnabled(false);
        lbPass.setEnabled(false);
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void lbPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbPassActionPerformed

    private void txtSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSDTKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        if (txtSDT.getText().equals("")) {
            lbSDT.setText("*Chưa nhập số điện thoại.");
            lbSDT.setForeground(Color.red);
            Border RedLine = BorderFactory.createLineBorder(Color.red);
            txtSDT.setBorder(RedLine);
        } else {
            DangNhapDAO dn = new DangNhapDAO();
            AccountDTO tk = dn.CheckPhone(txtSDT.getText());
            if (tk == null) {
                lbSDT.setText("*Tài khoản không tồn tại");
                lbSDT.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                txtSDT.setBorder(RedLine);
            } else {
                    txtTaiKhoan.setText(tk.getTaiKhoan());
                    lbPass.setText(tk.getMatKhau());
                    // Bắt đầu hoặc reset timer mỗi khi có dữ liệu mới
                    timer.restart();
            }
        }
    }
    }//GEN-LAST:event_txtSDTKeyPressed

    private void txtSDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSDTMouseClicked
        // TODO add your handling code here:
        lbSDT.setText("");
        txtSDT.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        txtSDT.setPreferredSize(txtSDT.getSize());
    }//GEN-LAST:event_txtSDTMouseClicked

    private void txtTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTaiKhoanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanMouseClicked

    private void txtTaiKhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaiKhoanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanActionPerformed

    private void txtTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaiKhoanKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaiKhoanKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button btnLamMoi;
    private swing.Button btnXacNhan;
    private javax.swing.JLabel jLabel1;
    private swing.TextField lbPass;
    private javax.swing.JLabel lbSDT;
    private swing.TextField txtSDT;
    private swing.TextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
