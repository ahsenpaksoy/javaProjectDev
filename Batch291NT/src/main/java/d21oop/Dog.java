package d21oop;

public class Dog extends Mammal {

    //Herkes Cat class’ta feedWithMilk() methodunu override etsin?

    public void bark() {
        System.out.println("Dogs bark...");
    }

    @Override  //Anotation
    public void eat() {
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal craete(){  // child parent in data tipini kullanabiliyor
        return new Dog(); //upcasting - Java bunu otomatik yapar
        //Dog class tan bir object urettik.
        //Animal data tipiyle return ettim (disariya)
        //downcasting - Java otomatik yapmaz
    }

    @Override
    public int add(int a, int b){
        return a+b;
        //primitive data tipleri arasinda parent-child iliskisi yoktur
        //bunlar class degil
        //primitive lerde return type degistirilemez
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a*b;
    }
}






