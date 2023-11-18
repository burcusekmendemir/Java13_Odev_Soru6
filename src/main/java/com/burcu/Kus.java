package com.burcu;

public class Kus extends Omurgalilar {
    public boolean yirticiMi;
    public String gagaTipi;

    public Kus(String alem, String tur, String cins, int boy, int agirlik, int yas, String rengi, boolean kuyrukVarMi, boolean tuyluMu, boolean kanatliMi, String beslenmeTuru, String hareketTuru, String barinmaTuru, String uremeTuru, String yasamAlani, String cinsiyet, boolean yirticiMi, String gagaTipi) {
        super(alem, tur, cins, boy, agirlik, yas, rengi, kuyrukVarMi, tuyluMu, kanatliMi, beslenmeTuru, hareketTuru, barinmaTuru, uremeTuru, yasamAlani, cinsiyet);
        this.yirticiMi = yirticiMi;
        this.gagaTipi = gagaTipi;
    }
}
