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
public class Wheel {
    private String marca;
    private int diametro;
    Engire axle;

    public Wheel(String marca, int diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }

    public void setAxle(Engire axle) {
        this.axle = axle;
    }

    @Override
    public String toString() {
        return "Wheel{" + "marca=" + marca + ", diametro=" + diametro + ", axle=" + axle + '}';
    }
    
    
}
