/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.sun.jdi.connect.spi.Connection;
import entity.HDCT;
import entity.HoaDon;
import entity.InHoaDon;
import java.util.ArrayList;
import repository.HoaDonKetNoi;
import utility.DBConnect;
import java.sql.*;
import entity.ThanhToan;

/**
 *
 * @author Admin
 */
public class QuanLyHoaDon {

    HoaDonKetNoi kn = new HoaDonKetNoi();

    public ArrayList<HoaDon> getlist() {
        return kn.getAll();
    }

    public int getTongSoHD() {
        return kn.getTongSoHD();
    }

    public ArrayList<HDCT> tim(String ma) {
        ArrayList<HDCT> kq = kn.HDCT(ma);
        return kq;
    }

    public ArrayList<HoaDon> timda() {
        return kn.timda();
    }

    public ArrayList<HoaDon> timhuy() {
        return kn.timdahuy();
    }

    public ArrayList<HoaDon> timchua() {
        return kn.timchua();
    }

    public String xoa(String ma) {
        Boolean check = kn.dele(ma);
        if (check) {
            return "Xoa ThanH cong";
        } else {
            return "Xoa That Bai";
        }
    }

    public void them(HoaDon hd, ThanhToan tt) {
        kn.themHD(hd, tt);
    }

    public void thanhToan(String ma) {
        kn.thanhToan(ma);
    }

    public void HuyHD(String ma) {
        kn.huyHoaDon(ma);
    }

    public void upateTongTien(String maHD, int tongTien) {
        kn.updateTongTien(maHD, tongTien);
    }
//     public void thanhTien(String maHD, int thanhTien) {
//        kn.thanhTien(maHD, thanhTien);
//    }

    public void updateMaKM(String maHD, int thanhTien, String maKH, String maKM) {
        kn.updateMaKM(maHD, thanhTien, maKH, maKM);
    }

    public ArrayList<HoaDon> timhd(String ma) {
        ArrayList<HoaDon> kq = kn.tim(ma);
        return kq;
    }

    public InHoaDon getHoaDonInfo(String ma) {
        return kn.getHoaDonInfo(ma);
    }

}
