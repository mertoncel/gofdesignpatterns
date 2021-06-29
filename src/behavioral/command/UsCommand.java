package behavioral.command;

import java.math.BigDecimal;

public class UsCommand implements Islem {
    @Override
    public BigDecimal islem(BigDecimal sayi1, BigDecimal sayi2) {
        return sayi1.pow(sayi2.intValue());
    }
}
