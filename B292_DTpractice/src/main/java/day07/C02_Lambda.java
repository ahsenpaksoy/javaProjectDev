package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Lambda {
    public static void main(String[] args) {

        //2) Bir list'teki "10'dan kucuk" olan elemanlarin "kare"lerini ayni satirda  aralarina bosluk
        //koyarak yazdiran method'u olusturunuz.

        List<Integer> mylist=new ArrayList<>(Arrays.asList(1,7,11,23,12,14,47,58,91,37,23,8));

        rakamlarinKareleri(mylist);
    }

    public static void rakamlarinKareleri(List<Integer> myList){
        myList.stream().filter(t -> t < 10).map(t -> t * t).forEach(System.out::println);   // 1. yol
        myList.stream().filter(t -> t < 10).map(t -> t * t).forEach(t -> System.out.print(t + " "));  // 2. yol

        System.out.println();

        int sum = myList.stream().filter(t -> t < 10).map(t -> t * t).reduce(0,Integer::sum); // 1. kisa yol
        int sum1 = myList.stream().filter(t -> t < 10).map(t -> t * t).reduce(0,(t,u)->t+u);  // 2. yol
        System.out.println("sum = " + sum);
        System.out.println("sum1 = " + sum1);
    }




}
