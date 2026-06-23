/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import conexion.Conexion;
import java.sql.Connection;
import Modelo.Ventas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jhanc
 */

public class VentasDAO {
    Conexion cn = new Conexion();
    public int guardarVenta(Ventas venta)
    {
        String sql =
        "INSERT INTO Ventas "
      + "(ID_Cliente, FechaVenta, Total) "
      + "VALUES (?, ?, ?)";
      
     try
     {
         Connection con = cn.conectar();
         PreparedStatement ps =con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
         ps.setInt(1, venta.getID_cliente());
         ps.setDate(2, java.sql.Date.valueOf( venta.getFechaVenta()));
         ps.setDouble(3, venta.getTotal());
         
         ps.executeUpdate();
         
         ResultSet rs = ps.getGeneratedKeys();
         
          if(rs.next())
          {
            return rs.getInt(1);
          }
     }catch(SQLException e)
     {
          JOptionPane.showMessageDialog(null,"Error: " + e.getMessage());
     }
     return -1;
    }
    
    
    
}
