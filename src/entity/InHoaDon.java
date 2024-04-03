/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author hiep nguyen
 */
public class InHoaDon {

    private String maHD;
    private String maNV;
    private String tenNV;
    private String maKH;
    private String tenKH;
    private String sdt;
    private String diaChi;
    private String maTT;
    private String ngayThanhToan;
    private int tongTien;
    private int thanhTien;
    private int mucGiam;
    private List<HDCT> danhSachSanPham;

    public InHoaDon() {
    }

    public InHoaDon(String maHD, String maNV, String tenNV, String maKH, String tenKH, String sdt, String diaChi, String maTT, String ngayThanhToan, int tongTien, int thanhTien, int mucGiam) {
        this.maHD = maHD;
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.maTT = maTT;
        this.ngayThanhToan = ngayThanhToan;
        this.tongTien = tongTien;
        this.thanhTien = thanhTien;
        this.mucGiam = mucGiam;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaTT() {
        return maTT;
    }

    public void setMaTT(String maTT) {
        this.maTT = maTT;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public int getMucGiam() {
        return mucGiam;
    }

    public void setMucGiam(int mucGiam) {
        this.mucGiam = mucGiam;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public List<HDCT> getDanhSachSanPham() {
        return danhSachSanPham;
    }

    public void setDanhSachSanPham(List<HDCT> danhSachSanPham) {
        this.danhSachSanPham = danhSachSanPham;
    }
}
