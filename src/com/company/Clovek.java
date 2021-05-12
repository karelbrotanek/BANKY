package com.company;

public class Clovek {
    private String jmeno;
    private String prijmeni;
    private String rdc;
    private String telefon;

    public Clovek(String rdc) {
        this.rdc = rdc;
    }

    public Clovek(String rdc, String jmeno, String prijmeni, String telefon) {
        this.rdc = rdc;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.telefon = telefon;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getRdc() {
        return rdc;
    }

    public void setRdc(String rdc) {
        this.rdc = rdc;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public String toString(){
        return "jmeno: " + jmeno + " prijmeni: " + prijmeni + " rodne cislo: " + rdc + " telefon " + telefon;
    }
}
