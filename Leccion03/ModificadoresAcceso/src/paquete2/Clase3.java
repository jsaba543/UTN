/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author agustinsaba
 */
public class Clase3 extends Clase1{
    //La clase 3 es hija de la clase 1
    
    public Clase3(){
        super("Llamamos al constructor protected de la clase madre pero debemos pasarle un atributo");
        this.atributoProtected = "Accedemos al atributo protected desde la clase hija";
        System.out.println("Atributo Protected = "+atributoProtected);
    }
}
