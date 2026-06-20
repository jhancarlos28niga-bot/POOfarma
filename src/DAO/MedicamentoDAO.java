/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.Medicamento;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class MedicamentoDAO {

    Conexion cn = new Conexion();
    public boolean guardar(Medicamento med) {

        String sql = "INSERT INTO Medicamentos "
                + "(Nombre, Descripcion, Categoria, Stock, Precio, Fecha_Vencimiento, Laboratorio) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {

            Connection con = cn.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, med.getNombre());
            ps.setString(2, med.getDescripcion());
            ps.setString(3, med.getCategoria());
            ps.setInt(4, med.getStock());
            ps.setDouble(5, med.getPrecio());
            ps.setString(6, med.getFechaVencimiento());
            ps.setString(7, med.getLaboratorio());

            ps.executeUpdate();

            return true;

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null,"Error SQL: " + e.getMessage());

            return false;
        }
    }
    public List<Medicamento> listar() {

    List<Medicamento> lista = new ArrayList<>();

    String sql = "SELECT * FROM Medicamentos";

    try {

        Connection con = cn.conectar();

        PreparedStatement ps = con.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {

            Medicamento med = new Medicamento();

            med.setIdMedicamento(
                    rs.getInt("ID_Medicamento"));

            med.setNombre(
                    rs.getString("Nombre"));

            med.setDescripcion(
                    rs.getString("Descripcion"));

            med.setCategoria(
                    rs.getString("Categoria"));

            med.setStock(
                    rs.getInt("Stock"));

            med.setPrecio(
                    rs.getDouble("Precio"));

            med.setFechaVencimiento(
                    rs.getString("Fecha_Vencimiento"));

            med.setLaboratorio(
                    rs.getString("Laboratorio"));

            lista.add(med);
        }

    } catch (SQLException e) {

        JOptionPane.showMessageDialog(null,
                "Error al listar: " + e.getMessage());
    }

    return lista;
    }
    public List<Medicamento> buscar(String nombre) {

    List<Medicamento> lista = new ArrayList<>();

    String sql = "SELECT * FROM Medicamentos WHERE Nombre LIKE ?";

    try {

        Connection con = cn.conectar();

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, "%" + nombre + "%");

        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            Medicamento med = new Medicamento();

            med.setIdMedicamento(rs.getInt("ID_Medicamento"));

            med.setNombre(rs.getString("Nombre"));

            med.setDescripcion(rs.getString("Descripcion"));

            med.setCategoria(rs.getString("Categoria"));

            med.setStock(rs.getInt("Stock"));

            med.setPrecio(rs.getDouble("Precio"));

            med.setFechaVencimiento(
                    rs.getString("Fecha_Vencimiento"));

            med.setLaboratorio(
                    rs.getString("Laboratorio"));

            lista.add(med);
        }

    } 
    catch(SQLException e) {

        JOptionPane.showMessageDialog(null,
                "Error al buscar: " + e.getMessage());
    }

    return lista;
    }
    public boolean actualizar(Medicamento med) 
    {
        String sql = "UPDATE Medicamentos SET "
                + "Nombre=?, "
                + "Descripcion=?, "
                + "Categoria=?, "
                + "Stock=?, "
                + "Precio=?, "
                + "Fecha_Vencimiento=?, "
                + "Laboratorio=? "
                + "WHERE ID_Medicamento=?";

        try 
       {
            Connection con = cn.conectar();

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, med.getNombre());
            ps.setString(2, med.getDescripcion());
            ps.setString(3, med.getCategoria());
            ps.setInt(4, med.getStock());
            ps.setDouble(5, med.getPrecio());
            ps.setString(6, med.getFechaVencimiento());
            ps.setString(7, med.getLaboratorio());
            ps.setInt(8, med.getIdMedicamento());

            ps.executeUpdate();

            return true;

        } 
        catch (SQLException e) {

            JOptionPane.showMessageDialog(null,"Error al actualizar: " + e.getMessage());

            return false;
        }
    }
    public boolean eliminar(int id)
    {
        String sql = "DELETE FROM Medicamentos " 
                + "WHERE ID_Medicamento = ?";
        try
        {
            Connection con = cn.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
            return true;
            
        }catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR: "+e.getMessage());
            return false;
        }
    }
    public boolean registrarEntrada(int idMedicamento, int cantidad)
    {
        String sql = "UPDATE Medicamentos "
                   + "SET Stock = Stock + ? "
                   + "WHERE ID_Medicamento = ?";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, cantidad);
            ps.setInt(2, idMedicamento);

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al registrar entrada: "+ e.getMessage());

            return false;
        }
    }
    public boolean descontarStock(int idMedicamento,int cantidad)
    {
        String sql = "UPDATE Medicamentos "
                   + "SET Stock = Stock - ? "
                   + "WHERE ID_Medicamento = ?";

        try
        {
            Connection con = cn.conectar();

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, cantidad);
            ps.setInt(2, idMedicamento);

            ps.executeUpdate();

            return true;
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error al descontar stock: "+ e.getMessage());
            return false;
        }
    }
}

