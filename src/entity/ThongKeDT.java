package entity;

public class ThongKeDT {

    private int thang, soHoaDon, soSanPham;
    private float giaBan, giaGiam, doanhThu;

    public ThongKeDT() {
    }

    public ThongKeDT(int thang, int soHoaDon, int soSanPham, float giaBan, float giaGiam, float doanhThu) {
        this.thang = thang;
        this.soHoaDon = soHoaDon;
        this.soSanPham = soSanPham;
        this.giaBan = giaBan;
        this.giaGiam = giaGiam;
        this.doanhThu = doanhThu;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public float getGiaGiam() {
        return giaGiam;
    }

    public void setGiaGiam(float giaGiam) {
        this.giaGiam = giaGiam;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }

}
