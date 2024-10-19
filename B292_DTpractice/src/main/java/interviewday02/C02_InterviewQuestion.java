package interviewday02;

import java.util.Arrays;
import java.util.Scanner;

public class C02_InterviewQuestion {
    public static void main(String[] args) {

        // bir cümlenin kelimelerini sayacak, her kelimeyi ters çevirecek kodu yazınız

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz");
        String str= input.nextLine();

        //hem kelimelere ayırdık hemde kelime sayisi buldum
        String[] words=str.split(" ");
        System.out.println("cümledeki kelime sayisi : "+words.length);//3
        System.out.println(Arrays.toString(words));

        //son kelimeden başlayarak ters cevirseydik ne olur
        //ali can topu bana at
        //ta anab upot nac ila
        //her kelimeyi ters cevirelim
        System.out.println("Ters çevrilmiş kelimeler : ");
        for (int i = words.length-1; i >=0 ; i--) {
            StringBuilder sb=new StringBuilder(words[i]);
            System.out.print(sb.reverse()+" ");
        }
        System.out.println();
        for (String word:words
        ) {
            StringBuilder sb=new StringBuilder(word);
            System.out.print(sb.reverse()+" ");
        }

    }
}





