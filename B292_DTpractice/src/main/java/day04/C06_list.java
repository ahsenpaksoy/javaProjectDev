package day04;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class C06_list {
    public static void main(String[] args) {

        // verilen bir listede tekrar eden sayilari sadece 1 tane yapan
        // bir method olusturun
        // orn : [1, 3, 5, 3, 5, 6, 1, 7]  bu listi
        //       [1, 3, 5, 6, 7] bu hale donusturun

        ArrayList<Integer>mylist=new ArrayList<>(Arrays.asList(1, 3, 5, 3, 5, 6, 1, 7));
        System.out.println(mylist);
        tekrarsizList(mylist);
        // System.out.println(mylist);

    }

    private static void tekrarsizList(ArrayList<Integer> myList) {

        ArrayList<Integer> newList = new ArrayList<>();
        for (int a : myList) {
            if (!newList.contains(a)){
                newList.add(a);
            }
        }
        System.out.println(newList);

    }
}
