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
public class DKVeThangDTO {

    private String maVethang;
    private String maCD;
    private String bienSo;
    private String loaiXe;
    private LocalDate ngayDk;
    private LocalDate ngayHetHan;
    private int idPhi;
    private String status;

    public DKVeThangDTO() {
    }

    public DKVeThangDTO(String maVethang, String maCD, String bienSo, String loaiXe, LocalDate ngayDk, LocalDate ngayHetHan, int idPhi, String status) {
        this.maVethang = maVethang;
        this.maCD = maCD;
        this.bienSo = bienSo;
        this.loaiXe = loaiXe;
        this.ngayDk = ngayDk;
        this.ngayHetHan = ngayHetHan;
        this.idPhi = idPhi;
        this.status = status;
    }

    

    public String getMaVethang() {
        return maVethang;
    }

    public void setMaVethang(String maVethang) {
        this.maVethang = maVethang;
    }

    public String maCD() {
        return maCD;
    }

    public void setmaCD(String maCD) {
        this.maCD = maCD;
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

    public LocalDate getNgayDk() {
        return ngayDk;
    }

    public void setNgayDk(LocalDate ngayDk) {
        this.ngayDk = ngayDk;
    }

    public int getSoTien() {
        return idPhi;
    }

    public void setSoTien(int idPhi) {
        this.idPhi = idPhi;
    }

    public String getMaCD() {
        return maCD;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public String getStatus() {
        return status;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

}
