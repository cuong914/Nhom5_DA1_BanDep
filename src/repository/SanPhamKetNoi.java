/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import entity.SanPham;
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
public class SanPhamKetNoi {

    DBConnect con;

    public ArrayList<SanPham> getAll() {
        String sql = "select * from SanPham";
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        try( Connection conn = con.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);) {

           
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               String masp = rs.getString("MaSP");
               String math = rs.getString("MaThuongHieu");
               String mamau = rs.getString("MaMau");
               String masize = rs.getString("MaSize");
               String macl = rs.getString("MaChatLieu");
               String makd = rs.getString("MaKieuDang");
               String ten = rs.getString("TenSP");
               Integer sl = rs.getInt("SoLuong");
               Float gia = rs.getFloat("DonGia");
                Date ngay = rs.getDate("NgayTao");
               String xuatxu = rs.getString("XuatXu");
                Integer tt = rs.getInt("TrangThai");
                SanPham sp = new SanPham(masp,math,mamau,masize,macl,makd,ten,sl,gia,ngay,xuatxu,tt);
                listSanPham.add(sp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    }
 public Boolean add(SanPham sp){
     String sql="INSERT INTO SanPham (MaSP, MaThuongHieu, MaMau, MaSize, MaChatLieu, MaKieuDang, TenSP, SoLuong, DonGia, NgayTao, XuatXu, TrangThai)" +
"VALUES(?,?,?,?,?,?,?,?,?,getdate(),?,?)";
        try(Connection conn = con.getConnection();PreparedStatement pst = conn.prepareStatement(sql)) {
           pst.setObject(1, sp.getMaSP());
           pst.setObject(2, sp.getMaTH());
           pst.setObject(3, sp.getMaMAU());
           pst.setObject(4, sp.getMaSIZE());
           pst.setObject(5, sp.getMaCl());
           pst.setObject(6, sp.getMaKD());
           pst.setObject(7, sp.getTenSP());
           pst.setObject(8, sp.getSl());
           pst.setObject(9, sp.getDongia());
           pst.setObject(10, sp.getXuatXu());
           pst.setObject(11, sp.getTt());
          
           int kq = pst.executeUpdate();
           return kq>0;
        } catch (Exception e) {
            e.printStackTrace();;
        }
    return false;
    }
   public Boolean dele(String ma){
    String sql="delete SanPham where MaSP =?";
        try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
           pst.setObject(1, ma);        
           int kq = pst.executeUpdate();
           return kq>0;
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return false;
        }
        public ArrayList<SanPham> tim(String ma) {
        String sql = "select * from SanPham where MaSP ='"+ma+"'";
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        try (Connection conn = con.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);){          
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
               String masp = rs.getString("MaSP");
               String math = rs.getString("MaThuongHieu");
               String mamau = rs.getString("MaMau");
               String masize = rs.getString("MaSize");
               String macl = rs.getString("MaChatLieu");
               String makd = rs.getString("MaKieuDang");
               String ten = rs.getString("TenSP");
               Integer sl = rs.getInt("SoLuong");
               Float gia = rs.getFloat("DonGia");
                Date ngay = rs.getDate("NgayTao");
               String xuatxu = rs.getString("XuatXu");
                Integer tt = rs.getInt("TrangThai");
                SanPham sp = new SanPham(masp,math,mamau,masize,macl,makd,ten,sl,gia,ngay,xuatxu,tt);
                listSanPham.add(sp);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSanPham;
    } 
        public Boolean update(SanPham sp){
    String sql="update SanPham set MaThuongHieu =? , MaMau=?, MaSize =? , MaChatLieu =? , MaKieuDang =? , TenSP =? ,SoLuong =? , DonGia =? , XuatXu =? , TrangThai=? where MaSP =?  ";
        try(Connection conn = con.getConnection(); PreparedStatement pst = conn.prepareStatement(sql)) {
           pst.setObject(1, sp.getMaTH());        
           pst.setObject(2, sp.getMaMAU());        
           pst.setObject(3, sp.getMaSIZE());        
           pst.setObject(4, sp.getMaCl());        
           pst.setObject(5, sp.getMaKD());        
           pst.setObject(6, sp.getTenSP());        
           pst.setObject(7, sp.getSl());        
           pst.setObject(8, sp.getDongia());        
           pst.setObject(9, sp.getXuatXu());        
           pst.setObject(10, sp.getTt());        
           pst.setObject(11, sp.getMaSP());        
           int kq = pst.executeUpdate();
           return kq>0;
        } catch (Exception e) {
            e.printStackTrace();;
        }
        return false;
        }
        
       public ArrayList<SanPham> truSP(int i , String ma){
          ArrayList<SanPham> listTru = new ArrayList<>();
           try {
               String sql = "update SanPham set SoLuong = SoLuong - ? where MaSP=?";
               Connection conn = DBConnect.getConnection();
               PreparedStatement ps = conn.prepareStatement(sql);
               ps.setInt(1, i);
               ps.setString(2, ma);
               ps.executeUpdate();
               conn.close();
           } catch (Exception e) {
               e.printStackTrace();
           }
           return listTru;
       }
}
