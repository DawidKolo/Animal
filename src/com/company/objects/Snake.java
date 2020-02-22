package com.company.objects;

public class Snake extends Zwierze implements Czynnosc2 {

        Snake(String _imie, int _wiek){
        imie = _imie;
        wiek = _wiek;

    }
    @Override
    public void jedzenie() {

        System.out.println("Poluję na mniejsze zwierzęta");

    }

    @Override
    public void skok() {
        System.out.println("Czasem spadam na ofiarę z drzewa");

    }

    @Override
    public void picie() {

        System.out.println("Raczej wodę czerpię z pożywienia");

    }

    @Override
    public void bieganieWKolowrotku() {
        System.out.println("Nie mam nóg");

    }

    @Override
    void przywitanie() {
        System.out.println("Jestem wężem");
    }
}
