package day06.staticblock;

public class Memur {
    public int id;
    public Memur(){
        id=sayac;
        sayac++;
    }
    private static int sayac;

    static {
        sayac=3568;
    }
}