package Control;

import Negocio.Producto;
import Negocio.Sucursal;


public class ControlVista {
    
  private ControlNegocio controlNegocio = new ControlNegocio();

    public ControlVista() {
    }
  
    public void agregarSucursal(String nombre, String direccion){
        Sucursal sucursal = new Sucursal(nombre, direccion);
        controlNegocio.agregarSucursal(sucursal);
    }
    
    public void eliminarSucursal(String nombre){
        controlNegocio.eliminarSucursal(nombre);
    }
    
    public void lanzarProducto(String nombreProducto, String codigo, String descripcion, double precio, String nombreSucursal){
        Producto producto = new Producto(nombreProducto, codigo, descripcion, precio);
        controlNegocio.lanzarProducto(producto, nombreSucursal);
    }
    
    public void descontinuarProducto(String nombreProducto, String nombreSucursal){
        controlNegocio.descontinuarProducto(nombreProducto, nombreSucursal);
    }
    
    public String productoMasAntiguo(){
        return controlNegocio.productoMasAntiguo();
    }
    
    public String listarProductos(String nombreSucursal){
       String msg = "";
        for(Producto p: controlNegocio.listarProductos(nombreSucursal)){
            msg += p.toString() + "\n";
        }
        return msg;
    }
    
    public void eliminarProductosRagoPrecioSucursal(double precioInicial, double precioFinal){
        controlNegocio.eliminarProductosDeSucursalesPorRangoPrecios(precioInicial, precioFinal);
    }
    
    public void generarReporte(){
        controlNegocio.generarReporteSucursales();
    }
  
}
