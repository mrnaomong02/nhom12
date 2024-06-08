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
import main.Main;

/**
 *
 * @author Admin
 */
public class FMenuStaff extends javax.swing.JFrame {

    private PFNhanXe PFNhanXeTab;
    private PFTraXe PFTraXeTab;
    private PFTraLichSu PFTraLichSuTab;
    private PFTraCuuBaiXe PFTraCuuBaiXeTab;
    private PFThongTinThem PFInfor;
    private PFXemLichLam PFLichLamViecTab;
    private String ma;
    boolean[] clicked = new boolean[6];
    /**
     * Creates new form FMenuStaff
     */
    public FMenuStaff(String user,String maNV) {
        initComponents();
        setSize(1270, 750);
        ma=maNV;
        //setExtendedState(MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
        ImageIcon icon = new ImageIcon(getClass().getResource("/UI/Image/Logo_PTIT.jpg")); // Sử dụng đường dẫn tương đối
        Image newImage = icon.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        this.setIconImage(newImage);
        xinchao(user);
        btnNhanXe.setMnemonic(KeyEvent.VK_1);
        btnTraXe.setMnemonic(KeyEvent.VK_2);
        btnTraLichSu.setMnemonic(KeyEvent.VK_3);
        btnThongTinBaiXe.setMnemonic(KeyEvent.VK_4);
        btnThongTinThem.setMnemonic(KeyEvent.VK_5);
        btnLichLamViec.setMnemonic(KeyEvent.VK_6);
        
        btnNhanXe.setBorderPainted(false);
        btnNhanXe.setContentAreaFilled(false);
        btnNhanXe.setOpaque(true);
        btnNhanXe.setFocusPainted(false);
        btnNhanXe.setBackground(new Color(204, 204, 255));
        btnNhanXe.setBorder(BorderFactory.createEmptyBorder());
        
        btnTraXe.setBorderPainted(false);
        btnTraXe.setContentAreaFilled(false);
        btnTraXe.setOpaque(true);
        btnTraXe.setFocusPainted(false);
        btnTraXe.setBackground(new Color(204, 204, 255));
        btnTraXe.setBorder(BorderFactory.createEmptyBorder());
        
        btnTraLichSu.setBorderPainted(false);
        btnTraLichSu.setContentAreaFilled(false);
        btnTraLichSu.setOpaque(true);
        btnTraLichSu.setFocusPainted(false);
        btnTraLichSu.setBackground(new Color(204, 204, 255));
        btnTraLichSu.setBorder(BorderFactory.createEmptyBorder());
        
        btnThongTinBaiXe.setBorderPainted(false);
        btnThongTinBaiXe.setContentAreaFilled(false);
        btnThongTinBaiXe.setOpaque(true);
        btnThongTinBaiXe.setFocusPainted(false);
        btnThongTinBaiXe.setBackground(new Color(204, 204, 255));
        btnThongTinBaiXe.setBorder(BorderFactory.createEmptyBorder());
        
        btnLichLamViec.setBorderPainted(false);
        btnLichLamViec.setContentAreaFilled(false);
        btnLichLamViec.setOpaque(true);
        btnLichLamViec.setFocusPainted(false);
        btnLichLamViec.setBackground(new Color(204, 204, 255));
        btnLichLamViec.setBorder(BorderFactory.createEmptyBorder());
        
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
            txtChaomung.setText("Chào mừng nhân viên " + ac.getTaiKhoan());
        }
    }
    
    private void flagClick(){
        for (int i=0;i<6;++i){
            if(clicked[i]==true){
                switch (i) {
                    case 0:
                        btnNhanXe.setBackground(new Color(204,204,255));
                        btnNhanXe.setFont(new Font(btnNhanXe.getFont().getName(), Font.PLAIN, btnNhanXe.getFont().getSize()));
                        btnNhanXe.setForeground(Color.BLACK);
                        break;
                    case 1:
                        btnTraXe.setBackground(new Color(204,204,255));
                        btnTraXe.setFont(new Font(btnTraXe.getFont().getName(), Font.PLAIN, btnTraXe.getFont().getSize()));
                        btnTraXe.setForeground(Color.BLACK);
                        break;
                    case 2:
                        btnTraLichSu.setBackground(new Color(204,204,255));
                        btnTraLichSu.setFont(new Font(btnTraLichSu.getFont().getName(), Font.PLAIN, btnTraLichSu.getFont().getSize()));
                        btnTraLichSu.setForeground(Color.BLACK);
                        break;
                    case 3:
                        btnThongTinBaiXe.setBackground(new Color(204,204,255));
                        btnThongTinBaiXe.setFont(new Font(btnThongTinBaiXe.getFont().getName(), Font.PLAIN, btnThongTinBaiXe.getFont().getSize()));
                        btnThongTinBaiXe.setForeground(Color.BLACK);
                        break;
                    case 4:
                        btnLichLamViec.setBackground(new Color(204,204,255));
                        btnLichLamViec.setFont(new Font(btnLichLamViec.getFont().getName(), Font.PLAIN, btnLichLamViec.getFont().getSize()));
                        btnLichLamViec.setForeground(Color.BLACK);
                        break;
                    case 5:
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
        txtChaomung = new javax.swing.JLabel();
        btnTTTK = new javax.swing.JLabel();
        btnThoat = new javax.swing.JLabel();
        btnDoiMK = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        TabMainBoard = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        btnNhanXe = new javax.swing.JButton();
        btnTraXe = new javax.swing.JButton();
        btnTraLichSu = new javax.swing.JButton();
        btnThongTinBaiXe = new javax.swing.JButton();
        btnThongTinThem = new javax.swing.JButton();
        btnLichLamViec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1270, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_parking_64px_1.png"))); // NOI18N
        jLabel3.setName("ParkingIcon"); // NOI18N

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
                .addGap(18, 18, 18)
                .addComponent(txtChaomung, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTTTK)
                .addGap(18, 18, 18)
                .addComponent(btnDoiMK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThoat)
                .addGap(48, 48, 48))
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
                        .addGap(21, 21, 21))))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1008, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        TabMainBoard.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.lightGray));
        TabMainBoard.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        TabMainBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TabMainBoard.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabMainBoard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabMainBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(0, 515, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        btnNhanXe.setBackground(new java.awt.Color(204, 204, 255));
        btnNhanXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNhanXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_sedan_32px.png"))); // NOI18N
        btnNhanXe.setText("Xe vào");
        btnNhanXe.setBorder(null);
        btnNhanXe.setBorderPainted(false);
        btnNhanXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhanXe.setFocusPainted(false);
        btnNhanXe.setFocusable(false);
        btnNhanXe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhanXe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNhanXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhanXeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNhanXeMouseExited(evt);
            }
        });
        btnNhanXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanXeActionPerformed(evt);
            }
        });

        btnTraXe.setBackground(new java.awt.Color(204, 204, 255));
        btnTraXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTraXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_car_theft_32px.png"))); // NOI18N
        btnTraXe.setText("Xe ra");
        btnTraXe.setBorder(null);
        btnTraXe.setBorderPainted(false);
        btnTraXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraXe.setFocusPainted(false);
        btnTraXe.setFocusable(false);
        btnTraXe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTraXe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTraXe.setPreferredSize(new java.awt.Dimension(90, 32));
        btnTraXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTraXeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTraXeMouseExited(evt);
            }
        });
        btnTraXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraXeActionPerformed(evt);
            }
        });

        btnTraLichSu.setBackground(new java.awt.Color(204, 204, 255));
        btnTraLichSu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTraLichSu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_membership_card_32px_1.png"))); // NOI18N
        btnTraLichSu.setText("Tra lịch sử giữ xe");
        btnTraLichSu.setBorder(null);
        btnTraLichSu.setBorderPainted(false);
        btnTraLichSu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTraLichSu.setFocusPainted(false);
        btnTraLichSu.setFocusable(false);
        btnTraLichSu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTraLichSu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnTraLichSu.setName("btnTraLichSu"); // NOI18N
        btnTraLichSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTraLichSuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTraLichSuMouseExited(evt);
            }
        });
        btnTraLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraLichSuActionPerformed(evt);
            }
        });

        btnThongTinBaiXe.setBackground(new java.awt.Color(204, 204, 255));
        btnThongTinBaiXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThongTinBaiXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_car_racing_32px_1.png"))); // NOI18N
        btnThongTinBaiXe.setText("Thông Tin Bãi Xe");
        btnThongTinBaiXe.setBorder(null);
        btnThongTinBaiXe.setBorderPainted(false);
        btnThongTinBaiXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTinBaiXe.setFocusable(false);
        btnThongTinBaiXe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongTinBaiXe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongTinBaiXe.setName("btnThongTinBaiXe"); // NOI18N
        btnThongTinBaiXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongTinBaiXeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongTinBaiXeMouseExited(evt);
            }
        });
        btnThongTinBaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinBaiXeActionPerformed(evt);
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

        btnLichLamViec.setBackground(new java.awt.Color(204, 204, 255));
        btnLichLamViec.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLichLamViec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_information_32px.png"))); // NOI18N
        btnLichLamViec.setText("Lịch làm việc");
        btnLichLamViec.setBorder(null);
        btnLichLamViec.setBorderPainted(false);
        btnLichLamViec.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLichLamViec.setFocusPainted(false);
        btnLichLamViec.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLichLamViec.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLichLamViec.setName("btnThongTinThem"); // NOI18N
        btnLichLamViec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLichLamViecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLichLamViecMouseExited(evt);
            }
        });
        btnLichLamViec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichLamViecActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNhanXe, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTraLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
            .addComponent(btnThongTinBaiXe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLichLamViec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTraXe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongTinThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnNhanXe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTraXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTraLichSu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTinBaiXe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLichLamViec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTinThem)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {
        new Main().setVisible(true);
        this.dispose();
    }
    private void btnThongTinThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinThemActionPerformed
        if (!clicked[5]) {
            btnThongTinThem.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnThongTinThem.setFont(new Font(btnThongTinThem.getFont().getName(), Font.BOLD, btnThongTinThem.getFont().getSize()));
            btnThongTinThem.setForeground(Color.WHITE);
            flagClick();
            clicked[5] = true;    
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

    private void btnTraLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraLichSuActionPerformed
        if (!clicked[2]) {
            btnTraLichSu.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnTraLichSu.setFont(new Font(btnTraLichSu.getFont().getName(), Font.BOLD, btnTraLichSu.getFont().getSize()));
            btnTraLichSu.setForeground(Color.WHITE);
            flagClick();
            clicked[2] = true;    
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraLichSuTab = new PFTraLichSu();
            TabMainBoard.addTab("Đăng Kí Vé Tháng", null, PFTraLichSuTab, "Đăng Kí Vé Tháng");
        }
        if (PFTraLichSuTab == null) {
            PFTraLichSuTab = new PFTraLichSu();
            TabMainBoard.addTab("Đăng Kí Vé Thàng", null, PFTraLichSuTab, "Đăng Kí Vé Thàng");
        }
    }//GEN-LAST:event_btnTraLichSuActionPerformed

    private void btnThongTinBaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinBaiXeActionPerformed
        if (!clicked[3]) {
            btnThongTinBaiXe.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnThongTinBaiXe.setFont(new Font(btnThongTinBaiXe.getFont().getName(), Font.BOLD, btnThongTinBaiXe.getFont().getSize()));
            btnThongTinBaiXe.setForeground(Color.WHITE);
            flagClick();
            clicked[3] = true;    
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraCuuBaiXeTab = new PFTraCuuBaiXe();
            TabMainBoard.addTab("Thông Tin Bãi Xe", null, PFTraCuuBaiXeTab, "Thông Tin Bãi Xe");
        }
        if (PFTraCuuBaiXeTab == null) {
            PFTraCuuBaiXeTab = new PFTraCuuBaiXe();
            TabMainBoard.addTab("Thông Tin Bãi Xe", null, PFTraCuuBaiXeTab, "Thông Tin Bãi Xe");
        }
    }//GEN-LAST:event_btnThongTinBaiXeActionPerformed

    private void btnNhanXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanXeActionPerformed
        if (!clicked[0]) {
            btnNhanXe.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnNhanXe.setFont(new Font(btnNhanXe.getFont().getName(), Font.BOLD, btnNhanXe.getFont().getSize()));
            btnNhanXe.setForeground(Color.WHITE);
            flagClick();
            clicked[0] = true;    
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFNhanXeTab = new PFNhanXe(ma);
            TabMainBoard.addTab("Nhận Xe", null, PFNhanXeTab, "Nhận Xe");
        }
        if (PFNhanXeTab == null) {
            PFNhanXeTab = new PFNhanXe(ma);
            TabMainBoard.addTab("Nhận Xe", null, PFNhanXeTab, "Nhận Xe");
        }
        
    }//GEN-LAST:event_btnNhanXeActionPerformed

    private void btnTraXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraXeActionPerformed
         if (!clicked[1]) {
            btnTraXe.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnTraXe.setFont(new Font(btnTraXe.getFont().getName(), Font.BOLD, btnTraXe.getFont().getSize()));
            btnTraXe.setForeground(Color.WHITE);
            flagClick();
            clicked[1] = true;    
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraXeTab = new PFTraXe(ma);
            TabMainBoard.addTab("Trả Xe", null, PFTraXeTab, "trả Xe");
        }
        if (PFTraXeTab == null) {
            PFTraXeTab = new PFTraXe(ma);
            TabMainBoard.addTab("Trả Xe", null, PFTraXeTab, "trả Xe");
        }
    }//GEN-LAST:event_btnTraXeActionPerformed

    private void btnLichLamViecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichLamViecActionPerformed
        // TODO add your handling code here:
        if (!clicked[4]) {
            btnLichLamViec.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnLichLamViec.setFont(new Font(btnLichLamViec.getFont().getName(), Font.BOLD, btnLichLamViec.getFont().getSize()));
            btnLichLamViec.setForeground(Color.WHITE);
            flagClick();
            clicked[4] = true;    
        } 
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFLichLamViecTab = new PFXemLichLam(ma);
            TabMainBoard.addTab("Lịch làm việc", null, PFLichLamViecTab, "lịch làm việc");
        }
        if (PFLichLamViecTab == null) {
            PFLichLamViecTab = new PFXemLichLam(ma);
            TabMainBoard.addTab("Lịch làm việc", null, PFLichLamViecTab, "lịch làm việc");
        }
    }//GEN-LAST:event_btnLichLamViecActionPerformed

    private void btnNhanXeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanXeMouseEntered
        // TODO add your handling code here:
        if (!clicked[0]) {
            btnNhanXe.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnNhanXeMouseEntered

    private void btnNhanXeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanXeMouseExited
        // TODO add your handling code here:
        if (!clicked[0]) {
            btnNhanXe.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnNhanXeMouseExited

    private void btnTraXeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraXeMouseEntered
        // TODO add your handling code here:
         if (!clicked[1]) {
            btnTraXe.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnTraXeMouseEntered

    private void btnTraXeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraXeMouseExited
        // TODO add your handling code here:
        if (!clicked[1]) {
            btnTraXe.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnTraXeMouseExited

    private void btnTraLichSuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraLichSuMouseEntered
        // TODO add your handling code here:
         if (!clicked[2]) {
            btnTraLichSu.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnTraLichSuMouseEntered

    private void btnTraLichSuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraLichSuMouseExited
        // TODO add your handling code here:
        if (!clicked[2]) {
            btnTraLichSu.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnTraLichSuMouseExited

    private void btnThongTinBaiXeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinBaiXeMouseEntered
        // TODO add your handling code here:
         if (!clicked[3]) {
            btnThongTinBaiXe.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinBaiXeMouseEntered

    private void btnThongTinBaiXeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinBaiXeMouseExited
        // TODO add your handling code here:
        if (!clicked[3]) {
            btnThongTinBaiXe.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnThongTinBaiXeMouseExited

    private void btnLichLamViecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLichLamViecMouseEntered
        // TODO add your handling code here:
         if (!clicked[4]) {
            btnLichLamViec.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnLichLamViecMouseEntered

    private void btnLichLamViecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLichLamViecMouseExited
        // TODO add your handling code here:
        if (!clicked[4]) {
            btnLichLamViec.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnLichLamViecMouseExited

    private void btnThongTinThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinThemMouseEntered
        // TODO add your handling code here:
         if (!clicked[5]) {
            btnThongTinThem.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinThemMouseEntered

    private void btnThongTinThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinThemMouseExited
        // TODO add your handling code here:
        if (!clicked[5]) {
            btnThongTinThem.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnThongTinThemMouseExited

    private void btnTTTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTTTKMouseClicked
        // TODO add your handling code here:
        new FTTAIKHOANNV_INFO(ma).setVisible(true);
    }//GEN-LAST:event_btnTTTKMouseClicked

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

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatMouseClicked

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

    private void btnThoatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnThoatKeyPressed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatKeyPressed

    private void btnDoiMKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoiMKMouseClicked
        // TODO add your handling code here:
        new FDoiMatKhau().setVisible(true);
    }//GEN-LAST:event_btnDoiMKMouseClicked

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

    private void txtChaomungActionPerformed(java.awt.event.ActionEvent evt) {
        /*if(PFNhanVienTab == null){
            PFNhanVienTab = new PFNhanVien();
            TabMainBoard.addTab("Nhân Viên", null, PFNhanVienTab, "Nhân Viên");
        }
        TabMainBoard.setSelectedComponent(PFNhanVienTab);*/
    }

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
            java.util.logging.Logger.getLogger(FMenuStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenuStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenuStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenuStaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenuStaff("21","21").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabMainBoard;
    private javax.swing.JLabel btnDoiMK;
    private javax.swing.JButton btnLichLamViec;
    private javax.swing.JButton btnNhanXe;
    private javax.swing.JLabel btnTTTK;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JButton btnThongTinBaiXe;
    private javax.swing.JButton btnThongTinThem;
    private javax.swing.JButton btnTraLichSu;
    private javax.swing.JButton btnTraXe;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel txtChaomung;
    // End of variables declaration//GEN-END:variables
}
