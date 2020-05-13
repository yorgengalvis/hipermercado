
package Interface;

import Negocio.Producto;
import Negocio.Sucursal;
import java.util.LinkedList;

public interface ReglasNegocio {
    
    public void agregarSucursal(Sucursal sucursal);
    public void eliminarSucursal(String nombre);
    public void lanzarProducto(Producto producto, String nombreSucursal);
    public void descontinuarProducto(String nombreProducto, String nombreSucursal);
    public String productoMasAntiguo();
    public LinkedList<Producto> listarProductos(String nombreSucursal);
    public void eliminarProductosDeSucursalesPorRangoPrecios(double precioInicial, double precioFinal);
    public void generarReporteSucursales();
    
    
}
