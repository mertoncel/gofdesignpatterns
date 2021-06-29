package structural.bridge.muzikcalar;

import structural.bridge.Muzik;

public class Fizy implements MuzikCalar {


    @Override
    public String muzikCal(Muzik muzik) {
        System.out.println("Fizy " + muzik + " şarkısını çalıyor");

        return muzik.getSes();
    }
}
