/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hesilfarma;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author jhanc
 */
public class menu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(menu.class.getName());
    int xMouse,yMouse;
    public menu() {
        initComponents();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        principalbtn = new javax.swing.JPanel();
        principalbtnText = new javax.swing.JLabel();
        medicamentosbtn = new javax.swing.JPanel();
        medicamentosText = new javax.swing.JLabel();
        ventasbtn = new javax.swing.JPanel();
        ventasText = new javax.swing.JLabel();
        inventariobtn = new javax.swing.JPanel();
        inventarioText = new javax.swing.JLabel();
        reportebtn = new javax.swing.JPanel();
        reporteText = new javax.swing.JLabel();
        exitbtn = new javax.swing.JPanel();
        exitText = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(45, 78, 155));

        principalbtn.setBackground(new java.awt.Color(45, 78, 155));

        principalbtnText.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        principalbtnText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        principalbtnText.setText("PRINCIPAL");
        principalbtnText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                principalbtnTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                principalbtnTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                principalbtnTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout principalbtnLayout = new javax.swing.GroupLayout(principalbtn);
        principalbtn.setLayout(principalbtnLayout);
        principalbtnLayout.setHorizontalGroup(
            principalbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalbtnText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        principalbtnLayout.setVerticalGroup(
            principalbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principalbtnText, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        medicamentosbtn.setBackground(new java.awt.Color(45, 78, 155));

        medicamentosText.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        medicamentosText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        medicamentosText.setText("MEDICAMENTOS");
        medicamentosText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medicamentosTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                medicamentosTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                medicamentosTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout medicamentosbtnLayout = new javax.swing.GroupLayout(medicamentosbtn);
        medicamentosbtn.setLayout(medicamentosbtnLayout);
        medicamentosbtnLayout.setHorizontalGroup(
            medicamentosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(medicamentosText, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );
        medicamentosbtnLayout.setVerticalGroup(
            medicamentosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(medicamentosText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        ventasbtn.setBackground(new java.awt.Color(45, 78, 155));

        ventasText.setBackground(new java.awt.Color(45, 78, 155));
        ventasText.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        ventasText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventasText.setText("VENTAS");
        ventasText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ventasTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ventasTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ventasbtnLayout = new javax.swing.GroupLayout(ventasbtn);
        ventasbtn.setLayout(ventasbtnLayout);
        ventasbtnLayout.setHorizontalGroup(
            ventasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventasText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventasbtnLayout.setVerticalGroup(
            ventasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventasText, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        inventariobtn.setBackground(new java.awt.Color(45, 78, 155));

        inventarioText.setBackground(new java.awt.Color(45, 78, 155));
        inventarioText.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        inventarioText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventarioText.setText("INVENTARIO");
        inventarioText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventarioTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventarioTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventarioTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout inventariobtnLayout = new javax.swing.GroupLayout(inventariobtn);
        inventariobtn.setLayout(inventariobtnLayout);
        inventariobtnLayout.setHorizontalGroup(
            inventariobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventarioText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inventariobtnLayout.setVerticalGroup(
            inventariobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventarioText, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        reportebtn.setBackground(new java.awt.Color(45, 78, 155));

        reporteText.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        reporteText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reporteText.setText("REPORTES");
        reporteText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reporteTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reporteTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reporteTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout reportebtnLayout = new javax.swing.GroupLayout(reportebtn);
        reportebtn.setLayout(reportebtnLayout);
        reportebtnLayout.setHorizontalGroup(
            reportebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reporteText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        reportebtnLayout.setVerticalGroup(
            reportebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reporteText, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        exitbtn.setBackground(new java.awt.Color(45, 78, 155));

        exitText.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        exitText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitText.setText("SALIR");
        exitText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitbtnLayout = new javax.swing.GroupLayout(exitbtn);
        exitbtn.setLayout(exitbtnLayout);
        exitbtnLayout.setHorizontalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitText, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(45, 78, 155));

        jLabel1.setBackground(new java.awt.Color(45, 78, 155));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOVER");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(medicamentosbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(principalbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ventasbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(inventariobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reportebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(principalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(medicamentosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ventasbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inventariobtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reportebtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void principalbtnTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalbtnTextMouseEntered
        principalbtn.setBackground(new Color(33,199,254));
    }//GEN-LAST:event_principalbtnTextMouseEntered

    private void principalbtnTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalbtnTextMouseExited
        principalbtn.setBackground(new Color(45,78,155));     
    }//GEN-LAST:event_principalbtnTextMouseExited

    private void medicamentosTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicamentosTextMouseEntered
        medicamentosbtn.setBackground(new Color(33,199,254));
    }//GEN-LAST:event_medicamentosTextMouseEntered

    private void medicamentosTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicamentosTextMouseExited
        medicamentosbtn.setBackground(new Color(45,78,155)); 
    }//GEN-LAST:event_medicamentosTextMouseExited

    private void ventasTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTextMouseEntered
        ventasbtn.setBackground(new Color(33,199,254));
    }//GEN-LAST:event_ventasTextMouseEntered

    private void ventasTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTextMouseExited
        ventasbtn.setBackground(new Color(45,78,155));
    }//GEN-LAST:event_ventasTextMouseExited

    private void inventarioTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioTextMouseEntered
        inventariobtn.setBackground(new Color(33,199,254));
    }//GEN-LAST:event_inventarioTextMouseEntered

    private void inventarioTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioTextMouseExited
        inventariobtn.setBackground(new Color(45,78,155));
    }//GEN-LAST:event_inventarioTextMouseExited

    private void reporteTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteTextMouseEntered
        reportebtn.setBackground(new Color(33,199,254));       
    }//GEN-LAST:event_reporteTextMouseEntered

    private void reporteTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteTextMouseExited
        reportebtn.setBackground(new Color(45,78,155));
    }//GEN-LAST:event_reporteTextMouseExited

    private void exitTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseEntered
        exitbtn.setBackground(new Color(33,199,254));        
    }//GEN-LAST:event_exitTextMouseEntered

    private void exitTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseExited
        exitbtn.setBackground(new Color(45,78,155));
    }//GEN-LAST:event_exitTextMouseExited

    private void exitTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseClicked
        this.dispose();       
    }//GEN-LAST:event_exitTextMouseClicked

    private void principalbtnTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_principalbtnTextMouseClicked

        principal p = new principal();

        p.setSize(680,580);
        p.setLocation(0,0);

        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_principalbtnTextMouseClicked

    private void medicamentosTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicamentosTextMouseClicked
        
        medicamentos medi = new medicamentos();

        medi.setSize(680,580);
        medi.setLocation(0,0);

        contenido.removeAll();
        contenido.add(medi, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_medicamentosTextMouseClicked

    private void ventasTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasTextMouseClicked
        ventas venta = new ventas();

        venta.setSize(680,580);
        venta.setLocation(0,0);

        contenido.removeAll();
        contenido.add(venta, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_ventasTextMouseClicked

    private void inventarioTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventarioTextMouseClicked
        inventario inventa = new inventario();

        inventa.setSize(680,580);
        inventa.setLocation(0,0);

        contenido.removeAll();
        contenido.add(inventa, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_inventarioTextMouseClicked

    private void reporteTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteTextMouseClicked
         reportes reporte = new reportes();

         reporte.setSize(680,580);
         reporte.setLocation(0,0);

         contenido.removeAll();
         contenido.add(reporte, BorderLayout.CENTER);
         contenido.revalidate();
         contenido.repaint();
    }//GEN-LAST:event_reporteTextMouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);        
        
    }//GEN-LAST:event_jLabel1MouseDragged

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
        java.awt.EventQueue.invokeLater(() -> new menu().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel exitText;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JLabel inventarioText;
    private javax.swing.JPanel inventariobtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel medicamentosText;
    private javax.swing.JPanel medicamentosbtn;
    private javax.swing.JPanel principalbtn;
    private javax.swing.JLabel principalbtnText;
    private javax.swing.JLabel reporteText;
    private javax.swing.JPanel reportebtn;
    private javax.swing.JLabel ventasText;
    private javax.swing.JPanel ventasbtn;
    // End of variables declaration//GEN-END:variables
}
