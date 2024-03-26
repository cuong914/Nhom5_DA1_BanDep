/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import model.KhachHang;
import responsetory.Repo_KhachHang;


/**
 *
 * @author cuong
 */
public class KhachHangService {

    Repo_KhachHang khrepo = new Repo_KhachHang();

    public List<KhachHang> getAllKhachHang() {
        return khrepo.getAllKhachHang();
    }
     public String InsertKhachHang(KhachHang kh) {
        int x = khrepo.InsertKhachHang(kh);
        if (x >= 0) {
            return "Thêm mới dữ liệu thành công ";
        } else {
            return "Thêm mới dữ liệu thất bại";
        }
    }
      public String UpdateKhachHang(KhachHang kh) {
        int x = khrepo.UpdateKhachHang(kh);
        if (x >= 0) {
            return "Cập nhật  dữ liệu thành công ";
        } else {
            return "Cập nhật  thất bại";
        }
    }
          public List<KhachHang> getAllNhanVienTKTheoManv(String makh) {
        return khrepo.getAllKhachHangTKTheoMakh(makh);
    }

    public List<KhachHang> getAllNhanVienTKTheoHoTen(String hoten) {
        return khrepo.getAllKhachHangTKTheoHoTen(hoten);
    }

    public List<KhachHang> getAllNhanVienTKTheoSDT(String sdt) {
        return khrepo.getAllKhachHangTKTheoSDT(sdt);
    }

}
