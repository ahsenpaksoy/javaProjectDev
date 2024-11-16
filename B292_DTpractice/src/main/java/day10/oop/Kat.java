package day10.oop;


import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Kat extends Apartman{//soyut class --ara class
    public String yanginTupu="Her katta yangın tüpü bulunmaktadır.";
    public String asansor="Asansor her kata erişim sağlamaktadır.";
    public String yanginAlarmi="Her katta yangın için sensor ve dügme bulunmaktadir.";
    public boolean lambaYaniyorMu;
    public abstract void kacinciKat();//method ne yapıcagımız soyler ama iş yapmaz

    public void pano(){
        System.out.println("20.11.2024 Tarihinde apartman toplantısı yapılıcaktir.");
        System.out.println("Acil durum numaraları.............");
        System.out.println("Panonun üzerinde faturalar bulunmaktadır.");
        System.out.println("Aidat ödeme ibani bulunmaktadir ........");
        System.out.println("Apartman icerisinde cüzdan bulunmustur lütfen kaybeden kapıcıya ulaşsın.");
    }
    private static LocalTime time= LocalTime.now();
    public void lambaYak(){
        if (time.getHour()>19||time.getHour()<6) {//19.00-06.00 arasında yanıcak
            System.out.println("Lamba yanıyor....");
            System.out.println("Lamba yandı....");
            this.lambaYaniyorMu=true;
        }
    }
    public void lambaKapat(){
        if (time.getHour()<19&&time.getHour()>6){//19.00-06.00 dışında ise 06.00-19.00 ise
            System.out.println("Lamba kapanıyor...");
            System.out.println("Lamba kapandı.");
            this.lambaYaniyorMu=false;
        }

    }

}