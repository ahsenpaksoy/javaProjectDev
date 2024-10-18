package d23oop_collections;

public class AudiS5 implements Engine, AC, Brake {

    // Engine interface'inden override edilen methodlar
    @Override
    public void eco() {
        System.out.println("Audi S5 ekonomik motor kullanır");
    }

    @Override
    public void turbo() {
        System.out.println("Audi S5 turbo motor kullanır");
    }

    @Override
    public void gas() {
        System.out.println("Audi S5 benzinli motor kullanır");
    }

    // AC interface'inden override edilen methodlar
    @Override
    public void analog() {
        System.out.println("Audi S5 analog klima kullanır");
    }

    @Override
    public void dijital() {
        System.out.println("Audi S5 dijital klima kullanır");
    }

    // Brake interface'inden override edilen methodlar
    @Override
    public void abs() {
        System.out.println("Audi S5 ABS kullanır");
    }

    @Override
    public void esp() {
        System.out.println("Audi S5 ESP kullanır");

    }

    @Override
    public void run() {
        System.out.println("Audi S5 havayastigi kullanir");
    }
}