/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hesilfarma;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author jhanc
 */
public class Hesil extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Hesil.class.getName());
    int xMouse,yMouse;
    public Hesil() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JPanel();
        loginbtnTX = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        salirbtn = new javax.swing.JPanel();
        exitbtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/hersil-sa-AA2309BD69786C2E233630thumbnail.jpeg"))); // NOI18N
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 470, 190));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("INICIAR SESIÓN");
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 290, 50));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("USUARIO");
        bg.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CONTRASEÑA");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Ingrese su nombre de Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        bg.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));
        bg.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 380, 10));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 380, 10));

        txtContraseña.setBackground(new java.awt.Color(255, 255, 255));
        txtContraseña.setText("********");
        txtContraseña.setBorder(null);
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        bg.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        loginbtn.setBackground(new java.awt.Color(45, 78, 155));
        loginbtn.setForeground(new java.awt.Color(0, 0, 0));

        loginbtnTX.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginbtnTX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginbtnTX.setText("ENTRAR");
        loginbtnTX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtnTX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtnTXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbtnTXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbtnTXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginbtnLayout = new javax.swing.GroupLayout(loginbtn);
        loginbtn.setLayout(loginbtnLayout);
        loginbtnLayout.setHorizontalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginbtnTX, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        loginbtnLayout.setVerticalGroup(
            loginbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginbtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginbtnTX, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        bg.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 100, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        salirbtn.setBackground(new java.awt.Color(255, 255, 255));

        exitbtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitbtn.setForeground(new java.awt.Color(0, 0, 0));
        exitbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitbtn.setText("X");
        exitbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitbtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout salirbtnLayout = new javax.swing.GroupLayout(salirbtn);
        salirbtn.setLayout(salirbtnLayout);
        salirbtnLayout.setHorizontalGroup(
            salirbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );
        salirbtnLayout.setVerticalGroup(
            salirbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(salirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 593, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(salirbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 614, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
            xMouse = evt.getX();
            yMouse = evt.getY();
            
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);      
    }//GEN-LAST:event_headerMouseDragged

    private void exitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseClicked
               System.exit(0);
    }//GEN-LAST:event_exitbtnMouseClicked

    private void exitbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseEntered
                salirbtn.setBackground(Color.red);        
    }//GEN-LAST:event_exitbtnMouseEntered

    private void exitbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitbtnMouseExited
                salirbtn.setBackground(Color.white);
    }//GEN-LAST:event_exitbtnMouseExited

    private void loginbtnTXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnTXMouseEntered
            loginbtn.setBackground(new Color(33,199,254));// TODO add your handling code here:
    }//GEN-LAST:event_loginbtnTXMouseEntered

    private void loginbtnTXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnTXMouseExited
            loginbtn.setBackground(new Color(45,78,155));// TODO add your handling code here:
    }//GEN-LAST:event_loginbtnTXMouseExited

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
            if(txtUsuario.getText().equals("Ingrese su nombre de Usuario"))
            {
                txtUsuario.setText("");
                txtUsuario.setForeground(Color.black);
            }
            if(String.valueOf(txtContraseña.getPassword()).isEmpty())
            {
               txtContraseña.setText("********");
               txtContraseña.setForeground(Color.gray);
            }
                
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
           if(String.valueOf(txtContraseña.getPassword()).equals("********"))
            {
               txtContraseña.setText("");
               txtContraseña.setForeground(Color.black);
            }
           if(txtUsuario.getText().isEmpty())
           {
               txtUsuario.setText("Ingrese su nombre de Usuario");
               txtUsuario.setForeground(Color.gray);
           }
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void loginbtnTXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtnTXMouseClicked
            // ACÁ NOS ENVIARÁ A OTRO JPG 
           
           String usuario = txtUsuario.getText();
           String contra = String.valueOf(txtContraseña.getPassword());
           boolean acceso = false;
           try{
                 BufferedReader br = new BufferedReader(new FileReader("usuarios.txt"));
                 
                 String linea;
                 while((linea = br.readLine()) != null)
                 {
                      String datos[] = linea.split(",");
                      String userTXT = datos[0];
                      String passTXT = datos[1];   
                      if(usuario.equals(userTXT) && contra.equals(passTXT))
                      {
                          acceso = true;
                          break;
                      }
                 }
                 br.close();
                 if(acceso)
                 {
                     JOptionPane.showMessageDialog(this, "Bienvenido");
                     menu  men = new menu();
                     men.setVisible(true);
                     this.dispose();
                 }else
                 {
                     JOptionPane.showMessageDialog(this, "Usuario o contraseña incorrectos");
                 }
           }catch(Exception e)
           {
               JOptionPane.showMessageDialog(this, "Error: " + e);
           }
           
    }//GEN-LAST:event_loginbtnTXMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Hesil().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel exitbtn;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel loginbtn;
    private javax.swing.JLabel loginbtnTX;
    private javax.swing.JPanel salirbtn;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
