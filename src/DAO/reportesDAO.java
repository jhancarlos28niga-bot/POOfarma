/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.reporte;
import conexion.Conexion;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

/**
 *
 * @author jhanc
 */
public class reportesDAO {
    Conexion cn = new Conexion();
    public List<reporte> listarVentas()
    {

        List<reporte> lista = new ArrayList<>();

        String sql =
                "SELECT "
                + "V.FechaVenta, "
                + "C.Nombre AS Cliente, "
                + "M.Nombre AS Medicamento, "
                + "D.Cantidad, "
                + "D.Precio_Unitario, "
                + "D.Subtotal "
                + "FROM Ventas V "
                + "INNER JOIN Clientes C "
                + "ON V.ID_Cliente = C.ID_Cliente "
                + "INNER JOIN DetalleVentas D "
                + "ON V.ID_Venta = D.ID_Venta "
                + "INNER JOIN Medicamentos M "
                + "ON D.ID_Medicamento = M.ID_Medicamento";
        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps =con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                reporte rep = new reporte();

                rep.setFecha(rs.getDate("FechaVenta").toLocalDate());

                rep.setCliente(rs.getString("Cliente"));

                rep.setMedicamento(rs.getString("Medicamento"));

                rep.setCantidad(rs.getInt("Cantidad"));

                rep.setPrecio(rs.getDouble("Precio_Unitario"));

                rep.setSubtotal(rs.getDouble("Subtotal"));

                lista.add(rep);
            }
        }catch(SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Error Reporte: "+ e.getMessage());
        }
        return lista;
    }
    public double totalVentas()
    {
        double total = 0;

        String sql ="SELECT SUM(Total) AS Total "+ "FROM Ventas";
         try
         {
            Connection con = cn.conectar();

            PreparedStatement ps =con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
             total = rs.getDouble("Total");
            }

         }catch(SQLException e)
          {
                JOptionPane.showMessageDialog(null,e.getMessage());
          }
          return total;
    }
    public int productosVendidos()
    {
        int total = 0;
        String sql ="SELECT SUM(Cantidad) AS Total "+ "FROM DetalleVentas";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps =con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                total =rs.getInt("Total");
            }

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return total;
    }
    public int numeroVentas()
    {
        int total = 0;

        String sql =
                "SELECT COUNT(*) AS Total "
                + "FROM Ventas";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                total =rs.getInt("Total");
            }

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return total;
    }
    public String medicamentoMasVendido()
    {
        String nombre = "-";

        String sql =
                "SELECT TOP 1 "
                + "M.Nombre "
                + "FROM DetalleVentas D "
                + "INNER JOIN Medicamentos M "
                + "ON D.ID_Medicamento = M.ID_Medicamento "
                + "GROUP BY M.Nombre "
                + "ORDER BY SUM(D.Cantidad) DESC";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                nombre = rs.getString("Nombre");
            }

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return nombre;
    }
    public List<reporte> buscarPorFechas(java.sql.Date inicio,java.sql.Date fin)
    {
        List<reporte> lista =new ArrayList<>();

        String sql =
                "SELECT "
                + "V.FechaVenta, "
                + "C.Nombre AS Cliente, "
                + "M.Nombre AS Medicamento, "
                + "D.Cantidad, "
                + "D.Precio_Unitario, "
                + "D.Subtotal "
                + "FROM Ventas V "
                + "INNER JOIN Clientes C "
                + "ON V.ID_Cliente = C.ID_Cliente "
                + "INNER JOIN DetalleVentas D "
                + "ON V.ID_Venta = D.ID_Venta "
                + "INNER JOIN Medicamentos M "
                + "ON D.ID_Medicamento = M.ID_Medicamento "
                + "WHERE V.FechaVenta "
                + "BETWEEN ? AND ?";

        try
        {
            Connection con =cn.conectar();

            PreparedStatement ps =con.prepareStatement(sql);

            ps.setDate(1, inicio);
            ps.setDate(2, fin);

            ResultSet rs =ps.executeQuery();

            while(rs.next())
            {
                reporte rep =new reporte();

                rep.setFecha(rs.getDate("FechaVenta").toLocalDate());

                rep.setCliente(rs.getString("Cliente"));

                rep.setMedicamento(rs.getString("Medicamento"));

                rep.setCantidad(rs.getInt("Cantidad"));

                rep.setPrecio(rs.getDouble("Precio_Unitario"));

                rep.setSubtotal(rs.getDouble("Subtotal"));

                lista.add(rep);
            }

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return lista;
    }
    public double totalVentasPorFecha(java.sql.Date inicio,java.sql.Date fin)
    {
        double total = 0;

        String sql =
                "SELECT SUM(Total) AS Total "
                + "FROM Ventas "
                + "WHERE FechaVenta "
                + "BETWEEN ? AND ?";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps =con.prepareStatement(sql);

            ps.setDate(1, inicio);
            ps.setDate(2, fin);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                total = rs.getDouble("Total");
            }

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return total;
    }
    public int productosVendidosPorFecha(java.sql.Date inicio,java.sql.Date fin)
    {
        int total = 0;

        String sql =
                "SELECT SUM(D.Cantidad) AS Total "
                + "FROM DetalleVentas D "
                + "INNER JOIN Ventas V "
                + "ON D.ID_Venta = V.ID_Venta "
                + "WHERE V.FechaVenta "
                + "BETWEEN ? AND ?";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps =con.prepareStatement(sql);

            ps.setDate(1, inicio);
            ps.setDate(2, fin);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                total = rs.getInt("Total");
            }

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return total;
    }
    public int numeroVentasPorFecha(java.sql.Date inicio,java.sql.Date fin)
    {
        int total = 0;

        String sql =
                "SELECT COUNT(*) AS Total "
                + "FROM Ventas "
                + "WHERE FechaVenta "
                + "BETWEEN ? AND ?";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps =con.prepareStatement(sql);

            ps.setDate(1, inicio);
            ps.setDate(2, fin);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                total = rs.getInt("Total");
            }

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return total;
    }
    public String medicamentoMasVendidoPorFecha(java.sql.Date inicio,java.sql.Date fin)
    {
        String nombre = "-";

        String sql =
                "SELECT TOP 1 M.Nombre "
                + "FROM DetalleVentas D "
                + "INNER JOIN Medicamentos M "
                + "ON D.ID_Medicamento = M.ID_Medicamento "
                + "INNER JOIN Ventas V "
                + "ON D.ID_Venta = V.ID_Venta "
                + "WHERE V.FechaVenta "
                + "BETWEEN ? AND ? "
                + "GROUP BY M.Nombre "
                + "ORDER BY SUM(D.Cantidad) DESC";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps =con.prepareStatement(sql);

            ps.setDate(1, inicio);
            ps.setDate(2, fin);

            ResultSet rs = ps.executeQuery();

            if(rs.next())
            {
                nombre = rs.getString("Nombre");
            }

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }

        return nombre;
    }
    
}
