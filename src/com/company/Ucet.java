package com.company;

public class Ucet {
    private String cislo;
    private Clovek majitel;
    private Double castka;

    public Ucet(String cislo) {
        this.cislo = cislo;
    }

    public Ucet(String cislo, Clovek majitel, Double castka) {
        this.cislo = cislo;
        this.majitel = majitel;
        this.castka = castka;
    }

    public Double getCastka() {
        return castka;
    }

    public void setCastka(Double castka) {
        this.castka = castka;
    }

    public Clovek getMajitel() {
        return majitel;
    }

    public void setMajitel(Clovek majitel) {
        this.majitel = majitel;
    }

    public String getCislo() {
        return cislo;
    }

    public void setCislo(String cislo) {
        this.cislo = cislo;
    }
    public String toString(){
        return ("cislo uctu: " + cislo + " majitel: " + majitel.toString() + " castka: " + castka);
    }
}
