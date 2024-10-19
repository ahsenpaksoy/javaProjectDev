package day06.inheritance02;

public class Araba {

    // Araba, Opel, Corsa adinda farkli class'lar olusturunuz.
    // Opel class'ı:Araba class'ina baglı olacak
    // Corsa class'a Opel class'ina baglı olacak
    // Araba class'ina genel bilgileri, variable ve method olarak yaziniz.
    // Opel class'ina gerekli bilgileri, variable ve method olarak yaziniz.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yaziniz.
    // Corsa class'indan obje olusturarak variablelara ve methodlara yazdiriniz.

    public String hareket="Arabalalar tekerlek ile haraket eder.";
    public String hiz="Arabalar motor gücüne göre hızlanır";
    public String yakit="Arabalar farklı türde yakit türüne sahip olabilirler";
    public String marka="Arabalar üretildikleri firmanin markasına sahiptir";

    public void motor( ){
        System.out.println("Arabalar farkli markalarda motorlara sahiptir");
    }
    public void yakitTuketimi(){
        System.out.println("Arabalar motor gücüne göre yakıt tüketir");
    }



}
