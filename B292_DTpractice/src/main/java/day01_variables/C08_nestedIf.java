package day01_variables;

import java.util.Scanner;

public class C08_nestedIf {

    public static void main(String[] args) {

        // bir kisinin kan bagisinda bulunup bulunamayacigini kontrol ediniz .
        // yas:18 ve uzeri olmali
        // kilo : 50 dan ust olmali

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz : ");
        int age= input.nextInt();
        if (age>=18){
            System.out.println("Lütfen kilonuzu giriniz : ");
            double weight= input.nextDouble();
            if (weight>50){
                System.out.println("Lütfen Aşağıdaki formu doldurunuz : ");
            }else {
                System.out.println("Lütfen "+(50-weight)+" kilo daha alıp geliniz ☻");
            }
        }else {
            System.out.println("Lütfen "+(18-age)+" yıl sonra geliniz ☺");
        }
    }

}
