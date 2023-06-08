/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author agustinsaba
 */
public class TestForEach {
    
    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9}; //Sintaxis resumida
        
        //La variable que usemos como iterador para recorrer nuestro arreglo debe ser del mismo tipo que el arreglo (en este caso int)
        //un detalle importante es que no vamos a poder ver la ubicación de los elementos con el bucle for each
        for (int edad: edades){
            System.out.println("edad = " + edad);;
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Pedro"), new Persona("Miguel")};
        
        for (Persona persona: personas){
            System.out.println("persona = " + persona);
    }
    
    
  
}
}

