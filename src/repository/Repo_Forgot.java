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
       public int updatepass(Forgot_MK fgp) {
        try {
            Connection con = DBConnect.getConnection();
            String up = "UPDATE taikhoan SET MATKHAU = ? WHERE tentk = ?  ";
            PreparedStatement ps = con.prepareStatement(up);
            ps.setString(2, fgp.getTentk());
            ps.setString(1, fgp.getMatkhau());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
        public boolean getuser(Forgot_MK fgp) {
        try {
            Connection con = DBConnect.getConnection();
            String get = "SELECT MANhanVien FROM tbl_nhanvien WHERE MANhanvien = ?";
            PreparedStatement ps = con.prepareStatement(get);
            ps.setString(1, fgp.getTentk());
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
