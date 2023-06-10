/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Gerente;


/**
 *
 * @author agustinsaba
 */
public class TestSobreescritura {
    public static void main(String[] args) {
         Gerente gerente1 = new Gerente("Agustin", 10000, "IT");
         gerente1.obtenerDetalles();
         
         /*Cuando ejecutamos la clase vemos que nos muestra la siguiente informacion:
           gerente1 = [Nombre: Agustin - Sueldo: $10000.0]
           lo que no vemos es el departamento, porque este es un atributo de la clase hija
         que no está en la clase padre. La informacion que muestra es la que figura en el método
         de la clase padre. Por eso vamos a sobreescribir el método y agregar el atributo "departamento"
         de la clase hija
         */
        
    }
   
}
