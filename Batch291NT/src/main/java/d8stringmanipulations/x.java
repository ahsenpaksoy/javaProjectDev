package d8stringmanipulations;

import java.util.Scanner;

public class x {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = input.nextLine();

        // i)En az 8 karakter olsun

        boolean lengthControl = pwd.length() > 7;

        //boolean spaceControl = pwd.replaceAll("[^ ]","").length() == 0;
        //boolean spaceControl = pwd.replaceAll("[^ ]","").isEmpty();
        boolean spaceControl = !pwd.contains(" ");

        //iii)En az bir tane buyuk harf olsun
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //System.out.println("upperCaseControl = " + upperCaseControl);

        boolean upperCase = pwd.replaceAll("[^A-Z]","").length() > 0;

        // iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;
        //System.out.println("lowerCaseControl = " + lowerCaseControl);

        boolean lowerCase = pwd.replaceAll("[^a-z]","").length() > 0;

        //v)En az bir tane rakam olsun
        boolean digitControl = pwd.replaceAll("[^0-9]", "").length() > 0;
        //System.out.println("digitControl = " + digitControl);

        boolean digit = pwd.replaceAll("[^0-9]","").length() > 0;

        if(!digit){
            System.out.println("Sifre en az bir rakam icermelidir");
        }

        boolean sembolControl = pwd.replaceAll("[^\\p{Punct}]","").length() > 0;

        boolean isValidd = lengthControl && spaceControl &&upperCaseControl && lowerCaseControl && digitControl && sembolControl;

        if(isValidd){
            System.out.println("Sifre gecerlidir");
        }else {
            System.out.println("Sifre gecersizdir");
        }



        if (!digitControl) {
            System.out.println("Sifre an az bir rakam icermelidir");
        }

        //ODEV: En az 1 tane sembol icermeli




        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl && sembolControl;

        if (isValid) {
            System.out.println("Sifre gecerlidir");
        } else {
            System.out.println("Sifre gecersizdir");
        }

    }

}