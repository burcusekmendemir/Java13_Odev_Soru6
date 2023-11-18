package com.burcu;

public class Kopek extends Omurgalilar {

    public int kuyrukUzunlugu;
    public int ayakSayisi;

    public Kopek(String alem, String tur, String cins, int boy, int agirlik,
                 int yas, String rengi, boolean kuyrukVarMi, boolean tuyluMu,
                 boolean kanatliMi, String beslenmeTuru, String hareketTuru,
                 String barinmaTuru, String uremeTuru, String yasamAlani,
                 String cinsiyet, int kuyrukUzunlugu, int ayakSayisi) {
        super(alem, tur, cins, boy, agirlik, yas, rengi, kuyrukVarMi, tuyluMu, kanatliMi, beslenmeTuru, hareketTuru, barinmaTuru, uremeTuru, yasamAlani, cinsiyet);
        this.kuyrukUzunlugu = kuyrukUzunlugu;
        this.ayakSayisi = ayakSayisi;
    }
}
