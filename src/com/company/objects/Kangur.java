package com.company.objects;

public class Kangur extends Zwierze implements Czynnosc
{
    Kangur(String _imie, int _wiek){
        imie = _imie;
        wiek = _wiek;

    }
    @Override
    void przywitanie()
    {
        System.out.println("Hej jestem Kangur");
    }

    @Override
    public void jedzenie()
    {

        System.out.println("Teraz jem i jestem kangurem");
    }

    @Override
    public void picie()
    {

        System.out.println("Piję wodę");
    }

    @Override
    public void skok()
    {
        System.out.println("Skaczę zamiast chodzić");
    }
}

