package com.burcu;

public class DenizAnasi extends Omurgasizlar {
    public int yasamSuresi;


    public DenizAnasi(String alem, String tur, String cins, int boy, int agirlik, int yas, String rengi, boolean kuyrukVarMi, boolean tuyluMu, boolean kanatliMi, String beslenmeTuru, String hareketTuru, String barinmaTuru, String uremeTuru, String yasamAlani, boolean zehirliMi, int yasamSuresi) {
        super(alem, tur, cins, boy, agirlik, yas, rengi, kuyrukVarMi, tuyluMu, kanatliMi, beslenmeTuru, hareketTuru, barinmaTuru, uremeTuru, yasamAlani, zehirliMi);
        this.yasamSuresi = yasamSuresi;
    }

}
