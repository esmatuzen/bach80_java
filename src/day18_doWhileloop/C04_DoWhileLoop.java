package day18_doWhileloop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        //kullanıcıdan tam sayılar alın
        // kullanıcı cift sayi girdigi muddetce
        // sayilri yazdırın tek sayi girdiğinde işlemi bitirin

        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        //while ile yapalım
        //Looplarda kullanacagımız veriablelları Looptan once olusturmalıyız
        //while loopta  looptan once olusturdugumuz  bu variablea atayacagımız degeri
        // düşünmemüz gerekiyor
        //cunku yanlıs deger atarsan loop dongusune girmez !!

        while (sayi % 2 == 0) {
            System.out.println("Lütfen bir sayi giriniz :");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("girilen sayi cift:" + sayi);
            } else {
                System.out.println("girilen sayi tek lütfen tekrar deneyiniz!");

            }
        }
        //do while loop ile yapalım
        do {
            //onceden olusturulan varşable hangi deger atandıgının
            // hiçbir onemi yok kodumuz her durumda calısır.
            //do while dez avantajı ilk
        }while (sayi%2==0);
    }
}
