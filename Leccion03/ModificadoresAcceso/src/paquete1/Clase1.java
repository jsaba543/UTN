/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author agustinsaba
 */
public class Clase1 {
    
    public String atributoPublic = "Valor atributo público";
    protected String atributoProtected = "Valor atributo protected";
    
    
    public Clase1(){
        System.out.println("Constructor vacío público");
    }
    
    protected Clase1(String atributoProtected){
        System.out.println("Constructor protected");
    }
    
    public void metodoPublico(){
        System.out.println("Método público");
    }
    
    
    protected void metodoProtected(){
        System.out.println("Método protected");
    }
}
