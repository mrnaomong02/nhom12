/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;


import DAO.DangNhapDAO;
import DTO.AccountDTO;
//import DAO.XeDAO;
//import DTO.XeDTO;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import main.Main;

/**
 *
 * @author Le Chuong
 */
public class JFmenuResident extends javax.swing.JFrame {

    private PFNhapThongTinXe PFNhapThongTinXeTab;
    private PFDKGuiXe PFDKGuiXeTab;
    private PFThongTinThem PFInforTab;
    private PFThongTinTheThang PFThongTinTheTab;
    private PFTraLichSuDK PFTraLichSuDKTab;
    private String ma;
    private String BSX;
    boolean[] clicked = new boolean[5];
    /**
     * Creates new form JFmenuResident
     */
    public JFmenuResident(String user,String maCD) {
        initComponents();
        setSize(1270, 720);
        ma=maCD;
        setLocationRelativeTo(null);
        this.setTitle("PHẦN MỀN QUẢN LÝ BÃI GỬI XE");
        ImageIcon icon = new ImageIcon(getClass().getResource("/UI/Image/Logo_PTIT.jpg")); // Sử dụng đường dẫn tương đối
        Image newImage = icon.getImage().getScaledInstance(45, 45, Image.SCALE_SMOOTH);
        this.setIconImage(newImage);
        xinchao(user);
        //layBSX(user);
        
        btnNhapThongTinXe.setBorderPainted(false);
        btnNhapThongTinXe.setContentAreaFilled(false);
        btnNhapThongTinXe.setOpaque(true);
        btnNhapThongTinXe.setFocusPainted(false);
        btnNhapThongTinXe.setBackground(new Color(204, 204, 255));
        btnNhapThongTinXe.setBorder(BorderFactory.createEmptyBorder());
        
        btnDKXe.setBorderPainted(false);
        btnDKXe.setContentAreaFilled(false);
        btnDKXe.setOpaque(true);
        btnDKXe.setFocusPainted(false);
        btnDKXe.setBackground(new Color(204, 204, 255));
        btnDKXe.setBorder(BorderFactory.createEmptyBorder());
        
        btnThongTinThe.setBorderPainted(false);
        btnThongTinThe.setContentAreaFilled(false);
        btnThongTinThe.setOpaque(true);
        btnThongTinThe.setFocusPainted(false);
        btnThongTinThe.setBackground(new Color(204, 204, 255));
        btnThongTinThe.setBorder(BorderFactory.createEmptyBorder());
        
        btnLichSu.setBorderPainted(false);
        btnLichSu.setContentAreaFilled(false);
        btnLichSu.setOpaque(true);
        btnLichSu.setFocusPainted(false);
        btnLichSu.setBackground(new Color(204, 204, 255));
        btnLichSu.setBorder(BorderFactory.createEmptyBorder());
        
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
        for (int i=0;i<5;++i){
            if(clicked[i]==true){
                switch (i) {
                    case 0:
                        btnNhapThongTinXe.setBackground(new Color(204,204,255));
                        btnNhapThongTinXe.setFont(new Font(btnNhapThongTinXe.getFont().getName(), Font.PLAIN, btnNhapThongTinXe.getFont().getSize()));
                        btnNhapThongTinXe.setForeground(Color.BLACK);
                        break;
                    case 1:
                        btnDKXe.setBackground(new Color(204,204,255));
                        btnDKXe.setFont(new Font(btnDKXe.getFont().getName(), Font.PLAIN, btnDKXe.getFont().getSize()));
                        btnDKXe.setForeground(Color.BLACK);
                        break;
                    case 2:
                        btnThongTinThe.setBackground(new Color(204,204,255));
                        btnThongTinThe.setFont(new Font(btnThongTinThe.getFont().getName(), Font.PLAIN, btnThongTinThe.getFont().getSize()));
                        btnThongTinThe.setForeground(Color.BLACK);
                        break;
                    case 3:
                        btnLichSu.setBackground(new Color(204,204,255));
                        btnLichSu.setFont(new Font(btnLichSu.getFont().getName(), Font.PLAIN, btnLichSu.getFont().getSize()));
                        btnLichSu.setForeground(Color.BLACK);
                        break;
                    case 4:
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
        btnNhapThongTinXe = new javax.swing.JButton();
        btnDKXe = new javax.swing.JButton();
        btnThongTinThe = new javax.swing.JButton();
        btnLichSu = new javax.swing.JButton();
        btnThongTinThem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1270, 720));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 80));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
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
            .addGap(0, 1023, Short.MAX_VALUE)
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
            .addComponent(TabMainBoard)
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

        btnNhapThongTinXe.setBackground(new java.awt.Color(204, 204, 255));
        btnNhapThongTinXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNhapThongTinXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_car_racing_32px_1.png"))); // NOI18N
        btnNhapThongTinXe.setText("Nhập thông tin xe");
        btnNhapThongTinXe.setBorder(null);
        btnNhapThongTinXe.setBorderPainted(false);
        btnNhapThongTinXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhapThongTinXe.setFocusPainted(false);
        btnNhapThongTinXe.setFocusable(false);
        btnNhapThongTinXe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNhapThongTinXe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNhapThongTinXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhapThongTinXeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNhapThongTinXeMouseExited(evt);
            }
        });
        btnNhapThongTinXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapThongTinXeActionPerformed(evt);
            }
        });

        btnDKXe.setBackground(new java.awt.Color(204, 204, 255));
        btnDKXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDKXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_scorecard_32px.png"))); // NOI18N
        btnDKXe.setText("Đăng ký gửi xe");
        btnDKXe.setBorder(null);
        btnDKXe.setBorderPainted(false);
        btnDKXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDKXe.setFocusPainted(false);
        btnDKXe.setFocusable(false);
        btnDKXe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDKXe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDKXe.setName("btnDKXe"); // NOI18N
        btnDKXe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDKXeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDKXeMouseExited(evt);
            }
        });
        btnDKXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDKXeActionPerformed(evt);
            }
        });

        btnThongTinThe.setBackground(new java.awt.Color(204, 204, 255));
        btnThongTinThe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThongTinThe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_information_32px.png"))); // NOI18N
        btnThongTinThe.setText("Thông tin thẻ");
        btnThongTinThe.setBorder(null);
        btnThongTinThe.setBorderPainted(false);
        btnThongTinThe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongTinThe.setFocusPainted(false);
        btnThongTinThe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongTinThe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnThongTinThe.setName("btnThongTinThem"); // NOI18N
        btnThongTinThe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongTinTheMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongTinTheMouseExited(evt);
            }
        });
        btnThongTinThe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinTheActionPerformed(evt);
            }
        });

        btnLichSu.setBackground(new java.awt.Color(204, 204, 255));
        btnLichSu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLichSu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_bank_cards_32px_1.png"))); // NOI18N
        btnLichSu.setText("Tra lịch sử hóa đơn");
        btnLichSu.setBorder(null);
        btnLichSu.setBorderPainted(false);
        btnLichSu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLichSu.setFocusable(false);
        btnLichSu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLichSu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLichSu.setName("btnLichSu"); // NOI18N
        btnLichSu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLichSuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLichSuMouseExited(evt);
            }
        });
        btnLichSu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnNhapThongTinXe, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
            .addComponent(btnThongTinThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLichSu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongTinThe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDKXe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnNhapThongTinXe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDKXe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTinThe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLichSu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnThongTinThem)
                .addGap(0, 375, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1239, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 17, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(63, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void btnTTTKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTTTKMouseClicked
        // TODO add your handling code here:
        new FTTAIKHOANCD_INFO(ma).setVisible(true);
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
        new FDoiMatKhau_CD().setVisible(true);
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

    private void btnNhapThongTinXeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapThongTinXeMouseEntered
        // TODO add your handling code here:
        if (!clicked[0]) {
            btnNhapThongTinXe.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnNhapThongTinXeMouseEntered

    private void btnNhapThongTinXeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhapThongTinXeMouseExited
        // TODO add your handling code here:
        if (!clicked[0]) {
            btnNhapThongTinXe.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnNhapThongTinXeMouseExited

    private void btnNhapThongTinXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapThongTinXeActionPerformed
        if (!clicked[0]) {
            btnNhapThongTinXe.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnNhapThongTinXe.setFont(new Font(btnNhapThongTinXe.getFont().getName(), Font.BOLD, btnNhapThongTinXe.getFont().getSize()));
            btnNhapThongTinXe.setForeground(Color.WHITE);
            flagClick();
            clicked[0] = true;
        }
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFNhapThongTinXeTab = new PFNhapThongTinXe(ma);
            TabMainBoard.addTab("Nhập Thông Tin Xe", null, PFNhapThongTinXeTab, "Nhập Thông Tin Xe");
        }
        if (PFNhapThongTinXeTab == null) {
            PFNhapThongTinXeTab = new PFNhapThongTinXe(ma);
            TabMainBoard.addTab("Nhập Thông Tin Xe", null, PFNhapThongTinXeTab, "Nhập Thông Tin Xe");
        }
    }//GEN-LAST:event_btnNhapThongTinXeActionPerformed

    private void btnDKXeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDKXeMouseEntered
        // TODO add your handling code here:
        if (!clicked[1]) {
            btnDKXe.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnDKXeMouseEntered

    private void btnDKXeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDKXeMouseExited
        // TODO add your handling code here:
        if (!clicked[1]) {
            btnDKXe.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnDKXeMouseExited

    private void btnDKXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDKXeActionPerformed
        if (!clicked[1]) {
            btnDKXe.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnDKXe.setFont(new Font(btnDKXe.getFont().getName(), Font.BOLD, btnDKXe.getFont().getSize()));
            btnDKXe.setForeground(Color.WHITE);
            flagClick();
            clicked[1] = true;
        }
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFDKGuiXeTab = new PFDKGuiXe(ma);
            TabMainBoard.addTab("Đăng Ký Gửi Xe", null, PFDKGuiXeTab, "Đăng Ký Gửi Xe");
        }
        if (PFDKGuiXeTab == null) {
            PFDKGuiXeTab = new PFDKGuiXe(ma);
            TabMainBoard.addTab("Đăng Ký Gửi Xe", null, PFDKGuiXeTab, "Đăng Ký Gửi Xe");
        }
    }//GEN-LAST:event_btnDKXeActionPerformed

    private void btnThongTinTheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinTheMouseEntered
        // TODO add your handling code here:
        if (!clicked[2]) {
            btnThongTinThe.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinTheMouseEntered

    private void btnThongTinTheMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinTheMouseExited
        // TODO add your handling code here:
        if (!clicked[2]) {
            btnThongTinThe.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnThongTinTheMouseExited

    private void btnThongTinTheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinTheActionPerformed
        // TODO add your handling code here:
        if (!clicked[2]) {
            btnThongTinThe.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnThongTinThe.setFont(new Font(btnThongTinThe.getFont().getName(), Font.BOLD, btnThongTinThe.getFont().getSize()));
            btnThongTinThe.setForeground(Color.WHITE);
            flagClick();
            clicked[2] = true;
        }
        if (TabMainBoard.getSelectedIndex() == 0) {
             TabMainBoard.remove(0);
             PFThongTinTheTab = new PFThongTinTheThang(ma);
             TabMainBoard.addTab("Thông Tin Thẻ", null, PFThongTinTheTab, "CThông Tin Thẻ");
        }
        if (PFThongTinTheTab == null) {
             PFThongTinTheTab = new PFThongTinTheThang(ma);
             TabMainBoard.addTab("Thông Tin Thẻ", null, PFThongTinTheTab, "Thông Tin Thẻ");
        }
    }//GEN-LAST:event_btnThongTinTheActionPerformed

    private void btnLichSuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLichSuMouseEntered
        // TODO add your handling code here:
        if (!clicked[3]) {
            btnLichSu.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnLichSuMouseEntered

    private void btnLichSuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLichSuMouseExited
        // TODO add your handling code here:
        if (!clicked[3]) {
            btnLichSu.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnLichSuMouseExited

    private void btnLichSuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuActionPerformed
        if (!clicked[3]) {
            btnLichSu.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnLichSu.setFont(new Font(btnLichSu.getFont().getName(), Font.BOLD, btnLichSu.getFont().getSize()));
            btnLichSu.setForeground(Color.WHITE);
            flagClick();
            clicked[3] = true;
        }
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFTraLichSuDKTab = new PFTraLichSuDK(ma);
            TabMainBoard.addTab("Tra Lịch Sử", null, PFTraLichSuDKTab, "Tra Lịch Sử");
        }
        if (PFTraLichSuDKTab == null) {
            PFTraLichSuDKTab = new PFTraLichSuDK(ma);
            TabMainBoard.addTab("Tra Lịch Sử", null, PFTraLichSuDKTab, "Tra Lịch Sử");
       }
    }//GEN-LAST:event_btnLichSuActionPerformed

    private void btnThongTinThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinThemMouseEntered
        // TODO add your handling code here:
        if (!clicked[4]) {
            btnThongTinThem.setBackground(new Color(107,107,255)); // Thay đổi thành màu xanh nhạt khi di chuột vào
        }
    }//GEN-LAST:event_btnThongTinThemMouseEntered

    private void btnThongTinThemMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongTinThemMouseExited
        // TODO add your handling code here:
        if (!clicked[4]) {
            btnThongTinThem.setBackground(new Color(204,204,255)); // Quay lại màu gốc khi di chuột ra
        }
    }//GEN-LAST:event_btnThongTinThemMouseExited

    private void btnThongTinThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinThemActionPerformed
        if (!clicked[4]) {
            btnThongTinThem.setBackground(new Color(102,102,255));// Thay đổi thành màu hồng nhạt khi nhấp chuột
            btnThongTinThem.setFont(new Font(btnThongTinThem.getFont().getName(), Font.BOLD, btnThongTinThem.getFont().getSize()));
            btnThongTinThem.setForeground(Color.WHITE);
            flagClick();
            clicked[4] = true;
        }
        if (TabMainBoard.getSelectedIndex() == 0) {
            TabMainBoard.remove(0);
            PFInforTab = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInforTab, "Thông Tin");
        }
        if (PFInforTab == null) {
            PFInforTab = new PFThongTinThem();
            TabMainBoard.addTab("Thông Tin", null, PFInforTab, "Thông Tin");
        }
    }//GEN-LAST:event_btnThongTinThemActionPerformed

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
            java.util.logging.Logger.getLogger(JFmenuResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFmenuResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFmenuResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFmenuResident.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFmenuResident("21","21").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane TabMainBoard;
    private javax.swing.JButton btnDKXe;
    private javax.swing.JLabel btnDoiMK;
    private javax.swing.JButton btnLichSu;
    private javax.swing.JButton btnNhapThongTinXe;
    private javax.swing.JLabel btnTTTK;
    private javax.swing.JLabel btnThoat;
    private javax.swing.JButton btnThongTinThe;
    private javax.swing.JButton btnThongTinThem;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel txtChaomung;
    // End of variables declaration//GEN-END:variables
}
