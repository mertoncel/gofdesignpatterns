package creational.prototype;

import java.util.Date;

public class App1 {

    public static void main(String[] args) {

        /**
         * Prototype pattern refers to creating
         * duplicate object while keeping performance in mind. This type of design pattern comes under creational
         * pattern as this pattern provides one of the best ways to create an object.
         *
         * This pattern involves implementing a creational.prototype interface which tells to create a clone of the current
         * object. This pattern is used when creation of object directly is costly. For example, an object is to be
         * created after a costly database operation. We can cache the object, returns its clone on next request and
         * update the database as and when needed thus reducing database calls.
         */

        GenelEntityService genelEntityService =
                new GenelEntityService();

        long id1 = 1L;
        long id2 = 2L;

        Date ilkTarih = new Date();
        Belge belge1 = genelEntityService.findBelgeById(id1);
        belgeyiVeSaniyeFarkiniYazdir(ilkTarih, belge1);

//        Date ilkTarih2 = new Date();
//        Belge belge2 = genelEntityService.findBelgeById(id2);
//        belgeyiVeSaniyeFarkiniYazdir(ilkTarih2, belge2);

        Date ilkTarih3 = new Date();
        Belge belgeClone = null;
        try {
            belgeClone = belge1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        belgeClone.setAdi("günlük");
        belgeClone.setVeri("Sevgili günlük...");
        belgeClone.getBelgeTuru().setAdi("Kişisel 2");

        belgeyiVeSaniyeFarkiniYazdir(ilkTarih3, belgeClone);

        System.out.println(belge1);

    }

    private static void belgeyiVeSaniyeFarkiniYazdir(Date ilkTarih, Belge belge) {
        Date sonTarih = new Date();

        Long saniyeFarki = getSaniyeFarki(ilkTarih, sonTarih);

        System.out.println(belge);
        System.out.println(saniyeFarki);

        System.out.println("\n");


    }

    private static Long getSaniyeFarki(Date ilkTarih, Date sonTarih) {
        long has = 1000;

        Long saniyeFarki = (sonTarih.getTime() / has) - (ilkTarih.getTime() / has);

        return saniyeFarki;
    }
}
