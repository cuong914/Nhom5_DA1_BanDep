/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;
import org.apache.poi.ss.formula.atp.DateParser;
import responsetory.Repo_NhanVien;
import service.NhanVienService;

/**
 *
 * @author cuong
 */
public class JPNhanVien extends javax.swing.JPanel {

    List<NhanVien> listNV = new ArrayList<>();
    NhanVienService serviceNV = new NhanVienService();
    Repo_NhanVien rp = new Repo_NhanVien();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private int index = -1;
    /**
     * Creates new form JPNhanVien
     */
    public JPNhanVien() {
        initComponents();
        //setLocationRelativeTo(null);
        listNV = serviceNV.getAllNhanVien();
        filltable(listNV);
//        btnthem.setBorder(BorderFactory.createLineBorder(Color.RED));
//         btnthem.setBackground(Color.BLUE);
    }

    public void filltable(List<NhanVien> list) {
        DefaultTableModel tblModel = new DefaultTableModel();
        String col[] = {"MãNV", "Họ tên", "SDT", "Giới tính ", "Ngày sinh", "Trạng thái", "Vai trò", "Mãtk"};
        tblModel.setColumnIdentifiers(col);
        tblModel.setRowCount(0);
        for (NhanVien nv : list) {
            String gt = "";
            if (nv.getGioitinh() == false) {
                gt = "Nữ";
            } else {
                gt = "Nam";
            }
            String tt = "";
            if (nv.getTrangthai()== false) {
                tt = "Đã nghỉ";
            } else {
                tt = "Đang đi làm";
            }
            tblModel.addRow(new Object[]{nv.getManv(), nv.getHoten(), nv.getSdt(), gt, nv.getNgaysinh(), tt, nv.getVaitro(), nv.getMatk()});
        }
        tblnhanvien.setModel(tblModel);
    }

    public void filltoform(int index) {
        NhanVien nv = listNV.get(index);
        txtmanv.setText(nv.getManv());
        txthoten.setText(nv.getHoten());
        txtsdt.setText(nv.getSdt());
        String tt = "";
        if (nv.getTrangthai()== true) {
    rbtlam.setText("Đang đi làm");
} else {
    rbtnghi.setText("Đã nghỉ ");
}
        
        if (nv.getGioitinh() == false) {
            rbtnu.setSelected(true);
        } else {
            rbtnam.setSelected(true);
        }
        txtmatk.setText(nv.getMatk());
        Date ngaySinh = nv.getNgaysinh();
        String ngaySinhString = dateFormat.format(ngaySinh);
        txtngaysinh.setText(ngaySinhString);
        txtvaitro.setText(nv.getVaitro());
    }
    public void clear(){
        txtmanv.setText("");
        txthoten.setText("");
        txtmatk.setText("");
        txtngaysinh.setText("");
        txtsdt.setText("");
        txtvaitro.setText("");
       // txttrangthai.setText("");
        buttonGroup1.clearSelection();
    }
      public NhanVien getNhanVien1() throws ParseException{
        if(txtmanv.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "không được để trống mã nhân viên");
            return null;
        }
        int check = 0;
//        if(txtmanv.isEnabled()){
//            for(NhanVien nv : listNV){
//                if(nv.getManv().equalsIgnoreCase(txtmanv.getText())){
//                    check ++;
//                    break;
//                }
//            }
//        }
        if(check > 0){
            JOptionPane.showMessageDialog(this, "ma nhan vien nay da ton tai moi nhap ma khac");
            return null;
            
        }if(txthoten.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "ho ten khong duoc de trong");
            return null;
        }if(txtsdt.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "sdt khong duoc de trong");
            return null;
        }if(txtvaitro.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "vai tro khong duoc de trong");
            return null;
        }
//        if(txtmatk.ge)
NhanVien nv = new NhanVien();
 String ma = txtmanv.getText();
        String ten = txthoten.getText();
        String sdt = txtsdt.getText();
        String matk = txtmatk.getText();
        Boolean gioiTinh = rbtnam.isSelected() ? true : false;
         Boolean trangthai = rbtlam.isSelected() ? true : false;
         Date ngaysinh = dateFormat.parse(txtngaysinh.getText());
         String vaitro = txtvaitro.getText();
return new NhanVien(ma, ten, sdt, gioiTinh, ngaysinh, trangthai, vaitro, matk) ;

    }
    public NhanVien getNhanVien() throws ParseException{
        if(txtmanv.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "không được để trống mã nhân viên");
            return null;
        }
        int check = 0;
        if(txtmanv.isEnabled()){
            for(NhanVien nv : listNV){
                if(nv.getManv().equalsIgnoreCase(txtmanv.getText())){
                    check ++;
                    break;
                }
            }
        }
        if(check > 0){
            JOptionPane.showMessageDialog(this, "ma nhan vien nay da ton tai moi nhap ma khac");
            return null;
            
        }if(txthoten.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "ho ten khong duoc de trong");
            return null;
        }if(txtsdt.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "sdt khong duoc de trong");
            return null;
        }if(txtvaitro.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "vai tro khong duoc de trong");
            return null;
        }
//        if(txtmatk.ge)
NhanVien nv = new NhanVien();
 String ma = txtmanv.getText();
        String ten = txthoten.getText();
        String sdt = txtsdt.getText();
        String matk = txtmatk.getText();
        Boolean gioiTinh = rbtnam.isSelected() ? true : false;
         Boolean trangthai = rbtlam.isSelected() ? true : false;
         Date ngaysinh = dateFormat.parse(txtngaysinh.getText());
         String vaitro = txtvaitro.getText();
return new NhanVien(ma, ten, sdt, gioiTinh, ngaysinh, trangthai, vaitro, matk) ;

    }
    public NhanVien readForm() throws ParseException {
        String ma = txtmanv.getText();
        String ten = txthoten.getText();
        String sdt = txtsdt.getText();
        String matk = txtmatk.getText();
        Boolean gioiTinh = rbtnam.isSelected() ? true : false;
         Boolean trangthai = rbtlam.isSelected() ? true : false;
         Date ngaysinh = dateFormat.parse(txtngaysinh.getText());
         // Date ngayvaolam = dateFormat.parse(.getText());
         String vaitro = txtvaitro.getText();
      
      

        return new NhanVien(ma, ten, sdt, gioiTinh,ngaysinh,trangthai,vaitro, matk);
    }
    public void lam(){
         listNV = serviceNV.getAllNhanVienTKTheoNghi(Boolean.TRUE);
                filltable(listNV);
    }
        public void nghi(){
         listNV = serviceNV.getAllNhanVienTKTheoNghi(Boolean.FALSE);
                filltable(listNV);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtsdt = new javax.swing.JTextField();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        txthoten = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbtnam = new javax.swing.JRadioButton();
        rbtnu = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtvaitro = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtmatk = new javax.swing.JTextField();
        txtmanv = new javax.swing.JTextField();
        rbtlam = new javax.swing.JRadioButton();
        rbtnghi = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblnhanvien = new javax.swing.JTable();
        txttimkiem = new javax.swing.JTextField();
        rbttat = new javax.swing.JRadioButton();
        rbtcbnghi = new javax.swing.JRadioButton();
        rbtcblam = new javax.swing.JRadioButton();
        cbtimkiem = new javax.swing.JComboBox<>();

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtsdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsdtActionPerformed(evt);
            }
        });

        btnsua.setText("Chỉnh sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        txthoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthotenActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã Nhân Viên :");

        jLabel2.setText("Họ Tên ");

        jLabel4.setText("Form nhân viên");

        buttonGroup1.add(rbtnam);
        rbtnam.setText("Nam");

        buttonGroup1.add(rbtnu);
        rbtnu.setText("Nữ");
        rbtnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnuActionPerformed(evt);
            }
        });

        jLabel6.setText("Số Điện  Thoại");

        jLabel7.setText("Ngày Sinh");

        jLabel8.setText("Mã Tài Khoản");

        jLabel9.setText("Vai Trò");

        jLabel10.setText("Trạng Thái");

        txtvaitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvaitroActionPerformed(evt);
            }
        });

        txtngaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaysinhActionPerformed(evt);
            }
        });

        txtmatk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmatkActionPerformed(evt);
            }
        });

        txtmanv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmanvActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbtlam);
        rbtlam.setText("Đang đi làm");

        buttonGroup2.add(rbtnghi);
        rbtnghi.setText("Đã nghỉ");

        jLabel11.setText("Giới Tính");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9))))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txthoten, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnam)
                        .addGap(31, 31, 31)
                        .addComponent(rbtnu))
                    .addComponent(txtmanv, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                    .addComponent(txtvaitro))
                .addGap(132, 132, 132)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmatk, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(191, 191, 191))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(rbtlam)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnghi)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(70, 70, 70)
                    .addComponent(jLabel11)
                    .addContainerGap(1089, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmanv, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtnam)
                                    .addComponent(rbtnu))
                                .addGap(77, 77, 77)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel8)
                                            .addComponent(txtmatk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbtlam)
                                    .addComponent(jLabel10)
                                    .addComponent(rbtnghi)
                                    .addComponent(txtvaitro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 260, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(206, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(173, 173, 173)))
        );

        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));

        tblnhanvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblnhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblnhanvien);

        txttimkiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txttimkiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttimkiemFocusLost(evt);
            }
        });
        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });
        txttimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttimkiemKeyReleased(evt);
            }
        });

        buttonGroup3.add(rbttat);
        rbttat.setText("tất cả ");
        rbttat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbttatActionPerformed(evt);
            }
        });

        buttonGroup3.add(rbtcbnghi);
        rbtcbnghi.setText("đã nghỉ");
        rbtcbnghi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtcbnghiActionPerformed(evt);
            }
        });

        buttonGroup3.add(rbtcblam);
        rbtcblam.setText("đang đi làm");
        rbtcblam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtcblamActionPerformed(evt);
            }
        });

        cbtimkiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HoTen", "SDT", "Manv", " " }));
        cbtimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1193, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(cbtimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbttat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtcblam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtcbnghi)
                .addGap(186, 186, 186))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbtimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbttat)
                            .addComponent(rbtcbnghi)
                            .addComponent(rbtcblam))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtsdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsdtActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
       
            
        int choice = JOptionPane.showConfirmDialog(this, "bạn có muốn thêm nhân viên không ? ", "xác nhận yêu cầu",JOptionPane.YES_NO_CANCEL_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            NhanVien nv = null;
            try {
                nv = getNhanVien();
            } catch (ParseException ex) {
                Logger.getLogger(JPNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            }
       
            if(nv == null){
                JOptionPane.showMessageDialog(this, "mời bạn nhập lại");
                return;
            }else{
                JOptionPane.showMessageDialog(this, serviceNV.InsertNhanVien(nv));
                listNV = serviceNV.getAllNhanVien();
                filltable(listNV);
            }
        }
    
    }//GEN-LAST:event_btnthemActionPerformed

    private void txthotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthotenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthotenActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
        int a = cbtimkiem.getSelectedIndex();
        String timKiem = txttimkiem.getText();
        if (a == 0) {
            listNV = serviceNV.getAllNhanVienTKTheoTen(timKiem);
            filltable(listNV);
        } else if (a == 1) {
            listNV = serviceNV.getAllNhanVienTKTheoSDT(timKiem);
            filltable(listNV);
        } else {
            listNV = serviceNV.getAllNhanVienTKTheoManv(timKiem);
            filltable(listNV);
        }
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void txtvaitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvaitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvaitroActionPerformed

    private void txtngaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaysinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaysinhActionPerformed

    private void txtmatkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmatkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmatkActionPerformed

    private void txtmanvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmanvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmanvActionPerformed

    private void tblnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblnhanvienMouseClicked
        // TODO add your handling code here:
        int vt = tblnhanvien.getSelectedRow();
        filltoform(vt);
    }//GEN-LAST:event_tblnhanvienMouseClicked

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
 
         int choice = JOptionPane.showConfirmDialog(this, "Bạn có xóa nhân viên không?", "Xác nhận yêu cầu", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            int vt = -1;
            vt = tblnhanvien.getSelectedRow();
            if (vt < 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải chọn nhân viên muốn xóa");
                return;
            } else {
              
                String manv = txtmanv.getText();
              
                JOptionPane.showMessageDialog(this, rp.XoaNhanVien( manv));
               // JOptionPane.showMessageDialog(this, "xóa thành công ");
                listNV = serviceNV.getAllNhanVien();
                filltable(listNV);
            }
        }

    }//GEN-LAST:event_btnxoaActionPerformed

    private void rbtnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnuActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
          int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật nhân viên không?", "Xác nhận yêu cầu", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            int vt = -1;
            vt = tblnhanvien.getSelectedRow();
            if (vt < 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải chọn dòng muốn sửa");
                return;
            } else {
                try {
                    NhanVien nv = getNhanVien1();
                    if (nv == null) {
                        JOptionPane.showMessageDialog(this, "Mời bạn thử lại");
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this, serviceNV.UpdateNhanVien(nv));
                        listNV = serviceNV.getAllNhanVien();
                        filltable(listNV);
                    }
                } catch (ParseException ex) {
                    Logger.getLogger(JPNhanVien.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void txttimkiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttimkiemFocusGained
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttimkiemFocusGained

    private void txttimkiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttimkiemFocusLost
        // TODO add your handling code here:
         
    }//GEN-LAST:event_txttimkiemFocusLost

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txttimkiemKeyReleased

    private void cbtimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtimkiemActionPerformed
        // TODO add your handling code here:
         int a = cbtimkiem.getSelectedIndex();
        String timKiem = txttimkiem.getText();
        if (a == 0) {
            listNV = serviceNV.getAllNhanVienTKTheoTen(timKiem);
            filltable(listNV);
        } else if (a == 1) {
            listNV = serviceNV.getAllNhanVienTKTheoSDT(timKiem);
            filltable(listNV);
        } else {
            listNV = serviceNV.getAllNhanVienTKTheoManv(timKiem);
            filltable(listNV);
        }
    }//GEN-LAST:event_cbtimkiemActionPerformed

    private void rbttatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbttatActionPerformed
        // TODO add your handling code here:
        listNV = serviceNV.getAllNhanVien();
            filltable(listNV);
       
    }//GEN-LAST:event_rbttatActionPerformed

    private void rbtcblamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtcblamActionPerformed
        // TODO add your handling code here:
        this.lam();
       
    }//GEN-LAST:event_rbtcblamActionPerformed

    private void rbtcbnghiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtcbnghiActionPerformed
        // TODO add your handling code here:
        this.nghi();
    }//GEN-LAST:event_rbtcbnghiActionPerformed
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPNhanVien spview = new JPNhanVien();
        jf.add(spview);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbtimkiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbtcblam;
    private javax.swing.JRadioButton rbtcbnghi;
    private javax.swing.JRadioButton rbtlam;
    private javax.swing.JRadioButton rbtnam;
    private javax.swing.JRadioButton rbtnghi;
    private javax.swing.JRadioButton rbtnu;
    private javax.swing.JRadioButton rbttat;
    private javax.swing.JTable tblnhanvien;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmanv;
    private javax.swing.JTextField txtmatk;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttimkiem;
    private javax.swing.JTextField txtvaitro;
    // End of variables declaration//GEN-END:variables
}
