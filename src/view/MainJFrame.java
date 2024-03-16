package view;

import bean.DanhMucBeen;
import controller.ChuyenManHinhController;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LayoutManager;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;

public final class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
        setTitle("Phần Mềm Bán Dép ");
        //Thiết lập màu nền cho JFrame và đặt độ trong suốt alpha của màu nền.
//        setLocationRelativeTo(null);
        this.setLocation(15, 5);
        initMoving(this);
        List<DanhMucBeen> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBeen("Bán Hàng", jpnBanHang, jlbBanHang));
        listDanhMuc.add(new DanhMucBeen("Sản Phẩm", jpnSanPham, jlbSanPham));
        listDanhMuc.add(new DanhMucBeen("Hóa Đơn", jpnHoaDon, jlbHoaDon));
        listDanhMuc.add(new DanhMucBeen("Nhân Viên", jpnNhanVien, jlbNhanVien));
        listDanhMuc.add(new DanhMucBeen("Thống Kê", jpnThongKe, jlbThongKe));
        listDanhMuc.add(new DanhMucBeen("Voucher", jpnVoucher, jlbVoucher));
        listDanhMuc.add(new DanhMucBeen("Khách Hàng", jpnKhachHang, jlbKhachHang));
        listDanhMuc.add(new DanhMucBeen("Đăng Xuất", jpnDangXuat, jlbDangXuat));

        ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
        controller.setEvent(listDanhMuc);
        controller.setView(jpnBanHang, jlbBanHang); //Thiết lập cái đầu đc chọn.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new utility.PanelBorder();
        jpnMenu = new utility.Menu();
        jpnIconGD = new RoundedPanel(1000);
        jpnChuaMenu = new javax.swing.JPanel();
        jpnBanHang = new javax.swing.JPanel();
        jlbBanHang = new javax.swing.JLabel();
        Ngan1 = new javax.swing.JSeparator();
        jpnSanPham = new javax.swing.JPanel();
        jlbSanPham = new javax.swing.JLabel();
        Ngan2 = new javax.swing.JSeparator();
        jpnHoaDon = new javax.swing.JPanel();
        jlbHoaDon = new javax.swing.JLabel();
        Ngan3 = new javax.swing.JSeparator();
        jpnNhanVien = new javax.swing.JPanel();
        jlbNhanVien = new javax.swing.JLabel();
        Ngan4 = new javax.swing.JSeparator();
        jpnThongKe = new javax.swing.JPanel();
        jlbThongKe = new javax.swing.JLabel();
        Ngan5 = new javax.swing.JSeparator();
        jpnVoucher = new javax.swing.JPanel();
        jlbVoucher = new javax.swing.JLabel();
        Ngan6 = new javax.swing.JSeparator();
        jpnKhachHang = new javax.swing.JPanel();
        jlbKhachHang = new javax.swing.JLabel();
        Ngan7 = new javax.swing.JSeparator();
        jpnDangXuat = new javax.swing.JPanel();
        jlbDangXuat = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setPreferredSize(new java.awt.Dimension(1510, 790));

        jpnMenu.setBackground(new java.awt.Color(204, 255, 255));
        jpnMenu.setPreferredSize(new java.awt.Dimension(300, 790));

        jpnIconGD.setBackground(new java.awt.Color(254, 254, 254));

        javax.swing.GroupLayout jpnIconGDLayout = new javax.swing.GroupLayout(jpnIconGD);
        jpnIconGD.setLayout(jpnIconGDLayout);
        jpnIconGDLayout.setHorizontalGroup(
            jpnIconGDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jpnIconGDLayout.setVerticalGroup(
            jpnIconGDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );

        jpnChuaMenu.setOpaque(false);
        jpnChuaMenu.setLayout(new javax.swing.BoxLayout(jpnChuaMenu, javax.swing.BoxLayout.Y_AXIS));

        jpnBanHang.setBackground(new java.awt.Color(255, 153, 153));
        jpnBanHang.setPreferredSize(new java.awt.Dimension(235, 50));

        jlbBanHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbBanHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbBanHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbBanHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trolley.png"))); // NOI18N
        jlbBanHang.setText("Bán Hàng");
        jlbBanHang.setToolTipText("");
        jlbBanHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlbBanHang.setIconTextGap(18);
        jlbBanHang.setMaximumSize(new java.awt.Dimension(200, 200));
        jlbBanHang.setPreferredSize(new java.awt.Dimension(30, 35));

        javax.swing.GroupLayout jpnBanHangLayout = new javax.swing.GroupLayout(jpnBanHang);
        jpnBanHang.setLayout(jpnBanHangLayout);
        jpnBanHangLayout.setHorizontalGroup(
            jpnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnBanHangLayout.setVerticalGroup(
            jpnBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlbBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jpnChuaMenu.add(jpnBanHang);
        jpnChuaMenu.add(Ngan1);

        jpnSanPham.setBackground(new java.awt.Color(255, 153, 153));
        jpnSanPham.setPreferredSize(new java.awt.Dimension(235, 50));

        jlbSanPham.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbSanPham.setForeground(new java.awt.Color(255, 255, 255));
        jlbSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sneakers.png"))); // NOI18N
        jlbSanPham.setText("Sản Phẩm");
        jlbSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlbSanPham.setIconTextGap(18);
        jlbSanPham.setMaximumSize(new java.awt.Dimension(200, 200));
        jlbSanPham.setPreferredSize(new java.awt.Dimension(30, 35));

        javax.swing.GroupLayout jpnSanPhamLayout = new javax.swing.GroupLayout(jpnSanPham);
        jpnSanPham.setLayout(jpnSanPhamLayout);
        jpnSanPhamLayout.setHorizontalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnSanPhamLayout.setVerticalGroup(
            jpnSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnChuaMenu.add(jpnSanPham);
        jpnChuaMenu.add(Ngan2);

        jpnHoaDon.setBackground(new java.awt.Color(255, 153, 153));
        jpnHoaDon.setPreferredSize(new java.awt.Dimension(235, 50));

        jlbHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoaDon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/invoice.png"))); // NOI18N
        jlbHoaDon.setText("Hóa Đơn");
        jlbHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlbHoaDon.setIconTextGap(18);
        jlbHoaDon.setMaximumSize(new java.awt.Dimension(200, 200));
        jlbHoaDon.setPreferredSize(new java.awt.Dimension(30, 35));

        javax.swing.GroupLayout jpnHoaDonLayout = new javax.swing.GroupLayout(jpnHoaDon);
        jpnHoaDon.setLayout(jpnHoaDonLayout);
        jpnHoaDonLayout.setHorizontalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnHoaDonLayout.setVerticalGroup(
            jpnHoaDonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnHoaDonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnChuaMenu.add(jpnHoaDon);
        jpnChuaMenu.add(Ngan3);

        jpnNhanVien.setBackground(new java.awt.Color(255, 153, 153));
        jpnNhanVien.setPreferredSize(new java.awt.Dimension(235, 50));

        jlbNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/steward.png"))); // NOI18N
        jlbNhanVien.setText("Nhân Viên");
        jlbNhanVien.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlbNhanVien.setIconTextGap(18);
        jlbNhanVien.setMaximumSize(new java.awt.Dimension(200, 200));
        jlbNhanVien.setPreferredSize(new java.awt.Dimension(30, 35));

        javax.swing.GroupLayout jpnNhanVienLayout = new javax.swing.GroupLayout(jpnNhanVien);
        jpnNhanVien.setLayout(jpnNhanVienLayout);
        jpnNhanVienLayout.setHorizontalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnNhanVienLayout.setVerticalGroup(
            jpnNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnChuaMenu.add(jpnNhanVien);
        jpnChuaMenu.add(Ngan4);

        jpnThongKe.setBackground(new java.awt.Color(255, 153, 153));
        jpnThongKe.setPreferredSize(new java.awt.Dimension(235, 50));

        jlbThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/analytics.png"))); // NOI18N
        jlbThongKe.setText("Thống Kê");
        jlbThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlbThongKe.setIconTextGap(18);
        jlbThongKe.setMaximumSize(new java.awt.Dimension(200, 200));
        jlbThongKe.setPreferredSize(new java.awt.Dimension(30, 35));

        javax.swing.GroupLayout jpnThongKeLayout = new javax.swing.GroupLayout(jpnThongKe);
        jpnThongKe.setLayout(jpnThongKeLayout);
        jpnThongKeLayout.setHorizontalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnThongKeLayout.setVerticalGroup(
            jpnThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnChuaMenu.add(jpnThongKe);
        jpnChuaMenu.add(Ngan5);

        jpnVoucher.setBackground(new java.awt.Color(255, 153, 153));
        jpnVoucher.setPreferredSize(new java.awt.Dimension(235, 50));

        jlbVoucher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbVoucher.setForeground(new java.awt.Color(255, 255, 255));
        jlbVoucher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbVoucher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gift-voucher.png"))); // NOI18N
        jlbVoucher.setText("Voucher");
        jlbVoucher.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlbVoucher.setIconTextGap(18);
        jlbVoucher.setMaximumSize(new java.awt.Dimension(200, 200));
        jlbVoucher.setPreferredSize(new java.awt.Dimension(30, 35));

        javax.swing.GroupLayout jpnVoucherLayout = new javax.swing.GroupLayout(jpnVoucher);
        jpnVoucher.setLayout(jpnVoucherLayout);
        jpnVoucherLayout.setHorizontalGroup(
            jpnVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnVoucherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnVoucherLayout.setVerticalGroup(
            jpnVoucherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnVoucherLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbVoucher, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnChuaMenu.add(jpnVoucher);
        jpnChuaMenu.add(Ngan6);

        jpnKhachHang.setBackground(new java.awt.Color(255, 153, 153));
        jpnKhachHang.setPreferredSize(new java.awt.Dimension(235, 50));

        jlbKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        jlbKhachHang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/client.png"))); // NOI18N
        jlbKhachHang.setText("Khách Hàng");
        jlbKhachHang.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlbKhachHang.setIconTextGap(18);
        jlbKhachHang.setMaximumSize(new java.awt.Dimension(200, 200));
        jlbKhachHang.setPreferredSize(new java.awt.Dimension(30, 35));

        javax.swing.GroupLayout jpnKhachHangLayout = new javax.swing.GroupLayout(jpnKhachHang);
        jpnKhachHang.setLayout(jpnKhachHangLayout);
        jpnKhachHangLayout.setHorizontalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnKhachHangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnKhachHangLayout.setVerticalGroup(
            jpnKhachHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnKhachHangLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jlbKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpnChuaMenu.add(jpnKhachHang);
        jpnChuaMenu.add(Ngan7);

        jpnDangXuat.setBackground(new java.awt.Color(255, 153, 153));
        jpnDangXuat.setPreferredSize(new java.awt.Dimension(235, 50));

        jlbDangXuat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlbDangXuat.setForeground(new java.awt.Color(255, 255, 255));
        jlbDangXuat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        jlbDangXuat.setText("Đăng Xuất");
        jlbDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jlbDangXuat.setIconTextGap(18);
        jlbDangXuat.setMaximumSize(new java.awt.Dimension(200, 200));
        jlbDangXuat.setPreferredSize(new java.awt.Dimension(30, 35));

        javax.swing.GroupLayout jpnDangXuatLayout = new javax.swing.GroupLayout(jpnDangXuat);
        jpnDangXuat.setLayout(jpnDangXuatLayout);
        jpnDangXuatLayout.setHorizontalGroup(
            jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnDangXuatLayout.setVerticalGroup(
            jpnDangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnDangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbDangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jpnChuaMenu.add(jpnDangXuat);

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnIconGD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnChuaMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jpnIconGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jpnChuaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnView.setBackground(new java.awt.Color(255, 255, 255));
        jpnView.setPreferredSize(new java.awt.Dimension(1210, 790));
        jpnView.setVerifyInputWhenFocusTarget(false);

        jLabel1.setText("Hi");

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1210, Short.MAX_VALUE)
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnViewLayout.createSequentialGroup()
                .addContainerGap(765, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainJFrame().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator Ngan1;
    private javax.swing.JSeparator Ngan2;
    private javax.swing.JSeparator Ngan3;
    private javax.swing.JSeparator Ngan4;
    private javax.swing.JSeparator Ngan5;
    private javax.swing.JSeparator Ngan6;
    private javax.swing.JSeparator Ngan7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jlbBanHang;
    private javax.swing.JLabel jlbDangXuat;
    private javax.swing.JLabel jlbHoaDon;
    private javax.swing.JLabel jlbKhachHang;
    private javax.swing.JLabel jlbNhanVien;
    private javax.swing.JLabel jlbSanPham;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JLabel jlbVoucher;
    private javax.swing.JPanel jpnBanHang;
    private javax.swing.JPanel jpnChuaMenu;
    private javax.swing.JPanel jpnDangXuat;
    private javax.swing.JPanel jpnHoaDon;
    private javax.swing.JPanel jpnIconGD;
    private javax.swing.JPanel jpnKhachHang;
    private utility.Menu jpnMenu;
    private javax.swing.JPanel jpnNhanVien;
    private utility.PanelBorder jpnRoot;
    private javax.swing.JPanel jpnSanPham;
    private javax.swing.JPanel jpnThongKe;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel jpnVoucher;
    // End of variables declaration//GEN-END:variables

    //Thiết lập di chuyển cho giao diện
    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        jpnMenu.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                x = e.getX();
                y = e.getY();
            }
        });
        jpnMenu.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                fram.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
            }
        });
    }

    //Thiết lập màu + độ trong suốt cho JPanel.
    class JPanelGradient extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2d = (Graphics2D) g;
            int width = getWidth();
            int height = getHeight();
            Color color1 = new Color(0, 0, 0, 0);
            Color color2 = new Color(0, 0, 0, 0);
            GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
            g2d.setPaint(gp);
            g2d.fillOval(0, 0, width, height);

        }
    }

    //Thiết lập đường cong cho tiêu đề + màu background cho nó.
    class RoundedPanel extends JPanel {
        
        private Color backgroundColor;
        private int cornerRadius = 15;

        public RoundedPanel(LayoutManager layout, int radius) {
            super(layout);
            cornerRadius = radius;
            setOpaque(false); // Thiết lập độ trong suốt
        }

        public RoundedPanel(LayoutManager layout, int radius, Color bgColor) {
            super(layout);
            cornerRadius = radius;
            backgroundColor = bgColor;
            setOpaque(false); // Thiết lập độ trong suốt
        }

        public RoundedPanel(int radius) {
            super();
            cornerRadius = radius;
            setOpaque(false); // Thiết lập độ trong suốt
        }

        public RoundedPanel(int radius, Color bgColor) {
            super();
            cornerRadius = radius;
            backgroundColor = bgColor;
            setOpaque(false); // Thiết lập độ trong suốt
        }

        @Override //Vẽ màu cho thành phần khi vẽ dựa vào mã code.
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Dimension arcs = new Dimension(cornerRadius, cornerRadius);
            int width = getWidth();
            int height = getHeight();
            Graphics2D graphics = (Graphics2D) g;
            graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            //Sử dụng mã màu mới. 
            Color startColor = Color.decode("#ECE9E6");
            Color endColor = Color.decode("#FFFFFF");
            // Tạo GradientPaint với các màu đã chọn
            GradientPaint gradientPaint = new GradientPaint(0, 0, startColor, 0, height, endColor);
            if (backgroundColor != null) {
                graphics.setColor(backgroundColor);
            } else {
                graphics.setPaint(gradientPaint); // Sử dụng setPaint thay vì setColor
            }
            graphics.fillRoundRect(0, 0, width - 1, height - 1, arcs.width, arcs.height); //paint background
            graphics.setColor(getForeground());
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
        }
    }

}//end the life
