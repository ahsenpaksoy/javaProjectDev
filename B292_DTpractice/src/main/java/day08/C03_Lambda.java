package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Lambda {
    public static void main(String[] args) {

        //3)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun

        List<Integer> mylist = new ArrayList<>(Arrays.asList(1, 7, 11, 23, 12, 14, 9, 47, 58, 91, 37, 37, 23, 8, 11, 1, 23, 23, 8));
        //3)Verilen List'teki "maksimum değeri" bulmak için bir method oluşturun
        maksimum(mylist);
    }

    private static void maksimum(List<Integer> mylist) {
        System.out.println(mylist.stream().distinct().reduce(Math::max).get());//reduce((t,u)->Math.max(t,u))
    }


    //varargs;
    //  public static void main(String[] args) {
    //      toplam(5,6,7,8,9,0,12,13,14,15,16,17,18,43,43,5476,78,76,6,54,3,2,43,54,56,674,32,76576,654,54,54332,2,22543,23);
    //  }
    //  public static void toplam(int... a){
    //      int toplam=0;
    //      for (int b :a
    //           ) {
    //          toplam += b;
    //      }
    //      System.out.println("toplam = " + toplam);
    //  }
}
