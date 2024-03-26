/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDon {
    private String mahd,manv,makh,makm,maTt,masp;
    private Date ngaytao,ngaythanhtoan;
    private float tongtien,thanhtien;
    private String trangThai;

    public HoaDon() {
    }

    public HoaDon(String mahd, String manv, String makh, String makm, String maTt, String masp, Date ngaytao, Date ngaythanhtoan, float tongtien, float thanhtien, String trangThai) {
        this.mahd = mahd;
        this.manv = manv;
        this.makh = makh;
        this.makm = makm;
        this.maTt = maTt;
        this.masp = masp;
        this.ngaytao = ngaytao;
        this.ngaythanhtoan = ngaythanhtoan;
        this.tongtien = tongtien;
        this.thanhtien = thanhtien;
        this.trangThai = trangThai;
    }

    public HoaDon(String mahd, String manv, String makh, String makm, String maTt, String masp, Date ngaythanhtoan, float tongtien, float thanhtien, String trangThai) {
        this.mahd = mahd;
        this.manv = manv;
        this.makh = makh;
        this.makm = makm;
        this.maTt = maTt;
        this.masp = masp;
        this.ngaythanhtoan = ngaythanhtoan;
        this.tongtien = tongtien;
        this.thanhtien = thanhtien;
        this.trangThai = trangThai;
    }

    public HoaDon(String ma, String maNV, Object object, Object object0, Object object1, Object object2, LocalDate ngayTao, float TOP_ALIGNMENT, float TOP_ALIGNMENT0, String trangThai) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getMakm() {
        return makm;
    }

    public void setMakm(String makm) {
        this.makm = makm;
    }

    public String getMaTt() {
        return maTt;
    }

    public void setMaTt(String maTt) {
        this.maTt = maTt;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Date getNgaythanhtoan() {
        return ngaythanhtoan;
    }

    public void setNgaythanhtoan(Date ngaythanhtoan) {
        this.ngaythanhtoan = ngaythanhtoan;
    }

    public float getTongtien() {
        return tongtien;
    }

    public void setTongtien(float tongtien) {
        this.tongtien = tongtien;
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

}