package com.company.objects;

public class Mysz extends Zwierze implements Czynnosc {

        Mysz(String _imie, int _wiek){
        imie = _imie;
        wiek = _wiek;

    }
    @Override
    public void jedzenie() {
        System.out.println("Jem Ziarenka");
    }

    @Override
    public void skok() {
        System.out.println("Czasem skaczę");

    }

    @Override
    public void picie() {
        System.out.println("Piję wodę");

    }

    @Override
    void przywitanie() {
        System.out.println("Jestem Mysz");

    }
}
