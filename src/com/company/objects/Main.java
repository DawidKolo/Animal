package com.company.objects;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        ArrayList<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kangur("Fred", 3));
        zwierze.add(new Mysz("Szara", 7));
        zwierze.add(new Snake("Syczek", 2));
        zwierze.add(new Chomik("Okruszek", 2));


        zwierze.get(0).przywitanie();
        zwierze.get(0).jedzenie();
        zwierze.get(0).skok();
        zwierze.get(0).picie();

        System.out.println();

        zwierze.get(1).przywitanie();
        zwierze.get(1).jedzenie();
        zwierze.get(1).skok();
        zwierze.get(1).picie();

        System.out.println();

        zwierze.get(2).przywitanie();
        zwierze.get(2).jedzenie();
        zwierze.get(2).skok();
        zwierze.get(2).picie();

        System.out.println();

        zwierze.get(3).przywitanie();
        zwierze.get(3).jedzenie();
        zwierze.get(3).skok();
        zwierze.get(3).picie();
    }
}


