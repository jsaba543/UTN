/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author agustinsaba
 */
public class TestAutoboxingUnboxing {
    
    public static void main(String[] args) {
        
        //CLASES ENVOLVENTES O WRAPPER
        
        //Integer es la clase envolvente del tipo primitivo int
        //Long es la clase envolvente del tipo primitivo long
        //Float es la clase envolvente del tipo primitivo float
        //Double es la clase envolvente del tipo primitivo double
        //Boolean es la clase envolvente del tipo primitivo boolean
        //Byte es la clase envolvente del tipo primitivo byte
        //Character es la clase envolvente del tipo primitivo char
        //Short es la clase envolvente del tipo primitivo int short
                    
        int enteroPrim = 10; //Tipo de dato primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        
        
        Integer entero = 10; //Tipo de dato Object de la clase Integer
        System.out.println("entero = " + entero.toString()); // con el toString logramos que el numero se convierta a tipo de dato String
        System.out.println("entero = " + entero.doubleValue()); //De esta forma lo convierto a un tipo de dato primitivo double. ESTO ES EL AUTOBOXING
        
        int entero2 = entero; //Unboxing Se extrae la literal de entero y se asigna a la variable entero2 cuyo tipo de dato es primitivo
        System.out.println("entero2 = " + entero2);
        
        
       
    }
    }

    
    
    

