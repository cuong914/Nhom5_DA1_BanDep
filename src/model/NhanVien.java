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
public class NhanVien {

    private String manv;
    private String hoten;
    private String sdt;
    private Boolean gioitinh;
    private Date ngaysinh;
    private Date ngayvaolam;
    private Date ngaynghi;
    private Boolean trangthai;
    private String vaitro;
    private String matk;

    public NhanVien() {
    }

    public NhanVien(String manv, String hoten, String sdt, Boolean gioitinh, Date ngaysinh, Date ngayvaolam, Date ngaynghi, Boolean trangthai, String vaitro, String matk) {
        this.manv = manv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.ngayvaolam = ngayvaolam;
        this.ngaynghi = ngaynghi;
        this.trangthai = trangthai;
        this.vaitro = vaitro;
        this.matk = matk;
    }

    public NhanVien(String manv, String hoten, String sdt, Boolean gioitinh, Date ngaysinh, Boolean trangthai, String vaitro, String matk) {
        this.manv = manv;
        this.hoten = hoten;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.trangthai = trangthai;
        this.vaitro = vaitro;
        this.matk = matk;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
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

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Date getNgayvaolam() {
        return ngayvaolam;
    }

    public void setNgayvaolam(Date ngayvaolam) {
        this.ngayvaolam = ngayvaolam;
    }

    public Date getNgaynghi() {
        return ngaynghi;
    }

    public void setNgaynghi(Date ngaynghi) {
        this.ngaynghi = ngaynghi;
    }

    public Boolean getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(Boolean trangthai) {
        this.trangthai = trangthai;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public String getMatk() {
        return matk;
    }

    public void setMatk(String matk) {
        this.matk = matk;
    }
    

}
