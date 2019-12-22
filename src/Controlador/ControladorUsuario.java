/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Ricardo
 */
public class ControladorUsuario {

    Conexion con = new Conexion();
    Connection coneccion;

    public ControladorUsuario() {
        coneccion = con.conectado();
    }

    public boolean ingresar(Usuario usuario) {
        try {
            String Query = "INSERT INTO usuarios(CEDULA,NOMBRE,APELLIDO,TELEFONO,DIRECCION,CORREO,ROL,contrasenia)values(?,?,?,?,?,?,?,?) ";
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setString(1, usuario.getCedula());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getApellido());
            statement.setString(4, usuario.getTelefono());
            statement.setString(5, usuario.getDireccion());
            statement.setString(6, usuario.getCorreo());
            statement.setString(7, usuario.getRol());
            statement.setString(8, usuario.getContraseña());
            statement.execute();
            // coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean eliminar(Usuario usuario) {
        try {
            String Query = "DELETE from usuarios WHERE ID = '" + usuario.getId() + "'";
            Statement se = (Statement) coneccion.createStatement();
            se.executeUpdate(Query);
            //coneccion.commit();
            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public boolean actualizar(Usuario usuario) {
        try {
            String Query = "UPDATE usuarios SET CEDULA = ?,NOMBRE = ?,APELLIDO = ?,TELEFONO = ?,DIRECCION = ?, ROL = ?, CORREO = ?, contrasenia = ? WHERE ID = " + usuario.getId();
            PreparedStatement statement = coneccion.prepareStatement(Query);

            statement.setString(1, usuario.getCedula());
            statement.setString(2, usuario.getNombre());
            statement.setString(3, usuario.getApellido());
            statement.setString(4, usuario.getTelefono());
            statement.setString(5, usuario.getDireccion());
            statement.setString(6, usuario.getRol());
            statement.setString(7, usuario.getCorreo());
            statement.setString(8, usuario.getContraseña());
            statement.execute();
            //coneccion.commit();

            return true;
        } catch (SQLException e) {
            System.out.println("ERROR: " + e);
            return false;
        }
    }

    public List<Usuario> listar() {
        List<Usuario> lista = new ArrayList<>();
        String sql = "select * from usuarios";
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                String cedula = seter.getString(2);
                String nombre = seter.getString(3);
                String apellido = seter.getString(4);
                String telefono = seter.getString(5);
                String direccion = seter.getString(6);
                String rol = seter.getString(7);
                String correo = seter.getString(8);
                String contraseña = seter.getString(9);

                Usuario usuario = new Usuario(id, cedula, nombre, apellido, telefono, direccion, rol, correo, contraseña);

                lista.add(usuario);
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return lista;
    }

    public Usuario buscar(String ced) {
        String sql = "select * from usuarios where CEDULA = '" + ced + "'";
        Usuario usuario = null;
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                String cedula = seter.getString(2);
                String nombre = seter.getString(3);
                String apellido = seter.getString(4);
                String telefono = seter.getString(5);
                String direccion = seter.getString(6);
                String rol = seter.getString(7);
                String correo = seter.getString(8);
                String contraseña = seter.getString(9);
                usuario = new Usuario(id, cedula, nombre, apellido, telefono, direccion, rol, correo, contraseña);
                return usuario;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return usuario;
    }

    public Usuario buscarID(String ced) {
        String sql = "select * from usuarios where ID = " + ced + "";
        Usuario usuario = null;
        try {
            Statement se = coneccion.createStatement();
            ResultSet seter = se.executeQuery(sql);
            while (seter.next()) {
                int id = seter.getInt(1);
                String cedula = seter.getString(2);
                String nombre = seter.getString(3);
                String apellido = seter.getString(4);
                String telefono = seter.getString(5);
                String direccion = seter.getString(6);
                String rol = seter.getString(7);
                String correo = seter.getString(8);
                String contraseña = seter.getString(9);
                usuario = new Usuario(id, cedula, nombre, apellido, telefono, direccion, rol, correo, contraseña);
                return usuario;
            }
        } catch (SQLException ex) {
            System.out.println("Error de lectura :" + ex.getMessage());
        }
        return usuario;
    }

    public void keyReleesCedula(JTextField t, KeyEvent evt) {
        if (t.getText().length() == 10 || t.getText().length() == 13) {
            if (IdentificadorCedula(t.getText()) == true || IdentifiRuc(t.getText()) == true) {
                t.setBackground(Color.GREEN);
            } else {
                t.setBackground(Color.red);
            }
            evt.consume();
        }else{
            t.setBackground(Color.CYAN);
        }
    }

    public void keyTypedCedula(JTextField t, KeyEvent evt) {
        if (evt.getKeyChar() == KeyEvent.VK_ENTER  || evt.getKeyChar() == KeyEvent.VK_DELETE || evt.getKeyChar() == KeyEvent.VK_BACK_SPACE) {

        } else if (evt.getKeyChar() < '0' || evt.getKeyChar() > '9') {
            evt.consume();
            t.setBackground(Color.RED);
        } else {
            t.setBackground(Color.CYAN);
        }
    }

    public boolean cedulaORuc(String ced) {
        switch (ced.length()) {
            case 10:
                return IdentificadorCedula(ced);
            case 13:
                return IdentifiRuc(ced);
            default:
                return false;
        }
    }

    public boolean IdentificadorCedula(String ced) {
        boolean verdadera = false;
        int num = 0;
        int ope = 0;
        int suma = 0;
        for (int cont = 0; cont < ced.length(); cont++) {
            num = Integer.valueOf(ced.substring(cont, cont + 1));
            if (cont == ced.length() - 1) {
                break;
            }
            if (cont % 2 != 0 && cont > 0) {
                suma = suma + num;
            } else {
                ope = num * 2;
                if (ope > 9) {
                    ope = ope - 9;
                }
                suma = suma + ope;
            }
        }
        if(suma != 0){
            
        suma = suma % 10;
        if (suma == 0) {
            if (suma == num) {
                verdadera = true;
            }
        } else {
            ope = 10 - suma;
            if (ope == num) {
                verdadera = true;
            }
        }
        }else{
            verdadera = false;
        }
        return verdadera;
    }

    public boolean IdentifiRuc(String ced) {
        boolean verdadera = false;
        int num = 0;
        int ope = 0;
        int suma = 0;
        for (int cont = 0; cont < 10; cont++) {
            num = Integer.valueOf(ced.substring(cont, cont + 1));
            if (cont == 9) {
                break;
            }
            if (cont % 2 != 0 && cont > 0) {
                suma = suma + num;
            } else {
                ope = num * 2;
                if (ope > 9) {
                    ope = ope - 9;
                }
                suma = suma + ope;
            }

        }
        suma = suma % 10;
        if (suma == 0) {
            if (suma == num) {
                verdadera = true;
            }
        } else {
            ope = 10 - suma;
            if (ope == num) {
                verdadera = true;
            }
        }
        
        if (verdadera) {
            String ruc = ced.substring(10, 13);
            if (ruc.equals("001")) {
                verdadera = true;
            } else {
                verdadera = false;
            }
        } else {
            verdadera = false;
        }
        return verdadera;
    }

}
