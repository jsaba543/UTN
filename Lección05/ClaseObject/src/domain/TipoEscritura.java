/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author agustinsaba
 */
public enum TipoEscritura {
    CLASICO ("Escritura a mano"),
    MODERNO ("Escritura digital");
    
    private final String descripción;
    
    private TipoEscritura(String descripcion){
        this.descripción = descripcion;
    }

    public String getDescripción() {
        return this.descripción;
    }
    
    
}
