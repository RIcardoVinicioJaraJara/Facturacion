
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Ricardo
 */
public class ControladorLogin {

    Conexion con = new Conexion();
    Connection coneccion;

    public ControladorLogin() {
        coneccion = con.conectado();
    }

    public boolean exitenUsuarios() {
        boolean resultado = false;
        try {
            String sql = "SELECT COUNT(ID) FROM facturacion.usuarios";
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int numero = seter.getInt(1);
                if (numero != 0) {
                    resultado = true;
                } else {
                    resultado = false;
                }
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            resultado = false;
        }
        return resultado;
    }

    public Usuario verificacion(String ced, String contraseña) {
        Usuario usuario = null;
        String sql = "select * from usuarios where CEDULA = '" + ced + "'";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                String contra = seter.getString(9);
                if (contra.equals(contraseña)) {
                    int id = seter.getInt(1);
                    String cedula = seter.getString(2);
                    String nombre = seter.getString(3);
                    String apellido = seter.getString(4);
                    String telefono = seter.getString(5);
                    String direccion = seter.getString(6);
                    String rol = seter.getString(7);
                    String correo = seter.getString(8);
                    String contrase = seter.getString(9);
                    usuario = new Usuario(id, cedula, nombre, apellido, telefono, direccion, rol, correo, contrase);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
            usuario = null;
        }
        return usuario;
    }

}
