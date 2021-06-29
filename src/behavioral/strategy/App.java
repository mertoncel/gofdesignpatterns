package behavioral.strategy;

public class App {

    /**
     * https://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
     *
     * In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.
     *
     * In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.
     *
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        System.out.println("--------------------");
        siralamaYazdir(EnumBolum.SAYISAL);
        System.out.println("--------------------");
        siralamaYazdir(EnumBolum.ESIT_AGIRLIK);
        System.out.println("--------------------");
        siralamaYazdir(EnumBolum.SOZEL);
    }

    private static void siralamaYazdir(EnumBolum bolum) {
        Ogrenci ogrenci = new Ogrenci(bolum);
        String oncelikSiralamasi = ogrenci.getOncelikSiralamasi();
        System.out.println(oncelikSiralamasi);
    }
}
