/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author cuong
 */
public class Login_Model {
    private String MaTK;
     private String TenTK;
      private String MatKhau;
      private Boolean ChucVu;

    public Login_Model() {
    }

    public Login_Model(String MaTK, String TenTK, String MatKhau, Boolean ChucVu) {
        this.MaTK = MaTK;
        this.TenTK = TenTK;
        this.MatKhau = MatKhau;
        this.ChucVu = ChucVu;
    }

    public String getMaTK() {
        return MaTK;
    }

    public void setMaTK(String MaTK) {
        this.MaTK = MaTK;
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public Boolean getChucVu() {
        return ChucVu;
    }

    public void setChucVu(Boolean ChucVu) {
        this.ChucVu = ChucVu;
    }
      
    
}
