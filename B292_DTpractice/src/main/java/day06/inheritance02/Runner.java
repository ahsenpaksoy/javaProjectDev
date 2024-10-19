package day06.inheritance02;

public class Runner {

    public static void main(String[] args) {
        Corsa araba1=new Corsa();
        System.out.println("araba1.hareket = " + araba1.hareket);//araba classından yazdırır
        System.out.println("araba1.hiz = " + araba1.hiz);//corsa classından yazdırır
        System.out.println("araba1.marka = " + araba1.marka);//opel classından yazdırır
        System.out.println("araba1.yakit = " + araba1.yakit);//corsa classından yazdırır

        //!!! fieldlarda referance data tipinden başlar
        //yoksa parentlara bakar, ilk bulduğu değeri getirir

        araba1.motor();//corsa classında method calısır
        araba1.yakitTuketimi();//opel classsındaki method calısır

        Opel araba2=new Corsa();
        //opelin tüm aktif ve pasif ozelliklerini tasir fakat aktif ozelliklerden daha güncel hali var ise güncel halini alir

        System.out.println("araba2.hareket = " + araba2.hareket);//araba classindan yazdirir
        System.out.println("araba2.hiz = " + araba2.hiz);//araba classından yazdirir
        System.out.println("araba2.yakit = " + araba2.yakit);//opel classından yazdirir

        araba2.yakitTuketimi();//Opel classından yazdirir
        araba2.motor();//Corsa classından yazdirir

        //methodlarda referans data tipine bakılır
        //metod varsa constructor data tipine kadar
        //child classlarda override edilmişse
        //en son hali çağırılır.Override edilmediyse
        //mevcut metod çağrılır.


        // Obje opelden olustugu icin variableda icin Corsa ya gitmez.
        // Methodlarda en guncel hali kullanilir

    }
}