package prog2.model;

import java.io.Serializable;

public class BungalowPremium extends Bungalow implements Serializable {

    private boolean serveisExtra;
    private String codiWifi;

    public BungalowPremium(String nom_, String idAllotjament_, boolean operatiu, String illuminacio, float mida, int habitacions,
                           int placesPersones, int placesParquing, boolean terrassa, boolean tv,
                           boolean aireFred, boolean serveisExtra, String codiWifi) {
        super(nom_, idAllotjament_, operatiu, illuminacio, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    public boolean isServeisExtra() {
        return this.serveisExtra;
    }

    public void setServeisExtra(boolean serveisExtra) {
        this.serveisExtra = serveisExtra;
    }

    public String getCodiWifi() {
        return this.codiWifi;
    }

    public void setCodiWifi(String codiWifi) {
        this.codiWifi = codiWifi;
    }

    @Override
    public boolean correcteFuncionament() {
        // Cridem al mètode del pare (Bungalow) per comprovar l'aire fred
        return isAireFred() && (this.codiWifi != null && this.codiWifi.length() >= 8 && this.codiWifi.length() <= 16);
    }

    @Override
    public String toString() {
        return baseToString() + "BungalowPremium {mida=" + getMida() + ", habitacions=" + getHabitacions() +
                ", placesPersones=" + getPlacesPersones() + ", placesParquing=" + getPlacesParquing() +
                ", terrassa=" + isTerrassa() + ", tv=" + isTv() + ", aireFred=" + isAireFred() +
                ", serveisExtra=" + this.serveisExtra + ", codiWifi=" + this.codiWifi + "}";
    }
}