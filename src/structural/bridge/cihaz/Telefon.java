package structural.bridge.cihaz;

import structural.bridge.Muzik;
import structural.bridge.muzikcalar.MuzikCalar;
import structural.bridge.sescihazi.SesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar{

    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon müzik çalıyor");

        super.muzikCal(muzik);
    }
}
