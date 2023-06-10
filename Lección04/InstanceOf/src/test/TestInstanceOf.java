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
public class TestInstanceOf {
    public static void main(String[] args) {
        /*
        En este ejemplo, creamos un objeto empleado1 de tipo Empleado, pero lo inicializamos con una instancia
        de la clase Gerente, lo cual es posible debido a la relación de herencia.
        Luego, utilizamos el operador instanceof para verificar si el objeto empleado1 es una instancia de la
        clase Gerente. Si es cierto, convertimos el objeto a Gerente utilizando una conversión de tipo
        (Gerente) y podemos realizar operaciones específicas para el tipo Gerente. En caso contrario,
        simplemente indicamos que el empleado no es un gerente.
        Es importante tener en cuenta que el uso de instanceof debe hacerse con cuidado, ya que en muchos
        casos puede ser una señal de un diseño poco claro o una jerarquía de clases compleja. Se recomienda
        utilizar el polimorfismo adecuado y evitar la dependencia excesiva del operador instanceof.
        */
        Empleado empleado1 = new Gerente("Agustin", 10000, "IT");
        
        
        if (empleado1 instanceof Gerente){
            Gerente gerente1  = (Gerente) empleado1;
            System.out.println("El empleado es un Gerente");   
        }else{
            System.out.println("El empleado NO es un gerente");
        }
    }
   
}
