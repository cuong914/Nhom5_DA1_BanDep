package entity;

public class ThongKeSP {

    private String maSP, tenSP, xuatXu, thuonHieu, mau, chatLieu;
    private int soLuong, size;

    public ThongKeSP() {
    }

    public ThongKeSP(String maSP, String tenSP, String xuatXu, String thuonHieu, String mau, String chatLieu, int soLuong, int size) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.xuatXu = xuatXu;
        this.thuonHieu = thuonHieu;
        this.mau = mau;
        this.chatLieu = chatLieu;
        this.soLuong = soLuong;
        this.size = size;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getThuonHieu() {
        return thuonHieu;
    }

    public void setThuonHieu(String thuonHieu) {
        this.thuonHieu = thuonHieu;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    
}
