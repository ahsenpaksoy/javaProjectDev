package day03;

public class C04_forloop {
    public static void main(String[] args) {

         /*
        * * * * .
        * * * . .
        * * . . .
        * . . . .
        . . . . .
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
