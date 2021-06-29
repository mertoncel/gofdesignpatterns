package creational.builder;

public class Ev {
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

    public Ev() {
    }

    public Ev(String il, String mahalle, String ilce, int odaSayisi, int banyoSayisi, int tuvaletSayisi, int balkonSayisi, int binaYil, boolean dubleksMi, boolean esyaliMi, boolean otoparkVar, boolean cocukParkiVar, boolean klimaVar, boolean havuzVar) {
        this.il = il;
        this.mahalle = mahalle;
        this.ilce = ilce;
        this.odaSayisi = odaSayisi;
        this.banyoSayisi = banyoSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.balkonSayisi = balkonSayisi;
        this.binaYil = binaYil;
        this.dubleksMi = dubleksMi;
        this.esyaliMi = esyaliMi;
        this.otoparkVar = otoparkVar;
        this.cocukParkiVar = cocukParkiVar;
        this.klimaVar = klimaVar;
        this.havuzVar = havuzVar;
    }

    public Ev(String il, String mahalle, String ilce, int odaSayisi, int binaYil) {
        this.il = il;
        this.mahalle = mahalle;
        this.ilce = ilce;
        this.odaSayisi = odaSayisi;
        this.binaYil = binaYil;
    }



    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getBanyoSayisi() {
        return banyoSayisi;
    }

    public void setBanyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public int getBalkonSayisi() {
        return balkonSayisi;
    }

    public void setBalkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
    }

    public int getBinaYil() {
        return binaYil;
    }

    public void setBinaYil(int binaYil) {
        this.binaYil = binaYil;
    }

    public boolean isDubleksMi() {
        return dubleksMi;
    }

    public void setDubleksMi(boolean dubleksMi) {
        this.dubleksMi = dubleksMi;
    }

    public boolean isEsyaliMi() {
        return esyaliMi;
    }

    public void setEsyaliMi(boolean esyaliMi) {
        this.esyaliMi = esyaliMi;
    }

    public boolean isOtoparkVar() {
        return otoparkVar;
    }

    public void setOtoparkVar(boolean otoparkVar) {
        this.otoparkVar = otoparkVar;
    }

    public boolean isCocukParkiVar() {
        return cocukParkiVar;
    }

    public void setCocukParkiVar(boolean cocukParkiVar) {
        this.cocukParkiVar = cocukParkiVar;
    }

    public boolean isKlimaVar() {
        return klimaVar;
    }

    public void setKlimaVar(boolean klimaVar) {
        this.klimaVar = klimaVar;
    }

    public boolean isHavuzVar() {
        return havuzVar;
    }

    public void setHavuzVar(boolean havuzVar) {
        this.havuzVar = havuzVar;
    }

    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", ilce='" + ilce + '\'' +
                ", odaSayisi=" + odaSayisi +
                ", banyoSayisi=" + banyoSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", balkonSayisi=" + balkonSayisi +
                ", binaYil=" + binaYil +
                ", dubleksMi=" + dubleksMi +
                ", esyaliMi=" + esyaliMi +
                ", otoparkVar=" + otoparkVar +
                ", cocukParkiVar=" + cocukParkiVar +
                ", klimaVar=" + klimaVar +
                ", havuzVar=" + havuzVar +
                '}';
    }
}
