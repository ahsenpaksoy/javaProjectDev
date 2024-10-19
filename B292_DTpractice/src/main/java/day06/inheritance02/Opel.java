package day06.inheritance02;

public class Opel extends Araba{

    //haraket ,hız,yakıt,marka ve motor,yakittüketimi
    public String marka="Opel";
    public String yakit="Opel arabalarda dizel yakıt türü kullanılır";
    public String sirketMerkezi="Almanya";

    public void motor(){//override
        System.out.println("Opel arabalari opel marka motor kullanmaktadir");
    }
    public void yakitTuketimi(){//override
        System.out.println("Opel arabalari cok az yakıt tüketir");
    }
    public void fren(){
        System.out.println("Opel arabalar abs özelligine sahip fren sistemi kullanırlar");
    }


}
