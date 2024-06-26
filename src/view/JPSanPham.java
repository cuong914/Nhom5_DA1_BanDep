/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import entity.SanPham;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.QuanlySanPham;

/**
 *
 * @author cuong
 */
public class JPSanPham extends javax.swing.JPanel {

    /**
     * Creates new form JPSanPham
     */
    DefaultTableModel defaultTableModel;
    QuanlySanPham ql = new QuanlySanPham();

    public JPSanPham() {
        initComponents();
        ArrayList<SanPham> list = ql.getlist();
        loadSp(list);
    }

    void loadSp(ArrayList<SanPham> list) {
        defaultTableModel = (DefaultTableModel) tblSP.getModel();
        defaultTableModel.setRowCount(0);
        for (SanPham sp : list) {
            defaultTableModel.addRow(new Object[]{
                sp.getMaSP(), sp.getMaTH(), sp.getMaMAU(), sp.getMaSIZE(), sp.getMaCl(), sp.getMaKD(),
                sp.getTenSP(), sp.getSl(), sp.getDongia(), sp.getNgaytao(), sp.getXuatXu(), sp.tt(sp.getTt())
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        btnTim = new javax.swing.JButton();
        txtTim = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSIZE = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMASP1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMaTH = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtMau = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKIeu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSL = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtXX = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cboTT = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnCN = new javax.swing.JButton();

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Mã Thương hiệu", "Mã Màu", "Mã SIZE", "Ma Chất Liệu", "Mã Kiểu", "Tên SP", "So lượng", "Đơn giá", "Ngày tạo", "Xuất Xứ", "Trạng Thái"
            }
        ));
        tblSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSP);

        btnTim.setText("Tìm");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        txtTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý  Sản Phẩm");

        jLabel2.setText("MÃ SP");

        jLabel3.setText("MÃ TH");

        jLabel4.setText("MÃ Màu");

        jLabel5.setText("MÃ SIZE");

        jLabel6.setText("MÃ CL");

        jLabel7.setText("Mã kiểu");

        jLabel8.setText("Tên SP");

        jLabel9.setText("Số Lượng");

        jLabel10.setText("Đơn giá");

        jLabel11.setText("Xuất Xứ");

        jLabel12.setText("Trạng Thái");

        cboTT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Con Hang", "Het Hang" }));

        btnAdd.setText("Thêm");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnCN.setText("Cập Nhật");
        btnCN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCNMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCNMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(464, 464, 464)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(31, 31, 31)
                                .addComponent(btnCN)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnTim))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 938, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(txtMASP1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSIZE, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKIeu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaTH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(326, 326, 326)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtXX, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(cboTT, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMASP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaTH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtSIZE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtXX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cboTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKIeu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim)
                    .addComponent(btnAdd)
                    .addComponent(btnXoa)
                    .addComponent(btnCN))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        String masp = txtTim.getText();
        ArrayList<SanPham> tim = ql.tim(masp);
        if (tim.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Sản Phẩm không tồn tại");
            return;
        }
        loadSp(tim);
    }//GEN-LAST:event_btnTimMouseClicked

    private void txtTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        String masp = txtMASP1.getText();
        String ten = txtTen.getText();

// Kiểm tra tên và mã sản phẩm không được trùng
        for (SanPham sp : ql.getlist()) {
            if (masp.equals(sp.getMaSP()) || ten.equals(sp.getTenSP())) {
                JOptionPane.showMessageDialog(this, "Tên và Mã sản phẩm không được trùng");
                return;
            }
        }

        String math = txtMaTH.getText();
        String mamau = txtMau.getText();
        String masize = txtSIZE.getText();
        String macl = txtCL.getText();
        String makd = txtKIeu.getText();
        String xx = txtXX.getText();
        Integer tt = 0;
        if (cboTT.equals("Con Hang")) {
            tt = 1;
        } else {
            tt = 0;
        }
// Kiểm tra số lượng và giá là số và lớn hơn 0
        Integer sl;
        Float gia;
        if (masp.equals("") || math.equals("") || mamau.equals("") || masize.equals("") || macl.equals("") || makd.equals("") || ten.equals("") || xx.equals("")) {
            JOptionPane.showMessageDialog(this, "Tất cả các thông tin phải điền đầy đủ");
            return;
        }
        try {
            sl = Integer.parseInt(txtSL.getText());
            gia = Float.parseFloat(txtGia.getText());
            if (sl <= 0 || gia <= 0) {
                JOptionPane.showMessageDialog(this, "Số lượng và giá phải lớn hơn 0");
                return;

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Số lượng và giá phải là số");
            return;
        }
        if (sl.equals("") || gia.equals("")) {
            JOptionPane.showMessageDialog(this, "Số lượng và giá không được để trống");
            return;
        }

        SanPham sp = new SanPham(masp, math, mamau, masize, macl, makd, ten, sl, gia, xx, tt);
        String add = ql.add(sp);
        JOptionPane.showMessageDialog(this, add);
        loadSp(ql.getlist());


    }//GEN-LAST:event_btnAddMouseClicked

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        String masp = txtMASP1.getText();
        int confirmResult = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa sản phẩm này?", "Xác nhận Xóa", JOptionPane.YES_NO_OPTION);

        if (confirmResult == JOptionPane.YES_OPTION) {
            // Nếu người dùng chọn YES
            String xoa = ql.xoa(masp);
            JOptionPane.showMessageDialog(this, xoa);
            // Gọi phương thức load lại danh sách sản phẩm sau khi xóa
            loadSp(ql.getlist());
        } else {
            // Nếu người dùng chọn NO hoặc đóng cửa sổ xác nhận
            // Không thực hiện thao tác xóa
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void tblSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSPMouseClicked
        // TODO add your handling code here:
        tblSP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tblSP.getSelectedRow(); // Lấy chỉ số hàng đang được chọn
                if (row != -1) { // Đảm bảo có hàng nào đang được chọn
                    // Lấy thông tin của hàng được chọn
                    String masp = tblSP.getValueAt(row, 0).toString();
                    String math = tblSP.getValueAt(row, 1).toString();
                    String mamau = tblSP.getValueAt(row, 2).toString();
                    String masize = tblSP.getValueAt(row, 3).toString();
                    String cl = tblSP.getValueAt(row, 4).toString();
                    String kd = tblSP.getValueAt(row, 5).toString();
                    String ten = tblSP.getValueAt(row, 6).toString();
                    Integer sl = (Integer) tblSP.getValueAt(row, 7);
                    Float gia = (Float) tblSP.getValueAt(row, 8);
                    String xx = tblSP.getValueAt(row, 10).toString();
                    String tt = tblSP.getValueAt(row, 11).toString();

                    if (tt.equals("Còn Hàng")) {
                        cboTT.setSelectedItem("Con Hang");
                    } else {
                        cboTT.setSelectedItem("Het Hang");
                    }
                    // Lấy các thông tin khác tương tự
                    // Hiển thị thông tin lên form
                    txtMASP1.setText(masp);
                    txtMaTH.setText(math);
                    txtMau.setText(mamau);
                    txtSIZE.setText(masize);
                    txtCL.setText(cl);
                    txtKIeu.setText(kd);
                    txtTen.setText(ten);
                    txtSL.setText(sl.toString());
                    txtGia.setText(gia.toString());
                    txtXX.setText(xx);
                    cboTT.setSelectedItem(tt);

                    // Hiển thị các thông tin khác tương tự
                }
            }
        });
    }//GEN-LAST:event_tblSPMouseClicked

    private void btnCNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCNMouseClicked
        // TODO add your handling code here:
        int confirmResult = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thêm sản phẩm này?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirmResult == JOptionPane.YES_OPTION) {
            // Đoạn mã để thêm sản phẩm vào cơ sở dữ liệu
            // TODO add your handling code here:
            String masp = txtMASP1.getText();
            String ten = txtTen.getText();

// Kiểm tra tên và mã sản phẩm không được trùng
//            for (SanPham sp : ql.getlist()) {
//                if (ten.equals(sp.getTenSP())) {
//                    JOptionPane.showMessageDialog(this, "Tên và Mã sản phẩm không được trùng");
//                    return;
//                }
//            }

            String math = txtMaTH.getText();
            String mamau = txtMau.getText();
            String masize = txtSIZE.getText();
            String macl = txtCL.getText();
            String makd = txtKIeu.getText();
            String xx = txtXX.getText();
            
// Kiểm tra số lượng và giá là số và lớn hơn 0
            Integer sl;
            Float gia;
            if (masp.equals("") || math.equals("") || mamau.equals("") || masize.equals("") || macl.equals("") || makd.equals("") || ten.equals("") || xx.equals("")) {
                JOptionPane.showMessageDialog(this, "Tất cả các thông tin phải điền đầy đủ");
                return;
            }
            if (txtSL.getText().equals("") ||txtGia.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Số lượng và giá không được để trống");
                return;
            }
            try {
                sl = Integer.parseInt(txtSL.getText());
                gia = Float.parseFloat(txtGia.getText());
                if (sl <= 0 || gia <= 0) {
                    JOptionPane.showMessageDialog(this, "Số lượng và giá phải lớn hơn 0");
                    return;

                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Số lượng và giá phải là số");
                return;
            }
            Integer tt = 0;
            if (sl > 0) {
                tt = 1;
            } else {
                tt = 0;
            }
            // Trong trường hợp này, bạn có thể đặt mã của bạn ở đây
            SanPham sp = new SanPham(masp, math, mamau, masize, macl, makd, ten, sl, gia, xx, tt);
            String up = ql.up(sp);
            JOptionPane.showMessageDialog(this, up);
            loadSp(ql.getlist());
        } else {
            // Nếu người dùng chọn No hoặc đóng cửa sổ, không thực hiện thêm sản phẩm
        }
    }//GEN-LAST:event_btnCNMouseClicked

    private void btnCNMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCNMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCNMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCN;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtCL;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtKIeu;
    private javax.swing.JTextField txtMASP1;
    private javax.swing.JTextField txtMaTH;
    private javax.swing.JTextField txtMau;
    private javax.swing.JTextField txtSIZE;
    private javax.swing.JTextField txtSL;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTim;
    private javax.swing.JTextField txtXX;
    // End of variables declaration//GEN-END:variables
}
