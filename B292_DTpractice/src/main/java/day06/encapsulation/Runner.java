package day06.encapsulation;

public class Runner {
    public static void main(String[] args) {

        // Student std=new Student();
        // System.out.println(std.getIsim());//alican
        // std.setIsim("Veli Can");
        // System.out.println(std.getIsim());
        // Student std1=new Student();
        // System.out.println(std1.getIsim());//ali can


        //Mete, Han, 25 ozelliklerine sahip bir obje olusturunuz ve yazdiriniz
        //objenin yasinı 30 olarak guncelleyin
        //paranetresiz cons kullanarak 2. bir obje olusturun
        //Ayse, Yilmaz, 40 degerlerini atayin
        //yas'ı -5 olarek guncelleyin
        //yas negatif deger olamayacak sekilde set methodunu quncelleyin

        //ODEV
        //isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
        //getter metodunda gerekli düzeltmeyi yapınız.

        Student std=new Student("Mete","Han",  25);
        System.out.println(std);//to string olmazsa ref atar
        System.out.println(std.getIsim());
        System.out.println(std.getSoyIsim());
        System.out.println(std.getYas());
        std.setYas(30);
        System.out.println(std);

        Student std1=new Student();
        System.out.println(std1);//ne verir null
        std1.setIsim("Ayşe");
        std1.setSoyIsim("Yılmaz");
        std1.setYas(40);
        System.out.println(std1);//Öğrenci{isim='Ayşe', soyIsim='Yılmaz', yas=40}
        std1.setYas(-5);
        System.out.println(std1);








    }
}
