/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hesilfarma;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author jhanc
 */
public class menu extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(menu.class.getName());
    int xMouse,yMouse;
    public menu() {
        initComponents();
        contenido .setLayout(new BorderLayout());
        principal p = new principal();

        contenido.removeAll();
        contenido.add(p, BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension ventana = getSize();
        setLocation((pantalla.width - ventana.width) / 2, (pantalla.height - ventana.height) / 2);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        medicamentosbtn = new javax.swing.JPanel();
        medicamentosText = new javax.swing.JLabel();
        exitbtn = new javax.swing.JPanel();
        exitText = new javax.swing.JLabel();
        moverbtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        reportesbtn = new javax.swing.JPanel();
        reportestxt = new javax.swing.JLabel();
        inventariobtn = new javax.swing.JPanel();
        inventariotxt = new javax.swing.JLabel();
        ventasbtn = new javax.swing.JPanel();
        ventastxt = new javax.swing.JLabel();
        clientesbtn = new javax.swing.JPanel();
        clientestxt = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jpPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(45, 78, 155));

        medicamentosbtn.setBackground(new java.awt.Color(45, 78, 155));
        medicamentosbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        medicamentosbtn.setPreferredSize(new java.awt.Dimension(112, 43));

        medicamentosText.setBackground(new java.awt.Color(255, 255, 255));
        medicamentosText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        medicamentosText.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(medicamentosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(medicamentosbtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(medicamentosText, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        medicamentosbtnLayout.setVerticalGroup(
            medicamentosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(medicamentosbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(medicamentosbtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(medicamentosText, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        exitbtn.setBackground(new java.awt.Color(45, 78, 155));
        exitbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        exitbtn.setPreferredSize(new java.awt.Dimension(112, 43));

        exitText.setBackground(new java.awt.Color(255, 255, 255));
        exitText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitText.setForeground(new java.awt.Color(255, 255, 255));
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
            .addGap(0, 168, Short.MAX_VALUE)
            .addGroup(exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(exitText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
        );
        exitbtnLayout.setVerticalGroup(
            exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
            .addGroup(exitbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitbtnLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(exitText, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        moverbtn.setBackground(new java.awt.Color(45, 78, 155));
        moverbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MOVER");
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });

        javax.swing.GroupLayout moverbtnLayout = new javax.swing.GroupLayout(moverbtn);
        moverbtn.setLayout(moverbtnLayout);
        moverbtnLayout.setHorizontalGroup(
            moverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        moverbtnLayout.setVerticalGroup(
            moverbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        reportesbtn.setBackground(new java.awt.Color(45, 78, 155));
        reportesbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        reportestxt.setBackground(new java.awt.Color(255, 255, 255));
        reportestxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        reportestxt.setForeground(new java.awt.Color(255, 255, 255));
        reportestxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reportestxt.setText("REPORTES");
        reportestxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportestxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reportestxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reportestxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout reportesbtnLayout = new javax.swing.GroupLayout(reportesbtn);
        reportesbtn.setLayout(reportesbtnLayout);
        reportesbtnLayout.setHorizontalGroup(
            reportesbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportestxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        reportesbtnLayout.setVerticalGroup(
            reportesbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportestxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        inventariobtn.setBackground(new java.awt.Color(45, 78, 155));
        inventariobtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        inventariobtn.setPreferredSize(new java.awt.Dimension(112, 43));

        inventariotxt.setBackground(new java.awt.Color(255, 255, 255));
        inventariotxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        inventariotxt.setForeground(new java.awt.Color(255, 255, 255));
        inventariotxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inventariotxt.setText("INVENTARIO");
        inventariotxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventariotxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                inventariotxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                inventariotxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout inventariobtnLayout = new javax.swing.GroupLayout(inventariobtn);
        inventariobtn.setLayout(inventariobtnLayout);
        inventariobtnLayout.setHorizontalGroup(
            inventariobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventariotxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        inventariobtnLayout.setVerticalGroup(
            inventariobtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inventariotxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        ventasbtn.setBackground(new java.awt.Color(45, 78, 155));
        ventasbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        ventasbtn.setPreferredSize(new java.awt.Dimension(112, 43));

        ventastxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ventastxt.setForeground(new java.awt.Color(255, 255, 255));
        ventastxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ventastxt.setText("VENTAS");
        ventastxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventastxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ventastxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ventastxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ventasbtnLayout = new javax.swing.GroupLayout(ventasbtn);
        ventasbtn.setLayout(ventasbtnLayout);
        ventasbtnLayout.setHorizontalGroup(
            ventasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventastxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ventasbtnLayout.setVerticalGroup(
            ventasbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventastxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        clientesbtn.setBackground(new java.awt.Color(45, 78, 155));
        clientesbtn.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        clientesbtn.setPreferredSize(new java.awt.Dimension(112, 43));

        clientestxt.setBackground(new java.awt.Color(255, 255, 255));
        clientestxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        clientestxt.setForeground(new java.awt.Color(255, 255, 255));
        clientestxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientestxt.setText("CLIENTES");
        clientestxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientestxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientestxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientestxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout clientesbtnLayout = new javax.swing.GroupLayout(clientesbtn);
        clientesbtn.setLayout(clientesbtnLayout);
        clientesbtnLayout.setHorizontalGroup(
            clientesbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientestxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        clientesbtnLayout.setVerticalGroup(
            clientesbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientestxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
            .addComponent(moverbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(reportesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(medicamentosbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
            .addComponent(clientesbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
            .addComponent(inventariobtn, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
            .addComponent(ventasbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(moverbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(medicamentosbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(clientesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ventasbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(inventariobtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(reportesbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(exitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        contenido.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenidoLayout = new javax.swing.GroupLayout(contenido);
        contenido.setLayout(contenidoLayout);
        contenidoLayout.setHorizontalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );
        contenidoLayout.setVerticalGroup(
            contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 786, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpPrincipalLayout = new javax.swing.GroupLayout(jpPrincipal);
        jpPrincipal.setLayout(jpPrincipalLayout);
        jpPrincipalLayout.setHorizontalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPrincipalLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jpPrincipalLayout.setVerticalGroup(
            jpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void exitTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseEntered
        exitbtn.setBackground(new Color(33,199,254));        
    }//GEN-LAST:event_exitTextMouseEntered

    private void exitTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseExited
        exitbtn.setBackground(new Color(45,78,155));
    }//GEN-LAST:event_exitTextMouseExited

    private void exitTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseClicked
        this.dispose();       
    }//GEN-LAST:event_exitTextMouseClicked

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);        
        
    }//GEN-LAST:event_jLabel1MouseDragged

    private void medicamentosTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicamentosTextMouseExited
        medicamentosbtn.setBackground(new Color(45,78,155));
    }//GEN-LAST:event_medicamentosTextMouseExited

    private void medicamentosTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicamentosTextMouseEntered
        medicamentosbtn.setBackground(new Color(33,199,254));
    }//GEN-LAST:event_medicamentosTextMouseEntered

    private void medicamentosTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicamentosTextMouseClicked

        medicamentos medi = new medicamentos();

        contenido.removeAll();
        contenido.add(medi,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
    }//GEN-LAST:event_medicamentosTextMouseClicked

    private void clientestxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientestxtMouseEntered
        clientesbtn.setBackground(new Color(33,199,254));
        // TODO add your handling code here:
    }//GEN-LAST:event_clientestxtMouseEntered

    private void clientestxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientestxtMouseExited
        clientesbtn.setBackground(new Color(45,78,155));
        // TODO add your handling code here:
    }//GEN-LAST:event_clientestxtMouseExited

    private void ventastxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventastxtMouseEntered
        ventasbtn.setBackground(new Color(33,199,254));
        // TODO add your handling code here:
    }//GEN-LAST:event_ventastxtMouseEntered

    private void ventastxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventastxtMouseExited
        ventasbtn.setBackground(new Color(45,78,155));
        // TODO add your handling code here:
    }//GEN-LAST:event_ventastxtMouseExited

    private void inventariotxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventariotxtMouseEntered
        inventariobtn.setBackground(new Color(33,199,254));
        // TODO add your handling code here:
    }//GEN-LAST:event_inventariotxtMouseEntered

    private void inventariotxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventariotxtMouseExited
        inventariobtn.setBackground(new Color(45,78,155));
        // TODO add your handling code here:
    }//GEN-LAST:event_inventariotxtMouseExited

    private void reportestxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportestxtMouseEntered
        reportesbtn.setBackground(new Color(33,199,254));
        // TODO add your handling code here:
    }//GEN-LAST:event_reportestxtMouseEntered

    private void reportestxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportestxtMouseExited
        reportesbtn.setBackground(new Color(45,78,155));
        // TODO add your handling code here:
    }//GEN-LAST:event_reportestxtMouseExited

    private void clientestxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientestxtMouseClicked
        Clientes c = new Clientes();
        contenido.removeAll();
        contenido.add(c,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_clientestxtMouseClicked

    private void ventastxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventastxtMouseClicked
        ventas v = new ventas();
        contenido.removeAll();
        contenido.add(v,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_ventastxtMouseClicked

    private void inventariotxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventariotxtMouseClicked
        inventario inven = new inventario();
        contenido.removeAll();
        contenido.add(inven,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_inventariotxtMouseClicked

    private void reportestxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reportestxtMouseClicked
        reportes repor = new reportes();
        contenido.removeAll();
        contenido.add(repor,BorderLayout.CENTER);
        contenido.revalidate();
        contenido.repaint();
        // TODO add your handling code here:
    }//GEN-LAST:event_reportestxtMouseClicked

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
    private javax.swing.JPanel clientesbtn;
    private javax.swing.JLabel clientestxt;
    private javax.swing.JPanel contenido;
    private javax.swing.JLabel exitText;
    private javax.swing.JPanel exitbtn;
    private javax.swing.JPanel inventariobtn;
    private javax.swing.JLabel inventariotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpPrincipal;
    private javax.swing.JLabel medicamentosText;
    private javax.swing.JPanel medicamentosbtn;
    private javax.swing.JPanel moverbtn;
    private javax.swing.JPanel reportesbtn;
    private javax.swing.JLabel reportestxt;
    private javax.swing.JPanel ventasbtn;
    private javax.swing.JLabel ventastxt;
    // End of variables declaration//GEN-END:variables
}
