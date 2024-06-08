/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhapXeDTO;
import DTO.lichlamviec;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lê Quang Hưng
 */
public class LichLamViecDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    List<NhapXeDTO> list = new ArrayList<>();


    public static ArrayList<lichlamviec>xemCaLam1 (String MANV) {
        ArrayList<lichlamviec> lichlam = new ArrayList<>();
        try {
            lichlamviec lv = null;
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from LICHLAMVIEC where MANV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MANV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lv = new lichlamviec();
                lv.setMaCa(rs.getString(1));
                Date x=rs.getDate(2);
                lv.setNgay(x.toLocalDate());
                String sql1="select * from CA where MACA=?";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ps1.setString(1, lv.getMaCa());
                ResultSet rs1 = ps1.executeQuery();
                if(rs1.next()){
                    lv.setGioBatDau(rs1.getTime(3).toString());
                    lv.setGioKetThuc(rs1.getTime(4).toString());
                    lv.setTenCa(rs1.getString(2));
                }
                lichlam.add(lv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lichlam;
    }
    
    public static ArrayList<lichlamviec>xemCaLam2 (String MANV, String tuNgay, String denNgay) {
        ArrayList<lichlamviec> lichlam = new ArrayList<>();
        try {
            lichlamviec lv = null;
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from LICHLAMVIEC where MANV=? and NGAY between '"+tuNgay+"' and '"+denNgay+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, MANV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lv = new lichlamviec();
                lv.setMaCa(rs.getString(1));
                Date x=rs.getDate(2);
                lv.setNgay(x.toLocalDate());
                String sql1="select * from CA where MACA=?";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ps1.setString(1, lv.getMaCa());
                ResultSet rs1 = ps1.executeQuery();
                if(rs1.next()){
                    lv.setGioBatDau(rs1.getTime(3).toString());
                    lv.setGioKetThuc(rs1.getTime(4).toString());
                    lv.setTenCa(rs1.getString(2));
                }
                lichlam.add(lv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lichlam;
    }
    
    public static ArrayList<String>LoadMaNV () {
        ArrayList<String> lichlam = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAN_VIEN where TRANGTHAI='True' and ID_CT_CHUCVU=2";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lichlam.add(rs.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lichlam;
    }

    public boolean checkngay(String ngay) {
        boolean x=true;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from LICHLAMVIEC where NGAY=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ngay);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                x=false;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public int themlich(String ngay,String maCa, String maNV) {
        int x=0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "insert into LICHLAMVIEC values(?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maCa);
            ps.setString(2, ngay);
            ps.setString(3, maNV);
            x = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
    
    public static ArrayList<lichlamviec>loadLich () {
        ArrayList<lichlamviec> lichlam = new ArrayList<>();
        try {
            lichlamviec lv = null;
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from LICHLAMVIEC";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lv = new lichlamviec();
                lv.setMaCa(rs.getString(1));
                Date x=rs.getDate(2);
                lv.setNgay(x.toLocalDate());
                lv.setMaNV(rs.getString(3));
                String sql1="select * from CA where MACA=?";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ps1.setString(1, lv.getMaCa());
                ResultSet rs1 = ps1.executeQuery();
                if(rs1.next()){
                    lv.setGioBatDau(rs1.getTime(3).toString());
                    lv.setGioKetThuc(rs1.getTime(4).toString());
                    lv.setTenCa(rs1.getString(2));
                }
                String sql2="select * from NHAN_VIEN where MANV=?";
                PreparedStatement ps2 = conn.prepareStatement(sql2);
                ps2.setString(1, lv.getMaNV());
                ResultSet rs2 = ps2.executeQuery();
                if(rs2.next()){
                    lv.setTenNV(rs2.getString(2));
                }
                lichlam.add(lv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lichlam;
    }
    
    public static ArrayList<lichlamviec>loadTimKiem(String ma) {
        ArrayList<lichlamviec> lichlam = new ArrayList<>();
        try {
            lichlamviec lv = null;
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from LICHLAMVIEC where MANV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lv = new lichlamviec();
                lv.setMaCa(rs.getString(1));
                Date x=rs.getDate(2);
                lv.setNgay(x.toLocalDate());
                lv.setMaNV(rs.getString(3));
                String sql1="select * from CA where MACA=?";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ps1.setString(1, lv.getMaCa());
                ResultSet rs1 = ps1.executeQuery();
                if(rs1.next()){
                    lv.setGioBatDau(rs1.getTime(3).toString());
                    lv.setGioKetThuc(rs1.getTime(4).toString());
                    lv.setTenCa(rs1.getString(2));
                }
                String sql2="select * from NHAN_VIEN where MANV=?";
                PreparedStatement ps2 = conn.prepareStatement(sql2);
                ps2.setString(1, lv.getMaNV());
                ResultSet rs2 = ps2.executeQuery();
                if(rs2.next()){
                    lv.setTenNV(rs2.getString(2));
                }
                lichlam.add(lv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lichlam;
    }
    
    public int capNhatLich(String ngay,String maCa, String maNV) {
        int x=0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "update LICHLAMVIEC set MANV='"+maNV+"' where MACA='"+maCa+"' and NGAY='"+ngay+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            x = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
}
