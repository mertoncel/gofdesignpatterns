package behavioral.command;

import java.math.BigDecimal;

public class App2 {

    /**
     * https://www.tutorialspoint.com/design_pattern/command_pattern.htm
     *
     * Command pattern is a data driven design pattern and falls under behavioral pattern category. A request is wrapped
     * under an object as command and passed to invoker object. Invoker object looks for the appropriate object which
     * can handle this command and passes the command to the corresponding object which executes the command.
     *
     * @param args
     */

    public static void main(String[] args) {

        BigDecimal sayi1 = BigDecimal.TEN;
        BigDecimal sayi2 = BigDecimal.valueOf(2);

        BigDecimal toplam = HesapMakinesi2.islem(new ToplamaCommand(), sayi1, sayi2);
        BigDecimal fark = HesapMakinesi2.islem(new CikarmaCommand(), sayi1, sayi2);
        BigDecimal carpma = HesapMakinesi2.islem(new CarpmaCommand(), sayi1, sayi2);
        BigDecimal bolme = HesapMakinesi2.islem(new BolmeCommand(), sayi1, sayi2);
        BigDecimal us = HesapMakinesi2.islem(new UsCommand(), sayi1, sayi2);
        BigDecimal mod = HesapMakinesi2.islem(new ModCommand(), sayi1, sayi2);

        System.out.println("Toplam: " + toplam);
        System.out.println("Fark: " + fark);
        System.out.println("Çarpma: " + carpma);
        System.out.println("Bolme: " + bolme);
        System.out.println("Üs: " + us);
        System.out.println("Mod: " + mod);

    }
}
