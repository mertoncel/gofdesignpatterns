package creational.singleton;

public class Singleton {

    private Singleton() {
        System.out.println("Ben oluştum");
    }

    private static Singleton instance;

    private static int SAYI = 0;

    public static synchronized Singleton getInstance() {

        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

}
