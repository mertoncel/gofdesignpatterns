package creational.builder;

public class EmlakciV2 {

    public static void main(String[] args) {

        /**
         * Builder pattern builds a complex object using
         * simple objects and using a step by step approach.
         * This type of design pattern comes under creational
         * pattern as this pattern provides one of the best
         * ways to create an object.
         *
         * A Builder class builds the final object step by
         * step. This creational.builder is independent of other
         * objects.
         */

        //burada zorunlu alanlarla builderı oluşturduk.
        //sonra opsiyonel kısımları ekledik.
        Ev ev1 =EvBuilder.startNormalEvBuild("Istanbul", "Ümraniye",
                "Tatlısu", 2010, 3)
                .setCocukParkiVar(true)
                .setOtoparkVar(true)
                .Build();

        printEv(ev1);

        Ev ev2 =EvBuilder.startHavuzluEvBuild("Istanbul", "Kartal",
                "Yakacık", 2014, 3)
                .setCocukParkiVar(true)
                .setOtoparkVar(true)
                .Build();

        printEv(ev2);


    }

    private static void printEv(Ev ev) {


        System.out.println();
        System.out.println("ev eklendi: " + ev);

        System.out.println();
    }
}
