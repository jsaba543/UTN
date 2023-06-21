/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author agustinsaba
 */
public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    //Método para sobreescribir
    @Override
    public void obtenerDetalles(){
        super.obtenerDetalles();
        System.out.println("Tipo de Escritura: "+tipoEscritura.getDescripción());
    }
    
    @Override
    public String toString(){
        return "Escritor{ "+"tipoEscritura="+tipoEscritura+" }"+super.toString();
    }

    public TipoEscritura getTipoEscritura() {
        return this.tipoEscritura;
    }
    
    
}
