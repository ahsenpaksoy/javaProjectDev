package Extra;

public class LetterA {

    public static void main(String[] args) {


        System.out.println("        *");
        for (int i = 0; i < 6 ; i++) {
            for (int m = 2*i; m <= 12; m+=2) {
                System.out.print(" ");
            }
            if (i==2){
                for (int g = 0; g < 7; g++) {
                    System.out.print("*");


                }
                System.out.println();
                continue;

            }
            System.out.print("*");
            for (int j = 0; j < i*2+1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
    }
}
