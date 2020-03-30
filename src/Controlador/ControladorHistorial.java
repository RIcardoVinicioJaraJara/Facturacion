/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Categoria;
import Modelo.Historial;
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
public class ControladorHistorial {

    Conexion con = new Conexion();
    Connection coneccion;
    ControladorProveedor controladorProveedor;
    ControladorCategoria controladorCategoria;
    ControladorProducto controladorProducto;

    public ControladorHistorial() {
        coneccion = con.conectado();
        controladorCategoria = new ControladorCategoria();
        controladorProveedor = new ControladorProveedor();
        controladorProducto = new ControladorProducto();
    }

    public boolean ingresar(Historial Historial) {
        try {
            String Query = "INSERT INTO historial (fecha, motivo, producto, cantidadAnt, cantidadNew, cantidadOld) values(?,?,?,?,?,?) ";
            System.out.println(Query);
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setString(1, Historial.getFecha());
            statement.setString(2, Historial.getMotivo());
            statement.setInt(3, Historial.getProducto().getId());
            statement.setInt(4, Historial.getCantidadAnt());
            statement.setInt(5, Historial.getCantidadNew());
            statement.setInt(6, Historial.getCantidadOld());
            statement.execute();
            // coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean eliminar(Historial Historial) {
        try {
            String Query = "DELETE from historial WHERE ID = '" + Historial.getId() + "'";
            Statement se = (Statement) coneccion.createStatement();
            se.executeUpdate(Query);
            //coneccion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public List<Historial> listar() {
        List<Historial> lista = new ArrayList<>();
        String sql = "select * from historial";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                String fecha = seter.getString(2);
                String motivo = seter.getString(3);
                Producto product0 = controladorProducto.buscarID(seter.getInt(4)+"");
                int cantidadAnt = seter.getInt(5);
                int cantidadNew = seter.getInt(5);
                int cantidadOld = seter.getInt(5);

               Historial h = new Historial(id, fecha, motivo, product0, cantidadAnt, cantidadNew, cantidadOld);

                lista.add(h);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return lista;
    }
}
