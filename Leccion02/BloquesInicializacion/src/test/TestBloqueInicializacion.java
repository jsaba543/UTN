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
public class TestBloqueInicializacion {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        //Al ejecutar esta clase podemos ver que lo primero que ocurre es la ejecucion del bloque estático, y antes de ejecutarse el constructor se ejecuta el bloque NO estático
        
        System.out.println("persona1 = " + persona1);
    }
    
    
}
