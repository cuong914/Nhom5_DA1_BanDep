/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class HDCT {

    private String mahd, masp, tensp;
    private int soLuong;
    private float dongia;

    public HDCT() {
    }

    public HDCT(String mahd, String masp, String tensp, int soLuong, float dongia) {
        this.mahd = mahd;
        this.masp = masp;
        this.tensp = tensp;
        this.soLuong = soLuong;
        this.dongia = dongia;
    }

    public String getMahd() {
        return mahd;
    }

    public void setMahd(String mahd) {
        this.mahd = mahd;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public float thanhTien() {
        return this.soLuong * this.dongia;
    }
}
