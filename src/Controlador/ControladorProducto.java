/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import Modelo.Producto;
import Modelo.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ricardo
 */
public class ControladorProducto {

    Conexion con = new Conexion();
    Connection coneccion;
    ControladorProveedor controladorProveedor;
    ControladorCategoria controladorCategoria;

    public ControladorProducto() {
        coneccion = con.conectado();
        controladorCategoria = new ControladorCategoria();
        controladorProveedor = new ControladorProveedor();
    }

    public boolean ingresar(Producto producto) {
        try {
            String Query = "INSERT INTO producto(nombre,precio,stock,codigo,proveedor,categoria)values(?,?,?,?,?,?) ";
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setString(1, producto.getNombre());
            statement.setDouble(2, producto.getPrecio());
            statement.setInt(3, producto.getStock());
            statement.setString(4, producto.getCodigo());
            statement.setInt(5, producto.getProveedor().getId());
            statement.setInt(6, producto.getCategoria().getId());
            statement.execute();
            // coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean eliminar(Producto producto) {
        try {
            String Query = "DELETE from producto WHERE ID = '" + producto.getId() + "'";
            Statement se = (Statement) coneccion.createStatement();
            se.executeUpdate(Query);
            //coneccion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean actualizar(Producto producto) {
        try {
            String Query = "UPDATE producto SET nombre = ?,precio = ?,stock = ?,codigo = ?,proveedor = ?,categoria = ? WHERE ID = " + producto.getId();
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setString(1, producto.getNombre());
            statement.setDouble(2, producto.getPrecio());
            statement.setInt(3, producto.getStock());
            statement.setString(4, producto.getCodigo());
            statement.setInt(5, producto.getProveedor().getId());
            statement.setInt(6, producto.getCategoria().getId());
            statement.execute();
            //coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public List<Producto> listar() {
        List<Producto> lista = new ArrayList<>();
        String sql = "select * from producto";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                String nombre = seter.getString(2);
                double precio = seter.getDouble(3);
                int stock = seter.getInt(4);
                String codigo = seter.getString(5);
                Categoria categoria = controladorCategoria.buscar(seter.getString(6));
                Proveedor proveedor = controladorProveedor.buscarID(seter.getString(7));

                Producto producto = new Producto(id, nombre, precio, stock, categoria, proveedor, codigo);

                lista.add(producto);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return lista;
    }

    public Producto buscar(String cod) {
        String sql = "select * from producto where codigo = '" + cod + "'";
        Producto producto = null;
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                String nombre = seter.getString(2);
                double precio = seter.getDouble(3);
                int stock = seter.getInt(4);
                 String codigo = seter.getString(5);
                Proveedor proveedor = controladorProveedor.buscarID(seter.getString(7));
                Categoria categoria = controladorCategoria.buscar(seter.getString(6));

                producto = new Producto(id, nombre, precio, stock, categoria, proveedor, codigo);
                return producto;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return producto;
    }
    
    public Producto buscarID(String cod) {
        String sql = "select * from producto where id = '" + cod + "'";
        Producto producto = null;
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                String nombre = seter.getString(2);
                double precio = seter.getDouble(3);
                int stock = seter.getInt(4);
                 String codigo = seter.getString(5);
                Proveedor proveedor = controladorProveedor.buscarID(seter.getString(6));
                Categoria categoria = controladorCategoria.buscar(seter.getString(7));

                producto = new Producto(id, nombre, precio, stock, categoria, proveedor, codigo);
                return producto;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return producto;
    }

    public int obtenerCodigo() {
        try {
            String sql = "SELECT MAX(ID) FROM facturacion.usuarios";
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
}
