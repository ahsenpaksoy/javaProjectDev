package day01_variables;

import java.util.Scanner;

public class C06_ifStatements {

    public static void main(String[] args) {

        //if eğer demektir else değilse demektir
        //Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz.");

        int sayi= input.nextInt();//7

        if (sayi%2==0){//% bölümünden kalanı verir
            System.out.println("Bir çift sayıdır.");
        }else {
            System.out.println("Bir tek sayıdır.");
        }
        //else if : eğer değilse demektir.

        //Kullanicidan alinan bir sayinin pozitif,
        //negatif veya notr oldugunu kontrol eden kodu yaziniz

        //Scanner input1=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz. ☺");
        double number= input.nextDouble();
        if (number>0){
            System.out.println("Sayi pozitiftir!");
        } else if (number<0) {
            System.out.println("Sayi negatiftir!");
        }else {
            System.out.println("Sayi sıfırdır!");
        }


    }

}
