package structural.proxy;

import java.math.BigDecimal;

public class App {

    /**
     * https://medium.com/@ibrahimozdogan?source=search_post---------5
     *
     * https://www.tutorialspoint.com/design_pattern/proxy_pattern.htm
     *
     * In proxy pattern, a class represents functionality of another class. This type of design pattern comes under structural pattern.
     *
     * In proxy pattern, we create object having original object to interface its functionality to outer world.
     *
     * @param args
     */

    public static void main(String[] args) {

        YoneticiProxy yoneticiProxy = new YoneticiProxy("yusuf", "12345");

        try {
            BigDecimal ciro = yoneticiProxy.getCiro();
            System.out.println("Şirket cirosu: " + ciro);
        } catch (IllegalAccessException e) {
            System.out.println("Hassas bilgilere erişiminiz yoktur!");
        }
    }
}
