package day05;

public class C01_odev {
    public static void main(String[] args) {

        /*

         *******
         *
         *
         *******
         *
         *
         *******

         */

        int satir=7;

        for (int bulSatir = 1; bulSatir <=satir ; bulSatir++) {
            if (bulSatir==1 ||bulSatir==satir/2+1||bulSatir==satir){
                for (int i = 1; i <=satir ; i++) {
                    System.out.print("*");
                }
            }else {
                System.out.print("*");
            }
            System.out.println();

        }



    }
}













