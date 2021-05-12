package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                    Clovek c1 = new Clovek("234 ||", "Karel ||", "Brotanek ||", "123 456 789 ||");
                    System.out.println(c1.toString());
                    Ucet u1 = new Ucet("457 ||", c1, 0.0);
                    System.out.println(u1.toString());
                    Banka b1 = new Banka("CSOB");
                    System.out.println(b1.toString());
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("1) Zpet");
                    jolba = sc.nextInt();

                }
            }

            if (volba == 2) {

            }
            if (volba == 3) {

            }
        }
    }
}
