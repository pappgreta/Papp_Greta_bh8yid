/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elso;

/**
 *
 * @author pappg
 */
public class GeometricShapetest {
    public static void main(String[] args) {
        Circle circle= new Circle(1.0);
        System.out.println("A circle created on "+ circle.toString());
        System.out.println("The radius is:"+circle.getRadius());
        System.out.println("The area is:"+circle.getArea());
        System.out.println("The diameter is:"+circle.getDiameter());
        
        Rectangle rectangle = new Rectangle(2.0, 4.0);
        System.out.println(System.clearProperty("line.separator")+ "A rectangle:"+rectangle.toString());
        System.out.println("The area is:"+rectangle.getArea());
        System.out.println("The perimeter is:"+rectangle.getPerimeter());
        
    }
    
}
