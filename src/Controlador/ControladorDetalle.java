/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Detalle;
import Modelo.Factura;
import Modelo.Producto;
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
public class ControladorDetalle {

    Conexion con = new Conexion();
    Connection coneccion;
    private ControladorFactura controladorFactura;
    private ControladorProducto controladorProducto;

    public ControladorDetalle() {
        coneccion = con.conectado();
        controladorFactura = new ControladorFactura();
        controladorProducto = new ControladorProducto();
    }

    public boolean ingresar(Detalle detalle) {
        try {
            String Query = "INSERT INTO detalle(cantiddad,subtotal,producto,factura)values(?,?,?,?) ";
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setInt(1, detalle.getCantidad());
            statement.setDouble(2, detalle.getSubtotal());
            statement.setInt(3, detalle.getProducto().getId());
            statement.setInt(4, detalle.getFactura().getId());
            statement.execute();
            // coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public List<Detalle> listar() {
        List<Detalle> lista = new ArrayList<>();
        String sql = "select * from detalle";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                int cantidad = seter.getInt(2);
                double subtotal = seter.getDouble(3);
                Producto producto = controladorProducto.buscar(seter.getInt(5) + "");
                Factura factura = controladorFactura.buscarID(seter.getInt(5) + "");
                Detalle detalle = new Detalle(id, cantidad, subtotal, producto, factura);
                lista.add(detalle);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return lista;
    }

    public Detalle buscarID(String ced) {
        String sql = "select * from detalle where ID = " + ced + "";
        Detalle detalle = null;
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                int cantidad = seter.getInt(2);
                double subtotal = seter.getDouble(3);
                Producto producto = controladorProducto.buscar(seter.getInt(5) + "");
                Factura factura = controladorFactura.buscarID(seter.getInt(5) + "");
                detalle = new Detalle(id, cantidad, subtotal, producto, factura);
                return detalle;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return detalle;
    }

    public int obtenerCodigo() {
        try {
            String sql = "select MAX(ID) from factura";
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int numero = seter.getInt(1);
                return numero;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return -999;
        }
        return -999;
    }

    public List<Detalle> listaDetalle(String coid) {
        String sql = "SELECT * FROM detalle where factura = '" +coid+"'";
        List<Detalle> lista = new ArrayList<>();

        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                int cantidad = seter.getInt(2);
                double subtotal = seter.getDouble(3);
                Producto producto = controladorProducto.buscarID(seter.getString(4) + "");
                Factura factura = controladorFactura.buscarID(seter.getInt(5) + "");
                Detalle detalle = new Detalle(id, cantidad, subtotal, producto, factura);
                lista.add(detalle);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return lista;

    }
}
