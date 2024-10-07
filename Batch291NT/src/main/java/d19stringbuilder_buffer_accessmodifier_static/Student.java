package d19stringbuilder_buffer_accessmodifier_static;

public class Student {
     /* Access Modifier (Erişim Belirleyici)

       1)public
       2)protected
       3)default
       4)private

       public > protected > default > private

       public      ==> public olanlar her class’dan kullanilabilir
       protected   ==> protected olanlar baska package’lardan kullanilamaz,
                    ancak baska package’larda child classlar icinden kullanilabilir
       default     ==> default olanlar baska package’lardan kullanilamazlar. Ayni package daki class lar ulasabilir
       private     ==> private olanlar sadece olusturulduklari class icinden kullanilabilirler

       Soru: ”protected ile default" arasindaki farki söyleyiniz?
       Cevap: protected olanlar baska package’lardan kullanilamaz ancak baska package’larda
       child classlar icinden kullanilabilir. default olanlar baska package’lardan kullanilamazlar

       Dis class lar public veya default olabilir
    */

    public String stdName = "Ali Can";
    protected String address = "Istanbul";
    String email = "alican@gmail.com"; //Hicbir sey yazmazsak default olur. Baska package lardan ulasilamaz
    private String tcKimlik = "1234567891";







/*   @Override
    public String toString() {
        return "Student{" +
                "stdName='" + stdName + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                '}';
    }*/

}
