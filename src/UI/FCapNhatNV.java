/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.DangNhapDAO;
import java.awt.Color;
import java.awt.Font;
import java.time.Month;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Le Chuong
 */
public class FCapNhatNV extends javax.swing.JFrame {

    /**
     * Creates new form FThemNV
     */
    public FCapNhatNV() {
        initComponents();
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
    }
    
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public int getDaysOfMonth(int month,int year) {
        // Tháng 2 có thể có 28 hoặc 29 ngày
        if (month == Month.FEBRUARY.getValue()) {
             if(isLeapYear(year)){
                 return 29;
             }else return 28;
        // Các tháng 4, 6, 9, 11 có 30 ngày
        } else if (month == Month.APRIL.getValue() || month == Month.JUNE.getValue() ||
                   month == Month.SEPTEMBER.getValue() || month == Month.NOVEMBER.getValue()) {
            return 30;
          // Các tháng còn lại có 31 ngày
        }else return 31;
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        HoTen = new javax.swing.JTextField();
        lbHoTen = new javax.swing.JLabel();
        GioiTinh = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Diachi = new javax.swing.JTextField();
        lbDiachi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ngay = new javax.swing.JComboBox<>();
        thang = new javax.swing.JComboBox<>();
        nam = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        SDT = new javax.swing.JTextField();
        lbSDT = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CCCD = new javax.swing.JTextField();
        lbCCCD = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        IDCTCV = new javax.swing.JComboBox<>();
        THEM = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        MANV = new javax.swing.JTextField();
        lbMANV = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 505));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cập nhật Nhân Viên");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Họ và Tên");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Giới Tính");

        HoTen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoTenMouseClicked(evt);
            }
        });

        GioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Địa chỉ");

        Diachi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DiachiMouseClicked(evt);
            }
        });
        Diachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiachiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Ngày sinh");

        ngay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        thang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                thangItemStateChanged(evt);
            }
        });

        nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1975", "1978", "1979", "1980", "1981", "1982", "1983", "1985", "1986", "1987", "1988", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1998", "1999", "2000", "2001", "2002", "2003" }));
        nam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                namItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        SDT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SDTMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel9.setText("CCCD");

        CCCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CCCDMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel12.setText("Chức vụ");

        IDCTCV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân Viên Trực", "Nhân Viên Quản Lý" }));
        IDCTCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDCTCVActionPerformed(evt);
            }
        });

        THEM.setBackground(new java.awt.Color(102, 102, 255));
        THEM.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        THEM.setText("CẬP NHẬT NHÂN VIÊN");
        THEM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                THEMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                THEMMouseExited(evt);
            }
        });
        THEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THEMActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Mã NV");

        MANV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MANVMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(382, 382, 382)
                        .addComponent(THEM, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MANV, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lbDiachi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(thang, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(2, 2, 2)
                                            .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(Diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IDCTCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MANV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDCTCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(GioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73)
                .addComponent(THEM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HoTenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoTenMouseClicked
        // TODO add your handling code here:
        lbHoTen.setText("");
        HoTen.setBorder(null);
    }//GEN-LAST:event_HoTenMouseClicked

    private void DiachiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DiachiMouseClicked
        // TODO add your handling code here:
        lbDiachi.setText("");
        Diachi.setBorder(null);
    }//GEN-LAST:event_DiachiMouseClicked

    private void DiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiachiActionPerformed

    private void SDTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SDTMouseClicked
        // TODO add your handling code here:
        lbSDT.setText("");
        SDT.setBorder(null);
    }//GEN-LAST:event_SDTMouseClicked

    private void CCCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CCCDMouseClicked
        // TODO add your handling code here:
        lbCCCD.setText("");
        CCCD.setBorder(null);
    }//GEN-LAST:event_CCCDMouseClicked

    private void IDCTCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDCTCVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDCTCVActionPerformed

    private void THEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THEMActionPerformed
        // TODO add your handling code here:
        try {
            String maNV=MANV.getText();
            String hoTen = HoTen.getText();
            String gt = GioiTinh.getSelectedItem().toString();
            String diaChi = Diachi.getText();
            String sdt = SDT.getText();
            String cccd= CCCD.getText();
            String id_CV_String = (String) IDCTCV.getSelectedItem(); 
            int id_CV = 0;
            if (id_CV_String.equals("Nhân Viên Trực"))
                id_CV=2;
            else id_CV=1;
            String ns=nam.getSelectedItem()+"-"+thang.getSelectedItem()+"-"+ngay.getSelectedItem();
            if (MANV.getText().equals("")){
                lbMANV.setText("*Chưa nhập mã nhân viên.");
                lbMANV.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                MANV.setBorder(RedLine);
            }
            else if (HoTen.getText().equals("")) {
                lbHoTen.setText("*Chưa nhập họ tên.");
                lbHoTen.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                HoTen.setBorder(RedLine);
            }
            else if (Diachi.getText().equals("")) {
                lbDiachi.setText("*Chưa nhập địa chỉ.");
                lbDiachi.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                Diachi.setBorder(RedLine);
            }
            else if (SDT.getText().equals("")) {
                lbSDT.setText("*Chưa nhập số điện thoại.");
                lbSDT.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                SDT.setBorder(RedLine);
            }
            else if (CCCD.getText().equals("")) {
                lbCCCD.setText("*Chưa nhập số CCCD.");
                lbCCCD.setForeground(Color.red);
                Border RedLine = BorderFactory.createLineBorder(Color.red);
                CCCD.setBorder(RedLine);
            }
            else if (!HoTen.getText().equals("") && !Diachi.getText().equals("") && !SDT.getText().equals("") && !CCCD.getText().equals("")) {
                DangNhapDAO dn = new DangNhapDAO();
                if (dn.CheckPhone2(sdt,maNV)==false){
                    lbSDT.setText("*Số điện thoại đã được sử dụng.");
                    lbSDT.setForeground(Color.red);
                    Border RedLine = BorderFactory.createLineBorder(Color.red);
                    SDT.setBorder(RedLine);
                }
                else{
                    if (dn.capNhatNV(maNV,hoTen, gt, ns, diaChi, sdt, cccd, id_CV)> 0) {
                        JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                        MANV.setText("");
                        HoTen.setText("");
                        Diachi.setText("");
                        SDT.setText("");
                        CCCD.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Không thành công! Không tìm thấy mã nhân viên");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_THEMActionPerformed

    private void MANVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MANVMouseClicked
        // TODO add your handling code here:
         lbMANV.setText("");
         MANV.setBorder(null);
    }//GEN-LAST:event_MANVMouseClicked

    private void THEMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THEMMouseEntered
        // TODO add your handling code here:
        THEM.setFont(new Font(THEM.getFont().getName(), Font.BOLD, THEM.getFont().getSize()));
        THEM.setForeground(Color.WHITE);
    }//GEN-LAST:event_THEMMouseEntered

    private void THEMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_THEMMouseExited
        // TODO add your handling code here:
        THEM.setFont(new Font(THEM.getFont().getName(), Font.PLAIN, THEM.getFont().getSize()));
        THEM.setForeground(Color.BLACK);
    }//GEN-LAST:event_THEMMouseExited

    private void thangItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_thangItemStateChanged
        // TODO add your handling code here:
        int Month=Integer.parseInt(thang.getSelectedItem().toString());
        int Year= Integer.parseInt(nam.getSelectedItem().toString());
        int Ngay=getDaysOfMonth(Month, Year);
        ngay.removeAllItems();
        for (int i = 1; i <= Ngay; i++) {
            ngay.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_thangItemStateChanged

    private void namItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_namItemStateChanged
        // TODO add your handling code here:
        int Month=Integer.parseInt(thang.getSelectedItem().toString());
        int Year= Integer.parseInt(nam.getSelectedItem().toString());
        int Ngay=getDaysOfMonth(Month, Year);
        ngay.removeAllItems();
        for (int i = 1; i <= Ngay; i++) {
            ngay.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_namItemStateChanged

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
            java.util.logging.Logger.getLogger(FCapNhatNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FCapNhatNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FCapNhatNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FCapNhatNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FCapNhatNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCCD;
    private javax.swing.JTextField Diachi;
    private javax.swing.JComboBox<String> GioiTinh;
    private javax.swing.JTextField HoTen;
    private javax.swing.JComboBox<String> IDCTCV;
    private javax.swing.JTextField MANV;
    private javax.swing.JTextField SDT;
    private javax.swing.JButton THEM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCCCD;
    private javax.swing.JLabel lbDiachi;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMANV;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JComboBox<String> nam;
    private javax.swing.JComboBox<String> ngay;
    private javax.swing.JComboBox<String> thang;
    // End of variables declaration//GEN-END:variables
}
