/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.HDCT;
import entity.HoaDon;
import entity.InHoaDon;
import entity.ThanhToan;
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

    ArrayList<HoaDon> listHoaDon = new ArrayList<>();
    DBConnect con;

    public ArrayList<HoaDon> getAll() {
        String sql = "  select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n"
                + "  left join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon";
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

    public int getTongSoHD() {
        String sql = "select count(*) as tongSo from HoaDon";
        int tongSoHD = 0;
        try (
                Connection conn = con.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                tongSoHD = rs.getInt("tongSo");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tongSoHD;
    }

    public ArrayList<HDCT> HDCT(String ma) {
        String sql = "select HoaDonChiTiet.MaHoaDon,HoaDonChiTiet.MaSP,TenSP,HoaDonChiTiet.SoLuong,SanPham.DonGia,ThanhTien from HoaDonChiTiet\n"
                + "                      join SanPham on SanPham.MaSP = HoaDonChiTiet.MaSP join HoaDon on HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon\n"
                + "                     where HoaDonChiTiet.MaHoaDon= '" + ma + "'";
        ArrayList<HDCT> listSanPham = new ArrayList<>();
        try (Connection conn = con.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String mahd = rs.getString("MaHoaDon");
                String masp = rs.getString("MaSP");
                String ten = rs.getString("TenSP");
                Integer makm = rs.getInt("SoLuong");
                Float gia = rs.getFloat("DonGia");

                HDCT hd = new HDCT(mahd, masp, ten, makm, gia);
                listSanPham.add(hd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    public ArrayList<HoaDon> timda() {
        String sql = "select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n"
                + "  join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon where HoaDon.TrangThai like N'Đã Thanh%'";
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
        String sql = "select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n"
                + " join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon where HoaDon.TrangThai like N'%Hủy hóa đơn%'";
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
        String sql = " select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n"
                + " join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon where HoaDon.TrangThai like N'Chờ thanh toán%'";
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

    public Boolean dele(String ma) {
        String sql = "delete HoaDonChiTiet where MaHoaDon = ?\n"
                + "delete HoaDon where MaHoaDon = ?";
        try (Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setObject(1, ma);
            pst.setObject(2, ma);
            int kq = pst.executeUpdate();
            return kq > 0;
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return false;
    }

    public ArrayList<HoaDon> tim(String ma) {
        String sql = "select HoaDon.MaHoaDon,MaNV,MaKH,MaKM,MaThanhToan,MaSP,HoaDon.NgayTao,NgayThanhToan,TongTien,ThanhTien,HoaDon.TrangThai  from HoaDon\n"
                + "  join HoaDonChiTiet on  HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon where HoaDon.MaHoaDon = '" + ma + "'";
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
                HoaDon sp = new HoaDon(mahd, manv, makh, makm, matt, masp, ngaytao, ngaytt, thanh, tong, tt);
                listSanPham.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }

    public void themHD(HoaDon hd, ThanhToan tt) {

        try {
            String sql = "insert into ThanhToan(MaThanhToan,NgayTao) values (?,getdate())";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tt.getMa());

            ps.executeUpdate();

            String sql1 = "insert into HoaDon(MaHoaDon,MaNV,MaThanhToan,NgayTao,TrangThai) values(?,?,?,getdate(),?)";

            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, hd.getMahd());
            ps1.setString(2, hd.getManv());
            ps1.setString(3, hd.getMaTt());
            ps1.setString(4, hd.getTrangThai());
            ps1.executeUpdate();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void thanhToan(String ma) {
        listHoaDon.clear();
        try {
            String sql = "update HoaDon set TrangThai=? where MaHoaDon=?";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Đã thanh toán");
            ps.setString(2, ma);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void huyHoaDon(String ma) {
        listHoaDon.clear();
        try {
            String sql = "update HoaDon set TrangThai=? where MaHoaDon=?";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Hủy hóa đơn");
            ps.setString(2, ma);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateTongTien(String maHD, int tongTien) {
        try {
            String sql = "update HoaDon set TongTien = ? where MaHoaDon = ?";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, tongTien);
            ps.setString(2, maHD);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    public void thanhTien(String maHD, int thanhTien) {
//        try {
//            String sql = "update HoaDon set ThanhTien = ? where MaHoaDon = ?";
//            Connection conn = DBConnect.getConnection();
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setInt(1, thanhTien);
//            ps.setString(2, maHD);
//            ps.executeUpdate();
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    public void updateMaKM(String maHD, int thanhTien, String maKH, String maKM) {
        try {
            String sql = "update HoaDon set ThanhTien = ?, MaKH=?, MaKM=?, NgayThanhToan = getdate() where MaHoaDon = ?";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, thanhTien);
            if ("".equals(maKH)) {
                maKH = null;
            }
            ps.setString(2, maKH);
            if ("".equals(maKM)) {
                maKM = null;
            }
            ps.setString(3, maKM);
            ps.setString(4, maHD);

            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public InHoaDon getHoaDonInfo(String ma) {
        InHoaDon hoaDonInfo = new InHoaDon();
        String sql = "select HoaDon.MaHoaDon as maHD,\n"
                + "     HoaDon.MaNV as maNV,\n"
                + "     NhanVien.HoTen as tenNV,\n"
                + "     KhachHang.MaKH as maKH,\n"
                + "     KhachHang.HoTen as tenKH,\n"
                + "     KhachHang.SDT as sdt,\n"
                + "     KhachHang.DiaChi as diaChi,\n"
                + "     HoaDon.MaThanhToan as maTT,\n"
                + "     HoaDon.NgayThanhToan as ngayThanhToan,\n"
                + "     HoaDon.TongTien as tongTien,\n"
                + "     KhuyenMai.MucGiamGia as mucGiam,\n"
                + "     HoaDon.ThanhTien as thanhTien\n"
                + " from HoaDon\n"
                + " inner join NhanVien on HoaDon.MaNV = NhanVien.MaNV\n"
                + " inner join KhachHang on KhachHang.MaKH = HoaDon.MaKH\n"
                + " inner join KhuyenMai on HoaDon.MaKM = KhuyenMai.MaKM\n"
                + " where HoaDon.MaHoaDon=?";
        try (Connection conn = con.getConnection(); PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString("maHD");
                String maNV = rs.getString("maNV");
                String tenNV = rs.getString("tenNV");
                String maKH = rs.getString("maKH");
                String tenKH = rs.getString("tenKH");
                String sdt = rs.getString("sdt");
                String diaChi = rs.getString("diaChi");
                String maTT = rs.getString("maTT");
                String ngayThanhToan = rs.getDate("ngayThanhToan").toString();
                Integer tongTien = rs.getInt("tongTien");
                Integer mucGiam = rs.getInt("mucGiam");
                Integer thanhTien = rs.getInt("thanhTien");
                hoaDonInfo = new InHoaDon(maHD, maNV, tenNV, maKH,
                        tenKH, sdt, diaChi, maTT, ngayThanhToan, tongTien,
                        thanhTien, mucGiam);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        hoaDonInfo.setDanhSachSanPham(HDCT(ma));
        return hoaDonInfo;
    }
}
