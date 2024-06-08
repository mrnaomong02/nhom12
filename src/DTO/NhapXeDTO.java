/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Lê Quang Hưng
 */
public class NhapXeDTO {

    private String bienSo;
    private String loaiXe;
    private String loaiVe;
    private String maVe;
    private LocalDate ngayGui;
    private String gioGui;
    private LocalDate ngayNhan;
    private String gioNhan;
    private String MaNV;
    private String viTri;
    private int ID_phi;
    private String maNV1;
    private String maNV2;
    private String maCD;
    private String Status;

    public NhapXeDTO() {
    }

    public NhapXeDTO(String bienSo, String loaiXe, String maVe, LocalDate ngayGui, String gioGui,String maNV,String vt,int ID_phi) {
        this.bienSo = bienSo;
        this.loaiXe = loaiXe;
        this.maVe = maVe;
        this.ngayGui = ngayGui;
        this.gioGui = gioGui;
        this.MaNV = maNV;
        this.viTri=vt;
        this.ID_phi=ID_phi;
        
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getLoaiVe() {
        return loaiVe;
    }

    public void setLoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    public String getMaVe() {
        return maVe;
    }

    public void setMaVe(String maVe) {
        this.maVe = maVe;
    }

    public String getNgayGui() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate ="";
        if (ngayGui!=null)
            formattedDate = ngayGui.format(formatter);
        return formattedDate;
    }

    public void setNgayGui(LocalDate ngayGui) {
        this.ngayGui = ngayGui;
    }

    public String getGioGui() {
        return gioGui;
    }

    public void setGioGui(String gioGui) {
        this.gioGui = gioGui;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getViTri() {
        return viTri;
    }
    
    public String getNgayNhan() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate ="";
        if (ngayNhan!=null)
            formattedDate = ngayNhan.format(formatter);
        return formattedDate;
    }

    public void setNgayNhan(LocalDate ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public String getGioNhan() {
        return gioNhan;
    }

    public void setGioNhan(String gioNhan) {
        this.gioNhan = gioNhan;
    }

    public int getID_phi() {
        return ID_phi;
    }

    public void setID_phi(int ID_phi) {
        this.ID_phi = ID_phi;
    }

    public String getMaNV1() {
        return maNV1;
    }

    public String getMaNV2() {
        return maNV2;
    }

    public void setMaNV1(String maNV1) {
        this.maNV1 = maNV1;
    }

    public void setMaNV2(String maNV2) {
        this.maNV2 = maNV2;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getMaCD() {
        return maCD;
    }
    
    
}
