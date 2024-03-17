/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String maSP,maTH,maMAU,maSIZE,maCl,maKD,tenSP;
    private int sl;
    private float dongia;
    private Date ngaytao;
    private String XuatXu;
    private int tt;

    public SanPham() {
    }

    public SanPham(String maSP, String maTH, String maMAU, String maSIZE, String maCl, String maKD, String tenSP, int sl, float dongia, Date ngaytao, String XuatXu, int tt) {
        this.maSP = maSP;
        this.maTH = maTH;
        this.maMAU = maMAU;
        this.maSIZE = maSIZE;
        this.maCl = maCl;
        this.maKD = maKD;
        this.tenSP = tenSP;
        this.sl = sl;
        this.dongia = dongia;
        this.ngaytao = ngaytao;
        this.XuatXu = XuatXu;
        this.tt = tt;
    }

    public SanPham(String maSP, String maTH, String maMAU, String maSIZE, String maCl, String maKD, String tenSP, int sl, float dongia, String XuatXu, int tt) {
        this.maSP = maSP;
        this.maTH = maTH;
        this.maMAU = maMAU;
        this.maSIZE = maSIZE;
        this.maCl = maCl;
        this.maKD = maKD;
        this.tenSP = tenSP;
        this.sl = sl;
        this.dongia = dongia;
        this.XuatXu = XuatXu;
        this.tt = tt;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaTH() {
        return maTH;
    }

    public void setMaTH(String maTH) {
        this.maTH = maTH;
    }

    public String getMaMAU() {
        return maMAU;
    }

    public void setMaMAU(String maMAU) {
        this.maMAU = maMAU;
    }

    public String getMaSIZE() {
        return maSIZE;
    }

    public void setMaSIZE(String maSIZE) {
        this.maSIZE = maSIZE;
    }

    public String getMaCl() {
        return maCl;
    }

    public void setMaCl(String maCl) {
        this.maCl = maCl;
    }

    public String getMaKD() {
        return maKD;
    }

    public void setMaKD(String maKD) {
        this.maKD = maKD;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setXuatXu(String XuatXu) {
        this.XuatXu = XuatXu;
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }
    
    public String tt(int tt){
        if (tt==1) {
            return "Còn Hàng";
        } else {
           return "Hết Hàng"; 
        }
    }
}
