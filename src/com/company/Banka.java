package com.company;

import java.util.ArrayList;

public class Banka {
    private String nazev;
    private ArrayList<Ucet> ucty;

    public Banka(String nazev) {
        this.nazev = nazev;
        this.ucty = new ArrayList<Ucet>();
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public ArrayList<Ucet> getUcty() {
        return ucty;
    }

    public void setUcty(ArrayList<Ucet> ucty) {
        this.ucty = ucty;
    }
    public String toString(){
        return "banka: " + nazev + " pocet uctu: " + ucty.size();
    }
}
