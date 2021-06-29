package behavioral.chainOfResponsibility;

public class App {

    /**
     * https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm
     *
     * As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request.
     * This pattern decouples sender and receiver of a request based on type of request. This pattern comes under
     * behavioral patterns.
     *
     * In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle
     * the request then it passes the same to the next receiver and so on.
     *
     *
     * @param args
     */

    public static void main(String[] args) {

        KargoSirketi sbmKargo = SbmKargo.getKargoSirketi();

        sbmKargo.kargola(EnumIl.KARS);

        System.out.println("\n--------------\n");

        sbmKargo.kargola(EnumIl.ANTALYA);

        System.out.println("\n--------------\n");

        sbmKargo.kargola(EnumIl.ISTANBUL);

        System.out.println("\n--------------\n");

        sbmKargo.kargola(EnumIl.ANKARA);

    }
}
