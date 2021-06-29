package behavioral.command;

import java.math.BigDecimal;

public class App {
    /**
     *
     * her yeni işlem için (üst, mod) HesapMakinesinde else if
     * ekledik. command design pattern bu gibi sorunlar için
     * kullanılır. yapılacak istek ile alakalı tüm bilgilerin
     * ayrılması gerek.
     *
     *
     * @param args
     */
    public static void main(String[] args) {

        BigDecimal toplam = HesapMakinesi1.islem(IslemTuru.TOPLAMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal fark = HesapMakinesi1.islem(IslemTuru.CIKARMA, BigDecimal.TEN, BigDecimal.ONE);
        BigDecimal ust = HesapMakinesi1.islem(IslemTuru.UST, BigDecimal.TEN, BigDecimal.valueOf(2));
        BigDecimal mod = HesapMakinesi1.islem(IslemTuru.MOD, BigDecimal.TEN, BigDecimal.valueOf(3));


        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Üst: " + ust);
        System.out.println("Mod: " + mod);
    }
}
