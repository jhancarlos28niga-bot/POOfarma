
package hesilfarma;

import DAO.MedicamentoDAO;
import Modelo.Medicamento;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class medicamentos extends javax.swing.JPanel {
    private int idSeleccionado = 0;
    public medicamentos() 
    {
        initComponents();
        ((JTextField) txtFecha.getDateEditor().getUiComponent()).setEditable(false);
        listarMedicamentos();
        jtablaMedicamentos.setDefaultEditor(Object.class, null);
        jtablaMedicamentos.getColumnModel().getColumn(2).setMinWidth(0);

        jtablaMedicamentos.getColumnModel().getColumn(2).setMaxWidth(0);

        jtablaMedicamentos.getColumnModel().getColumn(2).setPreferredWidth(0);
        
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setWrapStyleWord(true);
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
                med.getLaboratorio()

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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("MEDICAMENTOS");

        jLabel3.setText("Buscar Medicamento:");

        txtBuscarMedicamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarMedicamentoKeyReleased(evt);
            }
        });

        jtablaMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripción", "Categoría", "Stock", "Precio", "Fecha_Vencimiento", "Laboratorio"
            }
        ));
        jtablaMedicamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaMedicamentosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtablaMedicamentos);

        jLabel4.setText("Nombre:");

        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Descripción:");

        jLabel6.setText("Categoría:");

        jLabel7.setText("Stock:");

        jLabel8.setText("Precio:");

        jLabel9.setText("Fecha Vencimiento:");

        jLabel10.setText("Laboratorio:");

        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(this::btnGuardarActionPerformed);

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(this::btnActualizarActionPerformed);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnLimpiar.setText("LIMPIAR");
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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel4)
                                        .addGap(21, 21, 21)
                                        .addComponent(txtNombre))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel6))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtStock)
                                            .addComponent(txtPrecio)
                                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(28, 28, 28)
                                .addComponent(btnActualizar)
                                .addGap(34, 34, 34)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(btnLimpiar))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31))))))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnEliminar)
                            .addComponent(btnActualizar)
                            .addComponent(btnGuardar)))
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
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtLaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
       if(txtNombre.getText().trim().isEmpty())
       {
           JOptionPane.showMessageDialog(null,"Ingrese el nombre");
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
       int stock;
       double precio;
      try {
              
             stock = Integer.parseInt( txtStock.getText().trim());
             if(stock < 0)
             {
                 JOptionPane.showMessageDialog(null,"El stock no puede ser negativo");
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

       Medicamento med = new Medicamento();

       med.setNombre(txtNombre.getText().trim());

       med.setDescripcion(txtDescripcion.getText().trim());

       med.setCategoria(cbCategoria.getSelectedItem().toString());

       med.setStock(stock);

       med.setPrecio(precio);

       med.setLaboratorio(txtLaboratorio.getText().trim());

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

        med.setFechaVencimiento(formato.format(txtFecha.getDate()));
        
        MedicamentoDAO dao = new MedicamentoDAO();

        if(dao.guardar(med))
        {
            JOptionPane.showMessageDialog( null,"Medicamento guardado correctamente");
            listarMedicamentos();
            Limpiar();    

        }else
        {
            JOptionPane.showMessageDialog( null,"Error al guardar medicamento");
        } 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jtablaMedicamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtablaMedicamentosMouseClicked
        int fila = jtablaMedicamentos.getSelectedRow();
            if(fila >= 0)
            {
                idSeleccionado = Integer.parseInt(jtablaMedicamentos.getValueAt(fila,0).toString());
                
                txtNombre.setText(jtablaMedicamentos.getValueAt(fila,1).toString());
                
                txtDescripcion.setText(jtablaMedicamentos.getValueAt(fila,2).toString());
                
                cbCategoria.setSelectedItem(jtablaMedicamentos.getValueAt(fila,3).toString());

                txtStock.setText(jtablaMedicamentos.getValueAt(fila,4).toString());

                txtPrecio.setText(jtablaMedicamentos.getValueAt(fila,5).toString());
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
        if(idSeleccionado == 0)
        {
            JOptionPane.showMessageDialog(null,"Seleccione un medicamento");
            return;
        }

        if(txtNombre.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Ingrese el nombre");
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
        int stock;
        double precio;

            try {
                stock = Integer.parseInt(txtStock.getText().trim());

                if(stock < 0)
                {
                    JOptionPane.showMessageDialog(null,"El stock no puede ser negativo");
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

            listarMedicamentos();
            Limpiar();
            
        }
        else
        {
            JOptionPane.showMessageDialog( null,"No se pudo actualizar");
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

