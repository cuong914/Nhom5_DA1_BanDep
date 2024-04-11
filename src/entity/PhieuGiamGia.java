package entity;

import java.util.Date;

public class PhieuGiamGia {

    private String ma, ten, hinhThuc, ngayBatDau, ngayKetThuc;
    private Date ngayTao;
    private int soHoaDon;
    private int mucGiamGia;
    private Boolean tt;

    public PhieuGiamGia() {
    }

    public PhieuGiamGia(String ma, String ten, String hinhThuc, String ngayBatDau, String ngayKetThuc, Date ngayTao, int soHoaDon, int mucGiamGia, Boolean tt) {
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

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
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

    public int getMucGiamGia() {
        return mucGiamGia;
    }

    public void setMucGiamGia(int mucGiamGia) {
        this.mucGiamGia = mucGiamGia;
    }

    public Boolean getTt() {
        return tt;
    }

    public void setTt(Boolean tt) {
        this.tt = tt;
    }

}
