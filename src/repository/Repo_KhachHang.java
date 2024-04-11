/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import model.KhachHang;
import utility.DBConnect;
import utility.JDBCHelper;

/**
 *
 * @author cuong
 */
public class Repo_KhachHang {

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public List<KhachHang> getAllKhachHang() {
        List<KhachHang> listKH = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sql = "select makh,hoten,sdt,diachi,trangthai from khachhang";
            conn = DBConnect.getConnection();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                KhachHang nv = new KhachHang();
                nv.setMakh(rs.getString(1));
                nv.setHoten(rs.getString(2));
                nv.setSdt(rs.getString(3));
                nv.setDiachi(rs.getString(4));
                nv.setTrangthai(rs.getBoolean(5));
                listKH.add(nv);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            rs.close();
            sttm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKH;
    }

    public int InsertKhachHang(KhachHang kh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sql = " insert into KhachHang( makh,hoten,sdt,diachi,trangthai) values(?,?,?,?,?)";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, kh.getMakh());
            sttm.setString(2, kh.getHoten());
            sttm.setString(3, kh.getSdt());
            sttm.setString(4, kh.getDiachi());
            //sttm.setString(5,kh.getSdt());
            if (kh.getTrangthai() != null) {
                sttm.setBoolean(5, kh.getTrangthai());
            } else {
                sttm.setNull(5, java.sql.Types.BOOLEAN);
            }
            return sttm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            sttm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int UpdateKhachHang(KhachHang kh) {

        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sql = " update khachhang set hoten= ? ,sdt= ? ,diachi= ? ,trangthai= ?  where makh = ?";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sql);

            sttm.setString(1, kh.getHoten());
            sttm.setString(2, kh.getSdt());
            sttm.setString(3, kh.getDiachi());

            sttm.setBoolean(4, kh.getTrangthai());
            sttm.setString(5, kh.getMakh());

            return sttm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            sttm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public int XoaKhachHang(String makh) {

        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sql = " delete khachhang where makh = ? ";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sql);

            sttm.setString(1, makh);

            return sttm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            sttm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public List<KhachHang> getAllKhachHangTKTheoSDT(String sdt) {
        List<KhachHang> listNV = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT makh,hoten,sdt,diachi,trangthai  FROM khachhang\n"
                    + "WHERE sdt like '%" + sdt + "%'";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                KhachHang nv = new KhachHang();
                nv.setMakh(rs.getString(1));
                nv.setHoten(rs.getString(2));
                nv.setSdt(rs.getString(3));
                nv.setTrangthai(rs.getBoolean(5));
                nv.setDiachi(rs.getString(4));
                listNV.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            rs.close();
            sttm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNV;
    }

    public List<KhachHang> getAllKhachHangTKTheoMakh(String makh) {
        List<KhachHang> listNV = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT makh,hoten,sdt,diachi,trangthai  FROM khachhang\n"
                    + "WHERE makh like '%" + makh + "%'";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                KhachHang nv = new KhachHang();
                nv.setMakh(rs.getString(1));
                nv.setHoten(rs.getString(2));
                nv.setSdt(rs.getString(3));
                nv.setTrangthai(rs.getBoolean(5));
                nv.setDiachi(rs.getString(4));
                listNV.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            rs.close();
            sttm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNV;
    }

    public List<KhachHang> getAllKhachHangTKTheoHoTen(String hoten) {
        List<KhachHang> listNV = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT makh,hoten,sdt,diachi,trangthai  FROM khachhang\n"
                    + "WHERE hoten like '%" + hoten + "%'";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                KhachHang nv = new KhachHang();
                nv.setMakh(rs.getString(1));
                nv.setHoten(rs.getString(2));
                nv.setSdt(rs.getString(3));
                nv.setTrangthai(rs.getBoolean(5));
                nv.setDiachi(rs.getString(4));
                listNV.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            rs.close();
            sttm.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNV;
    }

   
}
