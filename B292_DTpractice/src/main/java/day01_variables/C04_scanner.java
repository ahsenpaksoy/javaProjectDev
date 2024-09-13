package day01_variables;

import java.util.Scanner;

public class C04_scanner {

    public static void main(String[] args) {

        //Kullanicidan yaricap isteyip cemberin cevresini ve
        //dairenin alanini hesaplayip yazdirin cevre formulu 2πrdir
        //(pi sayisini 3 alabilirsiniz)dairenin alani ise π r²dir(pi sayisini 3 alabilirsiniz)

        //ilk adım önce scanner objesi olustur.
        Scanner input=new Scanner(System.in);

        //kullaniciya bilgi vermek
        System.out.println("Lütfen hesaplamak istediğiniz Dairenin yarı çapını giriniz ☻");

        //kavonaza koyma(variable)
        double r=input.nextDouble();

        System.out.println("Çevre = " + String.format("%.2f",2*Math.PI*r));  // 2f noktadan sonra iki birim almayi saglar.
        System.out.println("Alan = "+String.format("%.2f",Math.PI*(Math.pow(r,2))));
        //Math classı java icerisindeki matematik ile ilgili işlemlerin yetersiz oldugu durumlarda kullanılan matematik classıdır!!!
        //Math.pow(r,2);//r²
        //System.out.println("Math.PI = " + Math.PI);

    }


}
