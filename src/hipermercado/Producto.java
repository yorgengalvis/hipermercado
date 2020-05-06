/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipermercado;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Producto {
    /* una línea de producto tiene un nombre, un código, una descripción,
un precio por unidad y una fecha de introducción a la sucursal.*/
    
    private String nombre;
    private String codigo;
    private String descripcion;
    private double precio;
    private Date fechaDeIntroduccion;

    public Producto() {
    }

    public Producto(String nombre, String codigo, String descripcion, double precio, Date fechaDeIntroduccion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.fechaDeIntroduccion = fechaDeIntroduccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFechaDeIntroduccion() {
        return fechaDeIntroduccion;
    }

    public void setFechaDeIntroduccion(Date fechaDeIntroduccion) {
        this.fechaDeIntroduccion = fechaDeIntroduccion;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", fechaDeIntroduccion=" + fechaDeIntroduccion + '}';
    }
    
    
    
    
}
