
package Negocio;

import java.util.Calendar;
import java.util.Date;

public class Producto {
    
    /* una línea de producto tiene un nombre, un código, una descripción,
un precio por unidad y una fecha de introducción a la sucursal.*/
    
    private String nombre;
    private String codigo;
    private String descripcion;
    private double precio;
    private String fechaDeIntroduccion;

    public Producto() {
    }

    public Producto(String nombre, String codigo, String descripcion, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        
        Calendar calendario = Calendar.getInstance();
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int mes = calendario.get(Calendar.MONTH);
        int anio = calendario.get(Calendar.YEAR);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
        int milisegundos = calendario.get(Calendar.MILLISECOND);

        this.fechaDeIntroduccion = dia + "/" + (mes+1) + "/" + anio + "." + hora + ":" + minutos + ":"  + segundos + ":" + milisegundos;
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

    public String getFechaDeIntroduccion() {
        return fechaDeIntroduccion;
    }

    public void setFechaDeIntroduccion(String fechaDeIntroduccion) {
        this.fechaDeIntroduccion = fechaDeIntroduccion;
    }

    

    @Override
    /*public String toString() {
        return "Producto{" + "nombre=" + nombre + ", codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", fechaDeIntroduccion=" + fechaDeIntroduccion + '}';
    }*/
    
    public String toString(){
        return "Codigo: "+codigo+" Nombre: "+nombre+" Descripcion: "+descripcion+ " Precio: "+precio+"\n";
    }
    
    public String toString2(){
        return codigo+ "-"+nombre+"-"+descripcion+"-"+precio+"-"+fechaDeIntroduccion;
    }
    
    
    
}
