package Negocio;

import java.util.LinkedList;

public class Hipermercado {

    private LinkedList<Sucursal> sucursales = new LinkedList<Sucursal>();

    public Hipermercado() {
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public void agregarProductoSucursal(String nombreSucursal, Producto producto) {
        for(Sucursal s: sucursales){
            if (s.getNombre().equalsIgnoreCase(nombreSucursal)) {
                s.AgregarProducto(producto);
                break;
            }
        }
    }

    public void eliminarSucursal(String nombre) {
        for (Sucursal s : sucursales) {
            if (s.getNombre().equalsIgnoreCase(nombre)) {
                sucursales.remove(s);
                break;
            }
        }
    }

    public void lanzarNuevoProductoSucursal(Producto producto, String nombreSucursal) {
        for (Sucursal s : sucursales) {
            if (s.getNombre().equalsIgnoreCase(nombreSucursal)) {
                s.AgregarProducto(producto);
                break;
            }
        }
    }

    public void descontinuarProductoSucursal(String nombreProducto, String nombreSucursal) {
        for (Sucursal s : sucursales) {
            if (s.getNombre().equalsIgnoreCase(nombreSucursal)) {
                s.descontinuarProducto(nombreProducto);
                break;
            }
        }
    }

    public Producto productoMasAntiguo() {
        Producto productoMasAntiguo = null;
        for (Sucursal s : sucursales) {
            productoMasAntiguo = s.ObetenerProductoAntiguo();
        }
        return productoMasAntiguo;
    }

    public LinkedList<Producto> listarProductos(String nombreSucursal) {
        LinkedList productos = new LinkedList<>();
        for (Sucursal s : sucursales) {
            if (s.getNombre().equalsIgnoreCase(nombreSucursal)) {
                productos = s.getProductos();
                break;
            }
        }
        return productos;
    }

    public void eliminarProductosPorRangoPrecioSurcursales(double precioInicial, double precioFinal) {
        for (Sucursal s : sucursales) {
            for (Producto p : s.getProductos()) {
                if (p.getPrecio() >= precioInicial && p.getPrecio() <= precioFinal) {
                    s.getProductos().remove();
                }
            }
        }
    }
    
    public LinkedList<Sucursal> getSucursales() {
        return sucursales;
    }


}
