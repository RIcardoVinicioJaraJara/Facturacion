/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ricardo
 */
public class ControladorCategoria {

    Conexion con = new Conexion();
    Connection coneccion;

    public ControladorCategoria() {
        coneccion = con.conectado();
    }

    public boolean ingresar(Categoria categoria) {
        try {
            String Query = "INSERT INTO categoria(NOMBRE,DESCRIPCION)values(?,?) ";
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setString(1, categoria.getNombre());
            statement.setString(2, categoria.getDescripcion());
            statement.execute();
            // coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean eliminar(Categoria categoria) {
        try {
            String Query = "DELETE from categoria WHERE ID = '" + categoria.getId() + "'";
            Statement se = (Statement) coneccion.createStatement();
            se.executeUpdate(Query);
            //coneccion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean actualizar(Categoria categoria) {
        try {
            String Query = "UPDATE categoria SET NOMBRE = ?,DESCRIPCION = ? WHERE ID = " + categoria.getId();
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setString(1, categoria.getNombre());
            statement.setString(2, categoria.getDescripcion());
            statement.execute();
            //coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public List<Categoria> listar() {
        List<Categoria> lista = new ArrayList<>();
        String sql = "select * from categoria";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                String nombre = seter.getString(2);
                String descripcion = seter.getString(3);
                Categoria categoria = new Categoria(id, nombre, descripcion);
                lista.add(categoria);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return lista;
    }

    public Categoria buscar(String id) {
        String sql = "select * from categoria where ID = '" + id + "'";
        Categoria categoria = null;
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int idd = seter.getInt(1);
                String nombre = seter.getString(2);
                String descripcion = seter.getString(3);
                categoria = new Categoria(idd, nombre, descripcion);
                return categoria;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return categoria;
    }

}
