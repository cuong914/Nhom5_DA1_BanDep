/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import entity.ThongKeDT;
import entity.ThongKeNam;
import entity.ThongKeSP;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repository.ThongKeKetNoi;

/**
 *
 * @author cuong
 */
public class JPThongKe extends javax.swing.JPanel {

    /**
     * Creates new form JPThongKe
     */
    ThongKeKetNoi qltk = new ThongKeKetNoi();
    DefaultTableModel tblDTModel;
    DefaultComboBoxModel<ThongKeNam> cboTKNModel = new DefaultComboBoxModel<>();
    DefaultTableModel tblSPModel = new DefaultTableModel();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public JPThongKe() {
        initComponents();
        tblDTModel = (DefaultTableModel) tblDT.getModel();
        cboTKNModel = (DefaultComboBoxModel) cboNam.getModel();
        tblSPModel = (DefaultTableModel) tblSP.getModel();
        loadcbNam();
        loadTKSPtoTable(qltk.getAllTKSP());
        btntkNgay();
        fillDT();

    }

    void loadcbNam() {
        for (ThongKeNam t : qltk.Year()) {
            cboTKNModel.addElement(t);
        }

    }

    void loadTKSPtoTable(List<ThongKeSP> lst) {
        tblSPModel.setRowCount(0);
        for (ThongKeSP p : lst) {
            tblSPModel.addRow(new Object[]{
                p.getMaSP(), p.getTenSP(), p.getXuatXu(), p.getThuonHieu(), p.getMau(), p.getSize(), p.getChatLieu(), p.getSoLuong()
            });
        }
    }

    void btntkNgay() {
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        txtNgayMin.setVisible(false);
        txtNgayMax.setVisible(false);
        btnTKKN.setVisible(false);

    }

    void loadDTtoTable() {
        ThongKeNam item = (ThongKeNam) cboNam.getSelectedItem();
        tblDTModel.setRowCount(0);
        for (ThongKeDT tk : qltk.getALLDT(item.toString())) {
            tblDTModel.addRow(new Object[]{

                tk.getThang(), tk.getSoHoaDon(), tk.getSoSanPham(), tk.getGiaBan(), tk.getGiaGiam(), tk.getDoanhThu()

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

        jFrame1 = new javax.swing.JFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        TongDoanhThu = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SoDonHang = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        DoanhThuThang = new javax.swing.JLabel();
        SoDoanhThuThang = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        DoanhThuNam = new javax.swing.JLabel();
        SoDoanhThuNam = new javax.swing.JLabel();
        cbTG = new javax.swing.JComboBox<>();
        txtNgayMin = new javax.swing.JTextField();
        txtNgayMax = new javax.swing.JTextField();
        btnTKKN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        cboNam = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDT = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSP = new javax.swing.JTable();
        cboSXSP = new javax.swing.JComboBox<>();
        rdTrongNgay = new javax.swing.JRadioButton();
        rdTrongThang = new javax.swing.JRadioButton();
        rdTrongNam = new javax.swing.JRadioButton();
        rdtimeTatCa = new javax.swing.JRadioButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tổng doanh thu");

        TongDoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TongDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        TongDoanhThu.setText("0 VNĐ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TongDoanhThu)
                    .addComponent(jLabel2))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TongDoanhThu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tổng số đơn hàng");

        SoDonHang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SoDonHang.setForeground(new java.awt.Color(255, 255, 255));
        SoDonHang.setText("0 Đơn");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(SoDonHang))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoDonHang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 204, 0));

        DoanhThuThang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DoanhThuThang.setForeground(new java.awt.Color(255, 255, 255));
        DoanhThuThang.setText("Doanh thu tháng");

        SoDoanhThuThang.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SoDoanhThuThang.setForeground(new java.awt.Color(255, 255, 255));
        SoDoanhThuThang.setText("0 VNĐ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SoDoanhThuThang)
                    .addComponent(DoanhThuThang))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DoanhThuThang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoDoanhThuThang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(255, 204, 51));

        DoanhThuNam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DoanhThuNam.setForeground(new java.awt.Color(255, 255, 255));
        DoanhThuNam.setText("Doanh thu năm ");

        SoDoanhThuNam.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        SoDoanhThuNam.setForeground(new java.awt.Color(255, 255, 255));
        SoDoanhThuNam.setText("0 VNĐ");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SoDoanhThuNam)
                    .addComponent(DoanhThuNam))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DoanhThuNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SoDoanhThuNam)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        cbTG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hôm nay", "Theo ngày" }));
        cbTG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTGActionPerformed(evt);
            }
        });

        btnTKKN.setText("Tìm");
        btnTKKN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTKKNMouseClicked(evt);
            }
        });

        jLabel4.setText("Từ ngày");

        jLabel5.setText("đến");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNgayMin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayMax, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTKKN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTKKN, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cboNam.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboNamItemStateChanged(evt);
            }
        });

        jLabel9.setText("Năm:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(205, Short.MAX_VALUE))
        );

        tblDT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "Số đơn", "Số sản phẩm", "Tổng giá bán", "Tổng giá giảm", "Doanh thu"
            }
        ));
        jScrollPane1.setViewportView(tblDT);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Doanh thu", jPanel4);

        tblSP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Xuất xứ", "Thương hiệu", "Màu", "Size", "Chất liệu", "Số lượt mua"
            }
        ));
        jScrollPane2.setViewportView(tblSP);

        cboSXSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Số lượt mua nhiều nhất", "Số lượt mua ít nhất" }));
        cboSXSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSXSPActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdTrongNgay);
        rdTrongNgay.setText("Trong ngày");

        buttonGroup1.add(rdTrongThang);
        rdTrongThang.setText("Trong tháng");

        buttonGroup1.add(rdTrongNam);
        rdTrongNam.setText("Trong năm");

        buttonGroup1.add(rdtimeTatCa);
        rdtimeTatCa.setText("Từ trước đến nay");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdTrongThang)
                    .addComponent(rdTrongNgay)
                    .addComponent(rdTrongNam)
                    .addComponent(rdtimeTatCa)
                    .addComponent(cboSXSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(rdTrongNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdTrongThang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdTrongNam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdtimeTatCa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboSXSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Sản phẩm", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboNamItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboNamItemStateChanged
        loadDTtoTable();
    }//GEN-LAST:event_cboNamItemStateChanged

    void fillDT() {
        SoDonHang.setText(qltk.getDTTheoNgay().getTongHoaDon() + " Đơn");
        TongDoanhThu.setText(qltk.getDTTheoNgay().getDoanhThuDay() + " VNĐ");
        DoanhThuThang.setText("Doanh thu tháng " + qltk.getDTTheoThang().getThang());
        DoanhThuNam.setText("Doanh thu năm " + qltk.getDTTheoNam().getNam());
        SoDoanhThuThang.setText(qltk.getDTTheoThang().getDoanhThuMonth() + " VNĐ");
        SoDoanhThuNam.setText(qltk.getDTTheoNam().getDoanhThuYear() + " VNĐ");
        rdTrongThang.setText("Trong tháng " + qltk.getDTTheoThang().getThang());
        rdTrongNam.setText("Trong năm " + qltk.getDTTheoNam().getNam());
    }
    private void cbTGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTGActionPerformed
        if (cbTG.getSelectedItem().equals("Theo ngày")) {
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            txtNgayMin.setVisible(true);
            txtNgayMax.setVisible(true);
            btnTKKN.setVisible(true);
        } else {
            jLabel4.setVisible(false);
            jLabel5.setVisible(false);
            txtNgayMin.setVisible(false);
            txtNgayMax.setVisible(false);
            btnTKKN.setVisible(false);
        }
    }//GEN-LAST:event_cbTGActionPerformed

    private void btnTKKNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTKKNMouseClicked

        try {
            dateFormat.parse(txtNgayMin.getText());
            dateFormat.parse(txtNgayMax.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng Năm-Tháng-Ngày");
            return;
        }
        SoDonHang.setText(qltk.getTKDTTheoNgay(txtNgayMin.getText(), txtNgayMax.getText()).getTongHoaDon() + " Đơn");
        TongDoanhThu.setText(qltk.getTKDTTheoNgay(txtNgayMin.getText(), txtNgayMax.getText()).getDoanhThuDay() + " VNĐ");
    }//GEN-LAST:event_btnTKKNMouseClicked

    private void cboSXSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSXSPActionPerformed
        if (cboSXSP.getSelectedItem().equals("Số lượt mua nhiều nhất")) {
            if (rdTrongNgay.isSelected() == true) {
                loadTKSPtoTable(qltk.getAllTKSP1TheoNgay());
            } else if (rdTrongThang.isSelected() == true) {
                loadTKSPtoTable(qltk.getAllTKSP1TheoThang());
            } else if (rdTrongNam.isSelected() == true) {
                loadTKSPtoTable(qltk.getAllTKSP1TheoNam());
            } else {
                loadTKSPtoTable(qltk.getAllTKSP1());
            }
        } else {
            if (rdTrongNgay.isSelected() == true) {
                loadTKSPtoTable(qltk.getAllTKSP2TheoNgay());
            } else if (rdTrongThang.isSelected() == true) {
                loadTKSPtoTable(qltk.getAllTKSP2TheoThang());
            } else if (rdTrongNam.isSelected() == true) {
                loadTKSPtoTable(qltk.getAllTKSP2TheoNam());
            } else {
                loadTKSPtoTable(qltk.getAllTKSP2());
            }
        }
    }//GEN-LAST:event_cboSXSPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoanhThuNam;
    private javax.swing.JLabel DoanhThuThang;
    private javax.swing.JLabel SoDoanhThuNam;
    private javax.swing.JLabel SoDoanhThuThang;
    private javax.swing.JLabel SoDonHang;
    private javax.swing.JLabel TongDoanhThu;
    private javax.swing.JButton btnTKKN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbTG;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JComboBox<String> cboSXSP;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdTrongNam;
    private javax.swing.JRadioButton rdTrongNgay;
    private javax.swing.JRadioButton rdTrongThang;
    private javax.swing.JRadioButton rdtimeTatCa;
    private javax.swing.JTable tblDT;
    private javax.swing.JTable tblSP;
    private javax.swing.JTextField txtNgayMax;
    private javax.swing.JTextField txtNgayMin;
    // End of variables declaration//GEN-END:variables
}
