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
public class EjercicioCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Wheel delantera1 = new Wheel("Mich", 50);
        Wheel delantera2 = new Wheel("Mich", 50);
        Wheel delanteras [] = new Wheel[2];
        delanteras[0] = delantera1;
        delanteras[1] = delantera2;
        
        
        Wheel atras1 = new Wheel("Mich", 100);
        Wheel atras2 = new Wheel("Mich", 100);
        Wheel traseras [] = new Wheel[2];
        traseras[0] = atras1;
        traseras[1] = atras2;
        
        Car car = new Car(delanteras, traseras);
        System.out.println(car);
        
        
        
    }
    
}
