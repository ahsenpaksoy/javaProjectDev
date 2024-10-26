package Extra.companyOop;

public class Manager extends Employee {

    private int teamSize; //Yoneticinin ekipindeki kisi sayisi

    //Constructor

    public Manager(String name, double salary, String position, int teamSize) {
        super(name, salary, position);
        this.teamSize = teamSize;
    }

    //Yonetici bilgilerini yazdirma

    @Override
    public void printDetails() {
        System.out.println("\nYonetici Bilgileri:");
        System.out.println("Tam Ismi: " + name);
        System.out.println("Maas: " + salary);
        System.out.println("Pozisyon: " + position);
        System.out.println("Ekip buyuklugu: " + teamSize);
    }
}
