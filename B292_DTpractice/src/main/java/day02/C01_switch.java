package day02;

import java.util.Scanner;

public class C01_switch {
    public static void main(String[] args) {
        //Toplama, Çıkarma, Çarpma, Bölme , kalan Hesaplama ve us alma
        // 2 sayi işlem yapan basit bir Hesap Makinesi oluşturun:

        //1. adım
        Scanner input=new Scanner(System.in);


        //2.adım normal koşullarda kullanıcıya bilgi verirdik
        System.out.println("Lütfen işlem yapmak istediğiniz operatoru giriniz : \ntoplama icin : +\ncıkarma icin : -\ncarpma icin : *\nbolme icin : /\nus almak icin : ^\nkalan hesaplama icin : %");


        //3.adım uygun bir variable'a atamak

        char operator=input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("Lütfen toplamak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların toplamı : "+(input.nextDouble()+ input.nextDouble()));
                break;
            case '-':
                System.out.println("Lütfen cıkarmak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların farkı : "+(input.nextDouble()- input.nextDouble()));
                break;
            case '*':
                System.out.println("Lütfen carpmak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların carpımı : "+input.nextDouble()* input.nextDouble());
                break;
            case '/':
                System.out.println("Lütfen bolmek istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların bolumu : "+input.nextDouble()/ input.nextDouble());//payda'nın 0 olma durumunu kontrol ediniz
                break;
            case '%':
                System.out.println("Lütfen modunu almak istediginiz sayilari sırasıyla giriniz : ");
                System.out.println("sayıların modu : "+input.nextDouble()% input.nextDouble());//payda'nın 0 olma durumunu kontrol ediniz
                break;
            case '^':
                System.out.println("Lütfen birbirinin kuvvetini almak istediginiz sayilari sirasiyla giriniz : ");
                System.out.println("sayilar kuvvet durumu : "+Math.pow(input.nextDouble(), input.nextDouble()));//sayi*sayi karesini alırız//aynısını for ile yapabilirsiniz bu odev!!!!!
                break;
            default:
                System.out.println("Lütfen gecerli bir operator giriniz ☺");
                break;
        }

        System.out.println("Bizi tercih ettiginiz icin tesekkürler ☻");

    }


}
