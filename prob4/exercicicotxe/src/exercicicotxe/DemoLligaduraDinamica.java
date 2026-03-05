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
public class DemoLligaduraDinamica {
    public static void main(String[] args){
        FactoriaDeCotxes factoria = new FactoriaDeCotxes();

        for(int i=0; i<10; i++){
            Cotxe cotxe = factoria.fabricarCotxeNou();
            System.out.println("Nou cotxe fabricat");

            if(cotxe instanceof CotxeAmbGPS){
                CotxeAmbGPS cag = (CotxeAmbGPS) cotxe;
                cag.canviarCoordenades(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
            }

            cotxe.vendre("X.X.X" + i);
            cotxe.matricular("PMM-" + i);

            cotxe.recorrer(i);

            cotxe.printInfo();
        }
    }
}

