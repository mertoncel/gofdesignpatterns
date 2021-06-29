package structural.facade.tahsilat;

import structural.facade.borc.Borc;
import structural.facade.borc.EnumBorcTuru;
import structural.facade.hukuksal.HukuksalKontrolService;
import structural.facade.yapilandirma.YapilandirmaKontrolService;

public class TahsilatKontrolService {

    private YapilandirmaKontrolService yapilandirmaKontrolService;
    private HukuksalKontrolService hukuksalKontrolService;

    public TahsilatKontrolService() {
        yapilandirmaKontrolService = new YapilandirmaKontrolService();
        hukuksalKontrolService = new HukuksalKontrolService();
    }

    public boolean isTahsilataUygun(Borc borc) {

        boolean yapilandirmaBozulmali = false;
        if (EnumBorcTuru.YAPILANDIRMA.equals(borc.getBorcTuru())) {
            yapilandirmaBozulmali = yapilandirmaKontrolService.isYapilandirmaBozulmali(borc.getVadeTarihi());
        }

        boolean hukuksalIslemde = hukuksalKontrolService.isHukuksalIslemde(borc.getId());

        boolean isBorcTahsilataUygun = !(yapilandirmaBozulmali || hukuksalIslemde);

        return isBorcTahsilataUygun;
    }
}
