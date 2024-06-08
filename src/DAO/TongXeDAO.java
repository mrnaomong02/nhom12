/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.TongXeDTO;
import java.sql.*;

/**
 *
 * @author Lê Quang Hưng
 */
public class TongXeDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;

    public int themCTHoaDon(TongXeDTO nx) throws Exception {
        int update=0;
        try {
            String sql = "INSERT INTO CT_HOADON(ID_THE,LoaiVe,BienSoXe,KhuVuc,ThoiGianGui,ThoiGianTra,LoaiXe) VALUES (?,?,?,?,?,?,?)";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ps.setString(1, nx.getMaVe());
            ps.setString(2, nx.getLoaiVe());
            ps.setString(3, nx.getBienSo());
            ps.setString(4, nx.getKhuVuc());
            String x=nx.getNgayGui()+" "+nx.getGioGui();
            ps.setString(5, x);
            x=nx.getNgayTra()+" "+nx.getGioTra();
            ps.setString(6, x);
            ps.setString(7, nx.getLoaiXe());
            update = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return update;
    }
    
    public int layMaCTHoaDon(String tgTra) throws Exception {
        int x=0;
        try {
            String sql = "select * from CT_HOADON where ThoiGianTra='"+tgTra+"'";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                x=rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
    
    public int layMaCTHoaDon2(String maThe) throws Exception {
        int x=0;
        try {
            String sql = "select * from CT_HOADON where ID_THE='"+maThe+"'";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ResultSet rs= ps.executeQuery();
            if(rs.next()){
                x=rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
public int themHoaDon(String tgTao, int tien, int ctHD, String maNV) throws Exception {
    int update = 0;
    try {
        // Lấy số cuối cùng trong cơ sở dữ liệu
        String lastTTNumber = getLastTTNumberFromDatabase(); // Hàm này cần được triển khai
        
        // Tăng số lên một đơn vị
        int nextTTNumber = 0;
        try {
            nextTTNumber = Integer.parseInt(lastTTNumber.trim()) + 1;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        
        // Tạo chuỗi TTnnnn với độ dài cố định bằng cách thêm số 0 vào phía trước nếu cần
        String nextTTString = String.format("HD%05d", nextTTNumber);
        
        String sql = "INSERT INTO HOADON VALUES (?, ?, ?, ?, ?)";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        ps.setString(1, nextTTString);
        ps.setString(2, tgTao);
        ps.setInt(3, tien);
        ps.setInt(4, ctHD);
        ps.setString(5, maNV);
        update = ps.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
    }
    return update;
}

private String getLastTTNumberFromDatabase() {
    String lastTTNumber = "";
    try {
        // Viết truy vấn SQL để lấy ID lớn nhất từ cơ sở dữ liệu
        String sql = "SELECT MAX(ID) FROM HOADON";
        
        // Thực thi truy vấn
        PreparedStatement statement = conn.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        
        // Lấy kết quả
        if (resultSet.next()) {
            // Lấy ID lớn nhất
            String maxID = resultSet.getString(1);
            if (maxID != null && !maxID.isEmpty()) {
                // Trích xuất phần số từ chuỗi ID lớn nhất
                lastTTNumber = maxID.substring(2);
            } else {
                // Nếu không có dữ liệu trong cơ sở dữ liệu, bạn có thể cung cấp một giá trị mặc định
                lastTTNumber = "00000";
            }
        }
        
        // Đóng kết nối
        resultSet.close();
        statement.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return lastTTNumber;
}
    

//    public int xoaXekhoibai(String bienso) throws Exception {
//        String sql = "delete from NHAPXE where BIENSO = '" + bienso + "'";
//        conn = KetNoiDAO.getKetNoiDAO();
//        ps = conn.prepareStatement(sql);
//        int update = ps.executeUpdate();
//        return update;
//    }
}
