package day06.encapsulation;

public class Student {
    //encapsulation : data hiding veri koruma ve gizleme
        /*
        bir class oluşturalım.
        private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
        parametreli ve parametresiz constructor oluşturun
        toString metodunu oluşturun
        */
    //private = gizli , protected = ev , defualt=oda, public=kütüphane;
    private String isim;
    private String soyIsim;
    private int yas;

    //getter: okuma,görüntüleme
    public String getIsim() {
        return isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public int getYas() {
        return yas;
    }

    //setter: degistirme,güncellemi
    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public void setYas(int yas) {
        if (yas<0){
            System.out.println("yaş degeri negatif olamaz!!!!");
        }else {
            this.yas = yas;
        }}

    //noArguments constructor
    public Student() {
    }

    //allArguments constructor
    //hızlı deger atamasi saglar
    public Student(String isim, String soyIsim, int yas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
    }


    //hızlı goruntuleme
    //toString


    @Override
    public String toString() {
        return "Öğrenci{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                '}';
    }

}