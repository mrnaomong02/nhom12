/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.NhapXeDTO;
import DTO.TongVeDTO;
import java.util.ArrayList;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 *
 * @author Lê Quang Hưng
 */
public class TongVeDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    List<TongVeDTO> list = new ArrayList<>();

    public static ArrayList<NhapXeDTO> veXe() {
        ArrayList<NhapXeDTO> veXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select *from THELUOT";
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
                nx.setStatus(rs.getString(4));
                Timestamp timestamp = rs.getTimestamp(2);
                if (timestamp!=null){
                    LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
                    String hour = timestamp.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    nx.setNgayGui(localDate);
                    nx.setGioGui(hour);
                }
                else{
                    nx.setNgayGui(null);
                    nx.setGioGui("");
                }
                Timestamp timestamp1 = rs.getTimestamp(3);
                if (timestamp1!=null){
                    LocalDate localDate1 = timestamp1.toLocalDateTime().toLocalDate();
                    String hour1 = timestamp1.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    nx.setNgayNhan(localDate1);
                    nx.setGioNhan(hour1);
                }else{
                    nx.setNgayNhan(null);
                    nx.setGioNhan("");
                }
                nx.setMaNV1(rs.getString(6));
                nx.setMaNV2(rs.getString(7));
                veXelist.add(nx);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }
    
    public static ArrayList<String> LoadComboBoxMaVe() {
        ArrayList<String> veXelist = new ArrayList<>();
        String ma="";
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select *from THELUOT where Status='Het han'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            veXelist.removeAll(veXelist);
            while (rs.next()) {
                ma=rs.getString(1);
                veXelist.add(ma);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }


    public int xoaVe(String mave) throws Exception {
        String sql = "delete from THELUOT where ID = '" + mave + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public int reset(String mave) throws Exception {
        String sql = "update THELUOT set ThoiGianVao=NULL, ThoiGianRa=NULL,Status='Chua su dung',BSX=NULL,MANV2=NULL,LoaiXe=NULL, ViTri=NULL,ID_PHI=NULL where ID='"+mave+"'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public int themVe(int sl, String ma) throws Exception {
        int update=0;
        try {
            String sql = "INSERT INTO THELUOT(ID,MANV1,Status) VALUES ('TL00001',?,'Chua su dung')";
            for (int i=0;i<sl;++i){
                conn = KetNoiDAO.getKetNoiDAO();
                ps = conn.prepareStatement(sql);
                ps.setString(1, ma);
                update = ps.executeUpdate();
                if (update<=0){
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return update;
    }
    //Thẻ tháng
    public static ArrayList<NhapXeDTO> veXe2() {
        ArrayList<NhapXeDTO> veXelist = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select *from THETHANG";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            NhapXeDTO nx;
            veXelist.removeAll(veXelist);
            
            while (rs.next()) {
                nx = new NhapXeDTO();
                nx.setMaVe(rs.getString(1));
                nx.setBienSo(rs.getString(4));
                nx.setStatus(rs.getString(6));
                Timestamp timestamp = rs.getTimestamp(2);
                if (timestamp!=null){
                    LocalDate localDate = timestamp.toLocalDateTime().toLocalDate();
                    String hour = timestamp.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    nx.setNgayGui(localDate);
                    nx.setGioGui(hour);
                }
                else{
                    nx.setNgayGui(null);
                    nx.setGioGui("");
                }
                Timestamp timestamp1 = rs.getTimestamp(3);
                if (timestamp1!=null){
                    LocalDate localDate1 = timestamp1.toLocalDateTime().toLocalDate();
                    String hour1 = timestamp1.toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                    nx.setNgayNhan(localDate1);
                    nx.setGioNhan(hour1);
                }else{
                    nx.setNgayNhan(null);
                    nx.setGioNhan("");
                }
                String sql1 = "select *from XE where BSX='"+nx.getBienSo()+"'";
                Statement st1 = conn.createStatement();
                ResultSet rs1 = st1.executeQuery(sql1);
                if (rs1.next()){
                    nx.setMaCD(rs1.getString(3));
                    nx.setLoaiXe(rs1.getString(2));
                }
                veXelist.add(nx);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }
    
    public static ArrayList<String> LoadComboBoxMaVe2() {
        ArrayList<String> veXelist = new ArrayList<>();
        String ma="";
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select *from THETHANG where Status='Het han' or Status='Khong su dung'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            veXelist.removeAll(veXelist);
            while (rs.next()) {
                ma=rs.getString(1);
                veXelist.add(ma);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veXelist;
    }


    public int xoaVe2(String mave) throws Exception {
        String sql = "delete from THETHANG where ID = '" + mave + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public int reset2(String mave) throws Exception {
        String sql = "update THETHANG set NGAYTAO=GETDATE(), NGAYHETHAN=DATEADD(day, 30, GETDATE()), BSX=NULL, ID_PHI=NULL,Status=NULL where ID='"+mave+"'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

//    public int themVe2(int sl, String ma) throws Exception {
//        int update=0;
//        try {
//            String sql = "INSERT INTO THELUOT(ID,MANV1,Status) VALUES ('TL00001',?,'Chua su dung')";
//            for (int i=0;i<sl;++i){
//                conn = KetNoiDAO.getKetNoiDAO();
//                ps = conn.prepareStatement(sql);
//                ps.setString(1, ma);
//                update = ps.executeUpdate();
//                if (update<=0){
//                    break;
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return update;
//    }
}
