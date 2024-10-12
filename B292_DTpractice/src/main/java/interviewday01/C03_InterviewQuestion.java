package interviewday01;

public class C03_InterviewQuestion {

    public static void main(String[] args) {
         /*
        Find the Largest Number in Java Program
        Java'da en buyuk sayiyi bulan programi yazınız
        */
        int a=16;
        int b=19;
        int c=25;
        if (a>b&&a>c){
            System.out.println("En büyük sayi : "+a);
        } else if (b>a&&b>c) {
            System.out.println("En büyük sayi : "+b);
        }else if (c>a&&c>b){
            System.out.println("En büyük sayi : "+c);
        }else {
            System.out.println("Bu sayılardan aynı olanlar olabilir");
        }

    }
}


