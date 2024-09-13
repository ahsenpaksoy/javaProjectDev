package day01_variables;

public class C01_variables {
    public static void main(String[] args) {
        /*
        Variable lar 2 tanedirler primitive ve non-primitive olmak üzere icerisinde küçük degerler saklanır
        pasif özelliklerdir
         */

        //iki sayinin toplamini yeni bir degere atayanizi ve yazdiriniz
        int a=76;
        double b=89.6;
        double toplam=a+b;
        System.out.println("toplam = " + toplam);

        //eger ondalıklı sayi ile işlem yapılıyorsa double dondurur
        //eger tam sayilarla işlem yapıyorsa int dondurur
        //byte x=5;
        //byte y=10;
        //byte sum=x+y;

        // System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        // System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);


        //ayni sayilari toplayip sadece tam kismini alin

        //1.yol
        //int toplam2 = a + (int)b ; // typecasting


        //2.yol :
        // int toplam2 = (int)(a + b) ;


        //3. yol
        //int toplam2=(int)toplam;

        double x=5.7;
        double y=6.8;


        double toplam3=x+y;
        System.out.println("toplam3 = " + toplam3);//12.5

        int toplam4=(int)x+(int)y;
        System.out.println("toplam4 = " + toplam4);//11

        int toplam5=(int)(x+y);
        System.out.println("toplam5 = " + toplam5);//12

        int toplam6=(int)toplam3;
        System.out.println("toplam6 = " + toplam6);//12

        /*
        Not 1 : primitive data type'larini java tarafında olusturulmustur, biz olusturamayiz
        Not 2 : primitive data type'larinin isimlerinin tüm harfleri kücük harften olusur
        Not 3 : primitive data type'lar her biri memory(Hafıza)'da farklı yer kaplar
        Not 4 : primitive data type'lar sadece icine atanan degeri korur başka bir iş yapmaz

        Tam Sayilar:
        byte
        short
        int
        long

        Ondalıklı Sayilar:
        double
        float

        Karakter icin:
        char

        Mantıksal operator:
        boolean



        */
    }
}
