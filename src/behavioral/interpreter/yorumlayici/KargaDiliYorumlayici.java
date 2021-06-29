package behavioral.interpreter.yorumlayici;

import behavioral.interpreter.dil.KargaDili;

public class KargaDiliYorumlayici implements Yorumlayici {
    @Override
    public String yorumla(String soz) {
        KargaDili kargaDili = new KargaDili();
        String turkce = kargaDili.turkceyeCevir(soz);

        return turkce;
    }
}
