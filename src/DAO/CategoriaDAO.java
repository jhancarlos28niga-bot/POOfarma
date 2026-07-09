/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Modelo.Categoria;
import conexion.Conexion;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author jhanc
 */
public class CategoriaDAO {
    Conexion cn = new Conexion();
    
    public List<Categoria> listarCategorias()
    {
        List<Categoria> lista = new ArrayList<>();
        String sql = "SELECT ID_Categoria, Nombre FROM Categorias ORDER BY Nombre";
        try
        {
             Connection con = cn.conectar();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while (rs.next())
             {
                 Categoria categoria = new Categoria();
                 categoria.setIdCategoria(rs.getInt("ID_Categoria"));
                 categoria.setNombre(rs.getString("Nombre"));
                 lista.add(categoria);
             }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al listar categorías: " + e.getMessage());
        }
        return lista;
    }
}
