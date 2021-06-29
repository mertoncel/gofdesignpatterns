package behavioral.visitor;

import behavioral.visitor.islemler.*;
import behavioral.visitor.saglikbakanligi.*;

public class App {

    public static void main(String[] args) {

        Hasta ahmet = new Hasta("Ahmet", EnumHastalik.COVID, EnumHastaDurumu.AGIR_HASTA);
        Hasta mehmet = new Hasta("mehmet", EnumHastalik.COVID, EnumHastaDurumu.ZATURRE);
        Hasta fatma = new Hasta("fatma", EnumHastalik.COVID, EnumHastaDurumu.OLUM);
        Hasta nese = new Hasta("nese", EnumHastalik.COVID, EnumHastaDurumu.IYILESTI);

        Hastane capaHastanesi = new Hastane("Çapa Hastanesi");
        capaHastanesi.hastaEkle(ahmet);
        capaHastanesi.hastaEkle(mehmet);
        capaHastanesi.hastaEkle(fatma);
        capaHastanesi.hastaEkle(nese);

        Il istanbul = new Il("İstanbul");
        istanbul.hastaneEkle(capaHastanesi);

        Ulke turkiye = new Ulke("Türkiye");
        turkiye.ilEkle(istanbul);

        raporUlke(turkiye);
    }

    private static void raporUlke(Ulke ulke) {

        CovidHastaSayisiVisitor covidHastaSayisiVisitor = new CovidHastaSayisiVisitor();
        String covidHastaSayisi = covidHastaSayisiVisitor.visitUlke(ulke);

        CovidOlumSayisiVisitor covidOlumSayisiVisitor = new CovidOlumSayisiVisitor();
        String covidOlumSayisi = covidOlumSayisiVisitor.visitUlke(ulke);

        CovidZaturreSayisiVisitor covidZaturreSayisiVisitor = new CovidZaturreSayisiVisitor();
        String covidZaturreSayisi = covidZaturreSayisiVisitor.visitUlke(ulke);

        CovidAgirHastaSayisiVisitor covidAgirHastaSayisiVisitor = new CovidAgirHastaSayisiVisitor();
        String covidAgirHastaSayisi = covidAgirHastaSayisiVisitor.visitUlke(ulke);

        CovidIyilesenSayisiVisitor covidIyilesenSayisiVisitor = new CovidIyilesenSayisiVisitor();
        String covidIyilesenSayisi = covidIyilesenSayisiVisitor.visitUlke(ulke);


        System.out.println("Hasta sayısı: " + covidHastaSayisi);
        System.out.println("Ölüm sayısı: " + covidOlumSayisi);
        System.out.println("Zatürre sayısı: " + covidZaturreSayisi);
        System.out.println("Ağır Hasta sayısı: " + covidAgirHastaSayisi);
        System.out.println("İyileşen sayısı: " + covidIyilesenSayisi);

    }
}
