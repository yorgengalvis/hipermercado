package Control;

import Interface.ReglasNegocio;
import Negocio.Hipermercado;
import Negocio.Producto;
import Negocio.Sucursal;
import java.util.LinkedList;

public class ControlNegocio implements ReglasNegocio{
    
    private Hipermercado hipermercado = new Hipermercado();

    @Override
    public void agregarSucursal(Sucursal sucursal) {
    hipermercado.agregarSucursal(sucursal);
    }

    @Override
    public void eliminarSucursal(String nombre) {
    hipermercado.eliminarSucursal(nombre);
    }

    @Override
    public void lanzarProducto(Producto producto, String nombreSucursal) {
    hipermercado.lanzarNuevoProductoSucursal(producto, nombreSucursal);
    }

    @Override
    public void descontinuarProducto(String nombreProducto, String nombreSucursal) {
    hipermercado.descontinuarProductoSucursal(nombreProducto, nombreSucursal);
    }

    @Override
    public String productoMasAntiguo() {
    return hipermercado.productoMasAntiguo().toString();
    }

    @Override
    public LinkedList<Producto> listarProductos(String nombreSucursal) {
    return hipermercado.listarProductos(nombreSucursal);
    }

    @Override
    public void eliminarProductosDeSucursalesPorRangoPrecios(double precioInicial, double precioFinal) {
    hipermercado.eliminarProductosPorRangoPrecioSurcursales(precioInicial, precioFinal);
    }

    @Override
    public void generarReporteSucursales() {
        String sucursales = listarTodasLasSucursales();
        new Reporte(sucursales);
    }
    
    private String listarTodasLasSucursales(){
        String msg = "";
        for(Sucursal s: hipermercado.getSucursales()){
            msg += s.toString() + "\n" + "\n";
        }
        return msg;
    }
    
   
}
