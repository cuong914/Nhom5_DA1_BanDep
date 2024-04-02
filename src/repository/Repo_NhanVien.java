/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsetory;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import model.NhanVien;
import utility.DBConnect;

/**
 *
 * @author cuong
 */
public class Repo_NhanVien {
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     
     public List<NhanVien> getAllNhanVien(){
         List<NhanVien> listNV = new ArrayList<>();
         Connection conn = null;
         Statement sttm = null;
         ResultSet rs = null;
         try {
             String sql = "select manv,hoten,sdt,gioitinh,ngaysinh,trangthai,vaitro,matk from nhanvien";
             conn = DBConnect.getConnection();
             sttm = conn.createStatement();
             rs = sttm.executeQuery(sql);
             while(rs.next()){
                 NhanVien nv = new NhanVien();
                 nv.setManv(rs.getString(1));
                  nv.setHoten(rs.getString(2));
                   nv.setSdt(rs.getString(3));
                    nv.setGioitinh(rs.getBoolean(4));
                     nv.setNgaysinh(rs.getDate(5));
                      nv.setTrangthai(rs.getBoolean(6));
                       nv.setVaitro(rs.getString(7));
                        nv.setMatk(rs.getString(8));
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

      public int XoaNhanVien( String manv){
        
        Connection conn = null;
         PreparedStatement  sttm = null;
         try {
             String sql = " delete nhanvien where manv = ? ";
             conn = DBConnect.getConnection();
             sttm = conn.prepareStatement(sql);
          
              sttm.setString(1,manv);
    
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
     public int InsertNhanVien(NhanVien nv){
         Connection conn = null;
         PreparedStatement  sttm = null;
         try {
             String sql = " insert into NhanVien(manv,hoten,sdt,gioitinh,ngaysinh,ngayvaolam,trangthai,vaitro,matk) values(?,?,?,?,?,getdate(),?,?,?) ";
             conn = DBConnect.getConnection();
             sttm = conn.prepareStatement(sql);
             sttm.setString(1,nv.getManv());
              sttm.setString(2,nv.getHoten());
               sttm.setString(3,nv.getSdt());
               if (nv.getGioitinh() != null) {
            sttm.setBoolean(4, nv.getGioitinh());
        } else {
            sttm.setNull(4, java.sql.Types.BOOLEAN);
        }
        
        // Kiểm tra giá trị null cho ngaysinh
        if (nv.getNgaysinh() != null) {
            sttm.setDate(5, new java.sql.Date(nv.getNgaysinh().getTime()));
        } else {
            sttm.setNull(5, java.sql.Types.DATE);
        }
        
        // Kiểm tra giá trị null cho trangthai
        if (nv.getTrangthai() != null) {
            sttm.setBoolean(6, nv.getTrangthai());
        } else {
            sttm.setNull(6, java.sql.Types.BOOLEAN);
        }
//                 sttm.setDate(5, (Date) nv.getNgaysinh());
//                  sttm.setBoolean(6,nv.getTrangthai());
                   sttm.setString(7,nv.getVaitro());
                    sttm.setString(8,nv.getMatk());
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
     
    public int UpdateNhanVien( NhanVien nv){
        
        Connection conn = null;
         PreparedStatement  sttm = null;
         try {
             String sql = " update NhanVien set hoten= ? ,sdt= ? ,gioitinh= ? ,ngaysinh= ? ,trangthai= ? ,vaitro= ? ,matk=? where manv = ?";
             conn = DBConnect.getConnection();
             sttm = conn.prepareStatement(sql);
          
              sttm.setString(1,nv.getHoten());
               sttm.setString(2,nv.getSdt());
                sttm.setBoolean(3,nv.getGioitinh());
                if (nv.getNgaysinh() != null) {
            sttm.setDate(4, new java.sql.Date(nv.getNgaysinh().getTime()));
        } else {
            sttm.setNull(4, java.sql.Types.DATE);
        }
                  sttm.setBoolean(5,nv.getTrangthai());
                   sttm.setString(6,nv.getVaitro());
                    sttm.setString(7,nv.getMatk());
                      sttm.setString(8,nv.getManv());
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
     public int UpdateNVNghiViec(String manv) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sql = "UPDATE NhanVien SET TrangThai=0,ngaynghi = getdate()\n" +
            "     WHERE MaNV=?";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, manv);
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
          public List<NhanVien> getAllNhanVienTKTheoSDT(String sdt) {
        List<NhanVien> listNV = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT manv,hoten,sdt,gioitinh,ngaysinh,trangthai,vaitro,matk  FROM NhanVien\n"
                    + "WHERE sdt like '%" + sdt + "%'";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                 nv.setManv(rs.getString(1));
                  nv.setHoten(rs.getString(2));
                   nv.setSdt(rs.getString(3));
                    nv.setGioitinh(rs.getBoolean(4));
                     nv.setNgaysinh(rs.getDate(5));
                      nv.setTrangthai(rs.getBoolean(6));
                       nv.setVaitro(rs.getString(7));
                        nv.setMatk(rs.getString(8));
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
   
     public List<NhanVien> getAllNhanVienTKTheoManv(String manv) {
        List<NhanVien> listNV = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT manv,hoten,sdt,gioitinh,ngaysinh,trangthai,vaitro,matk FROM NhanVien\n"
                    + "WHERE manv like '%" + manv + "%'";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                 nv.setManv(rs.getString(1));
                  nv.setHoten(rs.getString(2));
                   nv.setSdt(rs.getString(3));
                    nv.setGioitinh(rs.getBoolean(4));
                     nv.setNgaysinh(rs.getDate(5));
                      nv.setTrangthai(rs.getBoolean(6));
                       nv.setVaitro(rs.getString(7));
                        nv.setMatk(rs.getString(8));
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
          public List<NhanVien> getAllNhanVienTKTheoHoTen(String hoten) {
        List<NhanVien> listNV = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT manv,hoten,sdt,gioitinh,ngaysinh,trangthai,vaitro,matk FROM NhanVien\n"
                    + "WHERE hoten like '%" + hoten + "%'";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                 nv.setManv(rs.getString(1));
                  nv.setHoten(rs.getString(2));
                   nv.setSdt(rs.getString(3));
                    nv.setGioitinh(rs.getBoolean(4));
                     nv.setNgaysinh(rs.getDate(5));
                      nv.setTrangthai(rs.getBoolean(6));
                       nv.setVaitro(rs.getString(7));
                        nv.setMatk(rs.getString(8));
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
           public List<NhanVien> getAllNhanVienlam(Boolean trangthai) {
        List<NhanVien> listNV = new ArrayList<>();
        Connection conn = null;
        PreparedStatement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT manv,hoten,sdt,gioitinh,ngaysinh,trangthai,vaitro,matk FROM NhanVien\n"
                    + "WHERE trangthai = 1";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sSQL);
            rs = sttm.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                 nv.setManv(rs.getString(1));
                  nv.setHoten(rs.getString(2));
                   nv.setSdt(rs.getString(3));
                    nv.setGioitinh(rs.getBoolean(4));
                     nv.setNgaysinh(rs.getDate(5));
                      nv.setTrangthai(rs.getBoolean(6));
                       nv.setVaitro(rs.getString(7));
                        nv.setMatk(rs.getString(8));
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
public List<NhanVien> getAllNhanVienNghi(boolean trangthai) {
    List<NhanVien> listNV = new ArrayList<>();
    
    try (Connection conn = DBConnect.getConnection();
         PreparedStatement sttm = conn.prepareStatement("SELECT manv, hoten, sdt, gioitinh, ngaysinh, trangthai, vaitro, matk FROM NhanVien WHERE trangthai = ?")) {
        
        sttm.setBoolean(1, trangthai);
        try (ResultSet rs = sttm.executeQuery()) {
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setManv(rs.getString("manv"));
                nv.setHoten(rs.getString("hoten"));
                nv.setSdt(rs.getString("sdt"));
                nv.setGioitinh(rs.getBoolean("gioitinh"));
                nv.setNgaysinh(rs.getDate("ngaysinh"));
                nv.setTrangthai(rs.getBoolean("trangthai"));
                nv.setVaitro(rs.getString("vaitro"));
                nv.setMatk(rs.getString("matk"));
                listNV.add(nv);
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
        // Xử lý ngoại lệ tại đây nếu cần
    }
    return listNV;
}
}
