/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Proveedor;
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
public class ControladorProveedor {

    Conexion con = new Conexion();
    Connection coneccion;

    public ControladorProveedor() {
        coneccion = con.conectado();
    }

    public boolean ingresar(Proveedor proveedor) {
        try {
            String Query = "INSERT INTO proveedor(RUC,NOMBRE,NACIONALIDAD)values(?,?,?) ";
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setString(1, proveedor.getRuc());
            statement.setString(2, proveedor.getNombre());
            statement.setString(3, proveedor.getNacionalidad());
            statement.execute();
            // coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean eliminar(Proveedor proveedor) {
        try {
            String Query = "DELETE from proveedor WHERE ID = '" + proveedor.getId() + "'";
            Statement se = (Statement) coneccion.createStatement();
            se.executeUpdate(Query);
            //coneccion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean actualizar(Proveedor proveedor) {
        try {
            String Query = "UPDATE proveedor SET RUC = ?,NOMBRE = ?,NACIONALIDAD = ? WHERE ID = " + proveedor.getId();
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setString(1, proveedor.getRuc());
            statement.setString(2, proveedor.getNombre());
            statement.setString(3, proveedor.getNacionalidad());
            statement.execute();
            //coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public List<Proveedor> listar() {
        List<Proveedor> lista = new ArrayList<>();
        String sql = "select * from proveedor";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int idd = seter.getInt(1);
                String ruc = seter.getString(2);
                String nombre = seter.getString(3);
                String nacionalidad = seter.getString(4);
                Proveedor proveedor = new Proveedor(idd, ruc, nombre, nacionalidad);
                lista.add(proveedor);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return lista;
    }

    public Proveedor buscar(String id) {
        String sql = "select * from proveedor where RUC = '" + id + "'";
        Proveedor proveedor = null;
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int idd = seter.getInt(1);
                String ruc = seter.getString(2);
                String nombre = seter.getString(3);
                String nacionalidad = seter.getString(4);
                proveedor = new Proveedor(idd, ruc, nombre, nacionalidad);
                return proveedor;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return proveedor;
    }
    
    public Proveedor buscarID(String id) {
        String sql = "select * from proveedor where ID = '" + id + "'";
        Proveedor proveedor = null;
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int idd = seter.getInt(1);
                String ruc = seter.getString(2);
                String nombre = seter.getString(3);
                String nacionalidad = seter.getString(4);
                proveedor = new Proveedor(idd, ruc, nombre, nacionalidad);
                return proveedor;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return proveedor;
    }

}
