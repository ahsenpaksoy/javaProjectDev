package day03;

public class C02_forloop {
    /*
         soru 1) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
           */
    public static void main(String[] args) {
        // Scanner input=new Scanner(System.in);
        // System.out.println("Lütfen carpim tablosunu olusturmak istediginiz tam sayiyi giriniz");
        // int sayi= input.nextInt();
        // for (int i = 1; i <=10 ; i++) {
        //     System.out.println(sayi+" * "+i+" = "+sayi*i);
        // }

        //Güncelleme lütfen 10x10lük bir carpim tablosunu olusturunuz
        for (int i = 1; i <=10 ; i++) {

            for (int j = 1; j <=10 ; j++) {
                System.out.print(i + " * " + j + " = " + i * j+"  ");
            }
            System.out.println("");
        }

             /*
             1*1=1
             ....


             2*1=2
              */

    }

}
