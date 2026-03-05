/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes_demo;

/**
 * Class Square subclass of Shape
 * @author ricardo.marques
 */

public class Square extends Shape{
    private double sidelength;

    public Square(String name_, double sidelength) {
        super(name_);
        this.sidelength = sidelength;
    }

    public double getSidelength() {
        return this.sidelength;
    }
    public void setSidelength(double sidelength) {
        this.sidelength = sidelength;
    }

    @Override
    public double getArea() {
        return sidelength * sidelength;
    }
}
