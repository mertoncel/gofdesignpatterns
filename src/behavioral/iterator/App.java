package behavioral.iterator;

import java.util.Iterator;

public class App {

    /***
     * https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
     *
     * Iterator pattern is very commonly used design pattern in Java and .Net programming environment. This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.
     *
     * Iterator pattern falls under behavioral pattern category.
     *
     * @param args
     */

    public static void main(String[] args) {

        Kitap kitap = new Kitap("Matematik");

        /**
         * iterator kullanmadan array ve list gibi yapıları
         * aynı metot içinde kullanamıyoruz. ayrı ayrı yazmamız
         * gerekiyor.
         */

        //List<Soru> soruList = kitap.getSoruList();


        Fasikul fasikul = new Fasikul("Matematik Fasikül");
//
//        Soru[] sorular = fasikul.getSorular();
//
//        for (Soru soru : sorular) {
//            Long soruNo = soru.getSoruNo();
//            System.out.println("Soru No: " + soruNo);
//        }

        /**
         * yeni işlem
         */

        Iterator soruIteratorKitap = kitap.getSoruIterator();

        yazdir(soruIteratorKitap);

        SoruIterator soruIteratorFasikul = fasikul.getSoruIterator();

        yazdir(soruIteratorFasikul);
    }

    private static void yazdir(Iterator soruIteratorKitap) {
        while (soruIteratorKitap.hasNext()) {
            Soru soru = (Soru) soruIteratorKitap.next();

            Long soruNo = soru.getSoruNo();

            System.out.println("Soru no: " + soruNo);
        }
    }


}
