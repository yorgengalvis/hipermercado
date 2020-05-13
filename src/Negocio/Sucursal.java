
package Negocio;

import java.util.Iterator;
import java.util.LinkedList;


public class Sucursal {
    
    /*Una sucursal tiene un nombre, una dirección
y las líneas de productos que en ella se venden. */
    
    private String nombre;
    private String direccion;
    private LinkedList<Producto> Productos = new  LinkedList<>();
    
    //Agrega una linea de producto a la linkedList de Linea de productos
    public void AgregarProducto(Producto producto) {
       Productos.push(producto); } 
    
    
    
   // Descontinuar una línea de producto en una sucursal específica.
    public boolean descontinuarProducto(String nombre){
          boolean v = false;
        Iterator<Producto> iter = Productos.iterator();
        while (iter.hasNext()) {
            Producto ob = iter.next();
            if (ob.getNombre().equalsIgnoreCase(nombre)) {
                iter.remove();
                v = true;}
        }
        return v;}
    
    //Obtener la línea de producto más antigua.
    public Producto ObetenerProductoAntiguo(){
        return Productos.getLast(); 
    }
    
    
    //Listar todas las líneas de productos de una sucursal.
    public void ListarProductos(String sucursal){
       
          if(Productos.isEmpty()){
            System.out.println("No hay productos registrados en la sucursal");
            return;
        }

        Iterator it = Productos.iterator();

         System.out.println("Linea de producto: ");
         while(it.hasNext())
         {
           System.out.println(it.next().toString());
         } }
    
    
    //Eliminar las líneas de productos de las sucursales que estén en un rango de precios y devuelve la cantida de productos eliminados.
    public int eliminarProductos(int precio){
          int v = 0;
        Iterator<Producto> iter = Productos.iterator();
        while (iter.hasNext()) {
            Producto ob = iter.next();
            if (ob.getPrecio()<precio) {
                iter.remove();
                v++;}
        }
        return v;}
    
     
    
    
    
    
    
    public Sucursal() {
    }

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LinkedList<Producto> getProductos() {
        return Productos;
    }

    public void setProductos(LinkedList<Producto> Productos) {
        this.Productos = Productos;
    }

    @Override
    public String toString() {
        return "Sucursal{" + "nombre=" + nombre + ", direccion=" + direccion + ", LineaDeProductos=" + Productos + '}';
    }
    
    
   
    
    
    
}
