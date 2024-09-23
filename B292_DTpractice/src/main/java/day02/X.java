package day02;

import java.util.Scanner;

public class X {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfin büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Kontrol etmek istediginiz harfi giriniz");

       String harf = input.next().toLowerCase();
       harf = harf.replaceAll("[^a-z]","*");
       harf = harf.replaceAll("[aeiou]","a");

       if (harf.contains("*") || harf.length()!=1){
           System.out.println("Hatalidir");
       }else {
           if (harf.equals("a")) {
               System.out.println("Sesli harftir");
           }else {
               System.out.println("Sessiz harftir");
           }
       }

       System.out.println("100 den kucuk pozitif bir tamsayi girin");
       byte sayi = input.nextByte();

       if (sayi<0 || sayi>100){
           System.out.println("Lütfen 100'den kucuk bir pozitif tam sayi giriniz");
       }else {
           for (int i = 3; i < sayi; i+=3) {//i=i+3;
               System.out.print(i + " ");
           }
       }


    }
}









