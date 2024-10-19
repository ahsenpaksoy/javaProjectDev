package day06.inheritance02;

public class Corsa extends Opel{
    //hareket,hız,yakıt,marka,sirketmerkezi ve fren, yakıtTuketimi,motor

    public String hiz="Corsa arabalar max. hız 200 km";
    public String yakit="Corsa arabalar LPG'lidir";
    public String model="Corsa";

    public void motor(){
        System.out.println("Corsa arabalar cevreci motor kullanmaktadir");
    }
    public void vitesSayisi(){
        System.out.println("Corsa arabalar 5 vitese sahiptir.");
    }

}