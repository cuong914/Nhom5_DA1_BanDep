package repository;

import entity.ThongKe;
import entity.ThongKeDT;
import entity.ThongKeNam;
import entity.ThongKeSP;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import utility.DBConnect;

public class ThongKeKetNoi {

    List<ThongKeNam> lstNam = new ArrayList<>();

    public List<ThongKeNam> Year() {
        lstNam.clear();
        try {
            String sql = "select Year(NgayTao) from HoaDon group by Year(NgayTao) ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                ThongKeNam nam = new ThongKeNam();
                nam.setNam(rs.getString(1));
                lstNam.add(nam);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstNam;
    }
    List<ThongKeDT> lstDT = new ArrayList<>();

    public List<ThongKeDT> getALLDT(String nam) {
        lstDT.clear();
        try {
            String sql = "select MONTH(NgayTao),count(DISTINCT HoaDon.MaHoaDon), sum(SoLuong), sum(GiaHienHanh*SoLuong), sum(TongTien - ThanhTien),(SUM(GiaHienHanh*SoLuong) - sum(HoaDon.TongTien-HoaDon.ThanhTien)) from HoaDon\n"
                    + " join HoaDonChiTiet on HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon \n"
                    + " where year(NgayTao) = '" + nam + "'"
                    + " group by MONTH(NgayTao)";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeDT dt = new ThongKeDT();
                dt.setThang(rs.getInt(1));
                dt.setSoHoaDon(rs.getInt(2));
                dt.setSoSanPham(rs.getInt(3));
                dt.setGiaBan(rs.getFloat(4));
                dt.setGiaGiam(rs.getFloat(5));
                dt.setDoanhThu(rs.getFloat(6));
                lstDT.add(dt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstDT;
    }
    List<ThongKeSP> lstTKSP = new ArrayList<>();

    public List<ThongKeSP> getAllTKSP() {
        lstTKSP.clear();
        try {
            String sql = "select sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu,SUM(hdct.SoLuong) from SanPham sp\n"
                    + "join ThuongHieu th on th.MaThuongHieu = sp.MaThuongHieu\n"
                    + "join MauSac ms on ms.MaMau = sp.MaMau\n"
                    + "join Size s on s.MaSize = sp.MaSize\n"
                    + "join ChatLieu cl on cl.MaChatLieu = sp.MaChatLieu\n"
                    + "join HoaDonChiTiet hdct on hdct.MaSP = sp.MaSP\n"
                    + "group by sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeSP s = new ThongKeSP();
                s.setMaSP(rs.getString(1));
                s.setTenSP(rs.getString(2));
                s.setXuatXu(rs.getString(3));
                s.setThuonHieu(rs.getString(4));
                s.setMau(rs.getString(5));
                s.setSize(rs.getInt(6));
                s.setChatLieu(rs.getString(7));
                s.setSoLuong(rs.getInt(8));
                lstTKSP.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTKSP;
    }

    public List<ThongKeSP> getAllTKSP1() {
        lstTKSP.clear();
        try {
            String sql = "select sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu,SUM(hdct.SoLuong) from SanPham sp\n"
                    + "join ThuongHieu th on th.MaThuongHieu = sp.MaThuongHieu\n"
                    + "join MauSac ms on ms.MaMau = sp.MaMau\n"
                    + "join Size s on s.MaSize = sp.MaSize\n"
                    + "join ChatLieu cl on cl.MaChatLieu = sp.MaChatLieu\n"
                    + "join HoaDonChiTiet hdct on hdct.MaSP = sp.MaSP\n"
                    + "group by sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu" + " order by SUM(hdct.SoLuong) desc ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeSP s = new ThongKeSP();
                s.setMaSP(rs.getString(1));
                s.setTenSP(rs.getString(2));
                s.setXuatXu(rs.getString(3));
                s.setThuonHieu(rs.getString(4));
                s.setMau(rs.getString(5));
                s.setSize(rs.getInt(6));
                s.setChatLieu(rs.getString(7));
                s.setSoLuong(rs.getInt(8));
                lstTKSP.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTKSP;
    }

    public List<ThongKeSP> getAllTKSP2() {
        lstTKSP.clear();
        try {
            String sql = "select sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu,SUM(hdct.SoLuong) from SanPham sp\n"
                    + "join ThuongHieu th on th.MaThuongHieu = sp.MaThuongHieu\n"
                    + "join MauSac ms on ms.MaMau = sp.MaMau\n"
                    + "join Size s on s.MaSize = sp.MaSize\n"
                    + "join ChatLieu cl on cl.MaChatLieu = sp.MaChatLieu\n"
                    + "join HoaDonChiTiet hdct on hdct.MaSP = sp.MaSP\n"
                    + "group by sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu" + " order by SUM(hdct.SoLuong) asc ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeSP s = new ThongKeSP();
                s.setMaSP(rs.getString(1));
                s.setTenSP(rs.getString(2));
                s.setXuatXu(rs.getString(3));
                s.setThuonHieu(rs.getString(4));
                s.setMau(rs.getString(5));
                s.setSize(rs.getInt(6));
                s.setChatLieu(rs.getString(7));
                s.setSoLuong(rs.getInt(8));
                lstTKSP.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTKSP;
    }

    public List<ThongKeSP> getAllTKSP1TheoNgay() {
        lstTKSP.clear();
        try {
            String sql = "select sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu,SUM(hdct.SoLuong) from SanPham sp\n"
                    + "join ThuongHieu th on th.MaThuongHieu = sp.MaThuongHieu\n"
                    + "join MauSac ms on ms.MaMau = sp.MaMau\n"
                    + "join Size s on s.MaSize = sp.MaSize\n"
                    + "join ChatLieu cl on cl.MaChatLieu = sp.MaChatLieu\n"
                    + "join HoaDonChiTiet hdct on hdct.MaSP = sp.MaSP\n"
                    + "join HoaDon hd on hd.MaHoaDon = hdct.MaHoaDon\n"
                    + "where day(hd.NgayTao) = DAY(GETDATE())"
                    + "group by sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu" + " order by SUM(hdct.SoLuong) desc ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeSP s = new ThongKeSP();
                s.setMaSP(rs.getString(1));
                s.setTenSP(rs.getString(2));
                s.setXuatXu(rs.getString(3));
                s.setThuonHieu(rs.getString(4));
                s.setMau(rs.getString(5));
                s.setSize(rs.getInt(6));
                s.setChatLieu(rs.getString(7));
                s.setSoLuong(rs.getInt(8));
                lstTKSP.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTKSP;
    }

    public List<ThongKeSP> getAllTKSP2TheoNgay() {
        lstTKSP.clear();
        try {
            String sql = "select sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu,SUM(hdct.SoLuong) from SanPham sp\n"
                    + "join ThuongHieu th on th.MaThuongHieu = sp.MaThuongHieu\n"
                    + "join MauSac ms on ms.MaMau = sp.MaMau\n"
                    + "join Size s on s.MaSize = sp.MaSize\n"
                    + "join ChatLieu cl on cl.MaChatLieu = sp.MaChatLieu\n"
                    + "join HoaDonChiTiet hdct on hdct.MaSP = sp.MaSP\n"
                    + "join HoaDon hd on hd.MaHoaDon = hdct.MaHoaDon\n"
                    + "where day(hd.NgayTao) = DAY(GETDATE())"
                    + "group by sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu" + " order by SUM(hdct.SoLuong) asc ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeSP s = new ThongKeSP();
                s.setMaSP(rs.getString(1));
                s.setTenSP(rs.getString(2));
                s.setXuatXu(rs.getString(3));
                s.setThuonHieu(rs.getString(4));
                s.setMau(rs.getString(5));
                s.setSize(rs.getInt(6));
                s.setChatLieu(rs.getString(7));
                s.setSoLuong(rs.getInt(8));
                lstTKSP.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTKSP;
    }

    public List<ThongKeSP> getAllTKSP1TheoThang() {
        lstTKSP.clear();
        try {
            String sql = "select sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu,SUM(hdct.SoLuong) from SanPham sp\n"
                    + "join ThuongHieu th on th.MaThuongHieu = sp.MaThuongHieu\n"
                    + "join MauSac ms on ms.MaMau = sp.MaMau\n"
                    + "join Size s on s.MaSize = sp.MaSize\n"
                    + "join ChatLieu cl on cl.MaChatLieu = sp.MaChatLieu\n"
                    + "join HoaDonChiTiet hdct on hdct.MaSP = sp.MaSP\n"
                    + "join HoaDon hd on hd.MaHoaDon = hdct.MaHoaDon\n"
                    + "where MONTH(hd.NgayTao) = MONTH(GETDATE())"
                    + "group by sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu" + " order by SUM(hdct.SoLuong) desc ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeSP s = new ThongKeSP();
                s.setMaSP(rs.getString(1));
                s.setTenSP(rs.getString(2));
                s.setXuatXu(rs.getString(3));
                s.setThuonHieu(rs.getString(4));
                s.setMau(rs.getString(5));
                s.setSize(rs.getInt(6));
                s.setChatLieu(rs.getString(7));
                s.setSoLuong(rs.getInt(8));
                lstTKSP.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTKSP;
    }

    public List<ThongKeSP> getAllTKSP2TheoThang() {
        lstTKSP.clear();
        try {
            String sql = "select sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu,SUM(hdct.SoLuong) from SanPham sp\n"
                    + "join ThuongHieu th on th.MaThuongHieu = sp.MaThuongHieu\n"
                    + "join MauSac ms on ms.MaMau = sp.MaMau\n"
                    + "join Size s on s.MaSize = sp.MaSize\n"
                    + "join ChatLieu cl on cl.MaChatLieu = sp.MaChatLieu\n"
                    + "join HoaDonChiTiet hdct on hdct.MaSP = sp.MaSP\n"
                    + "join HoaDon hd on hd.MaHoaDon = hdct.MaHoaDon\n"
                    + "where MONTH(hd.NgayTao) = MONTH(GETDATE())"
                    + "group by sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu" + " order by SUM(hdct.SoLuong) asc ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeSP s = new ThongKeSP();
                s.setMaSP(rs.getString(1));
                s.setTenSP(rs.getString(2));
                s.setXuatXu(rs.getString(3));
                s.setThuonHieu(rs.getString(4));
                s.setMau(rs.getString(5));
                s.setSize(rs.getInt(6));
                s.setChatLieu(rs.getString(7));
                s.setSoLuong(rs.getInt(8));
                lstTKSP.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTKSP;
    }

    public List<ThongKeSP> getAllTKSP1TheoNam() {
        lstTKSP.clear();
        try {
            String sql = "select sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu,SUM(hdct.SoLuong) from SanPham sp\n"
                    + "join ThuongHieu th on th.MaThuongHieu = sp.MaThuongHieu\n"
                    + "join MauSac ms on ms.MaMau = sp.MaMau\n"
                    + "join Size s on s.MaSize = sp.MaSize\n"
                    + "join ChatLieu cl on cl.MaChatLieu = sp.MaChatLieu\n"
                    + "join HoaDonChiTiet hdct on hdct.MaSP = sp.MaSP\n"
                    + "join HoaDon hd on hd.MaHoaDon = hdct.MaHoaDon\n"
                    + "where YEAR(hd.NgayTao) = YEAR(GETDATE())"
                    + "group by sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu" + " order by SUM(hdct.SoLuong) desc ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeSP s = new ThongKeSP();
                s.setMaSP(rs.getString(1));
                s.setTenSP(rs.getString(2));
                s.setXuatXu(rs.getString(3));
                s.setThuonHieu(rs.getString(4));
                s.setMau(rs.getString(5));
                s.setSize(rs.getInt(6));
                s.setChatLieu(rs.getString(7));
                s.setSoLuong(rs.getInt(8));
                lstTKSP.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTKSP;
    }

    public List<ThongKeSP> getAllTKSP2TheoNam() {
        lstTKSP.clear();
        try {
            String sql = "select sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu,SUM(hdct.SoLuong) from SanPham sp\n"
                    + "join ThuongHieu th on th.MaThuongHieu = sp.MaThuongHieu\n"
                    + "join MauSac ms on ms.MaMau = sp.MaMau\n"
                    + "join Size s on s.MaSize = sp.MaSize\n"
                    + "join ChatLieu cl on cl.MaChatLieu = sp.MaChatLieu\n"
                    + "join HoaDonChiTiet hdct on hdct.MaSP = sp.MaSP\n"
                    + "join HoaDon hd on hd.MaHoaDon = hdct.MaHoaDon\n"
                    + "where YEAR(hd.NgayTao) = YEAR(GETDATE())"
                    + "group by sp.MaSP,TenSP,XuatXu,TenThuongHieu,TenMau,SoSize,TenChatLieu" + " order by SUM(hdct.SoLuong) asc ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ThongKeSP s = new ThongKeSP();
                s.setMaSP(rs.getString(1));
                s.setTenSP(rs.getString(2));
                s.setXuatXu(rs.getString(3));
                s.setThuonHieu(rs.getString(4));
                s.setMau(rs.getString(5));
                s.setSize(rs.getInt(6));
                s.setChatLieu(rs.getString(7));
                s.setSoLuong(rs.getInt(8));
                lstTKSP.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstTKSP;
    }
    List<ThongKe> lstTKTN = new ArrayList<>();

    public ThongKe getDTTheoNgay() {
        ThongKe tkn = new ThongKe();
        try {
            String sql = "select count(MaHoaDon), SUM(ThanhTien) from HoaDon where day(NgayTao) = day(GETDATE())";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tkn.setDoanhThuDay(rs.getFloat(2));
                tkn.setTongHoaDon(rs.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tkn;
    }

    public ThongKe getDTTheoThang() {
        ThongKe tkt = new ThongKe();
        try {
            String sql = "select (SUM(GiaHienHanh*SoLuong) - sum(HoaDon.TongTien-HoaDon.ThanhTien)), MONTH(GETDATE()) from HoaDon"
                    + " join HoaDonChiTiet on HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon \n"
                    + " where MONTH(NgayTao) = MONTH(GETDATE()) and YEAR(NgayTao) = YEAR(GETDATE())";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tkt.setDoanhThuMonth(rs.getFloat(1));
                tkt.setThang(rs.getInt(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tkt;
    }

    public ThongKe getDTTheoNam() {
        ThongKe tkNam = new ThongKe();
        try {
            String sql = "select (SUM(GiaHienHanh*SoLuong) - sum(HoaDon.TongTien-HoaDon.ThanhTien)), YEAR(GETDATE()) from HoaDon "
                    + " join HoaDonChiTiet on HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon \n"
                    + " where YEAR(NgayTao) = YEAR(GETDATE())";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tkNam.setDoanhThuYear(rs.getFloat(1));
                tkNam.setNam(rs.getInt(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return tkNam;
    }

    public ThongKe getTKDTTheoNgay(String ngayMin, String ngayMax) {
        ThongKe tkn = new ThongKe();
        try {
            String sql = "select count(MaHoaDon), SUM(ThanhTien) from HoaDon WHERE NgayTao >= '" + ngayMin + "' AND NgayTao <= '" + ngayMax + "'";
            Connection conn = DBConnect.getConnection();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                tkn.setDoanhThuDay(rs.getFloat(2));
                tkn.setTongHoaDon(rs.getInt(1));
            }
        } catch (Exception e) {
            tkn.setDoanhThuDay(0);
            tkn.setTongHoaDon(0);
            e.printStackTrace();
        }
        return tkn;
    }
}
