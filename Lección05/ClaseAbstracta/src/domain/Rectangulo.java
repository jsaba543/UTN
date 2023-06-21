/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author agustinsaba
 */
public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    
    
    @Override
    public void dibujar(){ //Estamos implementando el método por primera vez ya que en la clase padre no está implementado
        System.out.println("Se imprime un: "+this.getClass().getSimpleName());
    }
    
}
