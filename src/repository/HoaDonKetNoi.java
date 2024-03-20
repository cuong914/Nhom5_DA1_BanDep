/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.HDCT;
import entity.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import utility.DBConnect;

/**
 *
 * @author Admin
 */
public class HoaDonKetNoi {

    DBConnect con;

    public ArrayList<HoaDon> getAll() {
        String sql = "select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n" +
"join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon";
        ArrayList<HoaDon> listSanPham = new ArrayList<>();
        try (Connection conn = con.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String mahd = rs.getString("MaHoaDon");
                String manv = rs.getString("MaNV");
                String makh = rs.getString("MaKH");
                String makm = rs.getString("MaKM");
                String matt = rs.getString("MaThanhToan");
                String masp = rs.getString("MaSP");
                Date ngaytao = rs.getDate("NgayTao");
                Date ngaytt = rs.getDate("NgayThanhToan");
                Float tong = rs.getFloat("TongTien");
                Float thanh = rs.getFloat("ThanhTien");
                String tt = rs.getString("TrangThai");
                HoaDon sp = new HoaDon(mahd, manv, makh, makm, matt, masp, ngaytao, ngaytt, tong, thanh, tt);
                listSanPham.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }
    public ArrayList<HDCT> HDCT(String ma) {
        String sql = "select HoaDonChiTiet.MaHoaDon,HoaDonChiTiet.MaSP,TenSP,HoaDonChiTiet.SoLuong,SanPham.DonGia,ThanhTien from HoaDonChiTiet\n" +
"                      join SanPham on SanPham.MaSP = HoaDonChiTiet.MaSP join HoaDon on HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon\n" +
"                     where HoaDonChiTiet.MaHoaDon= '"+ma+"'";
        ArrayList<HDCT> listSanPham = new ArrayList<>();
        try (Connection conn = con.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String mahd = rs.getString("MaHoaDon");
                String masp = rs.getString("MaSP");
                String ten = rs.getString("TenSP");
                Integer makm = rs.getInt("SoLuong");
                Float gia = rs.getFloat("DonGia");
                Float tt = rs.getFloat("ThanhTien");
                
                HDCT hd = new HDCT(mahd,masp,ten,makm,gia,tt);
                listSanPham.add(hd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }
      public ArrayList<HoaDon> timda() {
        String sql = "select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n" +
"join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon where HoaDon.TrangThai like N'Đã Thanh%'";
        ArrayList<HoaDon> listSanPham = new ArrayList<>();
        try (Connection conn = con.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String mahd = rs.getString("MaHoaDon");
                String manv = rs.getString("MaNV");
                String makh = rs.getString("MaKH");
                String makm = rs.getString("MaKM");
                String matt = rs.getString("MaThanhToan");
                String masp = rs.getString("MaSP");
                Date ngaytao = rs.getDate("NgayTao");
                Date ngaytt = rs.getDate("NgayThanhToan");
                Float tong = rs.getFloat("TongTien");
                Float thanh = rs.getFloat("ThanhTien");
                String tt = rs.getString("TrangThai");
                HoaDon sp = new HoaDon(mahd, manv, makh, makm, matt, masp, ngaytao, ngaytt, tong, thanh, tt);
                listSanPham.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
      }
       public ArrayList<HoaDon> timdahuy() {
        String sql = "select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n" +
"join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon where HoaDon.TrangThai like N'Đã Huỷ%'";
        ArrayList<HoaDon> listSanPham = new ArrayList<>();
        try (Connection conn = con.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String mahd = rs.getString("MaHoaDon");
                String manv = rs.getString("MaNV");
                String makh = rs.getString("MaKH");
                String makm = rs.getString("MaKM");
                String matt = rs.getString("MaThanhToan");
                String masp = rs.getString("MaSP");
                Date ngaytao = rs.getDate("NgayTao");
                Date ngaytt = rs.getDate("NgayThanhToan");
                Float tong = rs.getFloat("TongTien");
                Float thanh = rs.getFloat("ThanhTien");
                String tt = rs.getString("TrangThai");
                HoaDon sp = new HoaDon(mahd, manv, makh, makm, matt, masp, ngaytao, ngaytt, tong, thanh, tt);
                listSanPham.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
      }
        public ArrayList<HoaDon> timchua() {
        String sql = "select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n" +
"join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon where HoaDon.TrangThai like N'Chưa%'";
        ArrayList<HoaDon> listSanPham = new ArrayList<>();
        try (Connection conn = con.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String mahd = rs.getString("MaHoaDon");
                String manv = rs.getString("MaNV");
                String makh = rs.getString("MaKH");
                String makm = rs.getString("MaKM");
                String matt = rs.getString("MaThanhToan");
                String masp = rs.getString("MaSP");
                Date ngaytao = rs.getDate("NgayTao");
                Date ngaytt = rs.getDate("NgayThanhToan");
                Float tong = rs.getFloat("TongTien");
                Float thanh = rs.getFloat("ThanhTien");
                String tt = rs.getString("TrangThai");
                HoaDon sp = new HoaDon(mahd, manv, makh, makm, matt, masp, ngaytao, ngaytt, tong, thanh, tt);
                listSanPham.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
      }
         public Boolean dele(String ma){
    String sql="delete HoaDonChiTiet where MaHoaDon = ?\n" +
"delete HoaDon where MaHoaDon = ?";
        try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
           pst.setObject(1, ma);        
           pst.setObject(2, ma);        
           int kq = pst.executeUpdate();
           return kq>0;
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return false;
        }
          public ArrayList<HoaDon> tim(String ma) {
        String sql = "select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n" +
"join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon where HoaDon.MaHoaDon = '"+ma+"'";
        ArrayList<HoaDon> listSanPham = new ArrayList<>();
        try (Connection conn = con.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String mahd = rs.getString("MaHoaDon");
                String manv = rs.getString("MaNV");
                String makh = rs.getString("MaKH");
                String makm = rs.getString("MaKM");
                String matt = rs.getString("MaThanhToan");
                String masp = rs.getString("MaSP");
                Date ngaytao = rs.getDate("NgayTao");
                Date ngaytt = rs.getDate("NgayThanhToan");
                Float tong = rs.getFloat("TongTien");
                Float thanh = rs.getFloat("ThanhTien");
                String tt = rs.getString("TrangThai");
                HoaDon sp = new HoaDon(mahd, manv, makh, makm, matt, masp, ngaytao, ngaytt, tong, thanh, tt);
                listSanPham.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
      }
}
