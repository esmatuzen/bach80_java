package day26_contructor;

public class HastaRunner {
    public static void main(String[] args) {

        Hasta hasta1= new Hasta();
        System.out.println("HASTA KABUL FORMU:" + hasta1.toString());



        Hasta hasta2= new Hasta("AYŞE","YILDIZ","VSD","11/08/2019");
        System.out.println("HASTA KABUL FORMU:" + hasta2.toString());


    }
}
