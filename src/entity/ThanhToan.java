/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author hiep nguyen
 */
public class ThanhToan {

    private String ma;
    private String ten;
    private String trangThai;
    private String ngay;
    private String ghiChu;

    public ThanhToan() {
    }

    public ThanhToan(String ma, String ten, String trangThai, String ngay, String ghiChu) {
        this.ma = ma;
        this.ten = ten;
        this.trangThai = trangThai;
        this.ngay = ngay;
        this.ghiChu = ghiChu;
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

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getNgay() {
        return ngay;
    }

    public void setNgay(String ngay) {
        this.ngay = ngay;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

}
