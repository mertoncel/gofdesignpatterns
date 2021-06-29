package creational.builder;

public class EvBuilder {

    private String il;
    private String mahalle;
    private String ilce;

    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;
    private int balkonSayisi;
    private int binaYil;

    private boolean dubleksMi;
    private boolean esyaliMi;
    private boolean otoparkVar;
    private boolean cocukParkiVar;
    private boolean klimaVar;
    private boolean havuzVar;

    /* zorunlu alanları startBuildde belirttiğimiz için buradan siliyoruz

    public EvBuilder setIl(String il) {
        this.il = il;
        return this;
    }

    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public EvBuilder setIlce(String ilce) {
        this.ilce = ilce;
        return this;
    }

    public EvBuilder setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }

     public EvBuilder setBinaYil(int binaYil) {
     this.binaYil = binaYil;
     return this;
    }
     */

    public EvBuilder setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }



    public EvBuilder setDubleksMi(boolean dubleksMi) {
        this.dubleksMi = dubleksMi;
        return this;
    }

    public EvBuilder setEsyaliMi(boolean esyaliMi) {
        this.esyaliMi = esyaliMi;
        return this;
    }

    public EvBuilder setOtoparkVar(boolean otoparkVar) {
        this.otoparkVar = otoparkVar;
        return this;
    }

    public EvBuilder setCocukParkiVar(boolean cocukParkiVar) {
        this.cocukParkiVar = cocukParkiVar;
        return this;
    }

    public EvBuilder setKlimaVar(boolean klimaVar) {
        this.klimaVar = klimaVar;
        return this;
    }

    public EvBuilder setHavuzVar(boolean havuzVar) {
        this.havuzVar = havuzVar;
        return this;
    }

    public static EvBuilder startNormalEvBuild(String il, String ilce, String mahalle, int binaYil, int odaSayisi) {

        // zorunlu tutulan alanlar istersek bunları ekliyoruz.
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce = ilce;
        evBuilder.mahalle = mahalle;
        evBuilder.binaYil = binaYil;

        return evBuilder;
    }

    public static EvBuilder startHavuzluEvBuild(String il, String ilce, String mahalle, int binaYil, int odaSayisi) {

        // zorunlu tutulan alanlar istersek bunları ekliyoruz.
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce = ilce;
        evBuilder.mahalle = mahalle;
        evBuilder.binaYil = binaYil;
        evBuilder.havuzVar = true;

        return evBuilder;
    }

    public Ev Build() {
     Ev ev = new Ev();

        ev.setIl(il);
        ev.setMahalle(mahalle);
        ev.setIlce(ilce);

        ev.setOdaSayisi(odaSayisi);
        ev.setBanyoSayisi(banyoSayisi);
        ev.setTuvaletSayisi(tuvaletSayisi);
        ev.setBalkonSayisi(balkonSayisi);
        ev.setBinaYil(binaYil);

        ev.setDubleksMi(dubleksMi);
        ev.setEsyaliMi(esyaliMi);
        ev.setOtoparkVar(otoparkVar);
        ev.setCocukParkiVar(cocukParkiVar);
        ev.setKlimaVar(klimaVar);
        ev.setHavuzVar(havuzVar);

        return ev;
    }
}
