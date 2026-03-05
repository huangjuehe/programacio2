/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes_demo;

import java.util.ArrayList;

/**
 * Class LlistaShapes which manipulates an ArrayList
 * 
 * @author ricardo.marques
 */

// Class to complete:
public class LlistaShapes {
    // Atributos:
    private ArrayList<Shape> shapes;
    
    // Constructor:
    public LlistaShapes(){
        this.shapes = new ArrayList<>();
    }

    public void addShape(){

    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    @Override
    public String toString(){
        String result = "";
        return result;
    }
}
