package repository;

import entity.PhieuGiamGia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import utility.DBConnect;

public class KhuyenMaiKetNoi {

    List<PhieuGiamGia> listGG = new ArrayList<>();

    public List<PhieuGiamGia> getALL() {
        listGG.clear();
        try {
            String sql = "select MaKM, TenKM, SoHoaDon, HinhThuc, MucGiamGia, ThoiGianBatDau, ThoiGianKetThuc, NgayTao, TrangThai from KhuyenMai";
            Connection conn = DBConnect.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()) {
                PhieuGiamGia p = new PhieuGiamGia();
                p.setHinhThuc(rs.getString(4));
                p.setMa(rs.getString(1));
                p.setMucGiamGia(rs.getInt(5));
                p.setNgayBatDau(rs.getString(6));
                p.setNgayKetThuc(rs.getString(7));
                p.setNgayTao(rs.getDate(8));
                p.setSoHoaDon(rs.getInt(3));
                p.setTen(rs.getString(2));
                p.setTt(rs.getBoolean(9));
                listGG.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listGG;
    }

    public List<PhieuGiamGia> timKiemGG(String maGG) {
        listGG.clear();
        try {
            String sql = "select * from KhuyenMai where MaKM ='" + maGG + "'";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PhieuGiamGia p = new PhieuGiamGia();
                p.setHinhThuc(rs.getString(4));
                p.setMa(rs.getString(1));
                p.setMucGiamGia(rs.getInt(5));
                p.setNgayBatDau(rs.getString(6));
                p.setNgayKetThuc(rs.getString(7));
                p.setNgayTao(rs.getDate(8));
                p.setSoHoaDon(rs.getInt(3));
                p.setTen(rs.getString(2));
                p.setTt(rs.getBoolean(9));
                listGG.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listGG;
    }

    public void ADDPGG(PhieuGiamGia pgg) {
        try {
            String sql = "insert into KhuyenMai( MaKM, TenKM, SoHoaDon, HinhThuc, MucGiamGia, ThoiGianBatDau, ThoiGianKetThuc, TrangThai,  NgayTao) values (?,?,?,?,?,?,?,?, getdate())";
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, pgg.getMa());
            stm.setString(2, pgg.getTen());
            stm.setInt(3, pgg.getSoHoaDon());
            stm.setString(4, pgg.getHinhThuc());
            stm.setInt(5, pgg.getMucGiamGia());
            stm.setString(6, pgg.getNgayBatDau());
            stm.setString(7, pgg.getNgayKetThuc());
            stm.setBoolean(8, pgg.getTt());
            stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void UPDATE(PhieuGiamGia pgg) {
        try {
            String sql = "update KhuyenMai set TenKM=?, SoHoaDon=?, HinhThuc=?, MucGiamGia=?, ThoiGianBatDau=?, ThoiGianKetThuc=?, TrangThai= ? where MaKM = ? ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);

            stm.setString(1, pgg.getTen());
            stm.setInt(2, pgg.getSoHoaDon());
            stm.setString(3, pgg.getHinhThuc());
            stm.setInt(4, pgg.getMucGiamGia());
            stm.setString(5, pgg.getNgayBatDau());
            stm.setString(6, pgg.getNgayKetThuc());
            stm.setBoolean(7, pgg.getTt());
            stm.setString(8, pgg.getMa());
            stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void deletePGG(String maGG) {
        try {
            String sql = "delete from KhuyenMai where MaKM = ? ";
            Connection conn = DBConnect.getConnection();
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setString(1, maGG);
            stm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public PhieuGiamGia getRow(int row) {
        return listGG.get(row);
    }

    public void truSoLuongKM(String ma) {
        try {
            String sql = "update KhuyenMai set SoHoaDon = SoHoaDon -1 where MaKM=?";
            Connection conn = DBConnect.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
