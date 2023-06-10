/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author agustinsaba
 */
public class Gerente extends Empleado {
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        //Utilizo super para invocar al constructor de la superclase (Empleado)desde el constructor de la subclase (Gerente)
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    /*
    Ahora, vamos a sobreescribir el método mostrarDetalles en la clase hija Gerente para agregar la información adicional del departamento.
    */
    @Override
    public void obtenerDetalles(){
        super.obtenerDetalles();
        System.out.println("Departamento: "+this.departamento);
        
    }
    
}
