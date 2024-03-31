/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import entity.PhieuGiamGia;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repository.KhuyenMaiKetNoi;

/**
 *
 * @author cuong
 */
public class JPVoucher extends javax.swing.JPanel {

    /**
     * Creates new form JPVoucher
     */
    KhuyenMaiKetNoi qlkm = new KhuyenMaiKetNoi();
    DefaultTableModel modelGG;
    SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");

    public JPVoucher() {
        initComponents();
        modelGG = (DefaultTableModel) tblPhieuGiamGia.getModel();
        loadData(qlkm.getALL());
    }

    void loadData(List<PhieuGiamGia> list) {
        modelGG.setRowCount(0);
        for (PhieuGiamGia p : list) {
            modelGG.addRow(new Object[]{
                p.getMa(),
                p.getTen(),
                p.getSoHoaDon(),
                p.getHinhThuc(),
                p.getMucGiamGia(),
                p.getNgayBatDau(),
                p.getNgayKetThuc(),
                p.getNgayTao(),
                p.getTt() ? "hoạt động" : "hết hạn"
            });
        }

    }

    PhieuGiamGia getform() {
        PhieuGiamGia pgg = new PhieuGiamGia();
        pgg.setMa(txtMaKM.getText());
        pgg.setHinhThuc(txtHinhThucGiamGia.getText());
        pgg.setTen(txtTenKM.getText());
        pgg.setNgayBatDau(txtNgayApDung.getText());
        pgg.setNgayKetThuc(txtNgayKetThuc.getText());
        pgg.setSoHoaDon(Integer.parseInt(txtSoLanDung.getText()));
        pgg.setMucGiamGia(Integer.parseInt(txtMucGiamGia.getText()));
        if (rdHH.isSelected()) {
            pgg.setTt(Boolean.FALSE);
        } else {
            pgg.setTt(Boolean.TRUE);
        }

        return pgg;
    }

    void setForm(PhieuGiamGia pgg) {
        txtTenKM.setText(pgg.getTen());
        txtMaKM.setText(pgg.getMa());
        txtHinhThucGiamGia.setText(pgg.getHinhThuc());
        txtSoLanDung.setText(pgg.getSoHoaDon() + "");
        txtMucGiamGia.setText(pgg.getMucGiamGia() + "");
        txtNgayApDung.setText(pgg.getNgayBatDau());
        txtNgayKetThuc.setText(pgg.getNgayKetThuc());
        if (pgg.getTt() == true) {
            rdHĐ.setSelected(true);
        } else {
            rdHH.setSelected(true);
        }
    }

    boolean validatePGG() {
        if (txtTenKM.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Tên phiếu không được bỏ trống.");
            return false;
        }
        if (txtMaKM.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Mã giảm giá không được bỏ trống.");
            return false;
        }
        if (txtHinhThucGiamGia.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập hình thức giảm giá.");
            return false;
        }
        if (txtSoLanDung.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số lần áp dụng.");
            return false;
        }
        try {
            Integer.valueOf(txtSoLanDung.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số lần áp dụng phải là số!");
            return false;
        }
        if (txtMucGiamGia.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập Mức giảm giá.");
            return false;
        }
        try {
            Integer.parseInt(txtMucGiamGia.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Mức giảm giá phải là số!");
            return false;
        }
        if (txtNgayApDung.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày bắt đầu.");
            return false;
        }
        try {
             format.setLenient(false);
            format.parse(txtNgayApDung.getText());
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày áp dụng không đúng định dạng Năm-Tháng-Ngày.");
            return false;
        }
        if (txtNgayKetThuc.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập ngày kết thúc.");
            return false;
        }
        try {
            format.setLenient(false);
            format.parse(txtNgayKetThuc.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ngày kết thúc dụng không đúng định dạng Năm-Tháng-Ngày.");
            return false;
        }
        return true;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieuGiamGia = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnTaoPhieuMoi = new javax.swing.JButton();
        txtMaKM = new javax.swing.JTextField();
        txtTenKM = new javax.swing.JTextField();
        txtSoLanDung = new javax.swing.JTextField();
        txtHinhThucGiamGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vai = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMucGiamGia = new javax.swing.JTextField();
        txtNgayApDung = new javax.swing.JTextField();
        txtNgayKetThuc = new javax.swing.JTextField();
        btnSuaPhieu = new javax.swing.JButton();
        btnXoaPhieu = new javax.swing.JButton();
        rdHĐ = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdHH = new javax.swing.JRadioButton();
        btnLamMoi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btntimKiem = new javax.swing.JButton();
        txtTimMaKM = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        tblPhieuGiamGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã giảm giá", "Tên phiếu", "Số lần áp dụng", "Hình thức", "Mức giảm", "Ngày bắt đầu", "Ngày kết thúc", "Ngày tạo ", "Trạng thái"
            }
        ));
        tblPhieuGiamGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuGiamGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhieuGiamGia);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnTaoPhieuMoi.setText("Tạo phiếu");
        btnTaoPhieuMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaoPhieuMoiMouseClicked(evt);
            }
        });

        jLabel6.setText("Hình thức");

        vai.setText("Số lần dùng");

        jLabel3.setText("Tên phiếu");

        jLabel1.setText("Mã giảm giá");

        jLabel7.setText("Mức giảm giá");

        jLabel8.setText("Ngày bắt đầu");

        jLabel9.setText("Ngày kết thúc");

        btnSuaPhieu.setText("Sửa phiếu");
        btnSuaPhieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSuaPhieuMouseClicked(evt);
            }
        });

        btnXoaPhieu.setText("Xóa phiếu");
        btnXoaPhieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaPhieuMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdHĐ);
        rdHĐ.setText("Hoạt động");

        jLabel4.setText("Trạng Thái");

        buttonGroup1.add(rdHH);
        rdHH.setText("Hết hạn");

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLamMoiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(vai)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHinhThucGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(34, 34, 34)
                                    .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtTenKM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSoLanDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNgayApDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtMucGiamGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdHĐ)
                                .addGap(41, 41, 41)
                                .addComponent(rdHH)))
                        .addGap(39, 39, 39))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnTaoPhieuMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSuaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXoaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txtMucGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(txtNgayApDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLanDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vai)
                    .addComponent(jLabel9)
                    .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHinhThucGiamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(rdHĐ)
                    .addComponent(jLabel4)
                    .addComponent(rdHH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTaoPhieuMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        btntimKiem.setText("Tìm phiếu");
        btntimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btntimKiemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btntimKiem)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntimKiem)
                    .addComponent(txtTimMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Phiếu Giảm Giá");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(529, 529, 529))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(256, 256, 256))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btntimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btntimKiemMouseClicked
        if (!validatePGG()) {
            return;
        } else {
            loadData(qlkm.timKiemGG(txtTimMaKM.getText()));
        }


    }//GEN-LAST:event_btntimKiemMouseClicked

    private void tblPhieuGiamGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuGiamGiaMouseClicked

        int row = tblPhieuGiamGia.getSelectedRow();
        setForm(qlkm.getRow(row));


    }//GEN-LAST:event_tblPhieuGiamGiaMouseClicked

    private void btnTaoPhieuMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaoPhieuMoiMouseClicked
        if (!validatePGG()) {
            return;
        } else {
             for (PhieuGiamGia p : qlkm.getALL()) {
            if (txtMaKM.getText().equals(p.getMa())) {
                JOptionPane.showMessageDialog(this, "Mã giảm giá này đã tồn tại!");
                return;
            }
        }
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm phiếu giảm giá này không ?", "Xác nhận", ConfirmationCallback.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                try {
                    qlkm.ADDPGG(getform());
                    JOptionPane.showMessageDialog(this, "thêm thành công");
                    loadData(qlkm.getALL());
                } catch (Exception e) {
                }
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }
        }


    }//GEN-LAST:event_btnTaoPhieuMoiMouseClicked

    private void btnSuaPhieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSuaPhieuMouseClicked
        
        if (!validatePGG()) {
            return;
        } else {
         int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn sửa phiếu giảm giá này không ?", "Xác nhận", ConfirmationCallback.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {try {
                qlkm.UPDATE(getform());
                JOptionPane.showMessageDialog(this, "Sửa thành công");
                loadData(qlkm.getALL());
            } catch (Exception e) {
            }}
            
        }


    }//GEN-LAST:event_btnSuaPhieuMouseClicked

    private void btnLamMoiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLamMoiMouseClicked
        txtTenKM.setText("");
        txtMaKM.setText("");
        txtHinhThucGiamGia.setText("");
        txtSoLanDung.setText("");
        txtMucGiamGia.setText("");
        txtNgayApDung.setText("");
        txtNgayKetThuc.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnLamMoiMouseClicked

    private void btnXoaPhieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaPhieuMouseClicked
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa phiếu này.", "xác nhận", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            int row = tblPhieuGiamGia.getSelectedRow();
            qlkm.deletePGG(qlkm.getRow(row).getMa());
            JOptionPane.showMessageDialog(this, qlkm.getRow(row).getTen() + " đã được xóa.");
            loadData(qlkm.getALL());
        } else {
            return;
        }

    }//GEN-LAST:event_btnXoaPhieuMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSuaPhieu;
    private javax.swing.JButton btnTaoPhieuMoi;
    private javax.swing.JButton btnXoaPhieu;
    private javax.swing.JButton btntimKiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdHH;
    private javax.swing.JRadioButton rdHĐ;
    private javax.swing.JTable tblPhieuGiamGia;
    private javax.swing.JTextField txtHinhThucGiamGia;
    private javax.swing.JTextField txtMaKM;
    private javax.swing.JTextField txtMucGiamGia;
    private javax.swing.JTextField txtNgayApDung;
    private javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtSoLanDung;
    private javax.swing.JTextField txtTenKM;
    private javax.swing.JTextField txtTimMaKM;
    private javax.swing.JLabel vai;
    // End of variables declaration//GEN-END:variables
}
