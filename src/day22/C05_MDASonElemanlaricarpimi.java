package day22;

public class C05_MDASonElemanlaricarpimi {
    public static void main(String[] args) {
       /* Soru 2) Asagidaki multi dimensional array’in
       ic array’lerindeki son elemanlarin carpimini
       ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
        */
         int [][] arr= { {1,2,3}, {4,5}, {6} };
         int carpimi=1;


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (j== arr[i].length-1){

                    carpimi*=arr[i][j];

                }
            }

        }
        System.out.println("son elemanların carpımı= " + carpimi);
    }
}
