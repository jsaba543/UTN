/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import paquete2.Clase4;

/**
 *
 * @author agustinsaba
 */
public class TestDefault {
    public static void main(String[] args) {
        
        Clase2 clase2 = new Clase2(); //DENTRO DEL MISMO PAQUETE PODEMOS ACCEDER A LA CLASE DEFAULT SIN PROBLEMAS
        
        Clase4 clase4 = new Clase4("Público");
       
        System.out.println("Accedemos al atributo privado a través de los metodos getters and setters = " +clase4.getAtributoPrivate());
    }
}