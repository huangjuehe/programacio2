/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicicotxe;

/**
 *
 * @author lauraigual
 */
public class Taxi extends Cotxe{
    public Taxi(){
        super();
    }

    public void recorrer(double kms){
        System.out.println("Iniciar carrera");
        super.recorrer(kms);
        System.out.println("Fin de carrera");
    }
}

