package com.burcu;

public class Omurgalilar extends Hayvanlar {
    public String cinsiyet;
    public Kopek kopek;
    public Balik balik;
    public Kus kus;



    public Omurgalilar(String alem, String tur, String cins, int boy, int agirlik, int yas, String rengi, boolean kuyrukVarMi, boolean tuyluMu, boolean kanatliMi, String beslenmeTuru, String hareketTuru, String barinmaTuru, String uremeTuru, String yasamAlani, String cinsiyet) {
        super(alem, tur, cins, boy, agirlik, yas, rengi, kuyrukVarMi, tuyluMu, kanatliMi, beslenmeTuru, hareketTuru, barinmaTuru, uremeTuru, yasamAlani);
        this.cinsiyet = cinsiyet;
    }
}
