/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Le Chuong
 */
public class INFO_TKNV {
    private String maNV;
    private String hoTen;
    private String gt;
    private String ngaySinh;
    private String DC;
    private String CCCD;
    private String SDT;
    private String chucVu;
    private String loaiNV;
    private String luong;
    
    public INFO_TKNV(){
        
    }

    public INFO_TKNV(String maNV, String hoTen, String gt, String ngaySinh, String DC, String CCCD, String SDT, String chucVu, String loaiNV, String luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.gt = gt;
        this.ngaySinh = ngaySinh;
        this.DC = DC;
        this.CCCD = CCCD;
        this.SDT = SDT;
        this.chucVu = chucVu;
        this.loaiNV = loaiNV;
        this.luong = luong;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getLoaiNV() {
        return loaiNV;
    }

    public String getLuong() {
        return luong;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setLoaiNV(String loaiNV) {
        this.loaiNV = loaiNV;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setDC(String DC) {
        this.DC = DC;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGt() {
        return gt;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public String getDC() {
        return DC;
    }

    public String getCCCD() {
        return CCCD;
    }

    public String getSDT() {
        return SDT;
    }
    

}
