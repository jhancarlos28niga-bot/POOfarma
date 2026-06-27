/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hesilfarma;

import DAO.MedicamentoDAO;
import DAO.MovimientoInventariosDAO;
import Modelo.Medicamento;
import Modelo.MovimientoInventario;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author jhanc
 */
public class inventario extends javax.swing.JPanel {

    /**
     * Creates new form inventario
     */
    private int idMedicamentoSeleccionado = 0;
    public inventario() {
        initComponents();
        ListarMedicamentos();
        ComboBox();
        personalizarTabla();
        personalizarTablaHistorial();
        
    }
    private void ListarMedicamentos()
    {
        DefaultTableModel modelo =(DefaultTableModel)jtablaMedicamentos.getModel();

        modelo.setRowCount(0);

        MedicamentoDAO dao = new MedicamentoDAO();

        List<Medicamento> lista = dao.listar();

        for (Medicamento med : lista) 
        {

            Object[] fila = 
            {

                med.getIdMedicamento(),
                med.getNombre(),
                med.getStock(),
                med.getFechaVencimiento(),
                med.getLaboratorio()
            };
            modelo.addRow(fila);
        }
         
    }
    public void listarHistorial(int idMedicamento)
    {
        MovimientoInventariosDAO dao =new MovimientoInventariosDAO();

        List<MovimientoInventario> lista =dao.listarPorMedicamento(idMedicamento);

        DefaultTableModel modelo =(DefaultTableModel) tblHistorial.getModel();

        modelo.setRowCount(0);

        for(MovimientoInventario mov : lista)
        {
            modelo.addRow(new Object[]{
                mov.getFechaMovimiento(),
                mov.getTipoMovimiento(),
                mov.getCantidad(),
                mov.getObservacion()
            });
        }
    }
    private void ComboBox()
    {
        cmbMotivo.removeAllItems();
        cmbMotivo.addItem("Seleccione un motivo");
        cmbMotivo.addItem("Reposición de Stock");
        cmbMotivo.addItem("Compra a Proveedor");
        cmbMotivo.addItem("Donación");
        cmbMotivo.addItem("Devolución");
        cmbMotivo.addItem("Ajuste de Inventario");
        
    }
    private void personalizarTabla()
    {
        JTableHeader header =jtablaMedicamentos.getTableHeader();

        header.setDefaultRenderer(new DefaultTableCellRenderer()
            {
                @Override
                public java.awt.Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column)
                {
                    JLabel lbl =(JLabel) super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);

                    lbl.setBackground(new Color(32,72,140));

                    lbl.setForeground(Color.WHITE);

                    lbl.setFont(new Font("Segoe UI",Font.BOLD,13));

                    lbl.setHorizontalAlignment(SwingConstants.CENTER);

                    lbl.setOpaque(true);

                    return lbl;
                }
            });

        jtablaMedicamentos.setRowHeight(28);

        jtablaMedicamentos.setFont( new Font("Segoe UI",Font.PLAIN,12));

        jtablaMedicamentos.setSelectionBackground(new Color(52,152,219));

        jtablaMedicamentos.setSelectionForeground(Color.WHITE);

        jtablaMedicamentos.setShowVerticalLines(false);

        jtablaMedicamentos.setGridColor(new Color(220,220,220));
        //tblHistorial
    }
    private void personalizarTablaHistorial()
    {
        JTableHeader header =tblHistorial.getTableHeader();

        header.setDefaultRenderer(new DefaultTableCellRenderer()
            {
                @Override
                public java.awt.Component getTableCellRendererComponent(JTable table,Object value,boolean isSelected,boolean hasFocus,int row,int column)
                {
                    JLabel lbl =(JLabel) super.getTableCellRendererComponent(table,value,isSelected,hasFocus,row,column);

                    lbl.setBackground(new Color(32,72,140));

                    lbl.setForeground(Color.WHITE);

                    lbl.setFont(new Font("Segoe UI",Font.BOLD,13));

                    lbl.setHorizontalAlignment(SwingConstants.CENTER);

                    lbl.setOpaque(true);

                    return lbl;
                }
            });

        tblHistorial.setRowHeight(28);

        tblHistorial.setFont( new Font("Segoe UI",Font.PLAIN,12));

        tblHistorial.setSelectionBackground(new Color(52,152,219));

        tblHistorial.setSelectionForeground(Color.WHITE);

        tblHistorial.setShowVerticalLines(false);

        tblHistorial.setGridColor(new Color(220,220,220));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaMedicamentos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtMedicamento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbMotivo = new javax.swing.JComboBox<>();
        btnRegistrarEntrada = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHistorial = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(526, 0));

        jPanel1.setBackground(new java.awt.Color(236, 245, 236));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 177, 76));
        jLabel2.setText("GESTIÓN INVENTARIO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 78, 160));
        jLabel3.setText("Buscar Medicamentos:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jtablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Medicamento", "Stock", "Fecha Vencimiento", "Laboratorio"
            }
        ));
        jtablaMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaMedicamentos);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 78, 160));
        jLabel4.setText("Medicamento Seleccionado:");

        txtMedicamento.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(30, 78, 160));
        jLabel5.setText("Stock Actual:");

        txtStock.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 78, 160));
        jLabel6.setText("Cantidad");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(30, 78, 160));
        jLabel7.setText("Motivo:");

        btnRegistrarEntrada.setBackground(new java.awt.Color(70, 230, 120));
        btnRegistrarEntrada.setText("REGISTRAR ENTRADA");
        btnRegistrarEntrada.addActionListener(this::btnRegistrarEntradaActionPerformed);

        tblHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Tipo", "Cantidad", "Observación"
            }
        ));
        jScrollPane2.setViewportView(tblHistorial);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(cmbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrarEntrada)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel2)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEntrada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtablaMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaMedicamentosMouseClicked
   
        int fila = jtablaMedicamentos.getSelectedRow();
        idMedicamentoSeleccionado =Integer.parseInt(jtablaMedicamentos.getValueAt(fila,0).toString());
        txtMedicamento.setText(jtablaMedicamentos.getValueAt(fila,1).toString());
        txtStock.setText(jtablaMedicamentos.getValueAt(fila,2).toString());
        idMedicamentoSeleccionado = Integer.parseInt(jtablaMedicamentos.getValueAt(fila,0).toString());
        listarHistorial(idMedicamentoSeleccionado);
        // TODO add your handling code here:
    }//GEN-LAST:event_jtablaMedicamentosMouseClicked

    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
        
        try
        {
            if(idMedicamentoSeleccionado == 0)
            {
                JOptionPane.showMessageDialog(null,"Seleccione un medicamento");
                return;
            }
            if(txtCantidad.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Ingrese una cantidad");
                return;
            }
            if(cmbMotivo.getSelectedIndex() == 0)
            {
                JOptionPane.showMessageDialog( null,"Seleccione un motivo");
                return;
            }
            int cantidad = Integer.parseInt(txtCantidad.getText());
            if(cantidad <= 0)
            {
                JOptionPane.showMessageDialog(null,"La cantidad debe ser mayor a cero");
                return;
            }

            String motivo = cmbMotivo.getSelectedItem().toString();

            MedicamentoDAO dao = new MedicamentoDAO();

             if(dao.registrarEntrada(idMedicamentoSeleccionado,cantidad))
             {
                 MovimientoInventario mov =new MovimientoInventario();
                 mov.setIdMedicamento(idMedicamentoSeleccionado);
                 mov.setTipoMovimiento("Entrada");
                 mov.setCantidad(cantidad);             
                 mov.setFechaMovimiento(LocalDate.now().toString());             
                 mov.setObservacion(motivo);             
                 MovimientoInventariosDAO daoMov =new MovimientoInventariosDAO();             
                 daoMov.guardar(mov);            
                 JOptionPane.showMessageDialog( null,"Entrada registrada");
                 ListarMedicamentos();
                 txtCantidad.setText("");
                 txtStock.setText("");
                 if(idMedicamentoSeleccionado > 0)
                {
                    listarHistorial(idMedicamentoSeleccionado);
                }

             } 
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog( null,"Error al registrar entrada:"+e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String nombre =txtBuscar.getText().trim();
        MedicamentoDAO dao = new MedicamentoDAO();
        List<Medicamento> lista = dao.buscar(nombre);
        DefaultTableModel modelo = (DefaultTableModel)jtablaMedicamentos.getModel();
        modelo.setRowCount(0);
        for(Medicamento med : lista)
        {
             modelo.addRow(new Object[]
        {
            med.getIdMedicamento(),
            med.getNombre(),
            med.getStock(),
            med.getFechaVencimiento(),
            med.getLaboratorio()
        });
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c)&& c != KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JComboBox<String> cmbMotivo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtablaMedicamentos;
    private javax.swing.JTable tblHistorial;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
