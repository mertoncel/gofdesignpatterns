package structural.adapter;

public class Priz {
    public void elektrikVer(ElektrikliEvAletleri evAletleri) {

        int volt = evAletleri.prizeTakVeCalistir();
        System.out.println("Prizden " + volt + " volt alınıyor");

    }
}
