package structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class App {

    /**
     * https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm
     *
     * Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and
     * increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to
     * decrease object count thus improving the object structure of application.
     *
     * Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object
     * when no matching object is found. We will demonstrate this pattern by drawing 20 circles of different locations
     * but we will create only 5 objects. Only 5 colors are available so color property is used to check already existing
     * Circle objects.
     *
     */

    public static void main(String[] args) {

        List<Asker> askerList = new ArrayList<>();

        Yuzbasi yuzbasi = new Yuzbasi();
        askerList.add(yuzbasi);

        for (int i = 0; i < 50; i++) {
            Er er = new Er();
            askerList.add(er);
        }

        for (Asker asker : askerList) {
            asker.atesEt();
        }

        for (Asker asker : askerList) {
            asker.tara();
        }
    }
}
