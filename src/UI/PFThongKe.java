/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import DAO.ThongKeDAO;
import DTO.TongXeDTO;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Le Chuong
 */
public class PFThongKe extends javax.swing.JPanel {

    /**
     * Creates new form PFTK
     */
    public PFThongKe() {
        initComponents();
        initComponents();
        setSize(1000, 505);
        loadCountTimeAll(layNgayHienTai(),layNgayHienTai());
        loadMoneyTimeAll(layNgayHienTai(),layNgayHienTai());
        findAll(layNgayHienTai(),layNgayHienTai());
        LocalDate now = LocalDate.now();
        ngay.setSelectedItem(String.valueOf(now.getDayOfMonth()));
        thang.setSelectedItem(String.valueOf(now.getMonthValue()));
        nam.setSelectedItem(String.valueOf(now.getYear()));
        ngay2.setSelectedItem(String.valueOf(now.getDayOfMonth()));
        thang2.setSelectedItem(String.valueOf(now.getMonthValue()));
        nam2.setSelectedItem(String.valueOf(now.getYear()));
    }
    private String layNgayHienTai(){
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // Lấy ngày hiện tại
        Date now = new Date();
        // Định dạng ngày hiện tại thành chuỗi theo định dạng
        String formattedDate = sdf.format(now);
        return formattedDate;
    }

    private void loadCountTimeAll(String tuNgay, String denNgay) {
        ArrayList<TongXeDTO> list = ThongKeDAO.findCarAll(tuNgay, denNgay);
        int x=list.size();
        lbCount.setText(String.valueOf(x));
    }

    private void loadCountTime(String Loaixe, String tuNgay, String denNgay) {
        ArrayList<TongXeDTO> list = ThongKeDAO.findCarAll(tuNgay, denNgay);
        int x=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getLoaiXe().equals(Loaixe)){
                x+=1;
            }
        }
        lbCount.setText(String.valueOf(x));
    }

    private void loadMoneyTimeAll(String tuNgay, String denNgay) {
        ArrayList<TongXeDTO> list = ThongKeDAO.findCarAll(tuNgay, denNgay);
        int x=0;
        for (int i = 0; i < list.size(); i++) {
                x+=list.get(i).getGiaTien();
        }
        
        txtTien.setText(String.valueOf(x));
    }

    private void loadMoneyTime(String Loaixe, String tuNgay, String denNgay) {
        ArrayList<TongXeDTO> list = ThongKeDAO.findCarAll(tuNgay, denNgay);
        int x=0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getLoaiXe().equals(Loaixe)){
                x+=list.get(i).getGiaTien();
            }
        }
        txtTien.setText(String.valueOf(x));
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

    private void find(String Loaixe, String TuNgay, String DenNgay) {
        ArrayList<TongXeDTO> list = ThongKeDAO.findCarAll(TuNgay, DenNgay);
        DefaultTableModel tblModel = (DefaultTableModel) TableLuotGuiXe.getModel();
        Object[] row = new Object[11];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getLoaiXe().equals(Loaixe)){
                row[0] = list.get(i).getMaVe();
                row[1] = list.get(i).getBienSo();
                row[2] = list.get(i).getLoaiXe();
                row[3] = list.get(i).getLoaiVe();
                row[4] = list.get(i).getKhuVuc();
                row[5] = list.get(i).getNgayGui();
                row[6] = list.get(i).getGioGui();
                row[7] = list.get(i).getNgayTra();
                row[8] = list.get(i).getGioTra();
                row[9] = list.get(i).getGiaTien();
                row[10]= list.get(i).getMaNV();
                tblModel.addRow(row);
            }
        }
    }

    private void findAll(String TuNgay, String DenNgay) {
        ArrayList<TongXeDTO> list = ThongKeDAO.findCarAll(TuNgay, DenNgay);
        DefaultTableModel tblModel = (DefaultTableModel) TableLuotGuiXe.getModel();
        Object[] row = new Object[11];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMaVe();
            row[1] = list.get(i).getBienSo();
            row[2] = list.get(i).getLoaiXe();
            row[3] = list.get(i).getLoaiVe();
            row[4] = list.get(i).getKhuVuc();
            row[5] = list.get(i).getNgayGui();
            row[6] = list.get(i).getGioGui();
            row[7] = list.get(i).getNgayTra();
            row[8] = list.get(i).getGioTra();
            row[9] = list.get(i).getGiaTien();
            row[10]= list.get(i).getMaNV();
            tblModel.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TableLuotGuiXe = new javax.swing.JTable();
        btnLammoi = new javax.swing.JButton();
        cbxLoaixe = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTien = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCount = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ngay = new javax.swing.JComboBox<>();
        thang = new javax.swing.JComboBox<>();
        nam = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nam2 = new javax.swing.JComboBox<>();
        thang2 = new javax.swing.JComboBox<>();
        ngay2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setPreferredSize(new java.awt.Dimension(992, 499));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(992, 499));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thống Kê");

        TableLuotGuiXe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vé Xe", "Biển Số Xe", "Loại Xe", "Loại Vé", "Khu Vực", "Ngày Nhận", "Giờ Nhận", "Ngày Trả", "Giờ Trả", "Tiền", "Mã NV"
            }
        ));
        jScrollPane1.setViewportView(TableLuotGuiXe);

        btnLammoi.setBackground(new java.awt.Color(102, 102, 255));
        btnLammoi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLammoi.setText("Làm mới");
        btnLammoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLammoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLammoiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLammoiMouseExited(evt);
            }
        });
        btnLammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLammoiActionPerformed(evt);
            }
        });

        cbxLoaixe.setBackground(new java.awt.Color(102, 102, 255));
        cbxLoaixe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxLoaixe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tổng xe", "Xe máy", "Xe ô tô" }));
        cbxLoaixe.setBorder(null);
        cbxLoaixe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxLoaixe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLoaixeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Từ ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Đến ");

        btnSearch.setBackground(new java.awt.Color(102, 102, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSearch.setText("Tra cứu");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Tổng Tiền :");

        txtTien.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        txtTien.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("VND");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Tổng số lượt :");

        lbCount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbCount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Lượt");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(txtTien, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCount, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbCount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addComponent(txtTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ngay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        thang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        thang.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                thangItemStateChanged(evt);
            }
        });

        nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        nam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                namItemStateChanged(evt);
            }
        });

        jLabel6.setText("Năm");

        jLabel9.setText("Tháng");

        jLabel10.setText("Ngày");

        jLabel11.setText("Ngày");

        jLabel12.setText("Tháng");

        jLabel13.setText("Năm");

        nam2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032" }));
        nam2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nam2ItemStateChanged(evt);
            }
        });

        thang2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        thang2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                thang2ItemStateChanged(evt);
            }
        });

        ngay2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLammoi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(cbxLoaixe, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel10)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel9)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thang, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel12)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ngay2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thang2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxLoaixe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thang2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLammoi))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLammoiActionPerformed
        LocalDate now = LocalDate.now();
        ngay.setSelectedItem(String.valueOf(now.getDayOfMonth()));
        thang.setSelectedItem(String.valueOf(now.getMonthValue()));
        nam.setSelectedItem(String.valueOf(now.getYear()));
        ngay2.setSelectedItem(String.valueOf(now.getDayOfMonth()));
        thang2.setSelectedItem(String.valueOf(now.getMonthValue()));
        nam2.setSelectedItem(String.valueOf(now.getYear()));
        loadCountTimeAll(layNgayHienTai(),layNgayHienTai());
        loadMoneyTimeAll(layNgayHienTai(),layNgayHienTai());
        findAll(layNgayHienTai(),layNgayHienTai());
    }//GEN-LAST:event_btnLammoiActionPerformed

    private void cbxLoaixeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLoaixeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLoaixeActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String tuNgay=(String)nam.getSelectedItem()+"-"+(String)thang.getSelectedItem()+"-"+(String)ngay.getSelectedItem();
        String denNgay=(String)nam2.getSelectedItem()+"-"+(String)thang2.getSelectedItem()+"-"+(String)ngay2.getSelectedItem();
        if (cbxLoaixe.getSelectedItem().toString().equals("Tổng xe")) {
            findAll(tuNgay, denNgay);
            loadCountTimeAll(tuNgay,denNgay);
            loadMoneyTimeAll(tuNgay,denNgay);
        } else {
            find(cbxLoaixe.getSelectedItem().toString(), tuNgay, denNgay);
            loadCountTime(cbxLoaixe.getSelectedItem().toString(),tuNgay,denNgay);
            loadMoneyTime(cbxLoaixe.getSelectedItem().toString(),tuNgay,denNgay);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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

    private void nam2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nam2ItemStateChanged
        // TODO add your handling code here:
        int Month=Integer.parseInt(thang2.getSelectedItem().toString());
        int Year= Integer.parseInt(nam2.getSelectedItem().toString());
        int Ngay=getDaysOfMonth(Month, Year);
        ngay2.removeAllItems();
        for (int i = 1; i <= Ngay; i++) {
            ngay2.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_nam2ItemStateChanged

    private void thang2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_thang2ItemStateChanged
        // TODO add your handling code here:
        int Month=Integer.parseInt(thang2.getSelectedItem().toString());
        int Year= Integer.parseInt(nam2.getSelectedItem().toString());
        int Ngay=getDaysOfMonth(Month, Year);
        ngay2.removeAllItems();
        for (int i = 1; i <= Ngay; i++) {
            ngay2.addItem(String.valueOf(i));
        }
    }//GEN-LAST:event_thang2ItemStateChanged

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        // TODO add your handling code here:
        
        btnSearch.setFont(new Font(btnSearch.getFont().getName(), Font.BOLD, btnSearch.getFont().getSize()));
        btnSearch.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        // TODO add your handling code here:
        
        btnSearch.setFont(new Font(btnSearch.getFont().getName(), Font.PLAIN, btnSearch.getFont().getSize()));
        btnSearch.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnSearchMouseExited

    private void btnLammoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLammoiMouseEntered
        // TODO add your handling code here:
        
        btnLammoi.setFont(new Font(btnLammoi.getFont().getName(), Font.BOLD, btnLammoi.getFont().getSize()));
        btnLammoi.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnLammoiMouseEntered

    private void btnLammoiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLammoiMouseExited
        // TODO add your handling code here:
        
        btnLammoi.setFont(new Font(btnLammoi.getFont().getName(), Font.PLAIN, btnLammoi.getFont().getSize()));
        btnLammoi.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnLammoiMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableLuotGuiXe;
    private javax.swing.JButton btnLammoi;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbxLoaixe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbCount;
    private javax.swing.JComboBox<String> nam;
    private javax.swing.JComboBox<String> nam2;
    private javax.swing.JComboBox<String> ngay;
    private javax.swing.JComboBox<String> ngay2;
    private javax.swing.JComboBox<String> thang;
    private javax.swing.JComboBox<String> thang2;
    private javax.swing.JLabel txtTien;
    // End of variables declaration//GEN-END:variables
}
