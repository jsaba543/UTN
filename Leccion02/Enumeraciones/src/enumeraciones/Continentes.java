/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enumeraciones;

/**
 *
 * @author agustinsaba
 */
public enum Continentes {
    AFRICA(53, "1.1 billones"),
    AMERICA(34, "1.8 billones"),
    ASIA(44, "3.5 billones"),
    EUROPA(46, "2.5 billones"),
    OCEANIA(14, "10.9 millones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    public int getPaises() {
        return this.paises;
    }

    public String getHabitantes() {
        return this.habitantes;
    }
    
    
}
