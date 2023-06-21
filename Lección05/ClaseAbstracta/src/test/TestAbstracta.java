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
public class TestAbstracta {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectángulo");
        //Arriba aplicamos el UPCASTING, asignamos una referencia de tipo hijo (Rectangulo) a una variable (figura) de tipo padre (FiguraGeometrica)
        figura.dibujar();
    }
    
}
