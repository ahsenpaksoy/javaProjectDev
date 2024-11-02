package interviewday04;

import java.util.Arrays;
import java.util.Scanner;

public class C01_InterviewQuestion {
    /*
  Bir metin içinde kullanıcıdan alınan bir kelimenin
  kaç kez geçtiğini sayan bir Java metodu yazın.
  Metin büyük/küçük harf duyarlı olmamalıdır.
  Örnek girdi olarak 'Java, Java, and java!' verildiğinde kullanıcı java girerse,
  çıktı olarak 3 verilmelidir
   */
    public static void main(String[] args) {
        String str="Java, Java, and java! çalışmalısın";
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen aramak istediginiz kelimeyi giriniz");
        String word=input.next();//java
        countWordOccurences(str,word);
        splitWithCountWordOccurences(str,word);
    }
    //1.yol
    public static void countWordOccurences(String cumle, String arananKelime) {
        cumle=cumle.toLowerCase();
        arananKelime=arananKelime.toLowerCase();
        //direkt kücülttüm çünkü duyarsız!!!

        int count=0;
        int index=0;
        //String str="Java, Java, and java! çalışmalısın";
        while((index=cumle.indexOf(arananKelime,index))!=-1){
            count++;
            index+=arananKelime.length();
        }
        System.out.println("Bu kelimeden toplam : "+count+" tane kullanılmıştır.");

    }

    //2.yol split ile array'e cevirip yapsak ne olurdu
    public static void splitWithCountWordOccurences(String cumle, String arananKelime){
        cumle=cumle.toLowerCase().replaceAll("[^a-z ]","");
        arananKelime=arananKelime.toLowerCase();

        String []arr=cumle.split(" ");
        System.out.println("arr = " + Arrays.toString(arr));
        // System.out.println("arr.length = " + arr.length);

        int sayac=0;
        for (String a:arr
        ) {
            if (a.equals(arananKelime)){
                sayac++;
            }
        }
        System.out.println("Bu kelimeden toplam : "+sayac+" tane kullanılmıştır.");

    }
}




