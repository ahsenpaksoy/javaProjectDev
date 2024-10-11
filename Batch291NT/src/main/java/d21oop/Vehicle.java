package d21oop;

public class Vehicle {

    /*Constructor Hiyerarsisi- Child class’tan bir object olusturdugunuzda constructor’lar
    en ustteki parent class’tan baslatilarak alta doğru calistirilir*/

    //Constructor olusturalim

    public Vehicle(){
        this("Honda", 2024, "Elektrikli");
        System.out.println("Honda, 2023, Benzin");
    }
    public Vehicle(String marka, int yil, String motor){
        super();
        System.out.println("Honda, 2024, Elektrikli");
    }

}

// Butun cagrilar tamamlandiktan sonra en ustteki paren tan geriye dogru constructor larin sout u yazmaya baslar.
// Sirada hangisi varsa super veya this yazdırarak gider