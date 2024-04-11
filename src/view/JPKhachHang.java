/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.KhachHang;
import repository.Repo_KhachHang;
import service.KhachHangService;

/**
 *
 * @author cuong
 */
public class JPKhachHang extends javax.swing.JPanel {

    /**
     * Creates new form JPKhachHang
     */
    List<KhachHang> listKH = new ArrayList<>();
    KhachHangService serviceKH = new KhachHangService();
    Repo_KhachHang rp = new Repo_KhachHang();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private int index = -1;

    public JPKhachHang() {
        initComponents();
        listKH = serviceKH.getAllKhachHang();
        filltable(listKH);

    }

    public void filltable(List<KhachHang> list) {
        DefaultTableModel tblModel = new DefaultTableModel();
        String col[] = {"MaKH", "Họ tên", "SDT", "Địa chỉ ", "Trạng thái"};
        tblModel.setColumnIdentifiers(col);
        tblModel.setRowCount(0);
        for (KhachHang kh : list) {
            String gt = "";
            if (kh.getTrangthai() == false) {
                gt = "M";
            } else {
                gt = "H";
            }

            tblModel.addRow(new Object[]{kh.getMakh(), kh.getHoten(), kh.getSdt(), kh.getDiachi(), gt,});
        }
        tblkhachhang.setModel(tblModel);
    }

    public KhachHang getKhachHang() throws ParseException {
        if (txtmakh.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "không được để trống mã khach hàng");
            return null;
        }
        int check = 0;
        if (txtmakh.isEnabled()) {
            for (KhachHang kh : listKH) {
                if (kh.getMakh().equalsIgnoreCase(txtmakh.getText())) {
                    check++;
                    break;
                }
            }
        }
        if (check > 0) {
            JOptionPane.showMessageDialog(this, "ma nhan vien nay da ton tai moi nhap ma khac");
            return null;

        }
        if (txthoten.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "ho ten khong duoc de trong");
            return null;
        }
        if (txtsdt.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "sdt khong duoc de trong");
            return null;
        }
//        if(txtmatk.ge)
        KhachHang kh = new KhachHang();
        String ma = txtmakh.getText();
        String ten = txthoten.getText();
        String sdt = txtsdt.getText();
        String diachi = txtdiachi.getText();

        Boolean trangthai = rbth.isSelected() ? true : false;

//return new KhachHang(ma, ten, sdt, diachi, trangthai) ;
        return new KhachHang(ma, ten, sdt, diachi, trangthai);

    }

    public KhachHang getKhachHang1() throws ParseException {
        if (txtmakh.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "không được để trống mã khach hàng");
            return null;
        }
        int check = 0;
//        if (txtmakh.isEnabled()) {
//            for (KhachHang kh : listKH) {
//                if (kh.getMakh().equalsIgnoreCase(txtmakh.getText())) {
//                    check++;
//                    break;
//                }
//            }
//        }
        if (check > 0) {
            JOptionPane.showMessageDialog(this, "ma nhan vien nay da ton tai moi nhap ma khac");
            return null;

        }
        if (txthoten.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "ho ten khong duoc de trong");
            return null;
        }
        if (txtsdt.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "sdt khong duoc de trong");
            return null;
        }
//        if(txtmatk.ge)
        KhachHang kh = new KhachHang();
        String ma = txtmakh.getText();
        String ten = txthoten.getText();
        String sdt = txtsdt.getText();
        String diachi = txtdiachi.getText();

        Boolean trangthai = rbth.isSelected() ? true : false;

//return new KhachHang(ma, ten, sdt, diachi, trangthai) ;
        return new KhachHang(ma, ten, sdt, diachi, trangthai);

    }

    public void filltoform(int index) {
        KhachHang kh = listKH.get(index);
        txtmakh.setText(kh.getMakh());
        txthoten.setText(kh.getHoten());
        txtsdt.setText(kh.getSdt());
        String tt = "";
//        if (kh.getTrangthai()== true) {
//    rbtlam.setText("Đang đi làm");
//} else {
//    rbtnghi.setText("Đã nghỉ ");
//}
//        
        if (kh.getTrangthai() == false) {
            rbtm.setSelected(true);
        } else {
            rbth.setSelected(true);
        }
        txtdiachi.setText(kh.getDiachi());
//        Date ngaySinh = nv.getNgaysinh();
//        String ngaySinhString = dateFormat.format(ngaySinh);
//        txtngaysinh.setText(ngaySinhString);
//        txtvaitro.setText(nv.getVaitro());
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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtmakh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsdt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtdiachi = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rbtm = new javax.swing.JRadioButton();
        rbth = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkhachhang = new javax.swing.JTable();
        txttimkiem = new javax.swing.JTextField();
        cbchuyende = new javax.swing.JComboBox<>();

        jLabel1.setText("HoTen");

        jLabel2.setText("Ma KH");

        txtsdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsdtActionPerformed(evt);
            }
        });

        jLabel3.setText("Dia Chi");

        jLabel4.setText("SDT");

        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });

        jButton2.setText("Thêm ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Chỉnh sửa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Trạng thái");

        buttonGroup1.add(rbtm);
        rbtm.setText("M");

        buttonGroup1.add(rbth);
        rbth.setText("H");

        jButton1.setText("Kiểm tra");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmakh, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtm, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(rbth, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(196, 196, 196)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jButton2))
                .addGap(174, 174, 174))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtmakh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(44, 44, 44)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel4)
                    .addComponent(txtsdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbtm)
                            .addComponent(rbth)
                            .addComponent(jButton4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton1)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        tblkhachhang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkhachhangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkhachhang);

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

        cbchuyende.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "makh", "hoten", "sdt", " " }));
        cbchuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbchuyendeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(cbchuyende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbchuyende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Thông tin khách hàng ");
    }// </editor-fold>//GEN-END:initComponents

    private void txtsdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsdtActionPerformed

    private void txtdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachiActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có xóa khach hàng  không?", "Xác nhận yêu cầu", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            int vt = -1;
            vt = tblkhachhang.getSelectedRow();
            if (vt < 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải chọn khách hàng muốn xóa");
                return;
            } else {

                String manv = txtmakh.getText();

                JOptionPane.showMessageDialog(this, rp.XoaKhachHang(manv));
                // JOptionPane.showMessageDialog(this, "xóa thành công ");
//                listKH =  serviceKH.getAllKhachHang();
                filltable(listKH);
            }
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn cập nhật khách hàng không?", "Xác nhận yêu cầu", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            int vt = -1;
            vt = tblkhachhang.getSelectedRow();
            if (vt < 0) {
                JOptionPane.showMessageDialog(this, "Bạn phải chọn dòng muốn sửa");
                return;
            } else {
                try {
                    KhachHang kh = getKhachHang1();
                    if (kh == null) {
                        JOptionPane.showMessageDialog(this, "Mời bạn thử lại");
                        return;
                    } else {
                        JOptionPane.showMessageDialog(this, serviceKH.UpdateKhachHang(kh));
                        listKH = serviceKH.getAllKhachHang();
                        filltable(listKH);
                    }
                } catch (ParseException ex) {

                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int choice = JOptionPane.showConfirmDialog(this, "bạn có muốn thêm khách hàng không ? ", "xác nhận yêu cầu", JOptionPane.YES_NO_CANCEL_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            KhachHang kh = null;

            try {
                kh = getKhachHang();
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(JPKhachHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            if (kh == null) {
                JOptionPane.showMessageDialog(this, "mời bạn nhập lại");
                return;
            } else {
                JOptionPane.showMessageDialog(this, serviceKH.InsertKhachHang(kh));
                listKH = serviceKH.getAllKhachHang();
                filltable(listKH);
            }
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void tblkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkhachhangMouseClicked
        // TODO add your handling code here:
        int vt = tblkhachhang.getSelectedRow();
        filltoform(vt);

    }//GEN-LAST:event_tblkhachhangMouseClicked

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txttimkiemActionPerformed

    private void txttimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttimkiemKeyReleased
        // TODO add your handling code here:
        int a = cbchuyende.getSelectedIndex();
        String timKiem = txttimkiem.getText();
        if (a == 0) {
            listKH = serviceKH.getAllNhanVienTKTheoManv(timKiem);
            filltable(listKH);
        } else if (a == 1) {
            listKH = serviceKH.getAllNhanVienTKTheoHoTen(timKiem);
            filltable(listKH);
        } else {
            listKH = serviceKH.getAllNhanVienTKTheoSDT(timKiem);
            filltable(listKH);
        }

    }//GEN-LAST:event_txttimkiemKeyReleased

    private void cbchuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbchuyendeActionPerformed
        // TODO add your handling code here:
        int a = cbchuyende.getSelectedIndex();
        String timKiem = txttimkiem.getText();
        if (a == 0) {
            listKH = serviceKH.getAllNhanVienTKTheoManv(timKiem);
            filltable(listKH);
        } else if (a == 1) {
            listKH = serviceKH.getAllNhanVienTKTheoHoTen(timKiem);
            filltable(listKH);
        } else {
            listKH = serviceKH.getAllNhanVienTKTheoSDT(timKiem);
            filltable(listKH);
        }
    }//GEN-LAST:event_cbchuyendeActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String sdt = txtsdt.getText();
        for (KhachHang kh : serviceKH.getAllKhachHang()) {
            if (txtsdt.getText().equals(kh.getSdt())) {
                txtmakh.setText(kh.getMakh());
                txthoten.setText(kh.getHoten());
                txtdiachi.setText(kh.getDiachi());
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Khách hàng chưa tồn tại");
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPKhachHang spview = new JPKhachHang();
        jf.add(spview);
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbchuyende;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbth;
    private javax.swing.JRadioButton rbtm;
    private javax.swing.JTable tblkhachhang;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmakh;
    private javax.swing.JTextField txtsdt;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
