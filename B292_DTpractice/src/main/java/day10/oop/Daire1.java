package day10.oop;

public class Daire1 extends Kat implements DaireBilgisi,KapiBilgisi{//iç dizaynini bildigim daire yapısı

    /*
    variableları olusturulalım diger ismi ile pasif özellikler
     */
    public String isim;
    public String soyIsim;
    public int kisiSayisi;
    public String mutfakTipi;
    public String kacinciKat;
    public int dusSayisi;
    public int lavaboSayisi;
    public int daireNo;
    //deger ataması kolay olsun diye cons olusturdum
    public Daire1(String isim, String soyIsim, int kisiSayisi, String mutfakTipi, String kacinciKat, int dusSayisi, int lavaboSayisi, int daireNo) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.kisiSayisi = kisiSayisi;
        this.mutfakTipi = mutfakTipi;
        this.kacinciKat = kacinciKat;
        this.dusSayisi = dusSayisi;
        this.lavaboSayisi = lavaboSayisi;
        this.daireNo = daireNo;
    }

    @Override
    public void daireNo() {
        System.out.println("Dairenin daire no bilgisi : "+this.daireNo+". dairedir");
    }

    @Override
    public void zilSesi() {
        System.out.println("Dairelerin zil sesi kendine özgüdür.");
    }

    @Override
    public void isimEtiketi() {
        System.out.println("Dairede yaşayan kişinin ismi : "+this.isim+" "+this.soyIsim+"dir.");
    }

    @Override
    public void kacinciKat() {
        System.out.println("Daire "+kacinciKat+". katta bulunmaktadir");
    }

    @Override
    public String toString() {
        return "Daire1{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", mutfakTipi='" + mutfakTipi + '\'' +
                ", kacinciKat='" + kacinciKat + '\'' +
                ", dusSayisi=" + dusSayisi +
                ", lavaboSayisi=" + lavaboSayisi +
                ", daireNo=" + daireNo +
                ",Apartman name='" + name + '\'' +
                ", kapiNo=" + kapiNo +
                '}';
    }
}

