/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hesilfarma;

import DAO.MedicamentoDAO;
import DAO.MovimientoInventariosDAO;
import Modelo.Medicamento;
import Modelo.MovimientoInventario;
import java.time.LocalDate;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        //DefaultTableModel modelo =(DefaultTableModel)tablaMovimientos.getModel();
        //modelo.setRowCount(0);
        ComboBox();
        
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
    private void ComboBox()
    {
        cmbMotivo.removeAllItems();
        cmbMotivo.addItem("Reposición");
        cmbMotivo.addItem("Compra");
        cmbMotivo.addItem("Donación");
        cmbMotivo.addItem("Ajuste");
    }
    /*private void listarMovimientos()
    {
        DefaultTableModel modelo =
                (DefaultTableModel) tablaMovimientos.getModel();

        modelo.setRowCount(0);

        MovimientoInventariosDAO dao =
                new MovimientoInventariosDAO();

        List<MovimientoInventario> lista = dao.listar();

        for(MovimientoInventario mov : lista)
        {
            Object[] fila =
            {
                mov.getIdMovimiento(),
                mov.getIdMedicamento(),
                mov.getTipoMovimiento(),
                mov.getFechaMovimiento(),
                mov.getObservacion()
            };

            modelo.addRow(fila);
        }
    }
*/
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
        btnRegistrarSalida = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(526, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("inventarios");

        jLabel3.setText("Buscar Medicamentos:");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
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

        jLabel4.setText("Medicamento Seleccionado:");

        txtMedicamento.setEditable(false);

        jLabel5.setText("Stock Actual:");

        txtStock.setEditable(false);

        jLabel6.setText("Cantidad");

        jLabel7.setText("Motivo:");

        btnRegistrarEntrada.setText("REGISTRAR ENTRADA");
        btnRegistrarEntrada.addActionListener(this::btnRegistrarEntradaActionPerformed);

        btnRegistrarSalida.setText("REGISTRAR SALIDA");
        btnRegistrarSalida.addActionListener(this::btnRegistrarSalidaActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(cmbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegistrarEntrada)
                                    .addComponent(jLabel4))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(btnRegistrarSalida)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbMotivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarEntrada)
                    .addComponent(btnRegistrarSalida))
                .addContainerGap(234, Short.MAX_VALUE))
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jtablaMedicamentosMouseClicked

    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
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
        int cantidad = Integer.parseInt(txtCantidad.getText());

        String motivo =cmbMotivo.getSelectedItem().toString();
        
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
             
         }
    
       
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed

    private void btnRegistrarSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarSalidaActionPerformed
        
        int cantidad = Integer.parseInt(txtCantidad.getText());
        int stockActual = Integer.parseInt(txtStock.getText());

        if(cantidad > stockActual)
        {
            JOptionPane.showMessageDialog(null,
                    "No hay suficiente stock");
            return;
        }

        String motivo = cmbMotivo.getSelectedItem().toString();

        MedicamentoDAO dao = new MedicamentoDAO();

        if(dao.descontarStock(idMedicamentoSeleccionado,cantidad))
        {
            MovimientoInventario mov = new MovimientoInventario();

            mov.setIdMedicamento(idMedicamentoSeleccionado);
            mov.setTipoMovimiento("Salida");
            mov.setCantidad(cantidad);
            mov.setFechaMovimiento(LocalDate.now().toString());
            mov.setObservacion(motivo);

            MovimientoInventariosDAO daoMov =
                    new MovimientoInventariosDAO();

            daoMov.guardar(mov);

            JOptionPane.showMessageDialog(null,
                    "Salida registrada");

            ListarMedicamentos();
            txtCantidad.setText("");
        }    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarSalidaActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JButton btnRegistrarSalida;
    private javax.swing.JComboBox<String> cmbMotivo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtablaMedicamentos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtMedicamento;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
