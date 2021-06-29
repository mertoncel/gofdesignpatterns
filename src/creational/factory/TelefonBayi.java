package creational.factory;

public class TelefonBayi {

    public static void main(String[] args) {

        // birbirine benzer nesneleri oluştururken kullanılır.
        // Amaç oluşturmak istenilen sınıfın nesnesini kendisinden türetmek yerine creational.factory
        // ile tek bir instance üzerinden üretmektir.

        Telefon s8 = TelefonFactory.getTelefon("s8", "2600mah", 4, 8 );

        Telefon note8 = TelefonFactory.getTelefon("Note8", "3000mah", 5, 8);

        System.out.println("S8 için telefon özellikleri: ");
        System.out.println(s8);

        System.out.println("Note 8 için telefon özellikleri");
        System.out.println(note8);
    }
}
