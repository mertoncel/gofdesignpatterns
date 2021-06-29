package behavioral.visitor.saglikbakanligi;

public class Hasta {

    private String ad;
    private EnumHastalik hastalik;
    private EnumHastaDurumu durumu;

    public Hasta(String ad, EnumHastalik hastalik, EnumHastaDurumu durumu) {
        this.ad = ad;
        this.hastalik = hastalik;
        this.durumu = durumu;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public EnumHastalik getHastalik() {
        return hastalik;
    }

    public void setHastalik(EnumHastalik hastalik) {
        this.hastalik = hastalik;
    }

    public EnumHastaDurumu getDurumu() {
        return durumu;
    }

    public void setDurumu(EnumHastaDurumu durumu) {
        this.durumu = durumu;
    }
}
