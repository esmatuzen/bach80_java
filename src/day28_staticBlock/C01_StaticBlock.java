package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        static block class uyelerinin tamamindan once calısır(min methoddan bile once)
         **niye static blok kullanılır ?
         main method calısmadan bir deger ataması yada
         on ayar yapmak istiyorsak

         static blocların class icerisinde nerede oldugu onemli degildir once static bloklar calısır.

         birden fazla static bloc varsa yukarıdan asagı dogru calısır
         */

        System.out.println("Statik blok calıstı");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calıstı");

        System.out.println(sayi);
    }

    static {
        System.out.println("main method altındaki static blok calıstı");
    }
}
