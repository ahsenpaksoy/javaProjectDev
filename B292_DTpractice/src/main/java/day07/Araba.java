package day07;

public class Araba implements Fren,Motor,Sase{//obje


    @Override
    public boolean isAbs() {
        return true;
    }

    @Override
    public String getYagDurumu() {
        return "Motorun yağı Max. durumdadır";
    }

    @Override
    public void servoFrenUygula() {
        System.out.println("Araba normal frenden yaklaşık 5 kat daha iyi fren uyguluyor");
    }

    @Override
    public void motorFreniUygula() {
        System.out.println("Normal fren calışmadığı için motor freni uygulanmaktadır");
    }

    @Override
    public double getGuc() {
        return 2.0;
    }

    @Override
    public void calistir() {
        System.out.println("Motor Calışmaya başladı");
    }

    @Override
    public void durdur() {
        System.out.println("Motor Durdurulmuştur");
    }

    @Override
    public boolean durumKontrolu() {
        return true;
    }

    @Override
    public String getBoyaTuru() {
        return "Şase metalik gri boya ile kaplıdır";
    }

    @Override
    public String getKaportaTuru() {
        return "steysin";
    }

    @Override
    public boolean farCalisiyorMu() {
        return true;
    }

    @Override
    public boolean sunRoofVarMi() {
        return true;
    }

}