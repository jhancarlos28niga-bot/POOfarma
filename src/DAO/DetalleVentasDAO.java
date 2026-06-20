/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.DetalleVenta;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author jhanc
 */
public class DetalleVentasDAO {
    Conexion cn = new Conexion(); 
    public boolean guardar(DetalleVenta det)
    {
        String sql ="INSERT INTO DetalleVentas "
                    + "(ID_Venta, ID_Medicamento, "
                    + "Cantidad, Precio_Unitario, Subtotal) "
                    + "VALUES (?, ?, ?, ?, ?)";
        try
        {
            Connection con = cn.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, det.getIdVenta());
            ps.setInt(2, det.getIdMedicamento());
            ps.setInt(3, det.getCantidad());
            ps.setDouble(4, det.getPrecioUnitario());
            ps.setDouble(5, det.getSubtotal());

            ps.executeUpdate();
            return true;
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
            return false;
        }
    }
    

}
