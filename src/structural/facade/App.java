package structural.facade;

import structural.facade.borc.Borc;
import structural.facade.borc.EnumBorcTuru;
import structural.facade.borc.OdemeBilgileriDto;

import java.math.BigDecimal;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        TahsilatFacade tahsilatFacade =  new TahsilatFacade();


        Long id = 1L;
        BigDecimal borcTutar = new BigDecimal(10);
        EnumBorcTuru borcTuru = EnumBorcTuru.NORMAL;
        Date vadeTarihi = DateUtil.tarihOlustur("26.06.2021");


        Borc borc = new Borc(id, borcTuru, borcTutar,
                vadeTarihi);

        OdemeBilgileriDto odemeBilgileriDto = new OdemeBilgileriDto("Sadık Bahadır Memiş",
                "123456456", 01L,
                2023L, 123L);

        boolean isSuccess = tahsilatFacade.tahsilatYap(borc, odemeBilgileriDto);

        if (isSuccess) {
            System.out.println("Tahsilat yapıldı!");
        } else {
            System.out.println("Tahsilat yapılamadı");
        }
    }
}
