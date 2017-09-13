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
public class Car {
    Engire m;
    Wheel [] front;
    Wheel [] rear;

   
    public Car(Wheel[] front, Wheel[] rear) {
        this.front = front;
        this.rear = rear;
        this.m = new Engire("Honda",10000);
        this.m.setAxle(rear);
        
        for(int i=0 ; i< this.rear.length;i++)
           this.rear[i].setAxle(m);
       
    }

    public void setFront(Wheel[] front) {
        this.front = front;
    }

    public void setRear(Wheel[] rear) {
        this.rear = rear;
    }
    
    
    public String toString() {
        return "Car{" + "m=" + m + ", front=" + front + ", rear=" + rear + '}';
    }
    
    
    
    
}
