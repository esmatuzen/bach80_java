package day18_doWhileloop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        //while loopda once kontrol wdip sonra islem yaptıgımız için işlem bittikten sonra
        // loop un kirilmasi için bir kez daha basa donmemiz
        int sayi=7;

        while (sayi<10 ){

            System.out.println(sayi);
            sayi++;
        }
        /*
        do while loop ile czlistırgımızda bu dezavantaj ortadan kalkar
         */
        sayi=7;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<10);

    }

}
