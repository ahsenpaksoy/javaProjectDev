package day10.oop;

public class ApartmanRunner {
    public static void main(String[] args) {
        Daire1 daire1=new Daire1("Yuşa","Siyah",5,"Normal Mutfak","Giriş",2,3,0);
        Daire1 daire2=new Daire1("Sinan","Yıldız",3,"Normal Mutfak","2",2,3,5);
        Daire2 daire3=new Daire2("Ali","Can","1",2);
        Daire2 daire4=new Daire2("Ömer","Faruk","1",3);
        //  System.out.println(daire1);
        //  System.out.println("-----------------------------");
        //  System.out.println(daire2);
        //  System.out.println("-----------------------------");
        //  System.out.println(daire3);
        //  System.out.println("-----------------------------");
        //  System.out.println(daire4);
        //  System.out.println("-----------------------------");
        //daire1.kacinciKat();//Daire Giriş. katta bulunmaktadir;
        daire1.aidatBilgisi();//Aidati ödenmemiş daire
        System.out.println(daire1.aidatOdendiMi);//false
        daire1.aidatOde();//Aidati şimdi ödediğiniz için teşekkürler bir sonraki ay görüşmek üzere....
        //2024-11-16
        System.out.println(daire1.aidatOdendiMi);//true
        daire1.aidatBilgisi();//Aidati ödenmiş daire

    }
}
