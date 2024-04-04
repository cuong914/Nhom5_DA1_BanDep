/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class ThongKeNam {
    private String nam;

    public ThongKeNam() {
    }

    public ThongKeNam(String nam) {
        this.nam = nam;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return nam;
    }
    
    
    
}
