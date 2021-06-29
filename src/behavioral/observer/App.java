package behavioral.observer;

import java.math.BigDecimal;
import java.util.Observer;

public class App {

    /**
     *
     * https://www.tutorialspoint.com/design_pattern/observer_pattern.htm
     *
     * Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.

     * @param args
     */


    public static void main(String[] args) {
        BigDecimal minSicaklik = BigDecimal.valueOf(23);
        BigDecimal maxSicaklik = BigDecimal.valueOf(28);

        Termometre termometre = new Termometre(minSicaklik, maxSicaklik);

        Ebeveyn anne = new Ebeveyn("Anne");
        Ebeveyn baba = new Ebeveyn("Baba");

        termometre.ekle(anne);
        termometre.ekle(baba);

        for (int i = termometre.getAnlikSicaklik().intValue(); i <= 30; i++) {
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }

        for (int i = termometre.getAnlikSicaklik().intValue(); i >= 22; i--) {
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));
        }
    }
}
