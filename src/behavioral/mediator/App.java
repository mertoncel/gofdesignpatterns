package behavioral.mediator;

import java.math.BigDecimal;

public class App {

    /**
     * https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm
     *
     *Mediator pattern is used to reduce communication complexity between multiple objects or classes. This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. Mediator pattern falls under behavioral pattern category.
     *
     * @param args
     */

    public static void main(String[] args) {
        Kabzimal kabzimal = new Kabzimal();

        DomatesUreticisi ureticiBahadir = new DomatesUreticisi("Bahadır", BigDecimal.valueOf(4), kabzimal);
        DomatesUreticisi ureticiYusuf = new DomatesUreticisi("Yusuf", BigDecimal.valueOf(3), kabzimal);

        DomatesHalcisi halciAhmet = new DomatesHalcisi("Ahmet", BigDecimal.valueOf(5), kabzimal);
        DomatesHalcisi halciMehmet = new DomatesHalcisi("Mehmet", BigDecimal.valueOf(7), kabzimal);

        kabzimal.ureticiEkle(ureticiBahadir);
        kabzimal.ureticiEkle(ureticiYusuf);

        kabzimal.halciEkle(halciAhmet);
        kabzimal.halciEkle(halciMehmet);

        ureticiBahadir.urunSat();
        halciMehmet.urunAl();
    }
}
