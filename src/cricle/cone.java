/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricle;

/**
 *
 * @author 344_10
 */
public class cone extends calcricle{
    
    private double h;
    
    
    public cone(double radius, double height) {
        super(radius);
        this.radius = radius;
        this.h = height;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return h;
    }
    
   
    public double calculateSurfaceArea() {
        double area = 0.33333333333*pi*(Math.pow(radius,2)*h);
        return area;
    }
}
