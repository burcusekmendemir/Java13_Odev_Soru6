package com.burcu;

import java.nio.charset.CoderResult;

public class Runner_SoyAgaci {
    public static void main(String[] args) {

        /**
         * Hayvanlar alemi soyağacı oluşturunuz. Bunu yaparken OOP ve kalıtımdan yararlanınız.
         * Hayvan sınıfı en üstte(parent class), miras alacak olanlar ise
         * kedi, balık, kuş, yılan v.s. şeklinde bir projeyi kodlayınız.
         */

       Kus muhabbetKusu=new Kus("Hayvanlar","M.undulatus", "Melopsittacus",
                20,30,1, "Sarı",
                false,true, true,
                "Otçul","Uçarak","Kafes",
                "Yumurtlama","Kara","Erkek",false,"Taneci");

       Orumcek orumcek=new Orumcek("Hayvanlar","Sparassidae","Adcatomus ",15,5,6,
               "Kahverengi",false,true,false,"Etçil","Yürüme",
               "Ağ Örme","Yumurtlama","Kara",true,4);

        System.out.println("Muhabbet Kuşu: " + muhabbetKusu);
        System.out.println("Örümcek: " + orumcek);

        System.out.println("Muhabbet Kuşu Gaga Tipi: "+muhabbetKusu.gagaTipi);
        System.out.println("Örümceğin Beslenme Türü: "+orumcek.beslenmeTuru);

        System.out.println("Örümcek Zehirli Mi? "+orumcek.zehirliMi);
        System.out.println("Muhabbet Kuşu Yırtıcı Mı? " + muhabbetKusu.yirticiMi);

    }
}
