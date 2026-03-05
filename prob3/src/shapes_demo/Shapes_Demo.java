/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes_demo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Class with a demo of shape lists
 * 
 * @author ricardo.marques
 */
public abstract class Shapes_Demo {

    /**
     * The main method creates 4 shapes and add them to a list of shapes 
     * implemented in two different ways:
     * Option 1: using an object of type ArrayList
     * Oprion 2: using an object of type LlistaShapes
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--------------------------------------
        //Option 1: directly using an arrayList:
        //--------------------------------------
        ArrayList<Shape> array_list_shapes = new ArrayList<>();
        
        Circle c1 = new Circle("Circle 1", 0.5);
        Circle c2 = new Circle("Circle 2", 1);
        Square s1 = new Square("Square 1", 1);
        Square s2 = new Square("Square 2", 2);
        
        array_list_shapes.add( c1 );
        array_list_shapes.add( c2 );
        array_list_shapes.add( s1 );
        array_list_shapes.add( s2 );

        System.out.println("Option 1:");        
        Iterator<Shape> it = array_list_shapes.iterator();
        while(it.hasNext()) {
            Shape s = it.next();
            System.out.println("Area of the shape " + s.getName() + ": " + s.getArea());
        }
        System.out.println("");

        //-------------------------------------------------------
        // Option 2: using a list of shapes (class LlistaShapes):
        //-------------------------------------------------------

        
        System.out.println("Option 2");
        llista = new llistaShapes();
    }
    
}
