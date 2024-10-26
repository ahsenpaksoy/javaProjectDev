package Extra.companyOop;

public class OfficeAssistant extends Employee {

    private int officeResponsibility; //Office asistanin sorumlulugndaki office sayisi

    //Constructor

    public OfficeAssistant(String name, double salary, String position, int officeResponsibility) {
        super(name, salary, position);
        this.officeResponsibility = officeResponsibility;
    }

    @Override
    public void printDetails() {
        System.out.println("\nOffice Asistanin Bilgileri:");
        System.out.println("Tam Ismi: " + name);
        System.out.println("Maas: " + salary);
        System.out.println("Pozisyonu: " + position);
        System.out.println("Sorumlu oldugu Office sayisi: " + officeResponsibility);
    }
}
