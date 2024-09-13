package day01_variables;

import java.util.Scanner;

public class C05_scanner {

    public static void main(String[] args) {


        //Soru : Kullanicidan dikdortgenler prizmasinin uzun,
        //kisa kenarlarini ve
        //yuksekligini isteyip prizmanin hacmini(uzun*kısa*yukselik) hesaplayip yazdirin

        //ilk adım scanner objesi olusturmak
        Scanner input=new Scanner(System.in);

        //----------------------------------------------
        //1.yol
//
//        //kullanıcıya mesaj vermek
//        System.out.println("Lütfen hesaplamak istediginiz dikdortgenler prizmasinin uzun kenari giriniz ☻");
//
//        //variable atama
//        double uzunKenar= input.nextDouble();
//
//        //tekrar kullanıcıya mesaj vermek
//        System.out.println("Lütfen hesaplamak istediginiz dikdortgenler prizmasinin kısa kenari giriniz ☻");
//
//        //variable atama
//        double kisaKenar= input.nextDouble();
//
//        //tekrar kullanıcıya mesaj vermek
//        System.out.println("Lütfen hesaplamak istediginiz dikdortgenler prizmasinin yüksekliğini giriniz ☻");
//
//        //variable atama
//        double yukseklik= input.nextDouble();

        //2.yol
        System.out.println("Lütfen hesaplamak istediginiz dikdortgenler prizmasinin sırasıyla uzun , kısa kenarini ve yüksekliğini giriniz ☻");
        double uzunKenar= input.nextDouble();
        double kisaKenar= input.nextDouble();
        double yukseklik= input.nextDouble();

        System.out.println("prizmanın hacmi : "+uzunKenar*kisaKenar*yukseklik);
    }

}
