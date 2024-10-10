package day05;

import java.time.LocalDate;
import java.util.Scanner;

public class C06_dateTime {
    public static void main(String[] args) {

        /*
        LocalDate->tarih objesi olusturmayi saglar
        LocalDateTime-> hem tarih hem saat objesi olusturmayi saglar
        LocalTime->saat objesi olusturmayi saglar
        icerisinde tarih ve saat icin gerekli methodlar bulunur
        DateTimeFormattir-> tarih ve saat objelerini istedigimiz formatta yazdırmayi saglar
        java'da normal kosullarda tarih objesi yıl/ay/gün olarak yazdılır
        biz istersek bunu formattir classımız ile degistirebiliriz
        */

          /*
       soru 1)
       -bugunun tarihini obje olusturarak yazdirin
       -bugun yilin kacinci gunu oldugunu yazdirin  //getDayOfYear()
       -hangi gunde oldugumuzu yazdirin  //getDayOfWeek()
       -yılın bitmesine kac gun kaldıgını yazdırın
       -bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
       -bugunden itibaren 2yil 2 ay 2 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
       -bugunden itibaren 7yil 7 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
       -ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
*/

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);
        System.out.println(tarih.getDayOfYear());  //284
        System.out.println(tarih.getDayOfWeek()); //THURSDAY
        //1. yol
        if(tarih.isLeapYear()){
            System.out.println(366 - tarih.getDayOfYear());
        }else {
            System.out.println(365 - tarih.getDayOfYear());
        }
        //2. yol
        System.out.println(tarih.lengthOfYear() - tarih.getDayOfYear()); //82

        System.out.println("STT : " + tarih.plusYears(3).plusMonths(5).plusDays(7));

        System.out.println(tarih.plusYears(2).plusMonths(2).plusDays(2).getDayOfMonth());

        System.out.println(tarih.plusYears(7).plusMonths(7).plusDays(7).getDayOfWeek()); //Monday

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen olusturmak istediginiz tarihin sırasiyla Gün bilgisini giriniz");
        int day= input.nextInt();
        System.out.println("Lütfen olusturmak istediginiz tarihin Ay bilgisini giriniz");
        int month= input.nextInt();
        System.out.println("Lütfen olusturmak istediginiz tarihin Yıl bilgisini giriniz");
        int year= input.nextInt();
        LocalDate yeniTarih= LocalDate.of(year,month,day);
        System.out.println(yeniTarih);
        if (tarih.isBefore(yeniTarih)){
            System.out.println(tarih);
        } else if (tarih.isAfter(yeniTarih)) {
            System.out.println(yeniTarih);
        }else {
            System.out.println("Bu iki tarih birbiri ile aynıdır!!!");
        }



    }
}







