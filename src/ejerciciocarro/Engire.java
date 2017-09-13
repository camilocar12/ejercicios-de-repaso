/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocarro;

/**
 *
 * @author Equipo
 */
public class Engire {
    private String marca;
    private int potencia;
    private int XXX;
    
    Wheel [] axle;

    public Engire(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }
    public void setAxle(Wheel[] axle) {
        this.axle = axle;
    }

    public void setXXX(int XXX) {
        this.XXX = XXX;
    }

    @Override
    public String toString() {
        return "Engire{" + "marca=" + marca + ", potencia=" + potencia + ", XXX=" + XXX + ", axle=" + axle + '}';
    }
    
    
    
    
}
