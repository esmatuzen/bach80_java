package day18_doWhileloop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
    9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz
  */
        int bas=9;
        int bitis=190;
        int temp=bas;
        // while loop

        while (temp<bitis){
            if (temp%7==0){

                System.out.println(temp + " ");
            }
            temp++;

        }
        //do while loop
        System.out.println(" ");
        temp=bas;
        do {
            if (temp%7==0){
                System.out.println( temp + " ");
                temp++;
            }
        } while (temp<bitis);
    }
}
