package creational.abstractFactory;

public class S8Factory implements ITelefonFactory{

    @Override
    public Telefon getTelefon(String model, String batarya, int en, int boy) {
        return new S8(model, batarya, en, boy);
    }
}
