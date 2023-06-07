/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import enumeraciones.Dias;
import enumeraciones.Continentes;

/**
 *
 * @author agustinsaba
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
        
//        System.out.println("Día 1: "+Dias.LUNES+ ", Día 2: "+Dias.MARTES);
//        
//        indicarDiaSemana(Dias.MIERCOLES);

          System.out.println("Continente Nº 1: "+Continentes.AFRICA);
          System.out.println("El Nº de paises en "+Continentes.AFRICA+ " es: "+Continentes.AFRICA.getPaises());
          System.out.println("El Nº de habitantes en "+Continentes.AFRICA+ " es: "+Continentes.AFRICA.getHabitantes());
          
          
          System.out.println("Continente Nº 2: "+Continentes.AMERICA);
          System.out.println("El Nº de paises en "+Continentes.AMERICA+ " es: "+Continentes.AMERICA.getPaises());
          System.out.println("El Nº de habitantes en "+Continentes.AMERICA+ " es: "+Continentes.AMERICA.getHabitantes());
          
          
          System.out.println("Continente Nº 3: "+Continentes.ASIA);
          System.out.println("El Nº de paises en "+Continentes.ASIA+ " es: "+Continentes.ASIA.getPaises());
          System.out.println("El Nº de habitantes en "+Continentes.ASIA+ " es: "+Continentes.ASIA.getHabitantes());
          
          
          System.out.println("Continente Nº 4: "+Continentes.EUROPA);
          System.out.println("El Nº de paises en "+Continentes.EUROPA+ " es: "+Continentes.EUROPA.getPaises());
          System.out.println("El Nº de habitantes en "+Continentes.EUROPA+ " es: "+Continentes.EUROPA.getHabitantes());
          
          
          System.out.println("Continente Nº 5: "+Continentes.OCEANIA);
          System.out.println("El Nº de paises en "+Continentes.OCEANIA+ " es: "+Continentes.OCEANIA.getPaises());
          System.out.println("El Nº de habitantes en "+Continentes.OCEANIA+ " es: "+Continentes.OCEANIA.getHabitantes());

    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana.");
                break;
            case MARTES:
                System.out.println("Segundo día de la semana.");
                break;
            case MIERCOLES:
                System.out.println("Tercer día de la semana.");
                break;
            case JUEVES:
                System.out.println("Cuarto día de la semana.");
                break;
            case VIERNES:
                System.out.println("Quinto día de la semana.");
                break;
            case SABADO:
                System.out.println("Sexto día de la semana.");
                break;
            case DOMINGO:
                System.out.println("Séptimo día de la semana.");
                break;
            
                
        }
    }
}
