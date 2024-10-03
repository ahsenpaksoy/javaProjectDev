package day04;

import java.util.List;

public class C07_list {
    public static void main(String[] args) {

        // bir listede ortalamanin ustunde olan eleman sayisini bulunuz
        //List.of methodu kısa surede list olusturmayı saglar fakat arraylistlerde kullanılamaz

        List<Double> mylist=List.of(1.5,3.14,1.8,57.57,37.0,13.5);

        double sum = 0;
        for (double a : mylist){
            sum += a;
        }
        double ort = sum/mylist.size();
        System.out.println(ort);

        int sayac = 0;
        for (double a : mylist){
            if (a>ort){
                sayac++;
                System.out.println(a);
            }
        }



    }
}
