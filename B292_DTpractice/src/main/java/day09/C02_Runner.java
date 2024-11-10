package day09;

import java.util.Scanner;

public class C02_Runner {
    public static void main(String[] args) {

        //task : Bir kullanıcının kan verebilmesi icin yaşı tutuyor mu
        //ona bakalım eger tutmuyorsa exception fırlatalım(AgeException)

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int age=input.nextInt();
        if (age>=18){
            System.out.println("Kan vermek icin formu doldurunuz");
            System.out.println(".....");
        }else {
            //System.out.println("Eğer bu değer çağrılıyorsa demek ki yaşınız tutmuyor demektir.");
            try {
                throw new AgeException("Yaşınız 18'den kucuk oldugu icin kan veremezsiniz");
            }catch (AgeException e){
                e.printStackTrace();
            }

        }
        System.out.println("else kısmı calıstıgında kodumuz calismaya devam ediyor mu?");


    }
}
