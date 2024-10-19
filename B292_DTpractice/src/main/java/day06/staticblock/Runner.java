package day06.staticblock;

public class Runner {
    public static void main(String[] args) {
        Memur memur1=new Memur();
        System.out.println("memur1.id = " + memur1.id);//3568

        Memur memur2=new Memur();
        System.out.println("memur2 = " + memur2.id);//3569

        Memur memur3=new Memur();
        System.out.println("memur3.id = " + memur3.id);
    }
}
