
package com.mycompany.productos;


public class Producto {

    public Producto(String nombre, double precio, int cantStock) { 
        this.nombre = nombre; 
        this.precio = precio; 
        this.cantStock = cantStock;
    } 

    private double precio;
    private String nombre;
    private int cantStock;
    
    public void setPrecio(double precio){
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.err.println("el precio debe ser mayor a 0");
        }
    }
    public double getPrecio(){
        return precio;
    }
     public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
     public void setCantStock(int cantStock){
        if (cantStock > 0) {
            this.cantStock = cantStock;
        } else {
            System.err.println("el la cantidad en Stock debe ser mayor a 0");
        }
    }
    public int getCantStock(){
        return cantStock;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre: "+ nombre +"\nPrecio: "+ precio +"\nCantidad en Stock: "+cantStock);
    }
}
