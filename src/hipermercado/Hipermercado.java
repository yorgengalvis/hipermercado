/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipermercado;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author TODOSYYO
 */
public class Hipermercado {

   
    //se crea e instancia una linkedList de aspirantes
    private LinkedList<Sucursal> hipermercado = new LinkedList<>();

    public Hipermercado() {
    }
    
   //Agrega sucursal a la linkedList de Hipermercado
    public void AgregarSucursal(Sucursal sucursal) {
        hipermercado.push(sucursal); } 
    
    
     /*Busca la sucursal segun su nombbre y la elimina */
    public boolean EliminarSucursal(String nombre) {
        boolean v = false;
        Iterator<Sucursal> iter = hipermercado.iterator();
        while (iter.hasNext()) {
            Sucursal ob = iter.next();
            if (ob.getNombre().equals(nombre)) {
                iter.remove();
                v = true;}
        }
        return v; }
    
    /*public Sucursal BuscarSucursal(String nombre) {
       
        Sucursal suc = null;
        Iterator<Sucursal> iter = hipermercado.iterator();
        while (iter.hasNext()) {
            Sucursal ob = iter.next();
            if (ob.getNombre().equals(nombre)) {
                
                suc = ob;}
        }
        return suc; }*/
    
    
    /*8. Generar un reporte de las sucursales y sus líneas de producto*/
    
    
     public void reporteDeSucursalesYProductos(){
         Iterator it = hipermercado.iterator();

         System.out.println("Sucursales: ");
         while(it.hasNext())
         {
           System.out.println(it.next().toString());
         } }
            
            
       
    
    
    
    public static void main(String[] args) {
        
        Hipermercado mercadito = new Hipermercado();
        //-------------------------------//////////-----/////////////////////////////////-----//////////////
        Sucursal sucursal = new Sucursal("Mercado paga","Av jdkjdl ");
        sucursal.AgregarProducto(new Producto("Jabon","5565664","para bañarse",35000,new Date(2019,02,10)));
        sucursal.AgregarProducto(new Producto("Jabon Fab","55664","para lavar",36000,new Date(2019,03,10)));
        ////////////////////////////////////////////////////////////////////////
        Sucursal sucursal2 = new Sucursal("Mercado paga","Av jdkjdl ");
        sucursal2.AgregarProducto(new Producto("Jabon","5565664","para bañarse",35000,new Date(2019,02,10)));
        sucursal2.AgregarProducto(new Producto("Jabon Fab","55664","para lavar",35000,new Date(2019,03,10)));
        
        Sucursal sucursal3 = new Sucursal("Mercado paga2","Av jdkjdl ");
        
        sucursal3.AgregarProducto(new Producto("Jabon","5565664","para bañarse",35000,new Date(2019,02,10)));
        sucursal3.AgregarProducto(new Producto("Jabon Fab","55664","para lavar",35000,new Date(2019,03,10)));
        
       
        
        mercadito.AgregarSucursal(sucursal);
        mercadito.AgregarSucursal(sucursal2);
        
        
        mercadito.AgregarSucursal(sucursal3);
        mercadito.EliminarSucursal("Mercado paga2");
        
        mercadito.reporteDeSucursalesYProductos();
        
    }
    
}
