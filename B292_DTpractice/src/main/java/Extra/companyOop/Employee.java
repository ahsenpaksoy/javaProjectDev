package Extra.companyOop;

import java.util.Scanner;

public abstract class Employee implements TaskHandler {
    protected String name;
    protected double salary;
    protected String position;
    protected String assignedTask;

    // Constructor
    public Employee(String name, double salary, String position) {
        this.name = name;
        this.salary = salary;
        this.position = position;
    }


    // Görev atama metodu
    @Override
    public void assignTask(String task) {
        this.assignedTask = task;
        System.out.println(name + " adlı çalışana görev atandı: " + task);
    }

    // Görev tamamlama metodu
    @Override
    public void completeTask() {
        if (this.assignedTask != null) {
            System.out.println(name + " adlı çalışan görevi tamamladı: " + assignedTask);
            assignedTask = null;  // Görev tamamlandıktan sonra sıfırla
        } else {
            System.out.println(name + " adlı çalışanın atanan bir görevi yok.");
        }
    }

    // Her çalışan bilgilerini yazdırmak zorunda, bu yüzden abstract metod
    public abstract void printDetails();

    // Çalışan bilgilerini kullanıcıdan alma - static yapıyoruz.
    public static Employee createEmployee(Scanner scanner) {
        System.out.println("Çalışan Tipi Seçin: \n1- Manager \n2- Developer \n3- Office Assistant");
        int type = scanner.nextInt();
        scanner.nextLine();  // Boşluk temizliği

        System.out.print("Tam Ismi: ");
        String name = scanner.nextLine();
        System.out.print("Maaş: ");
        double salary = scanner.nextDouble();
        scanner.nextLine();  // Boşluk temizliği
        System.out.print("Pozisyon: ");
        String position = scanner.nextLine();

        if (type == 1) {
            System.out.print("Ekip büyüklüğü: ");
            int teamSize = scanner.nextInt();
            return new Manager(name, salary, position, teamSize);

        } else if (type == 2) {
            System.out.print("Uzmanlık alanı: ");
            String expertise = scanner.nextLine();
            return new Developer(name, salary, position, expertise);

        } else if (type == 3) {
            System.out.println("Kac tane officeten sorumlu: ");
            int officeResponsibility = scanner.nextInt();
            return new OfficeAssistant(name, salary, position, officeResponsibility);

        } else {
            System.out.println("Geçersiz seçim!");
            return null;
        }
    }


}


