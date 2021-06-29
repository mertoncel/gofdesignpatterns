package creational.abstractFactory;

public interface ITelefonFactory {
    Telefon getTelefon(String model, String batarya, int en, int boy);
}
