/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;

/**
 *
 * @author Lê Quang Hưng
 */
public class KetNoiDAO {
    public static Connection getKetNoiDAO() {
        Connection ketNoi = null;
        String uRL = "jdbc:sqlserver://localhost:1433;databaseName=Do_An;encrypt=true;trustServerCertificate=true;";
        String userName = "sa";
        String password = "Mr.butthead02112003";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //com.microsoft.sqlserver.jdbc.SQLServerDriver
            ketNoi = DriverManager.getConnection(uRL, userName, password);
            System.out.println("Ket noi CSDL thanh cong");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Khong ket noi duoc voi CSDL");
        }
        return ketNoi;
    }
    
    public static void main(String[] args) throws SQLException {
       getKetNoiDAO();
    }

}
