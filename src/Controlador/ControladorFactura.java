/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Factura;
import Modelo.Usuario;
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
public class ControladorFactura {

    Conexion con = new Conexion();
    Connection coneccion;
    private ControladorUsuario controladorUsuario;

    public ControladorFactura() {
        coneccion = con.conectado();
        controladorUsuario = new ControladorUsuario();
    }

    public boolean ingresar(Factura factura) {
        try {
            String Query = "INSERT INTO factura(subtotal,iva,total,fecha,usuarios)values(?,?,?,?,?) ";
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setDouble(1, factura.getSubtotal());
            statement.setDouble(2, factura.getIva());
            statement.setDouble(3, factura.getTotal());
            statement.setString(4, factura.getFecha());
            statement.setInt(5, factura.getUsuario().getId());
            statement.execute();
            // coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public List<Factura> listar() {
        List<Factura> lista = new ArrayList<>();
        String sql = "select * from factura";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                double subtotal = seter.getDouble(2);
                double iva = seter.getDouble(3);
                double total = seter.getDouble(4);
                String fecha = seter.getString(5);
                Usuario usuario = controladorUsuario.buscarID(seter.getInt(6) + "");
                Factura factura = new Factura(id, subtotal, iva, total, fecha, usuario);
                lista.add(factura);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return lista;
    }

    public Factura buscarID(String ced) {
        String sql = "select * from factura where ID = " + ced + "";
        Factura factura = null;
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                double subtotal = seter.getDouble(2);
                double iva = seter.getDouble(3);
                double total = seter.getDouble(4);
                String fecha = seter.getString(5);
                Usuario usuario = controladorUsuario.buscarID(seter.getInt(6) + "");
                factura = new Factura(id, subtotal, iva, total, fecha, usuario);
                return factura;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return factura;
    }
}
