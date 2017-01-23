package com.anmolthedeveloper.audiotouristguide;

/**
 * Created by Anmol Singh on 09-Jan-17.
 */

public class InfoCards {
    private int imagen;
    private String nameCard;
    private String information;

    public InfoCards(int imagen, String nameCard, String information) {
        this.imagen = imagen;
        this.nameCard = nameCard;
        this.information = information;
    }

    public String getNameCard() {
        return nameCard;
    }

    public String getInformation() {
        return information;
    }

    public int getImagen() {
        return imagen;
    }
}
