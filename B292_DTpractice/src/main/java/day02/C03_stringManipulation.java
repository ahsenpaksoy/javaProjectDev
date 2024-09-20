package day02;

import java.util.Scanner;

public class C03_stringManipulation {
    public static void main(String[] args) {
        /*
       Kullanicidan email adresini girmesini isteyin,
       mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
       @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
       @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
       odev!! bosluk karakteri varsada hata mesaji verin
   */
        //1.adım
        Scanner input=new Scanner(System.in);

        //2.adım kullanıcıya bilgi
        System.out.println("Lütfen email adresinizi giriniz ☺");

        //3.adım uygun bir variable'a atamak
        String email=input.nextLine();
        System.out.println(email);

        if (!email.contains("@gmail.com")){
            System.out.println("Lutfen gmail adresi giriniz :)");
        } else if (email.endsWith("@gmail.com")) {
            System.out.println("Email adresiniz kaydedildi");
        }else {
            System.out.println("lutfen yazimi kontol edin!");
        }
    }
}
