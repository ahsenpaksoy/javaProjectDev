package day06.inheritance;

public class Child extends Parent{
    public int yas=5;
    public static String isim="Veli";

    public void method4(){
        System.out.println("Child method4 yas : "+this.yas);
    }

    public static void main(String[] args) {
        System.out.println(isim);//Veli
        System.out.println(Parent.isim);//Ali
        Parent.method1();//Parent classdaki static method1
        method1();

        Parent p=new Parent();
        System.out.println(p.yas);//22
        Child c=new Child();
        System.out.println(c.yas);//5

        Parent parent=new Child();
        System.out.println(parent.yas);//22

        parent.method4();//child method4 yas : 5
        p.method4();//parenttaki instance method4
    }
}














