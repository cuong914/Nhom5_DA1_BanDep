package entity;

public class ThongKe {

    private float doanhThuDay, doanhThuMonth, doanhThuYear;
    private int tongHoaDon,thang,nam;

    public ThongKe() {
    }

    public float getDoanhThuDay() {
        return doanhThuDay;
    }

    public void setDoanhThuDay(float doanhThuDay) {
        this.doanhThuDay = doanhThuDay;
    }

    public float getDoanhThuMonth() {
        return doanhThuMonth;
    }

    public void setDoanhThuMonth(float doanhThuMonth) {
        this.doanhThuMonth = doanhThuMonth;
    }

    public float getDoanhThuYear() {
        return doanhThuYear;
    }

    public void setDoanhThuYear(float doanhThuYear) {
        this.doanhThuYear = doanhThuYear;
    }

    public int getTongHoaDon() {
        return tongHoaDon;
    }

    public void setTongHoaDon(int tongHoaDon) {
        this.tongHoaDon = tongHoaDon;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public ThongKe(float doanhThuDay, float doanhThuMonth, float doanhThuYear, int tongHoaDon, int thang, int nam) {
        this.doanhThuDay = doanhThuDay;
        this.doanhThuMonth = doanhThuMonth;
        this.doanhThuYear = doanhThuYear;
        this.tongHoaDon = tongHoaDon;
        this.thang = thang;
        this.nam = nam;
    }

    
}
