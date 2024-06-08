/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;



import java.sql.*;



/**
 *
 * @author alats
 */

public class TraCuuBaiXeDAO extends KetNoiDAO {
    
    Connection conn = null;
    PreparedStatement ps = null;
    
    public String XeMayTong(){
     
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LoaiXe) as LOAIXE from THELUOT where LoaiXe='Xe máy' and Status='Dang su dung'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String XeMayA(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LoaiXe) from THELUOT where LoaiXe='Xe máy' and ViTri='A' and Status='Dang su dung'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String XeMayB(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LoaiXe) from THELUOT where LoaiXe='Xe máy' and ViTri='B' and Status='Dang su dung'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String XeMayC(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LoaiXe) from THELUOT where LoaiXe='Xe máy' and ViTri='C' and Status='Dang su dung'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    
    public String OTOTong(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LoaiXe) as LOAIXE from THELUOT where LoaiXe='Xe ô tô' and Status='Dang su dung'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public String OTOD(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LoaiXe) from THELUOT where LoaiXe='Xe ô tô' and ViTri='D' and Status='Dang su dung'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    
    
    public String OTOE(){
        String nx = null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select count(LoaiXe) from THELUOT where LoaiXe='Xe ô tô' and ViTri='E' and Status='Dang su dung'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                nx = rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
}
