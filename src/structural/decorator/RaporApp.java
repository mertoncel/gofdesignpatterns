package structural.decorator;

public class RaporApp {

    public static void main(String[] args) {

        /**
         * Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
         * This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.
         *
         * This pattern creates a decorator class which wraps the original class and provides additional functionality
         * keeping class methods signature intact.
         *
         * We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with
         * some color without alter shape class.
         */



        String icerik = getRaporIcerik();

        //String metin = duzRaporCiktisi(icerik);

        //String metin = cizgiliRaporCiktisi(icerik);

        //String metin = cizgiliKucukRaporCiktisi(icerik);

        String metin = imzaliCizgiliKucukRaporCiktisi(icerik);


        System.out.println(metin);


    }

    private static String imzaliCizgiliKucukRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);

        CizgiliRaporDecorator cizgiliRaporDecorator = new CizgiliRaporDecorator(duzRapor);

        KucukRaporDecorator kucukRaporDecorator = new KucukRaporDecorator(cizgiliRaporDecorator);

        ImzaliRaporDecorator decorator = new ImzaliRaporDecorator(kucukRaporDecorator);

        String metin = decorator.getMetin();
        return metin;
    }

    private static String cizgiliKucukRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);

        CizgiliRaporDecorator cizgiliRaporDecorator = new CizgiliRaporDecorator(duzRapor);

        KucukRaporDecorator decorator = new KucukRaporDecorator(cizgiliRaporDecorator);

        String metin = decorator.getMetin();
        return metin;
    }

    private static String cizgiliRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);

        CizgiliRaporDecorator decorator = new CizgiliRaporDecorator(duzRapor);

        String metin = decorator.getMetin();
        return metin;
    }

    private static String duzRaporCiktisi(String icerik) {
        DuzRapor duzRapor = new DuzRapor(icerik);

        String metin = duzRapor.getMetin();
        return metin;
    }

    private static String getRaporIcerik() {
        String icerik = "What is Lorem Ipsum?\n" +
                "\nLorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the " +
                "\nindustry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type " +
                "\nand scrambled it to make a type specimen book. It has survived not only five centuries, but also the" +
                "\n leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s " +
                "\nwith the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop" +
                "\n publishing software like Aldus PageMaker including versions of Lorem Ipsum.";

return icerik;

    }
}
