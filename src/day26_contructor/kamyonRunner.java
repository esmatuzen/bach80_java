package day26_contructor;

public class kamyonRunner {
    public static void main(String[] args) {

        Kamyon kamyon1= new Kamyon();
        System.out.println("KAMYON 1 OZELLİKLER : " + kamyon1.toString());

        Kamyon kamyon2= new Kamyon("mercedes","a20", 2022,400000);
        System.out.println("KAMYON 2 OZELİKLERİ :" + kamyon2);//to string yazmasanda yazar

        Kamyon kamyon3=new Kamyon("MAN","as900",2007,400000);
        System.out.println("Kamyon3 bilgileri " + kamyon3);

        Kamyon kamyon4=new Kamyon("Scania","s540");
        System.out.println("Kamyon4 bilgileri " + kamyon4);  }
}
