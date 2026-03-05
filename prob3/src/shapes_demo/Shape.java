/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes_demo;

/**
 * Abstract class Shape
 * 
 * @author ricardo.marques
 */
public abstract class Shape {
    // Atributos
    private String name_;
    private double radius;
    
    // Constructor
    public Shape(String name_) {
        this.name_ = name_;
    }
    
    // getters y setters
    public String getName() {
        return this.name_;
    }

    public void setName_(String name_) {
        this.name_ = name_;
    }

    /**
     * Otros metodos - de otros java files
     */
    public abstract double getArea();
}
