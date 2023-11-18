package com.burcu;

public class Balik extends Omurgalilar {
    public String pulRengi;

    public Balik(String alem, String tur, String cins, int boy, int agirlik, int yas, String rengi, boolean kuyrukVarMi, boolean tuyluMu, boolean kanatliMi, String beslenmeTuru, String hareketTuru, String barinmaTuru, String uremeTuru, String yasamAlani, String cinsiyet, String pulRengi) {
        super(alem, tur, cins, boy, agirlik, yas, rengi, kuyrukVarMi, tuyluMu, kanatliMi, beslenmeTuru, hareketTuru, barinmaTuru, uremeTuru, yasamAlani, cinsiyet);
        this.pulRengi = pulRengi;
    }


}
