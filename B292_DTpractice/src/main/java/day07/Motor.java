package day07;

public interface Motor {
    //motorun gucunu getirir
    double getGuc();

    //motoru calıstırma
    void calistir();

    //moturu durduma
    void durdur();

    //motorun durumunu kontrol eder
    boolean durumKontrolu();

}