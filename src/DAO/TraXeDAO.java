/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhapXeDTO;
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
public class TraXeDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    List<NhapXeDTO> list = new ArrayList<>();

    public static ArrayList<NhapXeDTO> veXe() {
        ArrayList<NhapXeDTO> veXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select *from THELUOT where Status='Dang su dung'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            NhapXeDTO nx;
            veXelist.removeAll(veXelist);
            
            while (rs.next()) {
                nx = new NhapXeDTO();
                nx.setMaVe(rs.getString(1));
                nx.setBienSo(rs.getString(5));
                nx.setLoaiXe(rs.getString(8));
                nx.setViTri(rs.getString(9));
                Timestamp timestamp = rs.getTimestamp(2);
                
                LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
                String hour = timestamp.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                nx.setNgayGui(localDate);
                nx.setGioGui(hour);
                nx.setID_phi(rs.getInt(10));
                veXelist.add(nx);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }

    private static LocalDate LocalDate(Date date) {
        return LocalDate.parse(date.toString(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
    
    public NhapXeDTO checkMaVe(String ma) {
        NhapXeDTO nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from THELUOT where ID=? and Status='Dang su dung'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new NhapXeDTO();
                nx.setBienSo(rs.getString(5));
                Timestamp timestamp = rs.getTimestamp(2);
                
                LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
                String hour = timestamp.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                nx.setNgayGui(localDate);
                nx.setGioGui(hour);
                nx.setID_phi(rs.getInt(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public boolean checkTheThang(String ma, LocalDate ngay) {
        boolean tk = false;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "SELECT CONVERT(date, NGAYHETHAN) AS Ngay FROM THETHANG where ID='" + ma + "'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                 LocalDate localDate = rs.getDate(1).toLocalDate();
                 if (ngay.isBefore(localDate) || ngay.isEqual(localDate))
                 {
                     tk=true;
                 }
                 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;
    }
    
    public void EXIT_TL(String gio, LocalDate ngay,String ID) {
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = ngay.format(formatter)+" "+gio;
            String sql = "Update THELUOT set ThoiGianRa=?, Status='Het han' where ID=? and ThoiGianRa IS NULL";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, formattedDate);
            ps.setString(2, ID);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public int themLichSu(String gio, LocalDate ngay,String ID) {
        int x=0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String formattedDate = ngay.format(formatter)+" "+gio;
            System.out.println(formattedDate);
            String sql = "Update LUOT_RAVAO set ThoiGianRa='"+formattedDate+"' where ID_the='"+ID+"' and ThoiGianRa IS NULL";
            PreparedStatement ps = conn.prepareStatement(sql);
            x = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
    
    
    public static ArrayList<NhapXeDTO> traTTTheoBienSo(String bienso) {
        ArrayList<NhapXeDTO> lichsuXe = new ArrayList<>();
        NhapXeDTO nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from THETHANG where BSX=? and Status='Dang su dung'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, bienso);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new NhapXeDTO();
                nx.setMaVe(rs.getString(1));
                nx.setBienSo(bienso);
                sql="select * from XE where BSX=?";
                ps=conn.prepareStatement(sql);
                ps.setString(1, bienso);
                rs = ps.executeQuery();
                if (rs.next()){
                    nx.setLoaiXe(rs.getString(2));
                }
                sql="select * from LUOT_RAVAO where ID_the=?";
                ps=conn.prepareStatement(sql);
                ps.setString(1, nx.getMaVe());
                rs = ps.executeQuery();
                while(rs.next()){
                   Timestamp timestamp = rs.getTimestamp(3);
                   LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
                   String hour = timestamp.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                   nx.setNgayGui(localDate);
                   nx.setGioGui(hour);
                   Timestamp timestamp2 = rs.getTimestamp(4);
                   if (timestamp2!=null){
                        LocalDate localDate2 = timestamp2.toLocalDateTime().toLocalDate();
                        String hour2 = timestamp2.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                        nx.setNgayNhan(localDate2);
                        nx.setGioNhan(hour2);
                   }
                   else {
                       nx.setNgayNhan(LocalDate.now());
                       nx.setGioNhan("");
                   }
                   lichsuXe.add(nx);
                }  
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lichsuXe;
    }
    
    public static ArrayList<NhapXeDTO> traTTTheoMaVe(String ma) {
        ArrayList<NhapXeDTO> lichsuXe = new ArrayList<>();
        NhapXeDTO nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from THETHANG where ID=? and Status='Dang su dung'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new NhapXeDTO();
                nx.setMaVe(ma);
                nx.setBienSo(rs.getString(4));
                sql="select * from XE where BSX=?";
                ps=conn.prepareStatement(sql);
                ps.setString(1, nx.getBienSo());
                rs = ps.executeQuery();
                if (rs.next()){
                    nx.setLoaiXe(rs.getString(2));
                }
                sql="select * from LUOT_RAVAO where ID_the=?";
                ps=conn.prepareStatement(sql);
                ps.setString(1, ma);
                rs = ps.executeQuery();
                while(rs.next()){
                   Timestamp timestamp = rs.getTimestamp(3);
                   LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
                   String hour = timestamp.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                   nx.setNgayGui(localDate);
                   nx.setGioGui(hour);
                   Timestamp timestamp2 = rs.getTimestamp(4);
                   if (timestamp2!=null){
                        LocalDate localDate2 = timestamp2.toLocalDateTime().toLocalDate();
                        String hour2 = timestamp2.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                        nx.setNgayNhan(localDate2);
                        nx.setGioNhan(hour2);
                   }
                   else {
                       nx.setNgayNhan(LocalDate.now());
                       nx.setGioNhan("");
                   }
                   lichsuXe.add(nx);
                } 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lichsuXe;
    }

    public NhapXeDTO findXebyBienso(String bienso) {
        NhapXeDTO nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from THELUOT where BSX=? and Status='Dang su dung'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, bienso);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new NhapXeDTO();
                nx.setMaVe(rs.getString(1));
                nx.setBienSo(rs.getString(5));
                nx.setLoaiXe(rs.getString(8));
                nx.setViTri(rs.getString(9));
                Timestamp timestamp = rs.getTimestamp(2);
                
                LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
                String hour = timestamp.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                nx.setNgayGui(localDate);
                nx.setGioGui(hour);
                nx.setID_phi(rs.getInt(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public NhapXeDTO findXebyMave(String mave) {
        NhapXeDTO nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from THELUOT where ID=? and Status='Dang su dung'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mave);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new NhapXeDTO();
                nx.setMaVe(rs.getString(1));
                nx.setBienSo(rs.getString(5));
                nx.setLoaiXe(rs.getString(8));
                nx.setViTri(rs.getString(9));
                Timestamp timestamp = rs.getTimestamp(2);
                
                LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
                String hour = timestamp.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                nx.setNgayGui(localDate);
                nx.setGioGui(hour);
                nx.setID_phi(rs.getInt(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }

    public long layPhiBN (int ID) {
        double phiBN=0;
        long phi=0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from PHIGUIXE where ID=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ID);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                phiBN=rs.getDouble(3);
                phi=Math.round(phiBN);
            } 
        }catch (Exception e) {
            e.printStackTrace();
        }
        return phi;
    }
    public long layPhiBD (int ID) {
        double phiBD=0;
        long phi=0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from PHIGUIXE where ID=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, ID);
            
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                phiBD=rs.getDouble(4);
                phi=Math.round(phiBD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return phi;
    }
    
}
