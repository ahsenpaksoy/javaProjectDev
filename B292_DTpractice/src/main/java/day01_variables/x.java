package day01_variables;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class x {

    public static void main(String[] args) {

        // Soru 1) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // =50  <60 arasi “C”,
        // =60  <80 arasi “B”,
        // =80’nin uzerinde ise “A”

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 100 uzerinden notunuzu giriniz");
        float note = input.nextFloat();

        if(note<0 || note>100){
            System.out.println("Gecerli bir not giriniz");
        } else if (note<50) {
            System.out.println("D");
        } else if (note<60) {
            System.out.println("C");
        } else if (note<80) {
            System.out.println("B");
        }else {
            System.out.println("A");
        }


    }

}
