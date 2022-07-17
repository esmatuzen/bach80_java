package day22;


import java.util.Arrays;

public class C02_MDA {
    public static void main(String[] args) {
        /*tek katlı arraylerde arrayi direk yazdıramıyoruz
        cunku array non primitive data turudur ve her non primitive data direk yazdırılamayabilir.

        ancak arrayın içerisindeki elementleri direk yazdırabiliyoruz. cunku genelde primitve data türü yada sting elementler kullanılıyordu.

        multi dimesinoal arraylerde en dikkat edecegimiz konu
        ulaşmak istediğimiz elementin bir array mi yoksa
        primitive data mı oldugudur.

         */
        int [][] sayilar= {{1,2,3,4,5},{3,4}};

        /*
        burada sayilar arrayınde dusunursek içinde 2 tane inner array var
        sayilar [0]==> [1,2,3,4,5]

        ancak en içerideki elementlere ulasabilirsek direk yazdırabiliriz.
         */
        System.out.println(sayilar[0]); //[I@30f39991
        System.out.println(Arrays.toString(sayilar[0])); //[1, 2, 3, 4, 5]

        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3
        System.out.println(Arrays.toString(sayilar));//[[I@30f39991, [I@452b3a41]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 3, 4, 5], [3, 4]]
        /*
        arrayi iki sekilde declare edebilirdik
        1. elemanları dırek yazabiliriz
        2.outer ve inner arraylerin uzunluklarını belirterek olusturabiliriz

        int [][] sayilar = new in

        ancak 2.

        eger iner arrayları farklı uzunluklarda olusturmak ıstıyorsanız mecburen 1. yontemi kullanmalısınız

         */
    }
}
