/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsetory;
import utility.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import model.Login_Model;
/**
 *
 * @author cuong
 */
public class Repo_Login {
     public Login_Model getDangnhap(String tentk, String mk) {
        try {
            Connection con = DBConnect.getConnection();
            String sql = ("""
                          select matk,tentk,matkhau,chucvu from taikhoan WHERE tentk =? AND matkhau=? """);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tentk);
            ps.setString(2, mk);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Login_Model lg = new Login_Model();
                lg.setMaTK(rs.getString("MaTK"));
                lg.setTenTK(rs.getString("TenTK"));
                lg.setMatKhau(rs.getString("MatKhau"));
                lg.setChucVu(rs.getBoolean("ChucVu"));
//                lg.setId_NV(rs.getInt("ID"));
//                lg.setManv(rs.getString("maNhanVien"));
//                lg.setMatkhau(rs.getString("matKhau"));
//                lg.setChucVu(rs.getInt("chucVu"));
                return lg;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }
    
//      public List<Login> Login_MK(String tentk, String matkhau){
//         List<Login> listlg = new ArrayList<>();
//         Connection conn = null;
//         Statement sttm = null;
//         ResultSet rs = null;
//         try {
//             String sql = "select matk,tentk,matkhau,chucvu from taikhoan WHERE tentk =? AND matkhau=? ";
//             conn = DBConnect.getConnection();
//             sttm = conn.createStatement();
//             rs = sttm.executeQuery(sql);
//             while(rs.next()){
//                
////                 NhanVien nv = new NhanVien();
////                 nv.setManv(rs.getString(1));
////                  nv.setHoten(rs.getString(2));
////                   nv.setSdt(rs.getString(3));
////                    nv.setGioitinh(rs.getBoolean(4));
////                     nv.setNgaysinh(rs.getDate(5));
////                      nv.setTrangthai(rs.getBoolean(6));
////                       nv.setVaitro(rs.getString(7));
////                        nv.setMatk(rs.getString(8));
//                      //  listNV.add(nv);
//                         
//             }
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         try {
//             rs.close();
//             sttm.close();
//             conn.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return listlg;
//     }

}
