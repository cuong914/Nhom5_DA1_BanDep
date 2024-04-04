/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package responsetory;

import model.Forgot_MK;
import java.sql.*;
import java.util.ArrayList;

import utility.DBConnect;

/**
 *
 * @author cuong
 */
public class Repo_Forgot {
      public int UpdateMatKhauTheoEmail(String matKhau, String email) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            String sSQL = "UPDATE TaiKhoan SET MatKhau=?\n"
                    + "WHERE tentk=?";
            conn = DBConnect.getConnection();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, matKhau);
            sttm.setString(2, email);
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
//        public boolean getuser(Forgot_MK fgp) {
//        try {
//            Connection con = DBConnect.getConnection();
//            String get = "SELECT MANhanVien FROM tbl_nhanvien WHERE MANhanvien = ?";
//            PreparedStatement ps = con.prepareStatement(get);
//            ps.setString(1, fgp.getTentk());
//            ResultSet rs = ps.executeQuery();
//            return rs.next();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//    }

}
