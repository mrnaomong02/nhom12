/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import DTO.AccountDTO;
import DTO.INFO_TKCD;
import DTO.INFO_TKNV;
import DTO.NhapXeDTO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lê Quang Hưng
 */
public class DangNhapDAO extends KetNoiDAO {

    Connection conn = null;
    PreparedStatement ps = null;
    List<AccountDTO> list = new ArrayList<>();

    public AccountDTO CheckUser(String user) {
        AccountDTO tk = null;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Find_User(?)}");
            Connection con1 = KetNoiDAO.getKetNoiDAO();
            String sql= "select * from TAIKHOAN_NV where USERNAME=?";
            PreparedStatement ps = con1.prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new AccountDTO();
                tk.setId(rs.getString(1));
                tk.setTaiKhoan(rs.getString(2));
                tk.setMatKhau(rs.getString(3));
                tk.setTrangThai(rs.getString(4));
                tk.setSdt(rs.getString(5));
            
            }
            else{
                sql= "select * from TAIKHOAN_CD where USERNAME=?";
                ps = con1.prepareStatement(sql);
                ps.setString(1, user);
                rs = ps.executeQuery();
                if (rs.next()) {
                    tk = new AccountDTO();
                    tk.setId(rs.getString(1));
                    tk.setTaiKhoan(rs.getString(2));
                    tk.setMatKhau(rs.getString(3));
                    tk.setTrangThai(rs.getString(4));
                    tk.setSdt(rs.getString(5));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            tk = null;
        }
        return tk;
    }

    public AccountDTO CheckPass(String pass, String user) {
        AccountDTO tk = null;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Check_Pass(?,?)}");
            Connection con2 = KetNoiDAO.getKetNoiDAO();
            String sql= "select * from TAIKHOAN_NV where PASSWORD=HASHBYTES('SHA2_256','"+pass+"') and USERNAME=? and TRANGTHAI='Dang su dung'";
            PreparedStatement ps = con2.prepareStatement(sql);
            ps.setString(1, user);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new AccountDTO();
                tk.setMatKhau(rs.getString(3));
            }
            else{
                sql= "select * from TAIKHOAN_CD where PASSWORD=HASHBYTES('SHA2_256','"+pass+"') and USERNAME=? and TRANGTHAI='Dang su dung'";
                ps = con2.prepareStatement(sql);
                ps.setString(1, user);
                rs = ps.executeQuery();
                if (rs.next()) {
                    tk = new AccountDTO();
                    tk.setMatKhau(rs.getString(3));
                }
            }
                 
        } catch (Exception e) {
            e.printStackTrace();
            tk = null;
        }
        return tk;
    }

    public int checkNhanVien(String maNV){
        int x=0;
        try {   
            Connection con2 = KetNoiDAO.getKetNoiDAO();
            String sql= "select * from NHAN_VIEN where MANV=?";
            PreparedStatement ps = con2.prepareStatement(sql);
            ps.setString(1, maNV);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                x=rs.getInt(8);
            }     
        } catch (Exception e) {
            e.printStackTrace();
            
        } 
        return x;
    }
    
    public AccountDTO CheckPhone(String phone) {
        AccountDTO tk = null;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Check_Phone(?,?)}");
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TAIKHOAN_NV where SDT=? and TRANGTHAI='Dang su dung'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new AccountDTO();
                tk.setTaiKhoan(rs.getString(2));
                tk.setMatKhau("123");
                setMK("TAIKHOAN_NV", phone);
            }
            else{
                sql = "select * from TAIKHOAN_CD where SDT=? and TRANGTHAI='Dang su dung'";
                PreparedStatement ps2 = conn.prepareStatement(sql);
                ps2.setString(1, phone);
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    tk = new AccountDTO();
                    tk.setTaiKhoan(rs2.getString(2));
                    tk.setMatKhau("123");
                    setMK("TAIKHOAN_CD", phone);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;

    }
    
    public boolean CheckPhone1(String phone) {
        boolean tk = true;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Check_Phone(?,?)}");
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAN_VIEN where SDT=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               tk=false;
            }
            else{
                sql = "select * from CUDAN where SDT=?";
                PreparedStatement ps2 = conn.prepareStatement(sql);
                ps2.setString(1, phone);
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    tk = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;

    }
    
    public boolean CheckPhone2(String phone, String ma) {
        boolean tk = true;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Check_Phone(?,?)}");
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAN_VIEN where SDT=? and MANV<>?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, phone);
            ps.setString(2, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
               tk=false;
            }
            else{
                sql = "select * from CUDAN where SDT=? and MACD<>?";
                PreparedStatement ps2 = conn.prepareStatement(sql);
                ps2.setString(1, phone);
                ps2.setString(2, ma);
                ResultSet rs2 = ps2.executeQuery();
                if (rs2.next()) {
                    tk = false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tk;

    }
    
    public static ArrayList<String> LoadMANV() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TAIKHOAN_NV where USERNAME IS NULL";
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
    
    public static ArrayList<String> LoadMANV2() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TAIKHOAN_NV where TRANGTHAI='Dang su dung'";
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
    
    public static ArrayList<String> LoadMANV3() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TAIKHOAN_NV where TRANGTHAI='Khong su dung'";
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
    
    public int tatTK(String ma) {
        int x=0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "update TAIKHOAN_NV set TRANGTHAI='Khong su dung' where MANV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            x = ps.executeUpdate();
            String  sql1="update NHAN_VIEN set TRANGTHAI='False' where MANV=?";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, ma);
            ps1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
    
    public int batTK(String ma) {
        int x=0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "update TAIKHOAN_NV set TRANGTHAI='Dang su dung' where MANV='"+ma+"'";
            PreparedStatement ps = conn.prepareStatement(sql);
            x = ps.executeUpdate();
            String sql1="update NHAN_VIEN set TRANGTHAI='True' where MANV='"+ma+"'";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public int ThemTk(String ma,String user, String pass,String sdt) throws Exception {
        try {
            String sql = "update TAIKHOAN_NV set USERNAME='"+user+"', PASSWORD=CONVERT(varbinary,'" +pass+ "'),TRANGTHAI='Dang su dung', SDT='"+sdt+"' where MANV=?";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            int update = ps.executeUpdate();
            sql="update NHAN_VIEN set TRANGTHAI='True' where MANV=?";
            ps.setString(1, ma);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
    
    public void setMK(String x,String sdt)throws Exception {
        String sql = "UPDATE "+x+" SET PASSWORD=CONVERT(varbinary,'123') WHERE SDT='"+sdt+"'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
    }

    public int DoiMK_NV(String taikhoan, String newpass, String oldpass) throws Exception {
        String sql = "UPDATE TAIKHOAN_NV SET PASSWORD=CONVERT(varbinary,'" + newpass + "') WHERE USERNAME='" + taikhoan + "' AND PASSWORD=HASHBYTES('SHA2_256','" + oldpass + "')";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }
    public int DoiMK_CD(String taikhoan, String newpass, String oldpass) throws Exception {
        String sql = "UPDATE TAIKHOAN_CD SET PASSWORD=CONVERT(varbinary,'" + newpass + "') WHERE USERNAME='" + taikhoan + "' AND PASSWORD=HASHBYTES('SHA2_256','" + oldpass + "')";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }

    public int updateAcc(String taikhoan, String tennv, String sdt, String matkhau) throws Exception {
        String sql = "update ACCOUNT set TENNV=N'" + tennv + "',PHONE='" + sdt + "',PASS='" + matkhau + "' where USERNAME='" + taikhoan + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;

    }

    public int deleteAcc(String taikhoan) throws Exception {
        String sql = "delete from ACCOUNT where USERNAME = '" + taikhoan + "'";
        conn = KetNoiDAO.getKetNoiDAO();
        ps = conn.prepareStatement(sql);
        int update = ps.executeUpdate();
        return update;
    }
    
    public INFO_TKNV TraNV(String ma) {
        INFO_TKNV tk = null;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Find_User(?)}");
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql="select * from NHAN_VIEN where MANV=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new INFO_TKNV();
                tk.setMaNV(rs.getString(1));
                tk.setHoTen(rs.getString(2));
                tk.setGt(rs.getString(3));
                tk.setNgaySinh(rs.getString(4));
                tk.setDC(rs.getString(5));
                tk.setCCCD(rs.getString(6));
                tk.setSDT(rs.getString(7)); 
            }
        } catch (Exception e) {
            e.printStackTrace();
            tk = null;
        }
        return tk;
    }
    
     public INFO_TKCD TraCD(String ma) {
        INFO_TKCD tk = null;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Find_User(?)}");
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql="select * from CUDAN where MACD=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tk = new INFO_TKCD();
                tk.setMaCD(rs.getString(1));
                tk.setHoTen(rs.getString(2));
                tk.setSDT(rs.getString(3));
                tk.setCCCD(rs.getString(4));
                tk.setDC(rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace();
            tk = null;
        }
        return tk;
    }


    public static ArrayList<INFO_TKNV> tableInfo() {
        ArrayList<INFO_TKNV> INFO_NV = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAN_VIEN where TRANGTHAI='True'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            INFO_TKNV nx=null;
            INFO_NV.removeAll(INFO_NV);
            while (rs.next()) {
                nx = new INFO_TKNV();
                nx.setMaNV(rs.getString(1));
                nx.setHoTen(rs.getString(2));
                nx.setGt(rs.getString(3));
                nx.setNgaySinh(rs.getString(4));
                nx.setDC(rs.getString(5));
                nx.setCCCD(rs.getString(6));
                nx.setSDT(rs.getString(7));
                int x=rs.getInt(8);
                String sql1 = "select * from CT_CHUCVU where ID_CT_CHUCVU=?";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ps1.setInt(1, x);
                ResultSet rs1 = ps1.executeQuery();
                if (rs1.next()){
                    nx.setChucVu(rs1.getString(2));
                }
                INFO_NV.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return INFO_NV;
    }
    
    public static INFO_TKNV tableInfo2(String ma) {
        INFO_TKNV nx=null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from NHAN_VIEN where MANV=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new INFO_TKNV();
                nx.setMaNV(rs.getString(1));
                nx.setHoTen(rs.getString(2));
                nx.setGt(rs.getString(3));
                nx.setNgaySinh(rs.getString(4));
                nx.setDC(rs.getString(5));
                nx.setCCCD(rs.getString(6));
                nx.setSDT(rs.getString(7));
                int x=rs.getInt(8);
                String sql1 = "select * from CT_CHUCVU where ID_CT_CHUCVU=?";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ps1.setInt(1, x);
                ResultSet rs1 = ps1.executeQuery();
                if (rs1.next()){
                    nx.setChucVu(rs1.getString(2));
                    nx.setLoaiNV(rs1.getString(3));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public int ThemNV(String hoten, String gt,String ns, String diachi, String sdt, String cccd, int id) {
        int rowsAffected=0;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Find_User(?)}");
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql="insert into NHAN_VIEN values('NV00001',?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, hoten);
            ps.setString(2, gt);
            ps.setString(3, ns);
            ps.setString(4, diachi);
            ps.setString(5, cccd);
            ps.setString(6, sdt);
            ps.setInt(7, id);
            ps.setString(8,"False");
            rowsAffected = ps.executeUpdate();
            sql="select * from NHAN_VIEN where SDT=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, sdt);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                sql="insert into TAIKHOAN_NV(MANV) values(?)";
                ps=conn.prepareStatement(sql);
                ps.setString(1, rs.getString("MANV"));
                ps.executeUpdate();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return rowsAffected;
    }
    
    public int capNhatNV(String ma,String hoten, String gt,String ns, String diachi, String sdt, String cccd, int id) {
        int rowsAffected=0;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Find_User(?)}");
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql="update NHAN_VIEN set HOTEN=?,GIOITINH=?,NGAYSINH=?,DIACHI=?,CCCD=?,SDT=?,ID_CT_CHUCVU=? where MANV=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, hoten);
            ps.setString(2, gt);
            ps.setString(3, ns);
            ps.setString(4, diachi);
            ps.setString(5, cccd);
            ps.setString(6, sdt);
            ps.setInt(7, id);
            ps.setString(8, ma);
            rowsAffected = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return rowsAffected;
    }
    
  // Cư dân
    
    public static ArrayList<INFO_TKCD> tableInfoCD() {
        ArrayList<INFO_TKCD> INFO_CD = new ArrayList<>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from CUDAN where TRANGTHAI='Dang o chung cu'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            INFO_TKCD nx=null;
            INFO_CD.removeAll(INFO_CD);
            while (rs.next()) {
                nx = new INFO_TKCD();
                nx.setMaCD(rs.getString(1));
                nx.setHoTen(rs.getString(2));
                nx.setSDT(rs.getString(3));
                nx.setCCCD(rs.getString(4));
                nx.setDC(rs.getString(5));
                nx.setTrangThai(rs.getString(6));
                INFO_CD.add(nx);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return INFO_CD;
    }
    
    public static INFO_TKCD tableInfoCD2(String ma) {
        INFO_TKCD nx=null;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from CUDAN where MACD=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                nx = new INFO_TKCD();
                nx.setMaCD(rs.getString(1));
                nx.setHoTen(rs.getString(2));
                nx.setSDT(rs.getString(3));
                nx.setCCCD(rs.getString(4));
                nx.setDC(rs.getString(5));
                nx.setTrangThai(rs.getString(6));
              
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return nx;
    }
    
    public int ThemCD(String hoten, String diachi, String sdt, String cccd) {
        int rowsAffected=0;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Find_User(?)}");
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql="insert into NHAN_VIEN values('CD00001',?,?,?,?,'Dang o chung cu')";
            ps = conn.prepareStatement(sql);
            ps.setString(1, hoten);
            ps.setString(2, sdt);
            ps.setString(3, cccd);
            ps.setString(4, diachi);
            rowsAffected = ps.executeUpdate();
            sql="select * from CUDAN where SDT=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1, sdt);
            ResultSet rs=ps.executeQuery();
            if (rs.next()){
                sql="insert into TAIKHOAN_CD(MACD) values(?)";
                ps=conn.prepareStatement(sql);
                ps.setString(1, rs.getString("MACD"));
                ps.executeUpdate();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return rowsAffected;
    }
    
    public int capNhatCD(String ma,String hoten,  String diachi, String sdt, String cccd) {
        int rowsAffected=0;
        try {
            //CallableStatement cs = KetNoiDAO.getKetNoiDAO().prepareCall("{call Login_Find_User(?)}");
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql="update CUDAN set HOTEN=?,DIACHI=?,CCCD=?,SDT=? where MACD=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, hoten);
            ps.setString(2, diachi);
            ps.setString(3, cccd);
            ps.setString(4, sdt);
            ps.setString(5, ma);
            rowsAffected = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return rowsAffected;
    }
    
    
    public static ArrayList<String> LoadMACD() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TAIKHOAN_CD where USERNAME IS NULL";
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
    
    public static ArrayList<String> LoadMACD2() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TAIKHOAN_CD where TRANGTHAI='Dang su dung'";
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
    
    public static ArrayList<String> LoadMACD3() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "select * from TAIKHOAN_CD where TRANGTHAI='Khong su dung'";
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
    
    public int tatTKCD(String ma) {
        int x=0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "update TAIKHOAN_CD set TRANGTHAI='Khong su dung' where MACD=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            x = ps.executeUpdate();
            String sql1="update CUDAN set TRANGTHAI='Het o chung cu' where MACD=?";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, ma);
            ps1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }
    
    public int batTKCD(String ma) {
        int x=0;
        try {
            Connection conn = KetNoiDAO.getKetNoiDAO();
            String sql = "update TAIKHOAN_CD set TRANGTHAI='Dang su dung' where MACD=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            x = ps.executeUpdate();
            String sql1="update CUDAN set TRANGTHAI='Dang o chung cu' where MACD=?";
            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, ma);
            ps1.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x;
    }

    public int ThemTkCD(String ma,String user, String pass,String sdt) throws Exception {
        try {
            String sql = "update TAIKHOAN_CD set USERNAME='"+user+"', PASSWORD=CONVERT(varbinary,'" +pass+ "'),TRANGTHAI='Dang su dung', SDT='"+sdt+"' where MACD=?";
            conn = KetNoiDAO.getKetNoiDAO();
            ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            int update = ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 1;
    }
}