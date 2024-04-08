
package service;

import java.util.Date;
import repository.Repo_HoaDon;


public class ThongKeService {
    Repo_HoaDon thongKeRepo = new Repo_HoaDon();
     public double getDoanhThuTheoNgay(Date ngatTT) {
        return thongKeRepo.getDoanhThuTheoNgay(ngatTT);
    }

    public int getSoLuongSPBanTheoNgay(Date ngayTT) {
        return thongKeRepo.getSoLuongSPBanTheoNgay(ngayTT);
    }

    public double getDoanhThuTheoThang(int thang) {
        return thongKeRepo.getDoanhThuTheoThang(thang);
    }
    
    public int getSoLuongSPBanTheoThang(int thang) {
        return thongKeRepo.getSoLuongSPBanTheoThang(thang);
    }

}
