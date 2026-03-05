/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes_demo;

/**
 * Class Circle subclass of Shape
 * @author ricardo.marques
 */

public class Circle extends Shape {
    private double radius;

    public Circle(String name_, double radius) {
        super(name_);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
