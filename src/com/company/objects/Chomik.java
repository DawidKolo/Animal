package com.company.objects;

public class Chomik extends Zwierze implements Czynnosc2 {

        Chomik(String _imie, int _wiek){
        imie = _imie;
        wiek = _wiek;

    }

    @Override
    public void jedzenie() {
        System.out.println("Jem warzywa i ziarna");
    }

    @Override
    public void skok() {
        System.out.println("Nie umiem skakać");

    }

    @Override
    public void picie() {
        System.out.println("Piję wodę");

    }

    @Override
    public void bieganieWKolowrotku() {
        System.out.println("Uwielbiam biegać w moim kołowrotku");

    }

    @Override
    void przywitanie() {
        System.out.println("Hej jestem Chomik");

    }
}
