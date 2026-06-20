/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.MovimientoInventario;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;


/**
 *
 * @author jhanc
 */
public class MovimientoInventariosDAO {
    Conexion cn = new Conexion();
    public boolean guardar(MovimientoInventario mov)
    {
        String sql =
                    "INSERT INTO MovimientoInventario "
                  + "(ID_Medicamento, "
                  + "TipoMovimiento, "
                  + "Cantidad, "
                  + "FechaMovimiento, "
                  + "Observacion) "
                  + "VALUES (?, ?, ?, ?, ?)";
        try
        {
            Connection con =cn.conectar();
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1,mov.getIdMedicamento());
            ps.setString(2,mov.getTipoMovimiento());
            ps.setInt(3, mov.getCantidad());
            ps.setString(4, mov.getFechaMovimiento());
            ps.setString(5, mov.getObservacion());
            ps.executeUpdate();
            return true;
            
        } catch(SQLException e)
        {
            JOptionPane.showMessageDialog( null, "Error Movimiento: " + e.getMessage());
            return false;
        }
    }
    public List<MovimientoInventario> listar()
    {
        List<MovimientoInventario> lista = new ArrayList<>();
        String sql = "SELECT * FROM MovimientoInventario";
        try
        {
            Connection con = cn.conectar();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                MovimientoInventario mov = new MovimientoInventario();
                mov.setIdMovimiento(rs.getInt("ID_Movimiento"));
                mov.setIdMedicamento(rs.getInt("ID_Medicamento"));
                mov.setTipoMovimiento(rs.getString("TipoMovimiento"));
                mov.setFechaMovimiento(rs.getString("FechaMovimiento"));
                mov.setObservacion(rs.getString("Observacion"));

                lista.add(mov);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        return lista;
    }
    
}
