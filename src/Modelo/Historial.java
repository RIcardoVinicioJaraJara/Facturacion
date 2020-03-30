/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author vinic
 */
public class Historial {
    private int id;
    private String fecha;
    private String motivo;
    private Producto producto;
    private int cantidadAnt;
    private int cantidadNew;
    private int cantidadOld;

    public Historial() {
    }

    public Historial(int id, String fecha, String motivo, Producto producto, int cantidadAnt, int cantidadNew, int cantidadOld) {
        this.id = id;
        this.fecha = fecha;
        this.motivo = motivo;
        this.producto = producto;
        this.cantidadAnt = cantidadAnt;
        this.cantidadNew = cantidadNew;
        this.cantidadOld = cantidadOld;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadAnt() {
        return cantidadAnt;
    }

    public void setCantidadAnt(int cantidadAnt) {
        this.cantidadAnt = cantidadAnt;
    }

    public int getCantidadNew() {
        return cantidadNew;
    }

    public void setCantidadNew(int cantidadNew) {
        this.cantidadNew = cantidadNew;
    }

    public int getCantidadOld() {
        return cantidadOld;
    }

    public void setCantidadOld(int cantidadOld) {
        this.cantidadOld = cantidadOld;
    }
    
    
    
}
