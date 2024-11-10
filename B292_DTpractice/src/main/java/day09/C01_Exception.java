package day09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exception {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınız giriniz");
        String str="Ali Can";
        byte age=0 ;
        try {
            age = input.nextByte();
            System.out.println(10/age);
            System.out.println(str.charAt(age));
        }catch (InputMismatchException e){
            e.printStackTrace();
            //throw new RuntimeException(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Payda 0 olamaz");
        } catch (Exception e){
            //e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }finally {
            System.out.println("Ne olursan ol yinede calış");
        }
        System.out.println(age);
        System.out.println("kodum calısmaya devam ediyor mu?");
    }
    // AritmeticException : sifira bolme basta olmak uzere matematiksel hatalari belirtir
    // NullpointerException : Henüz deger atamasi yapmadigmiz degiskenler uzerinde islem yapmaya calisirsak dondurur
    // IndexOutOfBoundsException: Hatalı indeks erişimlerinde fırlatılır.
    // ClassCastException: Geçersiz tür dönüşümü işlemlerinde fırlatılır.
    // IllegalArgumentException: Metoda verilen parametrelerden biri hatalı olduğunda fırlatılır.
    // NumberFormatException: Bir String değerini sayısal bir türe dönüştürmeye çalıştığımızda, eğer String değer düzgün bir sayı ifade etmiyorsa fırlatılır.
    // ArrayIndexOutOfBoundsException: Bir dizinin aralığı dışında elemanına erişmeye çalışıldığında fırlatılır.
    // StringIndexOutOfBoundsException: Bir String index'inin disina cikarsak aldigimiz hata
    // UnsupportedOperationException: Desteklenmeyen bir iş yapmaya çalışıldığında fırlatılır.
}







