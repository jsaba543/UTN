/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author agustinsaba
 */
public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    
    //No corresponde trabajar con atributos que no sean static
    static{ //Bloque de inicialización estático
        System.out.println("Ejecución bloque estático");
        ++contadorPersonas;
        //++Persona.contadorPersonas; // Es lo mismo que esta arriba
    }
    
    
    //Bloque de inicialización NO estático (CONTEXTO DINÁMICO)
    {
        System.out.println("Ejecución bloque NO estático");
        this.idPersona = Persona.contadorPersonas++; //Incrementamos el atributo
    }
    
    //LOS BLOQUES DE INICIALIZACIÓN SE EJECUTAN ANTES DEL CONSTRUCTOR DE NUESTRA CLASE
    
    public Persona(){
        System.out.println("Ejecución del Constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
