package behavioral.template;

public class App {

    /**
     * https://www.tutorialspoint.com/design_pattern/template_pattern.htm
     *
     * In Template pattern, an abstract class exposes defined way(s)/template(s) to execute its methods. Its subclasses can override the method implementation as per need but the invocation is to be in the same way as defined by an abstract class. This pattern comes under behavior pattern category.
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        AnadoluLisesiDilekce anadoluLisesiDilekce = new AnadoluLisesiDilekce("12-Fen-A", "1093", "Sadık Bahadır Memiş");

        FenLisesiDilekce fenLisesiDilekce = new FenLisesiDilekce("10", "91", "Ayşe Yusuf", "B");

        anadoluLisesiDilekce.dilekceYazdir();
        System.out.println("\n\n\n\n");
        fenLisesiDilekce.dilekceYazdir();
    }
}
