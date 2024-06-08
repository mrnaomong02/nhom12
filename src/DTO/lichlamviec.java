/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author Lê Quang Hưng
 */
public class lichlamviec {

    private int stt;
    private String maCa;
    private String tenCa;
    private LocalDate ngay;
    private String maNV;
    private String gioBatDau;
    private String gioKetThuc;
    private String tenNV;
    public lichlamviec() {
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public void setMaCa(String maCa) {
        this.maCa = maCa;
    }

    public void setTenCa(String tenCa) {
        this.tenCa = tenCa;
    }

    public void setNgay(LocalDate ngay) {
        this.ngay = ngay;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public void setGioBatDau(String gioBatDau) {
        this.gioBatDau = gioBatDau;
    }

    public void setGioKetThuc(String gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }

    public int getStt() {
        return stt;
    }

    public String getMaCa() {
        return maCa;
    }

    public String getTenCa() {
        return tenCa;
    }

    public LocalDate getNgay() {
        return ngay;
    }

    public String getMaNV() {
        return maNV;
    }

    public String getGioBatDau() {
        return gioBatDau;
    }

    public String getGioKetThuc() {
        return gioKetThuc;
    }

    public lichlamviec(int stt, String maCa, String tenCa, LocalDate ngay, String maNV, String gioBatDau, String gioKetThuc) {
        this.stt = stt;
        this.maCa = maCa;
        this.tenCa = tenCa;
        this.ngay = ngay;
        this.maNV = maNV;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    

}
