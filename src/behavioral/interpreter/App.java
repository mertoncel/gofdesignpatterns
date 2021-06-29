package behavioral.interpreter;

import behavioral.interpreter.yorumlayici.KargaDiliYorumlayici;
import behavioral.interpreter.yorumlayici.KusDiliYorumlayici;
import behavioral.interpreter.yorumlayici.Yorumlayici;

public class App {

    /**
     * https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm
     *Interpreter pattern provides a way to evaluate language grammar or expression. This type of pattern comes under
     *  behavioral pattern. This pattern involves implementing an expression interface which tells to interpret a
     *  particular context. This pattern is used in SQL parsing, symbol processing engine etc.
     *
     * @param args
     */

    public static void main(String[] args) {

        String kusSozu = getKusSozu();

        String kargaSozu = getKargaSozu();


        yazdir(kusSozu, new KusDiliYorumlayici());

        yazdir(kargaSozu, new KargaDiliYorumlayici());



    }

    private static void yazdir(String kusSozu, Yorumlayici yorumlayici) {
        String turkce = yorumlayici.yorumla(kusSozu);
        System.out.println(turkce);
    }

    private static String getKusSozu() {
        String kusSozu = "Sacadıcık Bacahacadıcır Mecemiciş cacacıcık yecer";
        return kusSozu;
    }

    private static String getKargaSozu() {
        String kusSozu = "Sagadıgık Bagahagadıgır Megemigiş cagacıgık yeger";
        return kusSozu;
    }
}
