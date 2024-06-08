/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhapXeDTO;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Lê Quang Hưng
 */
public class NhapXeDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;

    public static ArrayList<String> LoadComboBoxMaVe(String loaive) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql="";
            if (loaive.equals("Ve Luot")==true)
                sql = "SELECT * FROM THELUOT WHERE Status='Chua su dung'";
            else if (loaive.equals("Ve Thang")==true)
                sql = "SELECT * FROM THETHANG WHERE Status='Dang su dung'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public static ArrayList<String> LoadcbxKhuVuc(String loaixe) {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql="";
            if (loaixe.equals("Xe máy")){
               
                sql = "SELECT tenViTri FROM VITRI where id_VT='A' or id_VT='B' or id_VT='C'";
            }else{
                sql = "SELECT tenViTri FROM VITRI where id_VT='D' or id_VT='E'";
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }


    public int ThemXe(NhapXeDTO nx) throws Exception {
        try {
            Date date = new Date(0000 - 00 - 00);
            String sql = "UPDATE THELUOT SET Thoigianvao = ?, Status = ?, BSX = ?, MANV2 = ?, LoaiXe=?, ViTri=?, ID_PHI=? WHERE ID = ?;";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            String x= nx.getNgayGui()+" "+nx.getGioGui();
            String vt = nx.getViTri().substring(nx.getViTri().length() - 1);
            ps.setString(1, x);
            ps.setString(2, "Dang su dung");
            ps.setString(3, nx.getBienSo());
            ps.setString(4,nx.getMaNV());
            ps.setString(5, nx.getLoaiXe());
            ps.setString(6, vt);
            ps.setInt(7, nx.getID_phi());
            ps.setString(8, nx.getMaVe());
            int update = ps.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    
    public NhapXeDTO checkBien(String bienso){
        NhapXeDTO b = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select BSX from THELUOT where BSX=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, bienso);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                b = new NhapXeDTO();
                b.setBienSo(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
    
    public boolean checkMANV(String ma){
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select MANV from NHAN_VIEN where MANV=? and (ID_CT_CHUCVU=3 or ID_CT_CHUCVU=4)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean checkTheThang(String ma, LocalDate ngay) {
        boolean tk = false;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "SELECT CONVERT(date, NGAYHETHAN) AS Ngay FROM THETHANG where ID='" + ma + "' and Status='Dang su dung'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                 LocalDate localDate = rs.getDate(1).toLocalDate();
                 if (ngay.isBefore(localDate) || ngay.isEqual(localDate))
                 {
                     tk=true;
                 }
                 else{
                     sql = "update THETHANG set Status='Het han' where ID='" + ma + "'";
                     ps.executeUpdate();
                 }
                 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }
    
    public void LoadTT() {
    try {
        Connection conn = KetNoiDAO.getKetNoiDAO();
        String sql = "SELECT ID, NGAYHETHAN FROM THETHANG"; // Chọn cột ID để sử dụng trong câu lệnh UPDATE
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LocalDate ngayHetHan = rs.getDate("NGAYHETHAN").toLocalDate();
            String maThe = rs.getString("ID");
            if (ngayHetHan.isBefore(LocalDate.now())) {
                String updateSql = "UPDATE THETHANG SET Status = 'Het han' WHERE ID = ?";
                PreparedStatement updatePs = conn.prepareStatement(updateSql);
                updatePs.setString(1, maThe);
                updatePs.executeUpdate();
            }
        }
        // Đóng các đối tượng ResultSet và PreparedStatement
        rs.close();
        ps.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    
    public void themLichSu(String gio, LocalDate ngay,String ID) {
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = ngay.format(formatter)+" "+gio;
            String sql = "insert into LUOT_RAVAO(ID_THE,Thoigianvao) values(?,'"+formattedDate+"')";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean checkLichSu(String ID) {
        boolean check=true;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from LUOT_RAVAO where ID_the=? and ThoiGianRa IS NULL";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ID);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                check=false;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }
}
