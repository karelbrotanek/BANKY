package com.company;

import java.util.Scanner;

public class Main {
    //Clovek c1 = new Clovek("234 " + " ||", "Karel" + " ||", "Brotanek" + " ||", "123 456 789 "+ " ||");
    //System.out.println(c1.toString());
    //Ucet u1 = new Ucet("457" + " ||", c1, 0.0);
    //System.out.println(u1.toString());
    //Banka b1 = new Banka("ČSOB");
    //System.out.println(b1.toString());

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Banka nazev = new Banka();
        nazev.setBanka("Air Bank");
        Banka typ = new Banka();
        typ.setTypBanky("1500");
        Ucet cislo = new Ucet(270067868, 15000, nazev);

        int volba = 0;

        System.out.println(" __       __  ________  __        ______    ______   __       __  ________ \n" +
                "|  \\  _  |  \\|        \\|  \\      /      \\  /      \\ |  \\     /  \\|        \\\n" +
                "| $$ / \\ | $$| $$$$$$$$| $$     |  $$$$$$\\|  $$$$$$\\| $$\\   /  $$| $$$$$$$$\n" +
                "| $$/  $\\| $$| $$__    | $$     | $$   \\$$| $$  | $$| $$$\\ /  $$$| $$__    \n" +
                "| $$  $$$\\ $$| $$  \\   | $$     | $$      | $$  | $$| $$$$\\  $$$$| $$  \\   \n" +
                "| $$ $$\\$$\\$$| $$$$$   | $$     | $$   __ | $$  | $$| $$\\$$ $$ $$| $$$$$   \n" +
                "| $$$$  \\$$$$| $$_____ | $$_____| $$__/  \\| $$__/ $$| $$ \\$$$| $$| $$_____ \n" +
                "| $$$    \\$$$| $$     \\| $$     \\\\$$    $$ \\$$    $$| $$  \\$ | $$| $$     \\\n" +
                " \\$$      \\$$ \\$$$$$$$$ \\$$$$$$$$ \\$$$$$$   \\$$$$$$  \\$$      \\$$ \\$$$$$$$$");
        while (volba != 5) {

            System.out.println("---------------------------------------------------------------------------");
            System.out.println("Co chcete provést ?");
            System.out.println("1) Zobrazit info o účtech");
            System.out.println("2) Zrušit účet u konkrétní banky");
            System.out.println("3) Přidat peníze na bankovní účet");
            System.out.println("4) Vybral z bankovního účtu peníze");
            //System.out.println("5) Zobrazit info o účtech");
            System.out.println("5) Ukončit app");
            System.out.println("---------------------------------------------------------------------------");

            int ucty = 0;
            int jolba = 0;
            String rolba;
            int pocet_uctu = 0;
            String[] nazvy = new String[10];
            String nazevUctu;

            try {
                volba = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Zadávejte pouze čísla !!!");
            }

            if (volba == 1) {

                while (jolba != 1) {
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("INFO");
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("banka: " + nazev.getBanka() + " || " + "číslo banky: " + typ.getTypBanky() + " || " + "číslo účtu:" + cislo.getCisloUctu() + " || " + "peníze: " + cislo.getPenize());
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("1) Zpet");
                    jolba = sc.nextInt();
                }
            }

            if (volba == 3) {
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Přidávání peněz");
                System.out.println("---------------------------------------------------------------------------");

                if (jolba != 1) {

                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("Číslo bankovního účtu: ");
                    System.out.println("---------------------------------------------------------------------------");
                    jolba = sc.nextInt();
                    if (jolba == cislo.getCisloUctu()) {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Kolik peněz chcete zaslat ?");
                        System.out.println("---------------------------------------------------------------------------");
                        jolba = sc.nextInt();
                        cislo.setPenize(cislo.getPenize() + jolba);
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Vaše peníze byly zaslány");
                        System.out.println("---------------------------------------------------------------------------");
                    }
                }
            }
            if (volba == 4) {
                System.out.println("---------------------------------------------------------------------------");
                System.out.println("Vybírání peněz");
                System.out.println("---------------------------------------------------------------------------");

                if (jolba != 1) {

                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("Číslo bankovního účtu: ");
                    System.out.println("---------------------------------------------------------------------------");
                    jolba = sc.nextInt();
                    if (jolba == cislo.getCisloUctu()) {
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Kolik peněz chcete vybrat ?");
                        System.out.println("---------------------------------------------------------------------------");
                        jolba = sc.nextInt();
                        cislo.setPenize(cislo.getPenize() - jolba);
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("Vaše peníze byly vybrány");
                        System.out.println("---------------------------------------------------------------------------");
                    }
                }
            }
            if (volba == 5) {
                return;
            }
        }
    }
}
