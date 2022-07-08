package esma_1;

public class day1 {
    public static void main(String[] args) {
        //method call
        /*input olrak verilen satıs fiyatı
         musteri kartı varmı
       uyeliği kac yıllık bilgileri degerlerndirip;
       -uye degilse %5
       -uyeliği var ama 5 yıldan az ise %10
       -uyeliği var ve 5 yıldan cok ıse %15 indirim
       asıl fiyati indirim mikrtarı ve indirim fiyartını yadrıdan bir method

         */
        // sadece yazdırmamızı ıstediği için return type void olabilir.
        boolean uyeMi= true;
        int uyelikYili=3;
        int satisFiyati=250;

        indirimliFiyatHesapla(uyeMi,satisFiyati);


    }

    private static void indirimliFiyatHesapla(boolean uyeMi, int satisFiyati) {
    }

    public static void indirdirimliFiyatHesaplama(boolean uyeMi,int uyelikYili, int satisFiyati){
        if (uyeMi){
            if (uyelikYili<5){
                System.out.println("urun fiyati:" +satisFiyati);
                System.out.println("indirim  miktarı:"+ satisFiyati*0.05);
                System.out.println("inidirm fiyati:" + (satisFiyati- satisFiyati*0.05 ));


            }else{
                System.out.println("urun fiyati:" +satisFiyati);
                System.out.println("indirim  miktarı:"+ satisFiyati*0.05);
                System.out.println("inidirm fiyati:" + (satisFiyati- satisFiyati*0.05 ));
            }

        }else{
            System.out.println("urun fiyati:" +satisFiyati);
            System.out.println("indirim  miktarı:"+ satisFiyati*0.05);
            System.out.println("inidirm fiyati:" + (satisFiyati- satisFiyati*0.05 ));
        }
    }
}
