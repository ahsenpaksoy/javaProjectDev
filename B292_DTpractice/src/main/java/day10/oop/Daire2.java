package day10.oop;

public class Daire2 extends Kat implements KapiBilgisi{//iç dizaynını bilmiyorum

    public String isim;
    public String soyIsim;
    //public int kisiSayisi;
    //public String mutfakTipi;
    public String kacinciKat;
    //public int dusSayisi;
    //public int lavaboSayisi;
    public int daireNo;
    //deger ataması kolay olsun diye cons olusturdum
    public Daire2(String isim, String soyIsim, String kacinciKat, int daireNo) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.kacinciKat = kacinciKat;
        this.daireNo = daireNo;
    }

    @Override
    public void daireNo() {
        System.out.println("Dairenin numarasi : "+daireNo+" numaradır.");
    }

    @Override
    public void zilSesi() {
        System.out.println("Dairenin zil kendine özgüdür.");
    }

    @Override
    public void isimEtiketi() {
        System.out.println("Dairenin üzerinde bulunan isim etiketi : "+this.isim+" "+this.soyIsim);
    }

    @Override
    public void kacinciKat() {
        System.out.println("Daire "+this.kacinciKat+". kattadır.");

    }

    @Override
    public String toString() {
        return "Daire2{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", kacinciKat='" + kacinciKat + '\'' +
                ", daireNo=" + daireNo +
                ", Apartman name='" + name + '\'' +
                ", kapiNo=" + kapiNo +
                '}';
    }
}