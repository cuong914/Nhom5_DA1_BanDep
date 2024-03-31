/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.SanPham;
import java.util.ArrayList;
import repository.SanPhamKetNoi;

/**
 *
 * @author Admin
 */
public class QuanlySanPham {

    SanPhamKetNoi kn = new SanPhamKetNoi();

    public ArrayList<SanPham> getlist() {
        return kn.getAll();
    }

    public String add(SanPham sp) {
        if (kn.add(sp) == true) {
            return "Them Thanh Cong";
        } else {
            return "Them That Bai";
        }
    }

    public String xoa(String ma) {
        Boolean check = kn.dele(ma);
        if (check) {
            return "Xoa ThanH cong";
        } else {
            return "Xoa That Bai";
        }
    }

    public ArrayList<SanPham> tim(String ma) {
        ArrayList<SanPham> kq = kn.tim(ma);
        return kq;
    }

    public String up(SanPham sp) {
        if (kn.update(sp) == true) {
            return "Sua Thanh Cong";
        } else {
            return "Sua That Bai";
        }
    }

    public ArrayList<SanPham> truSP(int i, String ma) {
        ArrayList<SanPham> listTru = kn.truSP(i, ma);
        return listTru;
    }

    public ArrayList<SanPham> nhanDoiTrongMa(int i, String ma) {
        ArrayList<SanPham> listNhanDoi = kn.nhanDoiTrongMa(i, ma);
        return listNhanDoi;
    }

    public ArrayList<SanPham> congSP(int i, String ma) {
        ArrayList<SanPham> listCong = kn.CongSP(i, ma);
        return listCong;
    }
    public ArrayList<SanPham> truSPtrongMa(int i, String ma) {
        ArrayList<SanPham> listTruSP = kn.truSPTrongMa(i, ma);
        return listTruSP;
    }
    public void khiHetHang(int i , String ma,int soLuong){
        kn.khiSoLuongHet(i, ma,soLuong);
    }
}
