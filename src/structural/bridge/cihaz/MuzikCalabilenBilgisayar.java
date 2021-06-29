package structural.bridge.cihaz;

import structural.bridge.Muzik;
import structural.bridge.muzikcalar.MuzikCalar;
import structural.bridge.sescihazi.SesCihazi;

public abstract class MuzikCalabilenBilgisayar {

    protected SesCihazi sesCihazi;
    protected MuzikCalar muzikCalar;

    public MuzikCalabilenBilgisayar() {
    }

    public MuzikCalabilenBilgisayar(SesCihazi sesCihazi, MuzikCalar muzikCalar) {
        this.sesCihazi = sesCihazi;
        this.muzikCalar = muzikCalar;
    }

    public void muzikCal(Muzik muzik) {
        String ses = muzikCalar.muzikCal(muzik);
        sesCihazi.sesiCal(ses);
    }
}
