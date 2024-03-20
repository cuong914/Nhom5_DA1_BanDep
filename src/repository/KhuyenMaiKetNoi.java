
package repository;
import entity.PhieuGiamGia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import utility.DBConnect;
public class KhuyenMaiKetNoi {
    List<PhieuGiamGia> listGG = new ArrayList<>();
    public List<PhieuGiamGia> getALL(){
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
                p.setMucGiamGia(rs.getFloat(5));
                p.setNgayBatDau(rs.getDate(6));
                p.setNgayKetThuc(rs.getDate(7));
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
}
