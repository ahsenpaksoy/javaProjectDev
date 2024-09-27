package day03;

public class C04_forloop {
    public static void main(String[] args) {

         /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
        *

// The main method must be in a class named "Main".
            class Main {
                public static void main(String[] args) {

            for (int j=1;j<=5 ;j++ ) {

                        for (int i=1;i<=5-j ;i++ ) {
                        System.out.print("* ");
                    }
                            for (int k=1;k<=j ;k++ ) {
                        System.out.print(". ");
                    }
                System.out.println("");

            }

                }
            }
                    */

        int satir=10;
        for (int bulunSatir = 1; bulunSatir <=satir ; bulunSatir++) {
            for (int yildizSayisi = satir-bulunSatir; yildizSayisi >0 ; yildizSayisi--) {
                System.out.print("* ");
            }
            for (int nokta = 1; nokta <=bulunSatir ; nokta++) {
                System.out.print(". ");
            }
            System.out.println();
        }

       // ODEV
        /*
                   *
                  * *
                 *****
                *     *
               *       *
         */



    }
}
