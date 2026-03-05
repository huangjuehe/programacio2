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

public class Cotxe{
    private String propietari_;
    private String matricula_;
    private double compteKilometres_;
    private static int comptador_;

    public Cotxe(){
        propietari_="Sense propietari";
        matricula_="Sense matricula";
        compteKilometres_ = 0.0;
        afegirComptador();
        if(comptador_==100){
            throw new
        }
    }
        
    public void vendre(String elPropietari) {
            propietari_ = elPropietari;
    }

    public void matricular(String laMatricula) {
            matricula_ = laMatricula;
    }

    public void recorrer(double kms){
             compteKilometres_ = compteKilometres_ + kms;
    }

    public static void afegirComptador(){
        comptador_++;
    }

    public void printInfo(){
        String tmp = "Propietari: " + propietari_ + "; " +
        " Matricula: " + matricula_ + "; " +
        "Kms recorridos: " + compteKilometres_ + ";" ;
        System.out.println(tmp) ;
    }
}