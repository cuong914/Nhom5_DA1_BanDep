/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.sun.jdi.connect.spi.Connection;
import entity.HDCT;
import entity.HoaDon;
import java.util.ArrayList;
import repository.HoaDonKetNoi;
import utility.DBConnect;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class QuanLyHoaDon {

    HoaDonKetNoi kn = new HoaDonKetNoi();

    public ArrayList<HoaDon> getlist() {
        return kn.getAll();
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

    public ArrayList<HoaDon> them(HoaDon hd) {
        return kn.themHD(hd);
    }

    public ArrayList<HoaDon> timhd(String ma) {
        ArrayList<HoaDon> kq = kn.tim(ma);
        return kq;
    }

}
