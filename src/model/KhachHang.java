/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author cuong
 */
public class KhachHang {
    private String makh;
    private String hoten;
    private String sdt;
    private String diachi;
    private Boolean trangthai;
    private Date ngaytao;

    public KhachHang() {
    }

    public KhachHang(String makh, String hoten, String sdt, String diachi, Boolean trangthai) {
        this.makh = makh;
        this.hoten = hoten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.trangthai = trangthai;
    }

    public KhachHang(String makh, String hoten, String sdt, String diachi, Boolean trangthai, Date ngaytao) {
        this.makh = makh;
        this.hoten = hoten;
        this.sdt = sdt;
        this.diachi = diachi;
        this.trangthai = trangthai;
        this.ngaytao = ngaytao;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Boolean getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(Boolean trangthai) {
        this.trangthai = trangthai;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }
    
    
    
    
}
