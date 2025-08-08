/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricle;

/**
 *
 * @author 344_10
 */
public class cone {
    private double r;
    private double h;
    final double pi = 3.1415926535897932384626433832795;
    
    public cone(double radius, double height) {
        this.r = radius;
        this.h = height;
    }

    // Getter
    public double getRadius() {
        return r;
    }

    public double getHeight() {
        return h;
    }
    public double getSlantHeight() {
        return Math.sqrt(r * r + h * h);
    }
   
    public double calculateSurfaceArea() {
        double l = getSlantHeight();
        return Math.PI * r * (r + l);
    }
}
