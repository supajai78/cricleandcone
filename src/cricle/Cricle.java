/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cricle;

/**
 *
 * @author 344_10
 */
public class Cricle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcricle circle = new calcricle(50);
        cone co = new cone(400, 50);
        
        System.out.println("Circle Area = " + circle.calculateArea());
        System.out.println("cone Area = " + co.calculateSurfaceArea());
    }

}
