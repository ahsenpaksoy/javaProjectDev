package Extra.companyOop;

public class Developer extends Employee {
    private String expertise;  // Geliştiricinin uzmanlık alanı

    //Constructor

    public Developer(String name, double salary, String position, String expertise) {
        super(name, salary, position);
        this.expertise = expertise;
    }

    // Geliştiricinin bilgilerini yazdırma

    @Override
    public void printDetails() {
        System.out.println("\nGeliştirici Bilgileri:");
        System.out.println("Tam Ismi: " + name);
        System.out.println("Maaş: " + salary);
        System.out.println("Pozisyon: " + position);
        System.out.println("Uzmanlık Alanı: " + expertise);
    }
}