package day02;

import java.util.Scanner;

public class C02_ternary {
    public static void main(String[] args) {
            /*
        Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
        değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfin büyük yada küçüklüğüne duyarlıdır.)
        Sesli harfler: a,e,i,o,u
        */

        //1.adım olarak scanner objesi
        Scanner input=new Scanner(System.in);

        //2.adım olarak kullanıcaya bilgi mesaji
        System.out.println("Lütfen kontrol etmek istediginiz harfi giriniz : ");

        //3.adım olarak uygun bir variable giriniz
        String harf="";
        //l               //L
        harf=harf.replaceAll("[^a-z]","^");
        harf=harf.replaceAll("[aeiou]","e");


        //?,!,.,$-> ^


        //if (harf.contains("^")||harf.length()>1){
        //    System.out.println("Hatalıdır");
        //}else {
        //  if (harf.equals("e")){
        //      System.out.println("Sesli harftir");
        //  }else {
        //      System.out.println("Sessiz harftir");
        //  }
        //}

        String str=harf.contains("^")||harf.length()>1?("Hatalıdır!") : (harf.equals("e")?"Sesli harftir":"Sessiz harftir");

        System.out.println("Sonuc : "+str);
    }
}
