package day09;

public class AgeException extends RuntimeException {
    //paramsiz cons.
    public AgeException(){
        super("Eğer bu değer çağrılıyorsa demek ki yaşınız tutmuyor demektir.");
        System.out.println("detay...");

    }
    public AgeException(String message){
        super(message);
    }

}


    /*

    public class YetersizUrun extends RuntimeException{
        public YetersizUrun(String message){
            super(message);
        }
    }

     */