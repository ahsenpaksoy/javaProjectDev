package interviewday01;

import java.util.Scanner;

public class C06_InterviewQuestion {
    public static void main(String[] args) {

        /*
          Check no is Armstrong or not   in java Program
          Bir sayinin armstrong olup olmadıgını kontrol eden java programini yaziniz
         */
        /*
        454 -> 4^3+5^3+4^3->253!=454 -> no armstrong!!!
        123
        548
        407-> 4^3+0^3+7^3->343+64->407==407-> armstrong sayidir!!!

         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen armstrong sayi olup olmadıgını kontrol etmek istediginiz sayiyi giriniz");
        int sayi= input.nextInt();
        int sayac=0;
        for (int i = sayi; i >0 ; i/=10) {
            sayac++;
        }
        //System.out.println("sayac = " + sayac);
        int sum=0;
        for (int i = sayi; i >0 ; i/=10) {
            sum+= power(i%10,sayac);
        }
        if (sayi==sum){
            System.out.println("Bu sayi armstrong sayidir!!!");
        }else {
            System.out.println("Bu sayi armstorng sayi degildir!!!");
        }

    }
    public static int power(int a, int b){
        int c=1;
        for (int i = 1; i <=b ; i++) {
            c*=a;
        }
        return c;
    }
}