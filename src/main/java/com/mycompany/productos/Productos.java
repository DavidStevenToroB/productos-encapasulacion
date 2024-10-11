
package com.mycompany.productos;

import java.util.ArrayList;

public class Productos {

    public static void main(String[] args) {
        Producto miP = new Producto();
        ArrayList<Producto> listProducto = new ArrayList<>();

        listProducto.add(new Producto("papas", 300)); 
        listProducto.add(new Producto("Chicles", 3500)); 
        listProducto.add(new Producto("agua", 4000)); 

        for (Producto prod : listProducto) { 
            prod.mostrarInfo(); 
            System.out.println("----------"); 
        } 
        
        listEmpleados.get(1).setSalario(3700.0); 
        
        
        miP.mostrarInfo();
    }
}
