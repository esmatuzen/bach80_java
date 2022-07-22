package day27_staticKeyword;

public class C01 {
     static  int sayi=10;// İNTANCSE VARİBLE
     int rakam =5;

    public static void main(String[] args) {

        /*
        class levelda iki tur variable olusturabiliriz
        static (class ) varibles
        instance (obje ) varible

       ** static variablelar tum klastan kullanabilirken
        instance olanlar sadece static olmayan methodlar da direk kullanabilir
        instance varible lara static metodlardan ulasmak istersek obje olusturmak gerekir

       ** instance varibles lar obje varbles oldugu için
        herhangi bir satırda instance variables degerinin ne oldugunu bulmak için
         OBJE OLUSTURLAN satirdan ıtıbaren kod incelenmelidir

       ** static variables lar klasss varibleslı oldugu ıcın her hangi bir satırda statik variblesın degerini bulmak için
       CLASSIN BASINDA clasın basından itibaren kod incelenmelidir.

         */
        C01 obj1= new C01();

        System.out.println("obj1'in rakam degeri: " + obj1.rakam);//obje olusturduk 5 yazdırır
        System.out.println("obj1'in sayi degeri :"+ sayi);//direk sayi yazabiliyoruz 10 yazdırır

        obj1.rakam+=1;//5+1
        sayi+=1;//10+1

       // rakam+//rakam instance bir variables direk kullanılamaz

        System.out.println(" 1  + obj1'in rakam degeri: " + obj1.rakam);//obje olusturduk 6 YAZDIRIR
        System.out.println("1 + obj1'in sayi degeri :"+ sayi);//11 YAZDIRR

        C01 obj2 = new C01(); // OBJE 2DEN SONRA OLUSTURLAN  RAKAM VE SAYIYA YENİ DEGER ATANIP ATANMADIGINA DİKKAT EİLİR YOKSA İNSCANSE

        System.out.println("obj2'in rakam degeri: " + obj2.rakam);//5 CLASTAN ALAMAYIZ MAINE UGRAMAZ
        System.out.println("obj2'in sayi degeri :"+ sayi);// STATİC OLDUGU İÇİNNNNNN CLASS TAN ALACAGIZ MAİNE UGRAR 11 YAZDIRIR

        obj2.rakam++;
        obj2.sayi++;

        System.out.println(" 1  + obj2'in rakam degeri: " + obj2.rakam);//obje olusturduk 6 YAZDIRIR
        System.out.println("1 + obj2'in sayi degeri :"+ sayi);//11 YAZDIRR


    }

}
