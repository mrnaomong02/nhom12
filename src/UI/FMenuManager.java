/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import main.Main;

/**
 *
 * @author Admin
 */
public class FMenuManager extends javax.swing.JFrame {

    private PFQLNhanVien PFQuanLyNhanVienTab;
    private PFQuanLyCuDan PFQuanLyCuDanTab;
    private PFPhanLich PFPhanLichTab;
    private PFThongKe PFThongKeTab;
    private PFQuanLyVeNgay PFThongTinVeXeTab;
    private PFQuanLyVeThang PFThongTinVeThangTab;
    private PFThongTinThem PFInfor;
    private String ma="";
    boolean[] clicked = new boolean[7];

    /**
     * Creates new form FMenuStaff
     */
    public FMenuManager(String user, String maNV) {
        initComponents();
        setSize(1270, 720);
        setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
        ImageIcon icon = new ImageIcon(getClass().getResource("/UI/Image/Logo_PTIT.jpg")); // Sử dụng đường dẫn tương đối
        Image newImage = icon.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        this.setIconImage(newImage);
        xinchao(user);
        ma=maNV;
        btnQuanLyCuDan.setMnemonic(KeyEvent.VK_1);
        btnQuanLyCuDan.setMnemonic(KeyEvent.VK_2);
        //btnQuanLyBaiXe.setMnemonic(KeyEvent.VK_2);
        btnThongKe.setMnemonic(KeyEvent.VK_3);
        //btnThongTinVeXe.setMnemonic(KeyEvent.VK_4);
        btnThongTinThem.setMnemonic(KeyEvent.VK_5);
        
       
        
        // Đảm bảo không có viền

        btnQuanLyCuDan.setBorderPainted(false);
        btnQuanLyCuDan.setContentAreaFilled(false);
        btnQuanLyCuDan.setOpaque(true);
        btnQuanLyCuDan.setFocusPainted(false);
        btnQuanLyCuDan.setBackground(new Color(204, 204, 255));
        btnQuanLyCuDan.setBorder(BorderFactory.createEmptyBorder());
        
        btnQuanLyNhanVien.setBorderPainted(false);
        btnQuanLyNhanVien.setContentAreaFilled(false);
        btnQuanLyNhanVien.setOpaque(true);
        btnQuanLyNhanVien.setFocusPainted(false);
        btnQuanLyNhanVien.setBackground(new Color(204, 204, 255));
        btnQuanLyNhanVien.setBorder(BorderFactory.createEmptyBorder());
        
        btnQuanLyBaiXe.setBorderPainted(false);
        btnQuanLyBaiXe.setContentAreaFilled(false);
        btnQuanLyBaiXe.setOpaque(true);
        btnQuanLyBaiXe.setFocusPainted(false);
        btnQuanLyBaiXe.setBackground(new Color(204, 204, 255));
        btnQuanLyBaiXe.setBorder(BorderFactory.createEmptyBorder());
        
        btnThongKe.setBorderPainted(false);
        btnThongKe.setContentAreaFilled(false);
        btnThongKe.setOpaque(true);
        btnThongKe.setFocusPainted(false);
        btnThongKe.setBackground(new Color(204, 204, 255));
        btnThongKe.setBorder(BorderFactory.createEmptyBorder());
        
        btnThongTinTheNgay.setBorderPainted(false);
        btnThongTinTheNgay.setContentAreaFilled(false);
        btnThongTinTheNgay.setOpaque(true);
        btnThongTinTheNgay.setFocusPainted(false);
        btnThongTinTheNgay.setBackground(new Color(204, 204, 255));
        btnThongTinTheNgay.setBorder(BorderFactory.createEmptyBorder());
        
        btnThongTinTheThang.setBorderPainted(false);
        btnThongTinTheThang.setContentAreaFilled(false);
        btnThongTinTheThang.setOpaque(true);
        btnThongTinTheThang.setFocusPainted(false);
        btnThongTinTheThang.setBackground(new Color(204, 204, 255));
        btnThongTinTheThang.setBorder(BorderFactory.createEmptyBorder());
        
        btnThongTinThem.setBorderPainted(false);
        btnThongTinThem.setContentAreaFilled(false);
        btnThongTinThem.setOpaque(true);
        btnThongTinThem.setFocusPainted(false);
        btnThongTinThem.setBackground(new Color(204, 204, 255));
        btnThongTinThem.setBorder(BorderFactory.createEmptyBorder());
        
    }

    private void xinchao(String user) {
        DangNhapDAO dn = new DangNhapDAO();
        AccountDTO ac = dn.CheckUser(user);
        if (ac != null) {
            txtChaomung.setText("Chào mừng " + ac.getTaiKhoan());
        }
    }
    private void flagClick(){
        for (int i=0;i<7;++i){
            if(clicked[i]==true){
                switch (i) {
                    case 0:
                        btnQuanLyNhanVien.setBackground(new Color(204,204,255));
                        btnQuanLyNhanVien.setFont(new Font(btnQuanLyNhanVien.getFont().getName(), Font.PLAIN, btnQuanLyNhanVien.getFont().getSize()));
                        btnQuanLyNhanVien.setForeground(Color.BLACK);
                        break;
                    case 1:
                        btnQuanLyCuDan.setBackground(new Color(204,204,255));
                        btnQuanLyCuDan.setFont(new Font(btnQuanLyCuDan.getFont().getName(), Font.PLAIN, btnQuanLyCuDan.getFont().getSize()));
                        btnQuanLyCuDan.setForeground(Color.BLACK);
                        break;
                    case 2:
                        btnQuanLyBaiXe.setBackground(new Color(204,204,255));
                        btnQuanLyBaiXe.setFont(new Font(btnQuanLyBaiXe.getFont().getName(), Font.PLAIN, btnQuanLyBaiXe.getFont().getSize()));
                        btnQuanLyBaiXe.setForeground(Color.BLACK);
                        break;
                    case 3:
                        btnThongKe.setBackground(new Color(204,204,255));
                        btnThongKe.setFont(new Font(btnThongKe.getFont().getName(), Font.PLAIN, btnThongKe.getFont().getSize()));
                        btnThongKe.setForeground(Color.BLACK);
                        break;
                    case 4:
                        btnThongTinTheThang.setBackground(new Color(204,204,255));
                        btnThongTinTheThang.setFont(new Font(btnThongTinTheThang.getFont().getName(), Font.PLAIN, btnThongTinTheThang.getFont().getSize()));
                        btnThongTinTheThang.setForeground(Color.BLACK);
                        break;
                    case 5:
                        btnThongTinTheNgay.setBackground(new Color(204,204,255));
                        btnThongTinTheNgay.setFont(new Font(btnThongTinTheNgay.getFont().getName(), Font.PLAIN, btnThongTinTheNgay.getFont().getSize()));
                        btnThongTinTheNgay.setForeground(Color.BLACK);
                        break;
                    case 6:
                        btnThongTinThem.setBackground(new Color(204,204,255));
                        btnThongTinThem.setFont(new Font(btnThongTinThem.getFont().getName(), Font.PLAIN, btnThongTinThem.getFont().getSize()));
                        btnThongTinThem.setForeground(Color.BLACK);
                        break;
                    default:
                        throw new AssertionError();
                }
                clicked[i]=false;
                return;
            }
                
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

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JLabel();
        txtChaomung = new javax.swing.JLabel();
        btnTTTK = new javax.swing.JLabel();
        btnDoiMK = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TabMainBoard = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        btnQuanLyCuDan = new javax.swing.JButton();
        btnQuanLyBaiXe = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnThongTinTheThang = new javax.swing.JButton();
        btnThongTinTheNgay = new javax.swing.JButton();
        btnThongTinThem = new javax.swing.JButton();
        btnQuanLyNhanVien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(1270, 720));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1270, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_parking_64px_1.png"))); // NOI18N
        jLabel3.setName("ParkingIcon"); // NOI18N

        btnThoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/download-icon-left+previous+icon-1320166862746760425_24.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThoatMouseExited(evt);
            }
        });
        btnThoat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnThoatKeyPressed(evt);
            }
        });

        txtChaomung.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtChaomung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_user_32px_1.png"))); // NOI18N
        txtChaomung.setText("Xin Chào");
        txtChaomung.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnTTTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTTTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/download-icon-left+previous+icon-1320166862746760425_24.png"))); // NOI18N
        btnTTTK.setText("Thông tin TK");
        btnTTTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTTTK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTTTKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTTTKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTTTKMouseExited(evt);
            }
        });

        btnDoiMK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/download-icon-left+previous+icon-1320166862746760425_24.png"))); // NOI18N
        btnDoiMK.setText("Đổi Mật Khẩu");
        btnDoiMK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDoiMK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoiMKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDoiMKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDoiMKMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(txtChaomung, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTTTK)
                .addGap(18, 18, 18)
                .addComponent(btnDoiMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnDoiMK)
                                .addComponent(btnTTTK)
                                .addComponent(btnThoat))
                            .addComponent(txtChaomung))
                        .addGap(24, 24, 24))))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        TabMainBoard.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        TabMainBoard.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        TabMainBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabMainBoard.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(TabMainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(TabMainBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 71, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        btnQuanLyCuDan.setBackground(new java.awt.Color(204, 204, 255));
        btnQuanLyCuDan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnQuanLyCuDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_management_32px.png"))); // NOI18N
        btnQuanLyCuDan.setText("Quản Lý Cư Dân");
        btnQuanLyCuDan.setAlignmentY(0.0F);
        btnQuanLyCuDan.setBorder(null);
        btnQuanLyCuDan.setBorderPainted(false);
        btnQuanLyCuDan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuanLyCuDan.setFocusPainted(false);
        btnQuanLyCuDan.setFocusable(false);
        btnQuanLyCuDan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyCuDan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQuanLyCuDan.setMargin(new java.awt.Insets(2, 14, 2, 14));
        btnQuanLyCuDan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyCuDanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyCuDanMouseExited(evt);
            }
        });
        btnQuanLyCuDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyCuDanActionPerformed(evt);
            }
        });

        btnQuanLyBaiXe.setBackground(new java.awt.Color(204, 204, 255));
        btnQuanLyBaiXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnQuanLyBaiXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_parking_32px_1.png"))); // NOI18N
        btnQuanLyBaiXe.setText("Phân lịch làm việc");
        btnQuanLyBaiXe.setBorder(null);
        btnQuanLyBaiXe.setBorderPainted(false);
        btnQuanLyBaiXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuanLyBaiXe.setFocusPainted(false);
        btnQuanLyBaiXe.setFocusable(false);
        btnQuanLyBaiXe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyBaiXe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQuanLyBaiXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyBaiXeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyBaiXeMouseExited(evt);
            }
        });
        btnQuanLyBaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyBaiXeActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(204, 204, 255));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_scorecard_32px.png"))); // NOI18N
        btnThongKe.setText("Thống Kê");
        btnThongKe.setBorder(null);
        btnThongKe.setBorderPainted(false);
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongKe.setFocusPainted(false);
        btnThongKe.setFocusable(false);
        btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongKe.setName("btnThongKe"); // NOI18N
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongKeMouseExited(evt);
            }
        });
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnThongTinTheThang.setBackground(new java.awt.Color(204, 204, 255));
        btnThongTinTheThang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThongTinTheThang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_bank_cards_32px_1.png"))); // NOI18N
        btnThongTinTheThang.setText("Quản Lý Thẻ Tháng");
        btnThongTinTheThang.setBorder(null);
        btnThongTinTheThang.setBorderPainted(false);
        btnThongTinTheThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTinTheThang.setFocusable(false);
        btnThongTinTheThang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongTinTheThang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongTinTheThang.setName("btnThongTinVeXe"); // NOI18N
        btnThongTinTheThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongTinTheThangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongTinTheThangMouseExited(evt);
            }
        });
        btnThongTinTheThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinTheThangActionPerformed(evt);
            }
        });

        btnThongTinTheNgay.setBackground(new java.awt.Color(204, 204, 255));
        btnThongTinTheNgay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThongTinTheNgay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_bank_cards_32px_1.png"))); // NOI18N
        btnThongTinTheNgay.setText("Quản Lý Thẻ Ngày");
        btnThongTinTheNgay.setBorder(null);
        btnThongTinTheNgay.setBorderPainted(false);
        btnThongTinTheNgay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTinTheNgay.setFocusable(false);
        btnThongTinTheNgay.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongTinTheNgay.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongTinTheNgay.setName("btnThongTinTheNgay"); // NOI18N
        btnThongTinTheNgay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongTinTheNgayMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongTinTheNgayMouseExited(evt);
            }
        });
        btnThongTinTheNgay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinTheNgayActionPerformed(evt);
            }
        });

        btnThongTinThem.setBackground(new java.awt.Color(204, 204, 255));
        btnThongTinThem.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThongTinThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_information_32px.png"))); // NOI18N
        btnThongTinThem.setText("Thông Tin");
        btnThongTinThem.setBorder(null);
        btnThongTinThem.setBorderPainted(false);
        btnThongTinThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTinThem.setFocusPainted(false);
        btnThongTinThem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongTinThem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongTinThem.setName("btnThongTinThem"); // NOI18N
        btnThongTinThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongTinThemMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongTinThemMouseExited(evt);
            }
        });
        btnThongTinThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinThemActionPerformed(evt);
            }
        });

        btnQuanLyNhanVien.setBackground(new java.awt.Color(204, 204, 255));
        btnQuanLyNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_management_32px.png"))); // NOI18N
        btnQuanLyNhanVien.setText("Quản Lý Nhân Viên");
        btnQuanLyNhanVien.setAlignmentY(0.0F);
        btnQuanLyNhanVien.setBorder(null);
        btnQuanLyNhanVien.setBorderPainted(false);
        btnQuanLyNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuanLyNhanVien.setFocusPainted(false);
        btnQuanLyNhanVien.setFocusable(false);
        btnQuanLyNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnQuanLyNhanVien.setMargin(new java.awt.Insets(2, 14, 2, 14));
        btnQuanLyNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyNhanVienMouseExited(evt);
            }
        });
        btnQuanLyNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnThongTinTheNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongTinThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQuanLyCuDan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQuanLyBaiXe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongTinTheThang, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
            .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuanLyCuDan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnQuanLyBaiXe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongKe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTinTheThang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTinTheNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTinThem)
                .addGap(0, 344, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1271, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongTinThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinThemActionPerformed
        if (!clicked[6]) {
            btnThongTinThem.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnThongTinThem.setFont(new Font(btnThongTinThem.getFont().getName(), Font.BOLD, btnThongTinThem.getFont().getSize()));
            btnThongTinThem.setForeground(Color.WHITE);
            flagClick();
            clicked[6] = true;    
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFInfor = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInfor, "Thông Tin");
        }
        if (PFInfor == null) {
            PFInfor = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInfor, "Thông Tin");
        }
    }//GEN-LAST:event_btnThongTinThemActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        if (!clicked[3]) {
            btnThongKe.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnThongKe.setFont(new Font(btnThongKe.getFont().getName(), Font.BOLD, btnThongKe.getFont().getSize()));
            btnThongKe.setForeground(Color.WHITE);
            flagClick();
            clicked[3] = true; 
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFThongKeTab = new PFThongKe();
            TabMainBoard.addTab("Thống Kê", null, PFThongKeTab, "Thống Kê");
        }
        if (PFThongKeTab == null) {
            PFThongKeTab = new PFThongKe();
            TabMainBoard.addTab("Thống Kê", null, PFThongKeTab, "Thống Kê");
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnThongTinTheNgayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinTheNgayActionPerformed
        if (!clicked[5]) {
            btnThongTinTheNgay.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnThongTinTheNgay.setFont(new Font(btnThongTinTheNgay.getFont().getName(), Font.BOLD, btnThongTinTheNgay.getFont().getSize()));
            btnThongTinTheNgay.setForeground(Color.WHITE);
            flagClick();
            clicked[5] = true; 
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFThongTinVeXeTab = new PFQuanLyVeNgay(ma);
            TabMainBoard.addTab("Quản Lý Thẻ Ngày", null, PFThongTinVeXeTab, "Quản Lý Thẻ Ngày");
        }
        if (PFThongTinVeXeTab == null) {
            PFThongTinVeXeTab = new PFQuanLyVeNgay(ma);
            TabMainBoard.addTab("Quản Lý Thẻ Ngày", null, PFThongTinVeXeTab, "Quản Lý Thẻ Ngày");
        }
    }//GEN-LAST:event_btnThongTinTheNgayActionPerformed

    private void btnQuanLyBaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyBaiXeActionPerformed
        if (!clicked[2]) {
            btnQuanLyBaiXe.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnQuanLyBaiXe.setFont(new Font(btnQuanLyBaiXe.getFont().getName(), Font.BOLD, btnQuanLyBaiXe.getFont().getSize()));
            btnQuanLyBaiXe.setForeground(Color.WHITE);
            flagClick();
            clicked[2] = true; 
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFPhanLichTab = new PFPhanLich();
            TabMainBoard.addTab("Phân Lịch", null, PFPhanLichTab, "Phân Lịch");
        }
        if (PFPhanLichTab == null) {
            PFPhanLichTab = new PFPhanLich();
            TabMainBoard.addTab("Phân Lịch", null, PFPhanLichTab, "Phân Lịch");
        }
    }//GEN-LAST:event_btnQuanLyBaiXeActionPerformed

    private void btnThoatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnThoatKeyPressed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatKeyPressed

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnQuanLyCuDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyCuDanActionPerformed
        // TODO add your handling code here:
        if (!clicked[1]) {
            btnQuanLyCuDan.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnQuanLyCuDan.setFont(new Font(btnQuanLyCuDan.getFont().getName(), Font.BOLD, btnQuanLyCuDan.getFont().getSize()));
            btnQuanLyCuDan.setForeground(Color.WHITE);
            flagClick();
            clicked[1] = true; 
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFQuanLyCuDanTab = new PFQuanLyCuDan();
            TabMainBoard.addTab("Quản Lý Cư Dân", null, PFQuanLyCuDanTab, "Quản Lý Cư Dân");
        }
        if (PFQuanLyCuDanTab == null) {
            PFQuanLyCuDanTab = new PFQuanLyCuDan();
            TabMainBoard.addTab("Quản Lý Cư Dân", null, PFQuanLyCuDanTab, "Quản Lý Cư Dân");
        }
    }//GEN-LAST:event_btnQuanLyCuDanActionPerformed

    private void btnThongTinTheThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinTheThangActionPerformed
        // TODO add your handling code here:
        if (!clicked[4]) {
            btnThongTinTheThang.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnThongTinTheThang.setFont(new Font(btnThongTinTheThang.getFont().getName(), Font.BOLD, btnThongTinTheThang.getFont().getSize()));
            btnThongTinTheThang.setForeground(Color.WHITE);
            flagClick();
            clicked[4] = true; 
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFThongTinVeThangTab = new PFQuanLyVeThang();
            TabMainBoard.addTab("Quản Lý Thẻ Tháng", null, PFThongTinVeThangTab, "Quản Lý Thẻ Tháng");
        }
        if (PFThongTinVeThangTab == null) {
            PFThongTinVeThangTab = new PFQuanLyVeThang();
            TabMainBoard.addTab("Quản Lý Thẻ Tháng", null, PFThongTinVeThangTab, "Quản Lý Thẻ Tháng");
        }
    }//GEN-LAST:event_btnThongTinTheThangActionPerformed

    private void btnTTTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTTTKMouseClicked
        // TODO add your handling code here:
        new FTTAIKHOANNV_INFO(ma).setVisible(true);
    }//GEN-LAST:event_btnTTTKMouseClicked

    private void btnDoiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMouseClicked
        // TODO add your handling code here:
        new FDoiMatKhau().setVisible(true);
    }//GEN-LAST:event_btnDoiMKMouseClicked

    private void btnQuanLyCuDanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyCuDanMouseEntered
        // TODO add your handling code here:
        if (!clicked[1]) {
            btnQuanLyCuDan.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnQuanLyCuDanMouseEntered

    private void btnQuanLyCuDanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyCuDanMouseExited
        // TODO add your handling code here:
        if (!clicked[1]) {
            btnQuanLyCuDan.setBackground(new Color(204,204,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnQuanLyCuDanMouseExited

    private void btnQuanLyBaiXeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyBaiXeMouseEntered
        // TODO add your handling code here:
        if (!clicked[2]) {
            btnQuanLyBaiXe.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnQuanLyBaiXeMouseEntered

    private void btnQuanLyBaiXeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyBaiXeMouseExited
        // TODO add your handling code here:
        if (!clicked[2]) {
            btnQuanLyBaiXe.setBackground(new Color(204,204,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnQuanLyBaiXeMouseExited

    private void btnThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseEntered
        // TODO add your handling code here:
        if (!clicked[3]) {
            btnThongKe.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongKeMouseEntered

    private void btnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseExited
        // TODO add your handling code here:
        if (!clicked[3]) {
            btnThongKe.setBackground(new Color(204,204,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongKeMouseExited

    private void btnThongTinTheThangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinTheThangMouseEntered
        // TODO add your handling code here:
        if (!clicked[4]) {
            btnThongTinTheThang.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinTheThangMouseEntered

    private void btnThongTinTheThangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinTheThangMouseExited
        // TODO add your handling code here:
        if (!clicked[4]) {
            btnThongTinTheThang.setBackground(new Color(204,204,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinTheThangMouseExited

    private void btnThongTinTheNgayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinTheNgayMouseEntered
        // TODO add your handling code here:
        if (!clicked[5]) {
            btnThongTinTheNgay.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinTheNgayMouseEntered

    private void btnThongTinTheNgayMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinTheNgayMouseExited
        // TODO add your handling code here:
        if (!clicked[5]) {
            btnThongTinTheNgay.setBackground(new Color(204,204,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinTheNgayMouseExited

    private void btnThongTinThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinThemMouseEntered
        // TODO add your handling code here:
        if (!clicked[6]) {
            btnThongTinThem.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinThemMouseEntered

    private void btnThongTinThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinThemMouseExited
        // TODO add your handling code here:
        if (!clicked[6]) {
            btnThongTinThem.setBackground(new Color(204,204,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinThemMouseExited

    private void btnQuanLyNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyNhanVienMouseEntered
        // TODO add your handling code here:
        if (!clicked[0]) {
            btnQuanLyNhanVien.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnQuanLyNhanVienMouseEntered

    private void btnQuanLyNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyNhanVienMouseExited
        // TODO add your handling code here:
        if (!clicked[0]) {
            btnQuanLyNhanVien.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnQuanLyNhanVienMouseExited

    private void btnQuanLyNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNhanVienActionPerformed
        // TODO add your handling code here:
        if (!clicked[0]) {
            btnQuanLyNhanVien.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnQuanLyNhanVien.setFont(new Font(btnQuanLyNhanVien.getFont().getName(), Font.BOLD, btnQuanLyNhanVien.getFont().getSize()));
            btnQuanLyNhanVien.setForeground(Color.WHITE);
            flagClick();
            clicked[0] = true;
        }

        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFQuanLyNhanVienTab= new PFQLNhanVien();
            TabMainBoard.addTab("Quản Lý Nhân Viên", null, PFQuanLyNhanVienTab, "Quản Lý Nhân Viên");
        }
        if (PFQuanLyNhanVienTab == null) {
            PFQuanLyNhanVienTab = new PFQLNhanVien();
            TabMainBoard.addTab("Quản Lý Nhân Viên", null, PFQuanLyNhanVienTab, "Quản Lý Nhân Viên");
        }
        
    }//GEN-LAST:event_btnQuanLyNhanVienActionPerformed

    private void btnDoiMKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMouseEntered
        // TODO add your handling code here:
         btnDoiMK.setFont(btnDoiMK.getFont().deriveFont(Font.BOLD | Font.ITALIC ));
         btnDoiMK.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnDoiMKMouseEntered

    private void btnDoiMKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMouseExited
        // TODO add your handling code here:
         btnDoiMK.setFont(btnDoiMK.getFont().deriveFont(Font.PLAIN));
         btnDoiMK.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnDoiMKMouseExited

    private void btnTTTKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTTTKMouseEntered
        // TODO add your handling code here:
        btnTTTK.setFont(btnTTTK.getFont().deriveFont(Font.BOLD | Font.ITALIC));
        btnTTTK.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnTTTKMouseEntered

    private void btnTTTKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTTTKMouseExited
        // TODO add your handling code here:
        btnTTTK.setFont(btnTTTK.getFont().deriveFont(Font.PLAIN));
        btnTTTK.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnTTTKMouseExited

    private void btnThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseEntered
        // TODO add your handling code here:
        btnThoat.setFont(btnThoat.getFont().deriveFont(Font.BOLD | Font.ITALIC));
        btnThoat.setForeground(Color.BLUE);
    }//GEN-LAST:event_btnThoatMouseEntered

    private void btnThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseExited
        // TODO add your handling code here:
        btnThoat.setFont(btnThoat.getFont().deriveFont(Font.PLAIN));
        btnThoat.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnThoatMouseExited

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
            java.util.logging.Logger.getLogger(FMenuManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenuManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenuManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenuManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenuManager("21","12").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabMainBoard;
    private javax.swing.JLabel btnDoiMK;
    private javax.swing.JButton btnQuanLyBaiXe;
    private javax.swing.JButton btnQuanLyCuDan;
    private javax.swing.JButton btnQuanLyNhanVien;
    private javax.swing.JLabel btnTTTK;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnThongTinTheNgay;
    private javax.swing.JButton btnThongTinTheThang;
    private javax.swing.JButton btnThongTinThem;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel txtChaomung;
    // End of variables declaration//GEN-END:variables
}
