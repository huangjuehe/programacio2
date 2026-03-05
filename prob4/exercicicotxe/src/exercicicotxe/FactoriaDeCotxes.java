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
public class FactoriaDeCotxes{
    private int tipus_=0;

    public Cotxe fabricarCotxeNou() {
        Cotxe elCotxe = null;
        if(tipus_==0){
            elCotxe = new Cotxe();
            tipus_=1;
        } else if (tipus_ == 1) {
            elCotxe = new CotxeAmbGPS();
            tipus_=2;
        } else if (tipus_ == 2) {
            elCotxe = new Taxi();
            tipus_ = 0;
        }

        return elCotxe;
    }
}

