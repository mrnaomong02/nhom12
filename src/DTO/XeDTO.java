/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author MINH QUAN
 */
public class XeDTO {
    private String bsx;
    private String loaiXe;
    private String maCD;

    public XeDTO(){}
    // Constructor
    public XeDTO(String bsx, String loaiXe, String maCD) {
        this.bsx = bsx;
        this.loaiXe = loaiXe;
        this.maCD = maCD;
    }

    // Getters and setters
    public String getBsx() {
        return bsx;
    }

    public void setBsx(String bsx) {
        this.bsx = bsx;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }
}
