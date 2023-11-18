package com.burcu;

public class Omurgasizlar extends Hayvanlar {
    public boolean zehirliMi;
    public Orumcek orumcek;
    public DenizAnasi denizAnasi;


    public Omurgasizlar(String alem, String tur, String cins, int boy, int agirlik, int yas, String rengi, boolean kuyrukVarMi, boolean tuyluMu, boolean kanatliMi, String beslenmeTuru, String hareketTuru, String barinmaTuru, String uremeTuru, String yasamAlani, boolean zehirliMi) {
        super(alem, tur, cins, boy, agirlik, yas, rengi, kuyrukVarMi, tuyluMu, kanatliMi, beslenmeTuru, hareketTuru, barinmaTuru, uremeTuru, yasamAlani);
        this.zehirliMi = zehirliMi;
    }

    public boolean isZehirliMi() {
        return zehirliMi;
    }

    public void setZehirliMi(boolean zehirliMi) {
        this.zehirliMi = zehirliMi;
    }
}
