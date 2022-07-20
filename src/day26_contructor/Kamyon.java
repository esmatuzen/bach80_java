package day26_contructor;

public class Kamyon {

    public String marka = "Marka Belirtilmedi";
    public String model = "Model Belirtilmedi";
    public int  yil ;
    public  int fiyat;

    public Kamyon(String marka, String model, int yil, int fiyat) {
        this.marka= marka;
        this.fiyat=fiyat;
        this.model=model;
        this.yil=yil;


    }

    public Kamyon(){

    }

    public Kamyon(String marka, String model) {
        this.marka=marka;
        this.model=model;

    }

    @Override
    public String toString() {
        return "" +
                "\nmarka= " + marka +
                " \nmodel= " + model +
                "  \nyil= " + yil +
                "  \nfiyat= " + fiyat ;
    }
}
 /*
          bizim temel amacimiz KamyonRunner'da argument olarak girilen degerin
          Kamyon class'inda intstance variable'a atanmasi
          Ancak scope konusunda ogrendigimiz gibi
          Kamyon constructor scope'unda marka oldugu icin
          instance marka'ya gitmiyor
          Bu karisikligi gidermek icin instance variable'lari
          belirli hale getirmemiz lazim
          Java bunun icin this keyword'u olusturmustur
          Genel kullanim acisindan this keyord'u kodu herkesin anlamasini
          kolaylastirdigi icin tercih edilir
         */
