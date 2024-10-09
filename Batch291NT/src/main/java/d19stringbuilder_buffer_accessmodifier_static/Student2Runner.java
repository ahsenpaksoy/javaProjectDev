package d19stringbuilder_buffer_accessmodifier_static;

public class Student2Runner {

    public static void main(String[] args) {

        System.out.println("Student2.stdName = " + Student2.stdName); //Student2.stdName = Ali Can
        // stdName static oldugu icin class ismiyle ulastik yani static class member'lara ulasmak icin sadece class ismi yeterlidir

        Student2 ali = new Student2();
        System.out.println("ali.age = " + ali.age); //ali.age = 18
        // age non static oldugu icin bir instance (object) olusturduk

        Student2.staticMethod(); //Ben static bir methodum
        ali.nonStaticMethod(); //Ben non-static bir methodum

    }
}