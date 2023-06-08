/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author agustinsaba
 */
class Clase2 extends Clase1{ //Al no tener el modificador de acceso se toma el modificador default
    
    //Una clase que sea default va a poder ser accedida dentro del MISMO PAQUETE únicamente
    
    String atributoDefault = "Atributo default";
    
//    Clase2(){
//        System.out.println("Constructor default");
//    }
    
    public Clase2(){
        super();
        this.atributoDefault = "Modificacion del atributo default";
        System.out.println("AtributoDefault = " + this.atributoDefault);
        this.metodoDefault();
    }
    void metodoDefault(){
        System.out.println("Método default");
    }
    
}
