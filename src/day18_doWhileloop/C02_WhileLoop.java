package day18_doWhileloop;

public class C02_WhileLoop {
    public static void main(String[] args) {
         //Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

   int input= 5432;
    int rakamlarToplami=0;
    int birlerBasamagı=0;
    int temp=input;
   while (temp>0) {
       birlerBasamagı = temp% 10;
       rakamlarToplami += birlerBasamagı;

       temp /= 10;

   }
        System.out.println(input + " sayinin rakamlar toplamı: "+ rakamlarToplami);
    }
}
