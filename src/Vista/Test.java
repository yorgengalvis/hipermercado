
package Vista;

import Control.ControlVista;

public class Test {
    public static void main(String[] args) {
        
        ControlVista control = new ControlVista();
        
        control.agregarSucursal("Sucursal1", "Direccion de la sucursal 1");
        control.agregarSucursal("Sucursal2", "Direccion de la sucursal 2");
        control.agregarSucursal("Sucursal3", "Direccion de la sucursal 3");
        
        control.lanzarProducto("Producto1","001", "producto1", 10000, "sucursal1");
        control.lanzarProducto("Producto2","002", "producto2", 12000, "sucursal1");
        control.lanzarProducto("Producto3","003", "producto3", 9000, "sucursal1");
        control.lanzarProducto("Producto4","004", "producto4", 23000, "sucursal1");
        
        control.lanzarProducto("Producto1","001", "producto1", 10000, "sucursal2");

        control.lanzarProducto("Producto3","003", "producto3", 9000, "sucursal3");
        control.lanzarProducto("Producto4","004", "producto4", 23000, "sucursal3");
        
        control.descontinuarProducto("producto3", "sucursal1");
            
        System.out.println(control.listarProductos("sucursal1"));
        System.out.println("*********************************");
        System.out.println(control.listarProductos("sucursal2"));
        System.out.println("*********************************");
        System.out.println(control.listarProductos("sucursal3"));
        
       System.out.println("El producto mas antiguo: " + "\n" + control.productoMasAntiguo());
       
       control.eliminarProductosRagoPrecioSucursal(9000, 10000);
       
       System.out.println(control.listarProductos("sucursal1"));
        
        
    }
}
