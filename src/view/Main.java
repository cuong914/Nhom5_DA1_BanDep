package view;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        //setSize(Toolkit.getDefaultToolkit().getScreenSize());
        Login login = new Login();
        Register register = new Register();
      slide = new swing.PanelSlide(); // Khởi tạo biến this.slide
      slide.setAnimate(2);
        slide.init(login, register);
        showLogin(); //
        login.addEventRegister(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //  Show register form
                slide.show(1);
               login.login();
               
            }
        });
        
        register.addEventBackLogin(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                slide.show(0);
                register.register();
            }
        });

       
    }
     private void showLogin() {
        slide.show(0); // Hiển thị giao diện đăng nhập
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 726, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private swing.PanelBorder panelBorder1;
    private swing.PanelGradiente panelGradiente1;
    private swing.PanelSlide slide;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
