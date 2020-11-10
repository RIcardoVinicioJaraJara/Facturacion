/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;

/**
 *
 * @author Ricardo
 */
public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private Categoria categoria;
    private Proveedor proveedor;
    private String codigo;
    private int pre_cliente;
    private int pre_proveedor;

    
    public Producto() {
    }

    public Producto(int id, String nombre, double precio, int stock, Categoria categoria, Proveedor proveedor, String codigo, int pre_cliente, int pre_proveedor) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.codigo = codigo;
        this.pre_cliente = pre_cliente;
        this.pre_proveedor = pre_proveedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPre_cliente() {
        return pre_cliente;
    }

    public void setPre_cliente(int pre_cliente) {
        this.pre_cliente = pre_cliente;
    }

    public int getPre_proveedor() {
        return pre_proveedor;
    }

    public void setPre_proveedor(int pre_proveedor) {
        this.pre_proveedor = pre_proveedor;
    }
}
