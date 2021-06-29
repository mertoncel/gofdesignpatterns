package structural.bridge.cihaz;

import structural.bridge.Muzik;
import structural.bridge.muzikcalar.Fizy;
import structural.bridge.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar {


    public BilgisayarKF() {
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Bilgisayar çalıştı");
        super.muzikCal(muzik);
    }
}
