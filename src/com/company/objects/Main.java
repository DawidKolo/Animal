package com.company.objects;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kangur("Fred", 3));
        zwierze.add(new Mysz("Szara", 7));
        zwierze.add(new Snake("Syczek", 2));
        zwierze.add(new Chomik("Okruszek", 2));

        for(int i=0;i<4;i++) {
            zwierze.get(i).przywitanie();
            zwierze.get(i).jedzenie();
            zwierze.get(i).skok();
            zwierze.get(i).picie();

            System.out.println();

        }
        System.out.println("Zmiany, zmiany");
        System.out.println("Waga 400 kg");
        System.out.println("zmiana na kopii");

        System.out.println("********************************************");
        System.out.println("*                                          *");
        System.out.println("* Zaliczenie GIT - systemy kontroli wersji *");
        System.out.println("*                                          *");
        System.out.println("********************************************");

    }
}


