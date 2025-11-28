package com.example.listaprzepisow3_gr_piatek;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RepozytoriumPrzepisow {
    private static ArrayList<Przepis> przepisy;

    private static void wygenerujPrzepisy(){
        przepisy = new ArrayList<>();
        przepisy.add(new Przepis("Pierniczki","ciasteczka",R.drawable.pierniczki,"mąka, kakao, przyprawy, miód","wszystko wymieszać"));
        przepisy.add(new Przepis("Muffinki","ciasteczka",R.drawable.muffinka,"mąka, mleko, kakao","wszystko wymieszać, upiec"));
        przepisy.add(new Przepis("Przepis2"));
        przepisy.add(new Przepis("Przepis3"));
        przepisy.add(new Przepis("Przepis4"));
        przepisy.add(new Przepis("Sernik na zimno", "ciasta",R.drawable.sernik,"ser biały, galaretka,woda","wymieszaj i do lodówki"));
        przepisy.add(new Przepis("herbata zimowa","napoje",R.drawable.herbata_zimowa,"herbata, rozmaryn, gożdziki,jabłko, pomarańcza,imbir","wszystko zalać wrzątkiem i poczekać"));
    }

    public static ArrayList<Przepis> zwrocPrzepisy(){
        wygenerujPrzepisy();
        return przepisy;
    }
    public static ArrayList<Przepis> zwrocPrzepisyWKategorii(String kategoria){
        ArrayList<Przepis> przepisyKategoria = new ArrayList<>();
        //TODO: wstawić przepisy z danej kategorii
        return przepisyKategoria;
    }

}