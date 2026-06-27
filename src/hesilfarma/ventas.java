    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package hesilfarma;

import DAO.ClientesDAO;
import DAO.DetalleVentasDAO;
import DAO.MedicamentoDAO;
import DAO.MovimientoInventariosDAO;
import DAO.VentasDAO;
import Modelo.Cliente;
import Modelo.DetalleVenta;
import Modelo.Medicamento;
import Modelo.MovimientoInventario;
import Modelo.Ventas;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public class ventas extends javax.swing.JPanel {

    /**
     * Creates new form ventas
     */
    private int idMedicamentoSeleccionado = 0;
    private String nombreMedicamentoSeleccionado = "";
    private double precioSeleccionado = 0;
    private int stockSeleccionado = 0;
    private double totalGeneral = 0;
    private int idClienteSeleccionado = 0;
    public ventas() {
        initComponents();
        ListarMedicamentos();
        fechaVenta.setText(LocalDate.now().format( DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        tablaVenta.getColumnModel().getColumn(0).setMinWidth(0);
        tablaVenta.getColumnModel() .getColumn(0).setMaxWidth(0);
        tablaVenta.getColumnModel().getColumn(0).setWidth(0);
        DefaultTableModel modelo =(DefaultTableModel) tablaVenta.getModel();
        modelo.setRowCount(0);
        personalizarTablaMedicamento();
        personalizarTablaVenta();
    }
    private void ListarMedicamentos()
    {
        DefaultTableModel modelo =(DefaultTableModel) jtablaMedicamentos.getModel();

        modelo.setRowCount(0);

        MedicamentoDAO dao = new MedicamentoDAO();

        List<Medicamento> lista = dao.listarDisponibles();

        for (Medicamento med : lista) 
        {

            Object[] fila = 
            {

                med.getIdMedicamento(),
                med.getNombre(),
                med.getStock(),
                med.getPrecio()
            };
            modelo.addRow(fila);
        }
         
    }
    private void personalizarTablaMedicamento()
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
    }
    private void personalizarTablaVenta()
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

        tablaVenta.setRowHeight(28);

        tablaVenta.setFont( new Font("Segoe UI",Font.PLAIN,12));

        tablaVenta.setSelectionBackground(new Color(52,152,219));

        tablaVenta.setSelectionForeground(Color.WHITE);

        tablaVenta.setShowVerticalLines(false);

        tablaVenta.setGridColor(new Color(220,220,220));
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarMed = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaMedicamentos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaVenta = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        btnQuitarProducto = new javax.swing.JButton();
        btnCancelarVenta = new javax.swing.JButton();
        btnRegistrarVenta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDNIbuscar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        fechaVenta = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(526, 0));

        jPanel1.setBackground(new java.awt.Color(241, 248, 241));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(34, 177, 76));
        jLabel2.setText("GESTIÓN DE VENTAS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(30, 78, 160));
        jLabel3.setText("Buscar Medicamentos:");

        txtBuscarMed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarMedKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarMedKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(30, 78, 160));
        jLabel4.setText("MEDICAMENTOS DISPONIBLES:");

        jtablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Stock", "Precio"
            }
        ));
        jtablaMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaMedicamentos);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(30, 78, 160));
        jLabel5.setText("Cantidad:");

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        btnAgregarProducto.setBackground(new java.awt.Color(70, 230, 120));
        btnAgregarProducto.setText("AGREGAR PRODUCTO");
        btnAgregarProducto.addActionListener(this::btnAgregarProductoActionPerformed);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(30, 78, 160));
        jLabel6.setText("DETALLE DE VENTA");

        tablaVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_Medicamento", "Nombre", "Cantidad", "Precio", "SubTotal"
            }
        ));
        jScrollPane2.setViewportView(tablaVenta);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(34, 177, 76));
        jLabel7.setText("TOTAL:");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(34, 177, 76));
        lblTotal.setText("0.00");

        btnQuitarProducto.setBackground(new java.awt.Color(255, 90, 90));
        btnQuitarProducto.setText("QUITAR PRODUCTO");
        btnQuitarProducto.addActionListener(this::btnQuitarProductoActionPerformed);

        btnCancelarVenta.setBackground(new java.awt.Color(255, 170, 50));
        btnCancelarVenta.setText("CANCELAR VENTA ");
        btnCancelarVenta.addActionListener(this::btnCancelarVentaActionPerformed);

        btnRegistrarVenta.setBackground(new java.awt.Color(34, 177, 76));
        btnRegistrarVenta.setText("REGISTRAR VENTA");
        btnRegistrarVenta.addActionListener(this::btnRegistrarVentaActionPerformed);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 78, 160));
        jLabel1.setText("DNI:");

        txtDNIbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIbuscarKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(30, 78, 160));
        jLabel9.setText("Cliente:");

        txtNombreCliente.setEditable(false);
        txtNombreCliente.setForeground(new java.awt.Color(34, 177, 76));

        btnBuscarCliente.setBackground(new java.awt.Color(70, 170, 255));
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(this::btnBuscarClienteActionPerformed);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(30, 78, 160));
        jLabel10.setText("Fecha Venta:");

        fechaVenta.setForeground(new java.awt.Color(30, 78, 160));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(30, 78, 160));
        jLabel8.setText("Nombre:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDNIbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCliente))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAgregarProducto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTotal))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnQuitarProducto)
                                    .addGap(31, 31, 31)
                                    .addComponent(btnCancelarVenta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrarVenta))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(211, 211, 211))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDNIbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(fechaVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarVenta)
                    .addComponent(btnRegistrarVenta)
                    .addComponent(btnQuitarProducto))
                .addGap(302, 302, 302))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        try
        {
           String dni = txtDNIbuscar.getText().trim();
            if(!dni.matches("\\d{8}"))
            {
                JOptionPane.showMessageDialog(null,"Ingrese un DNI válido");
                return;
            }
            ClientesDAO dao = new ClientesDAO();
            Cliente cli = dao.buscarCliente(dni);
            if(cli != null)
            {
                idClienteSeleccionado =cli.getID_Cliente();
                txtNombreCliente.setText(cli.getNombre());

            }else
            {
                JOptionPane.showMessageDialog(null,"Cliente no encontrado");
                idClienteSeleccionado = 0;
                txtNombreCliente.setText("");
            } 
        }catch(Exception e)
        {
             JOptionPane.showMessageDialog(null,"Error al buscar cliente: "+ e.getMessage());
        }
            
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void txtBuscarMedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMedKeyReleased
        String nombre =txtBuscarMed.getText().trim();
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
            med.getPrecio()
        });
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMedKeyReleased

    private void jtablaMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaMedicamentosMouseClicked
        
    int fila =
        jtablaMedicamentos.getSelectedRow();

    if(fila >= 0)
    {
        idMedicamentoSeleccionado = Integer.parseInt(jtablaMedicamentos.getValueAt(fila,0).toString());

        nombreMedicamentoSeleccionado = jtablaMedicamentos.getValueAt(fila,1).toString();

        stockSeleccionado =  Integer.parseInt(jtablaMedicamentos.getValueAt(fila,2).toString());

        precioSeleccionado =Double.parseDouble( jtablaMedicamentos.getValueAt(fila,3).toString());
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jtablaMedicamentosMouseClicked

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
     try
     {
      if(idMedicamentoSeleccionado == 0)
      {
         JOptionPane.showMessageDialog( null, "Seleccione un medicamento");
         return;
      }

      if(txtCantidad.getText().trim().isEmpty())
      {
         JOptionPane.showMessageDialog(null,"Ingrese la cantidad");
         return;
      }

      int cantidad =Integer.parseInt(txtCantidad.getText());

      if(cantidad <= 0)
      {
         JOptionPane.showMessageDialog(null,"Cantidad inválida");
         return;
      }

      if(cantidad > stockSeleccionado)
      {
         JOptionPane.showMessageDialog(null,"Stock insuficiente");
         return;
      }

      double subtotal =cantidad * precioSeleccionado;

      DefaultTableModel modelo =(DefaultTableModel)
      tablaVenta.getModel();
      modelo.addRow(new Object[]{idMedicamentoSeleccionado,nombreMedicamentoSeleccionado,cantidad, precioSeleccionado,subtotal});

      totalGeneral += subtotal;

      lblTotal.setText( "S/. " + String.format("%.2f", totalGeneral));
      txtCantidad.setText("");  
     }catch(Exception e)
     {
         JOptionPane.showMessageDialog(null,"Error al Agregar producto: "+ e.getMessage());
     }
    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void btnQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarProductoActionPerformed
        int fila = tablaVenta.getSelectedRow();
         if(fila < 0)
         {
            JOptionPane.showMessageDialog( null,"Seleccione un producto");
            return;
        }
        double subtotal =Double.parseDouble(tablaVenta.getValueAt(fila,4).toString());
        totalGeneral -= subtotal;
        DefaultTableModel modelo =(DefaultTableModel)tablaVenta.getModel();
         modelo.removeRow(fila);
         lblTotal.setText("S/. " +String.format("%.2f",totalGeneral));
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuitarProductoActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
         DefaultTableModel modelo =(DefaultTableModel) tablaVenta.getModel();
         modelo.setRowCount(0);
         totalGeneral = 0;
         lblTotal.setText("S/. 0.00");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarVentaActionPerformed

    private void btnRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVentaActionPerformed
        if(idClienteSeleccionado == 0)
        {
             JOptionPane.showMessageDialog( null,"Seleccione un cliente");
             return;
        }
        if(tablaVenta.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(  null,"No hay productos en la venta");
            return;
        }
        try
        {
            Ventas venta = new Ventas();
            venta.setID_cliente(idClienteSeleccionado);
            venta.setFechaVenta(LocalDate.now());
            venta.setTotal(totalGeneral);
            VentasDAO daoVenta =new VentasDAO();
            int idVentaGenerada = daoVenta.guardarVenta(venta);
            if(idVentaGenerada <= 0)
            {
                JOptionPane.showMessageDialog(  null, "No se pudo registrar la venta");
                return;
            }
            DetalleVentasDAO daoDetalle = new DetalleVentasDAO();
            DefaultTableModel modelo =(DefaultTableModel)tablaVenta.getModel();
            for(int i = 0;i < modelo.getRowCount(); i++)
            {
                 DetalleVenta det = new DetalleVenta();
                 det.setIdVenta(idVentaGenerada);
                 det.setIdMedicamento(Integer.parseInt( modelo.getValueAt(i,0) .toString()));
                 det.setCantidad( Integer.parseInt( modelo.getValueAt(i,2).toString()));
                 det.setPrecioUnitario( Double.parseDouble(modelo.getValueAt(i,3).toString()));
                 det.setSubtotal(Double.parseDouble( modelo.getValueAt(i,4).toString()));
                 daoDetalle.guardar(det);
                 MedicamentoDAO daoMedicamento = new MedicamentoDAO();
                 daoMedicamento.descontarStock(det.getIdMedicamento(),det.getCantidad());
                 MovimientoInventario mov = new MovimientoInventario();
                 mov.setIdMedicamento(det.getIdMedicamento());
                 mov.setTipoMovimiento("Salida");
                 mov.setCantidad(det.getCantidad());
                 mov.setFechaMovimiento(LocalDate.now().toString());
                 mov.setObservacion("Venta");

                MovimientoInventariosDAO daoMov = new MovimientoInventariosDAO();
                daoMov.guardar(mov);
            }
             JOptionPane.showMessageDialog(null,"Venta registrada correctamente");
             modelo.setRowCount(0);
             totalGeneral = 0;
             lblTotal.setText("S/. 0.00");
             txtCantidad.setText("");
             ListarMedicamentos();
             idClienteSeleccionado = 0;
            txtDNIbuscar.setText("");
            txtNombreCliente.setText("");
            idMedicamentoSeleccionado = 0;
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
        }   // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarVentaActionPerformed

    private void txtDNIbuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIbuscarKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }

        if(txtDNIbuscar.getText().length() >= 8)
        {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIbuscarKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
         if(!Character.isDigit(evt.getKeyChar()))
        {
            evt.consume();
        }   
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtBuscarMedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMedKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c)
                && c != KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMedKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCancelarVenta;
    private javax.swing.JButton btnQuitarProducto;
    private javax.swing.JButton btnRegistrarVenta;
    private javax.swing.JLabel fechaVenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtablaMedicamentos;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tablaVenta;
    private javax.swing.JTextField txtBuscarMed;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDNIbuscar;
    private javax.swing.JTextField txtNombreCliente;
    // End of variables declaration//GEN-END:variables
}
