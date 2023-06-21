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
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
        System.out.println("empleado = " + empleado);
        
        /*Si bien utilizamos el objeto empleado de la clase padre (Emplepado), estamos accediendo al método de la clase hija (Escritor)
        que nos muestra además del nombre y sueldo, el tipo de escritura y esto es debido al polimorfismo. Esto es porque al objeto
        o variable empleado en realidad le asignamos o instanciamos la clase Escritor (clase hija)
        */
        empleado.obtenerDetalles();
        
        
        //CASTEO O CONVERSION DE TIPOS DE DATOS
        /*
        Si ahora queremos acceder al getter definido en la clase hija no vamos a poder ya que no es un metodo que comparten la clase padre
        e hija y que se encuentra sobreescrito. Para ello debemos castear o convertir el objeti de tipo Empleado a Escritor
        */
        
        //DOWNCASTING: El objeto empleado de la clase padre (Empleado) se convierte a tipo de objeto de la clase hija (Escritor)
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        //UPCASTING:
        Empleado empleado2 = escritor;
        empleado2.obtenerDetalles();
        
        
    }
    
}
