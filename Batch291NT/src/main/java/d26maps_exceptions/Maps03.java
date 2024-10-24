package d26maps_exceptions;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {

        //Meshur bir interview sorusu

        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız olsun)

        //example 1: Given a String, count the number of times each word is used in that String
        // write the code that displays.(Case insensitive)

        // ali = 2, nasilsin = 1

        String s = "Ali nasilsin Ali.";

        s = s.replaceAll("\\p{Punct}", "").toLowerCase();
        System.out.println(s); //ali nasilsin ali

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words)); //[ali, nasilsin, ali]

        HashMap<String, Integer> myMap = new HashMap<>();

        System.out.println(myMap); //{                                                }

        //[ali, nasilsin, ali]
        for (String w : words) {

            Integer isThere = myMap.get(w); //ilk dongude w'nun icinde ali var. map'te ali olmadigindan null gelecek
            if (isThere == null) {
                myMap.put(w, 1); //ilk dongude map te ali yok, 1 tane eklenecek
            } else {
                myMap.put(w, isThere + 1); //map'te varsa 1 artir
            }
        }
        System.out.println(myMap); //{nasilsin=1, ali=2}

        //ODEV: Size verilen bir String'deki her harfin o String'de kac defa kullanildigini gosteren kodu yaziniz.
        //example 2: Write the code that shows how many times each letter in a given String is used in that String.
        //           “Hello” ==> H=1, e=1, l=2, o=1

        //1.yol
        String str ="Hello";
        str = str.toLowerCase();
        String[] harf = str.split("");
        System.out.println(Arrays.toString(harf));
        HashMap<String, Integer> hm =new HashMap<>();

        for (String w : harf){
            if (hm.get(w)==null){
                hm.put(w,1);
            }else {
                hm.put(w,hm.get(w)+1);
            }
        }
        System.out.println(hm); //{e=1, h=1, l=2, o=1}

//2.yol

        String str2 ="Hello";
        str2 = str2.toLowerCase();
        HashMap<Character,Integer> hm2 = new HashMap<>();

        for (int i = 0; i < str2.length() ; i++)
        {
            if(hm2.get(str2.charAt(i))==null){
                hm2.put(str2.charAt(i),1);
            }else {
                hm2.put(str2.charAt(i),hm2.get(str2.charAt(i))+1);
            }
        }
        System.out.println(hm2); //{e=1, h=1, l=2, o=1}





    }
}






