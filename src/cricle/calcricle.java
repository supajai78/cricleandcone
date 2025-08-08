/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricle;

/**
 *
 * @author 344_10
 */
public class calcricle {
     protected double radius;
     final double pi = 3.1415926535897932384626433832795;
     
    public calcricle(double radius) {
        this.radius = radius;
    }

   
    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return pi * this.radius * this.radius;
    }
    
    
   
}

