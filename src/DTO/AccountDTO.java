/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Lê Quang Hưng
 */
public class AccountDTO {
    private String Id;
    private String taiKhoan;
    private String trangThai;
    private String sdt;
    private String matKhau;

    public AccountDTO() {
        
    }

    public AccountDTO(String Id, String taiKhoan,String matKhau, String trangThai, String sdt ) {
        this.Id = Id;
        this.taiKhoan = taiKhoan;
        this.trangThai= trangThai;
        this.sdt = sdt;
        this.matKhau = matKhau;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    
    
    
}
