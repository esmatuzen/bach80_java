package day22;

public class C02_MDATumelementleriYazdırma {
    public static void main(String[] args) {
        // verilen bir MDA ARRAYIN tüm elementlerini yazdıran bir method hazırlayalım

        int [][] sayilar = {{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdir( sayilar);
    }

    private static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) {// i= 0,1,2 degerleri alacak

            for (int j = 0; j < sayilar[i].length; j++) {//inner arraylerin uzunluguna bagladık 0dan baslıyacak sırayla

                System.out.println( sayilar[i][j]+ " ");

            }

        }

    }
}
