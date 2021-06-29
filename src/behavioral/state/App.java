package behavioral.state;

public class App {

    /**
     * https://www.tutorialspoint.com/design_pattern/state_pattern.htm
     *
     * In State pattern a class behavior changes based on its state. This type of design pattern comes under behavior pattern.
     *
     * In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.
     *
     * @param args
     */

    public static void main(String[] args) {
        Oyun oyun = new Oyun();

        oyun.x();
        oyun.ucgen();
        oyun.kare();
        oyun.topuKaybet();

        oyun.x();
        oyun.kare();
        oyun.topuKap();
    }
}
