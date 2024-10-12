package interviewday01;

import java.util.Scanner;

public class C04_İnterviewQuestion {
    public static void main(String[] args) {

        /*
        Print Reverse number in  java program
        Bir sayiyi tersten yazdıran programi yazınız
         */

       /*
        714532
        235417
                 */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ters cevirmek istediginiz sayiyi giriniz");
        //1.yol : String ters="";
        int reverse=0;                   //2.yol
        for (int sayi=input.nextInt(); sayi >0 ; sayi/=10) {
            //1.yol :  ters=ters+sayi%10;
            reverse=reverse*10;          //2. yol
            reverse=reverse+sayi%10;

        }
        System.out.println("ters = " + reverse);

    }
}