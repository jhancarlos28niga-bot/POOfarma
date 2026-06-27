
package hesilfarma;

import DAO.MedicamentoDAO;
import Modelo.Medicamento;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class medicamentos extends javax.swing.JPanel {
    private int idSeleccionado = 0;
    public medicamentos() 
    {
        initComponents();
        ((JTextField) txtFecha.getDateEditor().getUiComponent()).setEditable(false);
        listarMedicamentos();
        ocultarColumnas();
        
        
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
        jtablaMedicamentos.setRowHeight(25);
        personalizarTabla();
        
       
    }
    private void ocultarColumnas()
    {
        jtablaMedicamentos.setDefaultEditor(Object.class, null);
        jtablaMedicamentos.getColumnModel().getColumn(2).setMinWidth(0);

        jtablaMedicamentos.getColumnModel().getColumn(2).setMaxWidth(0);

        jtablaMedicamentos.getColumnModel().getColumn(2).setPreferredWidth(0);
        
        jtablaMedicamentos.getColumnModel().getColumn(0).setMinWidth(0);
        
        jtablaMedicamentos.getColumnModel().getColumn(0).setPreferredWidth(0);
        
        jtablaMedicamentos.getColumnModel().getColumn(0).setMaxWidth(0);
        
        
        jtablaMedicamentos.getColumnModel().getColumn(8).setMinWidth(0);
        
        jtablaMedicamentos.getColumnModel().getColumn(8).setPreferredWidth(0);
        
        jtablaMedicamentos.getColumnModel().getColumn(8).setMaxWidth(0);
    }
    private void listarMedicamentos() {

        DefaultTableModel modelo =(DefaultTableModel) jtablaMedicamentos.getModel();

        modelo.setRowCount(0);

        MedicamentoDAO dao = new MedicamentoDAO();

        List<Medicamento> lista = dao.listar();

        for (Medicamento med : lista) 
        {

            Object[] fila = 
            {

                med.getIdMedicamento(),
                med.getNombre(),
                med.getDescripcion(),
                med.getCategoria(),
                med.getStock(),
                med.getPrecio(),
                med.getFechaVencimiento(),
                med.getLaboratorio(),
                med.getEstado()

            };

            modelo.addRow(fila);
        }
    }
    
    @SuppressWarnings("unchecked")
    private void Limpiar()
    {
        txtNombre.setText("");
        txtDescripcion.setText("");
        txtStock.setText("");
        txtPrecio.setText("");
        txtLaboratorio.setText("");
        txtFecha.setDate(null);
        cbCategoria.setSelectedIndex(0);
        txtNombre.requestFocus();    
        idSeleccionado = 0;
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
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarMedicamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtablaMedicamentos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtLaboratorio = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtFecha = new com.toedter.calendar.JDateChooser();
        cbCategoria = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(526, 0));

        jPanel2.setBackground(new java.awt.Color(236, 245, 236));

        jLabel2.setBackground(new java.awt.Color(39, 174, 96));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(39, 174, 96));
        jLabel2.setText("MEDICAMENTOS");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(32, 72, 140));
        jLabel3.setText("Buscar Medicamento:");

        txtBuscarMedicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarMedicamentoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarMedicamentoKeyTyped(evt);
            }
        });

        jtablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripción", "Categoría", "Stock", "Precio", "Fecha_Vencimiento", "Laboratorio", "Estado"
            }
        ));
        jtablaMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaMedicamentos);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(32, 72, 140));
        jLabel4.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(250, 250, 250));
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(32, 72, 140));
        jLabel5.setText("Descripción:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 72, 140));
        jLabel6.setText("Categoría:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(32, 72, 140));
        jLabel7.setText("Stock:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(32, 72, 140));
        jLabel8.setText("Precio:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(32, 72, 140));
        jLabel9.setText("Fecha Vencimiento:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(32, 72, 140));
        jLabel10.setText("Laboratorio:");

        txtStock.setBackground(new java.awt.Color(250, 250, 250));
        txtStock.setForeground(new java.awt.Color(0, 0, 0));
        txtStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStockKeyTyped(evt);
            }
        });

        txtPrecio.setBackground(new java.awt.Color(250, 250, 250));
        txtPrecio.setForeground(new java.awt.Color(0, 0, 0));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        txtLaboratorio.setBackground(new java.awt.Color(250, 250, 250));
        txtLaboratorio.setForeground(new java.awt.Color(0, 0, 0));
        txtLaboratorio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLaboratorioKeyTyped(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(46, 204, 113));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnActualizar.setBackground(new java.awt.Color(52, 152, 219));
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnEliminar.setBackground(new java.awt.Color(231, 76, 60));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnLimpiar.setBackground(new java.awt.Color(52, 152, 219));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setPreferredSize(new java.awt.Dimension(100, 30));
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Categoría", "Tabletas", "Jarabe", "Cápsulas", "Inyectable", "Crema" }));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(7, 7, 7)
                                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtPrecio))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(69, 69, 69)
                                    .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBuscarMedicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(3, 3, 3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
       try
       {
   
       
            if(txtNombre.getText().trim().isEmpty())
           {
               JOptionPane.showMessageDialog(null,"Ingrese el nombre");
               return;
           }
           if(txtNombre.getText().trim().length() < 3)
            {
                JOptionPane.showMessageDialog(null,"Ingrese un nombre válido");
                return;
            }
           if(cbCategoria.getSelectedIndex()==0)
           {
                JOptionPane.showMessageDialog(null,"Seleccione una categoría");
                return;
           }
           if(txtStock.getText().trim().isEmpty())
           {
               JOptionPane.showMessageDialog(null,"Ingrese el stock");
               return;
           }
           if(txtPrecio.getText().trim().isEmpty())
           {
             JOptionPane.showMessageDialog(null,"Ingrese el precio");
             return;
           }
           if(txtFecha.getDate() ==null)
           {
               JOptionPane.showMessageDialog(null,"Seleccione una fecha");
               return;
           }
           if(txtFecha.getDate().before(new java.util.Date()))
            {
                JOptionPane.showMessageDialog(null,"La fecha de vencimiento debe ser futura");
                return;
            }
           if(txtLaboratorio.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Ingrese el laboratorio");
                return;
            }
           if(txtDescripcion.getText().trim().isEmpty())
           {
               JOptionPane.showMessageDialog(null,"Ingrese una descripción");
                return;
           }
           int stock;
           double precio;
          try {

                 stock = Integer.parseInt( txtStock.getText().trim());
                 if(stock < 0)
                 {
                     JOptionPane.showMessageDialog(null,"El stock no puede ser negativo");
                     return;
                 }
                 if(stock == 0)
                 {
                     JOptionPane.showMessageDialog(null,"El stock no puede ser 0");
                     return;
                 }

                 precio = Double.parseDouble( txtPrecio.getText().trim());

                 if(precio <= 0)
                 {
                     JOptionPane.showMessageDialog(null,"El precio debe ser mayor a 0");
                     return;
                 }

             } catch(NumberFormatException e) {

                 JOptionPane.showMessageDialog(null,"Stock y Precio deben ser numéricos");
                 return;
             }
          MedicamentoDAO dao = new MedicamentoDAO();

            if (dao.existeMedicamento(txtNombre.getText().trim(),cbCategoria.getSelectedItem().toString())) 
            {
                JOptionPane.showMessageDialog(null,"Ya existe un medicamento con ese nombre y categoría.");
                return;
            }

           Medicamento med = new Medicamento();

           med.setNombre(txtNombre.getText().trim());

           med.setDescripcion(txtDescripcion.getText().trim());

           med.setCategoria(cbCategoria.getSelectedItem().toString());

           med.setStock(stock);

           med.setPrecio(precio);

           med.setLaboratorio(txtLaboratorio.getText().trim());

            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

            med.setFechaVencimiento(formato.format(txtFecha.getDate()));


            if(dao.guardar(med))
            {
                JOptionPane.showMessageDialog( null,"Medicamento guardado correctamente");
                listarMedicamentos();
                Limpiar();    

            }else
            {
                JOptionPane.showMessageDialog( null,"Error al guardar medicamento");
            } 
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtablaMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaMedicamentosMouseClicked
        int fila = jtablaMedicamentos.getSelectedRow();
            if(fila >= 0)
            {
                idSeleccionado = Integer.parseInt(jtablaMedicamentos.getValueAt(fila,0).toString());
                
                txtNombre.setText(jtablaMedicamentos.getValueAt(fila,1).toString());
                txtNombre.setEditable(false);
                
                txtDescripcion.setText(jtablaMedicamentos.getValueAt(fila,2).toString());
                
                cbCategoria.setSelectedItem(jtablaMedicamentos.getValueAt(fila,3).toString());

                txtStock.setText(jtablaMedicamentos.getValueAt(fila,4).toString());

                txtPrecio.setText(jtablaMedicamentos.getValueAt(fila,5).toString());
                btnGuardar.setEnabled(false);
                btnActualizar.setEnabled(true);
                btnEliminar.setEnabled(true);
                try {
                    
                        SimpleDateFormat formato =new SimpleDateFormat("yyyy-MM-dd");
                       
                        Date fecha = formato.parse( jtablaMedicamentos.getValueAt(fila,6).toString());

                        txtFecha.setDate(fecha);

                    } catch (Exception e) 
                    {
                        e.printStackTrace();

                    }
                txtLaboratorio.setText(jtablaMedicamentos.getValueAt(fila,7).toString());
            }
        // TODO add your handling code here:
    }//GEN-LAST:event_jtablaMedicamentosMouseClicked

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try
        {
            
        
            if(idSeleccionado == 0)
            {
                JOptionPane.showMessageDialog(null,"Seleccione un medicamento");
                return;
            }

            if(cbCategoria.getSelectedIndex()==0)
            {
                JOptionPane.showMessageDialog(null,"Seleccione una categoría");
                return;
            }

            if(txtStock.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog( null,"Ingrese el stock");
                return;
            }

            if(txtPrecio.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Ingrese el precio");
                return;
            }


            if(txtFecha.getDate() == null)
            {
                JOptionPane.showMessageDialog(null,"Seleccione una fecha");
                return;
            }
            if(txtFecha.getDate().before(new java.util.Date()))
            {
                JOptionPane.showMessageDialog(null,"La fecha de vencimiento debe ser futura");
                return;
            }
            if(txtLaboratorio.getText().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Ingrese el laboratorio");
                return;
            }
            if(txtDescripcion.getText().trim().isEmpty())
            {
               JOptionPane.showMessageDialog(null,"Ingrese una descripción");
                return;
            }
            int stock;
            double precio;

                try {
                    stock = Integer.parseInt(txtStock.getText().trim());

                    if(stock < 0)
                    {
                        JOptionPane.showMessageDialog(null,"El stock no puede ser negativo");
                        return;
                    }
                    if(stock == 0)
                 {
                     JOptionPane.showMessageDialog(null,"El stock no puede ser 0");
                     return;
                 }

                    precio = Double.parseDouble(txtPrecio.getText().trim());

                    if(precio <= 0)
                    {
                        JOptionPane.showMessageDialog(null,"El precio debe ser mayor a 0");
                        return;
                    }
                     } catch(NumberFormatException e) {

                        JOptionPane.showMessageDialog(null,"Stock y Precio deben ser numéricos");
                        return;
                    }


            Medicamento med = new Medicamento();

            med.setIdMedicamento(idSeleccionado);

            med.setNombre(txtNombre.getText().trim());

            med.setDescripcion(txtDescripcion.getText().trim());

            med.setCategoria(cbCategoria.getSelectedItem().toString());

            med.setStock(stock);

            med.setPrecio(precio);

            med.setLaboratorio(txtLaboratorio.getText().trim());

            SimpleDateFormat formato =new SimpleDateFormat("yyyy-MM-dd");

            med.setFechaVencimiento(formato.format(txtFecha.getDate()));

            MedicamentoDAO dao = new MedicamentoDAO();

            if(dao.actualizar(med))
            {
                JOptionPane.showMessageDialog(null,"Medicamento actualizado correctamente");
                btnGuardar.setEnabled(true);
                listarMedicamentos();
                Limpiar();

            }
            else
            {
                JOptionPane.showMessageDialog( null,"No se pudo actualizar");
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if(idSeleccionado == 0)
        {
            JOptionPane.showMessageDialog( null,"Seleccione un medicamento");
            return;
        }
        int respuesta = JOptionPane.showConfirmDialog(null,"¿Desea eliminar este medicamento?","Confirmar eliminación", JOptionPane.YES_NO_OPTION);
       if(respuesta == JOptionPane.YES_OPTION)
       {
           MedicamentoDAO medicamento = new MedicamentoDAO();
           if(medicamento.eliminar(idSeleccionado))
           {
               JOptionPane.showMessageDialog( null,"Medicamento eliminado");
               btnGuardar.setEnabled(true);
               listarMedicamentos();
               Limpiar();
           }else
           {
               JOptionPane.showMessageDialog(null,"No se pudo eliminar");
           }
       }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Limpiar();
        txtNombre.setEditable(true);
        btnGuardar.setEnabled(true);
        jtablaMedicamentos.clearSelection();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarMedicamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMedicamentoKeyReleased
        String nombre =txtBuscarMedicamento.getText().trim();
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
            med.getDescripcion(),
            med.getCategoria(),
            med.getStock(),
            med.getPrecio(),
            med.getFechaVencimiento(),
            med.getLaboratorio()
        });
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMedicamentoKeyReleased

    private void txtStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStockKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c)&& c != '.')
        {
            evt.consume();
        }

        if(c == '.'&& txtPrecio.getText().contains("."))
        {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtLaboratorioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLaboratorioKeyTyped
        char c = evt.getKeyChar();
        
        if(!Character.isLetter(c)&& c != KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLaboratorioKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c)&& c != KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtBuscarMedicamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMedicamentoKeyTyped
        char c = evt.getKeyChar();

        if(!Character.isLetter(c)&& c != KeyEvent.VK_SPACE)
        {
            evt.consume();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMedicamentoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtablaMedicamentos;
    private javax.swing.JTextField txtBuscarMedicamento;
    private javax.swing.JTextArea txtDescripcion;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtLaboratorio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}

