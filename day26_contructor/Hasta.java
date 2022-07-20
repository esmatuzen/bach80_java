package day26_contructor;

public class Hasta {

    // hasta kabul formunu uretmek için olusturulmus bir kanlıp hanede denebilir
    // ouyuzden kendimiz bir tane contructor olusturmalısyız.

    String isim="Belirtilmedi";
    String soyisim="Belirtilmedi";
    String tani= " Tanı Bilinmiyor ";
    String dogumTarihi="Tarih girilmedi";
    String yatisTarihi="Tarih belirtilmedi";
    String yattigiBolum="Bölüm belirtilmedi";


    public Hasta(

    ) {// gizlicons. defaultun yerine bos bir tane constructor olusturduk

    }

    public Hasta(String isim, String soyisim, String tani, String dogumTarihi, String yatisTarihi, String yattigiBolum) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.tani = tani;
        this.dogumTarihi = dogumTarihi;
        this.yatisTarihi = yatisTarihi;
        this.yattigiBolum = yattigiBolum;
    }

    // hasta yattıgı tarihi ve bölümü hatırlamıyorsa ;

    public Hasta(String isim, String soyisim, String tani, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.tani = tani;
        this.dogumTarihi = dogumTarihi;
    }
    // hasta yattıgı tarihi ,bölümü ve tanısını bilmiyorsa ;




    @Override
    public String toString() {
        return  
                "\nİsim= " + isim +
                "\nSoyisim= " + soyisim +
                "\nTanı= " + tani +
                "\nDogum Tarihi= " + dogumTarihi +
                "\nYatis Tarihi= " + yatisTarihi +
                "\nYattigi Bölüm= " + yattigiBolum
                ;
    }
}
