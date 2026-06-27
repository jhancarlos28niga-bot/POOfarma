    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexion.Conexion;
import Modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jhanc
 */
public class ClientesDAO {
    Conexion cn = new Conexion(); 
    public boolean guardar(Cliente cli){ 
        String sql = "INSERT INTO Clientes " + "(DNI, Nombre, Telefono) " + "VALUES (?, ?, ?)";
        
        try 
        {
            Connection con = cn.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cli.getDNI());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getTelefono());
            
            ps.executeUpdate();
            return true;
            
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
            return false;
        }
    }
    public List<Cliente> listar()
    {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Clientes "
                +"WHERE Estado = 1";
        try 
        {
            Connection con = cn.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) 
            {
                Cliente cli = new Cliente();
                cli.setID_Cliente( rs.getInt("ID_Cliente"));
                cli.setDNI(rs.getString("DNI"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setTelefono( rs.getString("Telefono"));
                cli.setEstado(rs.getInt("Estado"));
                lista.add(cli);
            } 
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al listar: " + e.getMessage());
        }
        return lista;
    }
    public boolean actualizar(Cliente cli)
    {
        String sql = "UPDATE Clientes SET "
                     + "DNI=?, "
                     + "Nombre=?, "
                     + "Telefono=? "
                     + "WHERE ID_Cliente=?";
        try
        {
            Connection con = cn.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cli.getDNI());
            ps.setString(2, cli.getNombre());
            ps.setString(3, cli.getTelefono());
            ps.setInt(4, cli.getID_Cliente());
            ps.executeUpdate();
            return true;
        }catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
            return false;
        }
    }
    public boolean eliminar(int id)
    {
        String sql = "UPDATE Clientes "
                +"SET Estado = 0 "
                +"WHERE ID_Cliente=?";
        try 
        { 
            Connection con = cn.conectar(); 
            PreparedStatement ps = con.prepareStatement(sql); 
            ps.setInt(1, id); 
            ps.executeUpdate(); 
            return true; 
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
            return false;
        }
    }
    public Cliente buscarCliente(String dni)
    {
        String sql = "SELECT * FROM Clientes WHERE DNI = ? "
                +"AND Estado = 1";
        try
        {
            Connection con = cn.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                Cliente cli = new Cliente();
                cli.setID_Cliente(rs.getInt("ID_Cliente"));
                cli.setDNI(rs.getString("DNI"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setTelefono(rs.getString("Telefono"));
                
                return cli;
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage());
            
        }
        return null;
    }
    public boolean existeDNI(String dni)
    {
        String sql = "SELECT DNI FROM Clientes WHERE DNI = ?";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dni);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al verificar DNI: " + e.getMessage());
            return false;
        }

    }
    public List<Cliente> buscarClienteDinac(String nombre)
    {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM Clientes WHERE Nombre LIKE ? "
                +"AND Estado = 1";
        try
        {
            Connection con = cn.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombre + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                Cliente cli = new Cliente();
                cli.setID_Cliente(rs.getInt("ID_Cliente"));
                cli.setDNI(rs.getString("DNI"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setTelefono(rs.getString("Telefono"));
                
                lista.add(cli);
            }
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage());
            
        }
        return lista;
    }
    public int contarClientes()
    {
        int total = 0;
        String sql = "SELECT COUNT(*) FROM Clientes "
                +"WHERE Estado = 1";
        try {
            Connection con = cn.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                total = rs.getInt(1);
            }

        } catch (SQLException e) {
            System.out.println("Error al contar clientes: " + e.getMessage());
        }

        return total;
    }
    
}
