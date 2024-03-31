/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import model.NhanVien;
import responsetory.Repo_NhanVien;

/**
 *
 * @author cuong
 */
public class NhanVienService {

    Repo_NhanVien nvrepo = new Repo_NhanVien();

    public List<NhanVien> getAllNhanVien() {
        return nvrepo.getAllNhanVien();
    }

    public String InsertNhanVien(NhanVien nv) {
        int x = nvrepo.InsertNhanVien(nv);
        if (x >= 0) {
            return "Thêm mới dữ liệu thành công ";
        } else {
            return "Thêm mới dữ liệu thất bại";
        }
    }

    public String UpdateNhanVien(NhanVien nv) {
        int x = nvrepo.UpdateNhanVien(nv);
        if (x >= 0) {
            return "Cập nhật  dữ liệu thành công ";
        } else {
            return "Cập nhật  thất bại";
        }
    }

    public String UpdateNhanVienNghiViec(String Manv) {
        int x = nvrepo.UpdateNVNghiViec(Manv);
        if (x >= 0) {
            return "Cập nhật nhân viên nghỉ việc thành công ";
        } else {
            return "Cập nhật nhân viên nghỉ việc thất bại";
        }
    }
//     public String  XoaNhanVien( NhanVien nv ,String Manv){
//         int x = nvrepo.UpdateNVNghiViec(Manv);
//        if (x>=0) {
//            return "Xóa nhân viên  thành công ";
//        }else{
//            return "Xóa nhân viên không thành công ";
//        }
//    }
//      

    public List<NhanVien> getAllNhanVienTKTheoTen(String hoten) {
        return nvrepo.getAllNhanVienTKTheoHoTen(hoten);
    }

    public List<NhanVien> getAllNhanVienTKTheoNghi(Boolean trangthai) {
        return nvrepo.getAllNhanVienNghi(trangthai);
    }

//      public List<NhanVien> getAllNhanVienTKTheoTen(String hoten) {
//        return nvrepo.getAllNhanVienTKTheoHoTen(hoten);
//    }
    public List<NhanVien> getAllNhanVienTKTheoManv(String manv) {
        return nvrepo.getAllNhanVienTKTheoManv(manv);
    }

    public List<NhanVien> getAllNhanVienTKTheoHoTen(String hoten) {
        return nvrepo.getAllNhanVienTKTheoHoTen(hoten);
    }

    public List<NhanVien> getAllNhanVienTKTheoSDT(String sdt) {
        return nvrepo.getAllNhanVienTKTheoSDT(sdt);
    }
}
