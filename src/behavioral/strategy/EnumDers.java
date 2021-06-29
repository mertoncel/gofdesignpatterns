package behavioral.strategy;

public enum EnumDers {

    TURKCE("Türkçe"),
    MATEMATIK("Matematik"),
    SOSYAL("Sosyal"),
    FEN("Fen")
    ;

    private String ders;

    EnumDers(String ders) {
        this.ders = ders;
    }

    @Override
    public String toString() {
        return ders;
    }
}
