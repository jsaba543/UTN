/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author agustinsaba
 */
public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        
        imprimirNumeros(1, 2 , 3);
        imprimirNumeros(100, 200, 300, 400, 500);
        
        
        variosParametros("Juan", "Perez", 1, 2, 3, 5);
    }
    
    //Los parátros variables van a ir siempre al final. Primero coloco el parámetro nombre de tipo String y luego el variable
    private static void variosParametros(String nombre, String apellido, int ...numeros){
        
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        imprimirNumeros(numeros);
    }
    
    
    private static void imprimirNumeros(int ...numeros){ //Con los 3 puntos indicamos que vamos a recibir argumentos variables(cantidad indefinida). La variable numeros se va a convertir en un arreglo de tipo entero
            
           for (int i = 0; i < numeros.length; i++) {
               System.out.println("Elementos: "+numeros[i]);
            
            }
  
        }
    }
    

