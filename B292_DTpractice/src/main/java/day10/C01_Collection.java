package day10;

import java.util.*;

public class C01_Collection {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); //index yapisi vardir
        Queue<String> queue = new LinkedList<>(); //index yapisi yoktur
        LinkedList<String> linkedList = new LinkedList<>(); //index yapisi vardir
        Set<String> set = new HashSet<>(); //index yapisi yoktur
        //list te index yapisı var queue de yoktur.

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        queue.add("6");
        queue.add("7");
        queue.add("8");
        queue.add("9");

        linkedList.add("10");
        linkedList.add("11");
        linkedList.add("12");
        linkedList.add("13");
        linkedList.add("14");

        set.add("15");
        set.add("16");
        set.add("17");
        set.add("18");
        set.add("19");

        System.out.println(list.get(2));
        System.out.println(queue.element());
        System.out.println(linkedList.element());
        System.out.println(linkedList.get(2));
        System.out.println(set);


    }
}
