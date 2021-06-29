package creational.abstractFactory;

public class TelefonBayisi {

    public static void main(String[] args) {
        // creational.factory tasarım kalıbında bir sürü if else
        // yazıldığında kod karışık hale gelir. bunu çözmek
        // için abstract creational.factory tasarım kalıbı doğmuştur.

        /**
         * Abstract Factory patterns work around a super-creational.factory
         * which creates other factories. This creational.factory is also
         * called as creational.factory of factories. This type of design
         * pattern comes under creational pattern as this
         * pattern provides one of the best ways to create
         * an object.
         *
         * In Abstract Factory pattern an interface is
         * responsible for creating a creational.factory of related
         * objects without explicitly specifying their classes.
         * Each generated creational.factory can give the objects as per
         * the Factory pattern.
         */

        S8Factory s8Factory = new S8Factory();
        Telefon s8 = s8Factory.getTelefon("s8", "2500mah", 4, 7);

        Note8Factory note8Factory = new Note8Factory();
        Telefon note8 = note8Factory.getTelefon("note8", "3000mah", 5, 8);

        System.out.println(s8);
        System.out.println(note8);
    }
}
