package com.company;

public class Ucet {

    private int cisloUctu;
    private int penize;
    private Banka bankaUctu;

    public Banka getBankaUctu() {
        return bankaUctu;
    }

    public void setBankaUctu(Banka bankaUctu) {
        this.bankaUctu = bankaUctu;
    }

    public void setCisloUctu(int cisloUctu) {
        this.cisloUctu = cisloUctu;
    }
    public int getCisloUctu() {
        return cisloUctu;
    }

    public void setPenize(int penize) {
        this.penize = penize;
    }

    public Ucet(int cisloUctu, int penize, Banka bankaUctu) {
        this.cisloUctu = cisloUctu;
        this.penize = penize;
        this.bankaUctu = bankaUctu;
    }

    public int getPenize() {
        return penize;
    }
}