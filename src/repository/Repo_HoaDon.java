/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import utility.DBConnect;
import entity.HoaDon;
public class Repo_HoaDon {
      
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public int getSoLuongSPBanTheoThang(int thang) {
        int soLuongSP = 0;
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement sttm = conn.prepareStatement("SELECT SUM(HoaDonChiTiet.SoLuong) FROM HoaDon INNER JOIN HoaDonChiTiet ON HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon WHERE trangthai = 1 AND MONTH(HoaDon.NgayThanhToan) = ?")) {
            sttm.setInt(1, thang);
            try (ResultSet rs = sttm.executeQuery()) {
                if (rs.next()) {
                    soLuongSP = rs.getInt(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soLuongSP;
    }

    public double getDoanhThuTheoThang(int thang) {
        double doanhThu = 0;
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement sttm = conn.prepareStatement("SELECT SUM(ThanhTien) FROM HoaDon WHERE MONTH(HoaDon.NgayThanhToan) = ?")) {
            sttm.setInt(1, thang);
            try (ResultSet rs = sttm.executeQuery()) {
                if (rs.next()) {
                    doanhThu = rs.getDouble(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doanhThu;
    }

    public double getDoanhThuTheoNgay(Date ngayTT) {
        double doanhThu = 0;
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement sttm = conn.prepareStatement("SELECT SUM(ThanhTien) FROM HoaDon WHERE NgayThanhToan = ?")) {
            sttm.setString(1, dateFormat.format(ngayTT));
            try (ResultSet rs = sttm.executeQuery()) {
                if (rs.next()) {
                    doanhThu = rs.getDouble(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return doanhThu;
    }

    public int getSoLuongSPBanTheoNgay(Date ngayTT) {
        int soLuongSP = 0;
        try (Connection conn = DBConnect.getConnection();
             PreparedStatement sttm = conn.prepareStatement("SELECT SUM(HoaDonChiTiet.SoLuong) FROM HoaDon INNER JOIN HoaDonChiTiet ON HoaDon.MaHoaDon = HoaDonChiTiet.MaHoaDon WHERE trangthai = 1 AND NgayThanhToan = ?")) {
            sttm.setString(1, dateFormat.format(ngayTT));
            try (ResultSet rs = sttm.executeQuery()) {
                if (rs.next()) {
                    soLuongSP = rs.getInt(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return soLuongSP;
    }
}
