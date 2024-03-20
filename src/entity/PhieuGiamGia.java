
package entity;

import java.util.Date;

public class PhieuGiamGia {
    private String ma, ten,hinhThuc;
    private Date ngayBatDau,ngayKetThuc,ngayTao;
    private int soHoaDon;
    private float mucGiamGia;
    private Boolean tt;

    public PhieuGiamGia() {
    }

    public PhieuGiamGia(String ma, String ten, String hinhThuc, Date ngayBatDau, Date ngayKetThuc, Date ngayTao, int soHoaDon, float mucGiamGia, Boolean tt) {
        this.ma = ma;
        this.ten = ten;
        this.hinhThuc = hinhThuc;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.ngayTao = ngayTao;
        this.soHoaDon = soHoaDon;
        this.mucGiamGia = mucGiamGia;
        this.tt = tt;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public float getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(float mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public Boolean getTt() {
        return tt;
    }

    public void setTt(Boolean tt) {
        this.tt = tt;
    }

    
}
