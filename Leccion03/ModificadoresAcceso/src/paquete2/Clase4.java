/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author agustinsaba
 */
public class Clase4 {
    private String atributoPrivate = "Atributo privado";
    
    private Clase4(){
        System.out.println("Constructor privado");
    }
    
    public Clase4(String atributo){
        this();
        System.out.println("Constructor público");
    }
    
    private void metodoPrivado(){
        System.out.println("Método privado");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
    
    
}
