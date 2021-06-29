package behavioral.observer;

public class Ebeveyn implements Observer {

    private String adi;

    public Ebeveyn(String adi) {
        this.adi = adi;
    }

    @Override
    public void update(Observable observable) {

        Termometre termometre = (Termometre) observable;

        System.out.println(adi + " dedi ki: ooo sıcaklık " + termometre.getAnlikSicaklik() +
                " derece olmuş.");
    }
}
