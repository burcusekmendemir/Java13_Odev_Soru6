package com.burcu;

public class Hayvanlar {
    public String alem;
    public String tur;
    public String cins;
    public int boy;
    public int agirlik;
    public int yas;
    public String rengi;
    public boolean kuyrukVarMi;
    public boolean tuyluMu;
    public boolean kanatliMi;
    public String beslenmeTuru;
    public String hareketTuru;
    public String barinmaTuru;
    public String uremeTuru;
    public String yasamAlani;


    public Hayvanlar() {
    }

    public Hayvanlar(String alem, String tur, String cins,
                     int boy, int agirlik, int yas, String rengi,
                     boolean kuyrukVarMi, boolean tuyluMu,
                     boolean kanatliMi, String beslenmeTuru,
                     String hareketTuru, String barinmaTuru,
                     String uremeTuru, String yasamAlani) {
        this.alem = alem;
        this.tur = tur;
        this.cins = cins;
        this.boy = boy;
        this.agirlik = agirlik;
        this.yas = yas;
        this.rengi = rengi;
        this.kuyrukVarMi = kuyrukVarMi;
        this.tuyluMu = tuyluMu;
        this.kanatliMi = kanatliMi;
        this.beslenmeTuru = beslenmeTuru;
        this.hareketTuru = hareketTuru;
        this.barinmaTuru = barinmaTuru;
        this.uremeTuru = uremeTuru;
        this.yasamAlani = yasamAlani;
    }

    @Override
    public String toString() {
        return "Hayvanlar{" +
                "alem='" + alem + '\'' +
                ", tur='" + tur + '\'' +
                ", cins='" + cins + '\'' +
                ", boy=" + boy +
                ", agirlik=" + agirlik +
                ", yas=" + yas +
                ", rengi='" + rengi + '\'' +
                ", kuyrukVarMi=" + kuyrukVarMi +
                ", tuyluMu=" + tuyluMu +
                ", kanatliMi=" + kanatliMi +
                ", beslenmeTuru='" + beslenmeTuru + '\'' +
                ", hareketTuru='" + hareketTuru + '\'' +
                ", barinmaTuru='" + barinmaTuru + '\'' +
                ", uremeTuru='" + uremeTuru + '\'' +
                ", yasamAlani='" + yasamAlani + '\'' +
                '}';
    }

    public String getAlem() {
        return alem;
    }

    public void setAlem(String alem) {
        this.alem = alem;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getAgirlik() {
        return agirlik;
    }

    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getRengi() {
        return rengi;
    }

    public void setRengi(String rengi) {
        this.rengi = rengi;
    }

    public boolean isKuyrukVarMi() {
        return kuyrukVarMi;
    }

    public void setKuyrukVarMi(boolean kuyrukVarMi) {
        this.kuyrukVarMi = kuyrukVarMi;
    }

    public boolean isTuyluMu() {
        return tuyluMu;
    }

    public void setTuyluMu(boolean tuyluMu) {
        this.tuyluMu = tuyluMu;
    }

    public boolean isKanatliMi() {
        return kanatliMi;
    }

    public void setKanatliMi(boolean kanatliMi) {
        this.kanatliMi = kanatliMi;
    }

    public String getBeslenmeTuru() {
        return beslenmeTuru;
    }

    public void setBeslenmeTuru(String beslenmeTuru) {
        this.beslenmeTuru = beslenmeTuru;
    }

    public String getHareketTuru() {
        return hareketTuru;
    }

    public void setHareketTuru(String hareketTuru) {
        this.hareketTuru = hareketTuru;
    }

    public String getBarinmaTuru() {
        return barinmaTuru;
    }

    public void setBarinmaTuru(String barinmaTuru) {
        this.barinmaTuru = barinmaTuru;
    }

    public String getUremeTuru() {
        return uremeTuru;
    }

    public void setUremeTuru(String uremeTuru) {
        this.uremeTuru = uremeTuru;
    }

    public String getYasamAlani() {
        return yasamAlani;
    }

    public void setYasamAlani(String yasamAlani) {
        this.yasamAlani = yasamAlani;
    }
}
