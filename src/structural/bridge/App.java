package structural.bridge;

import structural.bridge.Muzik;
import structural.bridge.cihaz.BilgisayarKF;
import structural.bridge.cihaz.Telefon;
import structural.bridge.muzikcalar.Fizy;
import structural.bridge.muzikcalar.Spotify;
import structural.bridge.sescihazi.Kulaklik;

public class App {

    /**
     * Bridge is used when we need to decouple an abstraction from its implementation so that the two can
     * vary independently. This type of design pattern comes under structural pattern as this pattern
     * decouples implementation class and abstract class by providing a bridge structure between them.
     *
     * This pattern involves an interface which acts as a bridge which makes the functionality of concrete
     * classes independent from interface implementer classes. Both types of classes can be altered structurally
     * without affecting each other.
     *
     * We are demonstrating use of Bridge pattern via following example in which a circle can be drawn in different
     * colors using same abstract class method but different bridge implementer classes.
     *
     */

    public static void main(String[] args) {

        Muzik muzik = new Muzik("Sezen Aksu - Gülümse ", "Gülümse");

        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);

        System.out.println("****************");

        Telefon telefon = new Telefon(new Kulaklik(), new Fizy());
        telefon.muzikCal(muzik);

        System.out.println("****************");

        Telefon telefon2 = new Telefon(new Kulaklik(), new Spotify());
        telefon2.muzikCal(muzik);

    }
}
