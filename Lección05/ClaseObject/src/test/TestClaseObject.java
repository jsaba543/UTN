/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.*;

/**
 *
 * @author agustinsaba
 */
public class TestClaseObject {
    
    public static void main(String[] args) {
        /*
        La palabra reservada "new" en Java se utiliza para crear una instancia
        de una clase y asignar memoria para el objeto. "empleado1" es el nombre
        de la variable que almacenará la referencia al objeto creado.
        */
        Empleado empleado1 = new Empleado("Juan", 5000); 
        Empleado empleado2 = new Empleado("juan", 5000);
        
        if (empleado1 == empleado2){
            System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("Tienen distinta referencia en memoria");
        }
        
        
        if (empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        }else{
            System.out.println("Los objetos son distintos en contenido");
        }
        
        
        if (empleado1.hashCode() == empleado2.hashCode()){
            System.out.println("El valor hashcode es igual");
        }else{
            System.out.println("El valor hashcode es diferente");
        }
    }
    
}
