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
public class CotxeAmbGPS extends Cotxe{
    private double latitud;
    private double longitud;

    public CotxeAmbGPS(){
        super();
        this.latitud = 0.0;
        this.longitud = 0.0;
    }

    public void canviarCoordenades(double latitud, double longitud){
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        printInfoPosicio();
    }

    public void printInfoPosicio(){
        String tmp = "Coordenades: " + this.latitud + ", " + this.longitud;
        System.out.println(tmp);
    }
}

