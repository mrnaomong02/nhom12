/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import DTO.XeDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author MINH QUAN
 */
public class XeDAO extends KetNoiDAO{
    public ArrayList<XeDTO> getBSX(String maCD) {
        ArrayList<XeDTO> listXe = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = KetNoiDAO.getKetNoiDAO(); // Lấy kết nối tới cơ sở dữ liệu
            String sql = "SELECT BSX FROM XE";
            ps = conn.prepareStatement(sql);
            
            rs = ps.executeQuery();
            while (rs.next()) {
                String bsx = rs.getString("BSX");
                
                // Tạo đối tượng XeDTO và thêm vào danh sách
                XeDTO xe = new XeDTO();
                xe.setBsx(bsx);
                listXe.add(xe);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Đóng các đối tượng ResultSet, PreparedStatement và Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return listXe;
    }
    public ArrayList<String> loadBSX(String maCD) {
        ArrayList<String> listXe = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = KetNoiDAO.getKetNoiDAO(); // Lấy kết nối tới cơ sở dữ liệu
            String sql = "SELECT * FROM XE WHERE MACD=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, maCD);
            rs = ps.executeQuery();
            while (rs.next()) {
                String bsx = rs.getString("BSX");
                
                // Tạo đối tượng XeDTO và thêm vào danh sách
                listXe.add(bsx);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        finally {
            // Đóng các đối tượng ResultSet, PreparedStatement và Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listXe;
    }
    
    public boolean themXe(XeDTO xe) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        boolean success = false;
        
        try {
            // Kết nối tới cơ sở dữ liệu
            conn = KetNoiDAO.getKetNoiDAO();            
            // Chuẩn bị câu lệnh SQL để thêm dữ liệu
            String sql = "INSERT INTO XE (BSX, LOAIXE, MACD) VALUES (?, ?, ?)";
            preparedStatement = conn.prepareStatement(sql);
            
            // Thiết lập các tham số cho câu lệnh SQL từ XeDTO
            preparedStatement.setString(1, xe.getBsx());
            preparedStatement.setString(2, xe.getLoaiXe());
            preparedStatement.setString(3, xe.getMaCD());
            
            // Thực thi câu lệnh SQL
            int rowsAffected = preparedStatement.executeUpdate();
            
            // Kiểm tra xem dữ liệu có được thêm thành công hay không
            if (rowsAffected > 0) {
                success = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
      
        return success;
    }
    
    public boolean xoaXe(String bsx, String maCD) {
        Connection conn = null;
        PreparedStatement preparedStatement = null;
        boolean success = false;
        
        try {
            // Kết nối tới cơ sở dữ liệu
            conn = KetNoiDAO.getKetNoiDAO();            
            // Chuẩn bị câu lệnh SQL để thêm dữ liệu
            String sql = "DELETE FROM XE WHERE BSX=? and MACD=?";
            preparedStatement = conn.prepareStatement(sql);
            
            // Thiết lập các tham số cho câu lệnh SQL từ XeDTO
            preparedStatement.setString(1, bsx);
            preparedStatement.setString(2, maCD);
            
            // Thực thi câu lệnh SQL
            int rowsAffected = preparedStatement.executeUpdate();
            
            // Kiểm tra xem dữ liệu có được thêm thành công hay không
            if (rowsAffected > 0) {
                success = true;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return success;
    }
    
    public boolean checkBSX(String bsx) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean exists = false;

        try {
            // Kết nối tới cơ sở dữ liệu
            conn = KetNoiDAO.getKetNoiDAO();

            // Chuẩn bị câu lệnh SQL để kiểm tra biển số xe
            String sql = "SELECT * FROM Xe WHERE BSX = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, bsx);

            // Thực hiện câu lệnh SQL
            rs = ps.executeQuery();

            // Nếu có kết quả, biển số xe đã tồn tại
            if (rs.next()) {
                exists = true;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
    }
        finally {
            // Đóng các đối tượng ResultSet, PreparedStatement và Connection
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    return exists;
}
}
