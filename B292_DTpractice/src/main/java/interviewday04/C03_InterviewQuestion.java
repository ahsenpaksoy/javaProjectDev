package interviewday04;

import java.util.Arrays;
import java.util.List;

public class C03_InterviewQuestion {
    public static void main(String[] args) {

        /*
        "Bir tamsayı listesini kullanarak aşağıdaki işlemleri gerçekleştiren bir Java metodu yazın:
        Negatif sayıları filtreleyin.
        Kalan pozitif sayıları iki katına çıkarın.
        Sonuçları küçükten büyüğe sıralayın ve bir liste olarak döndürün.
         */
        List<Integer> numbers = Arrays.asList(-5, 3, -2, 8, 0, 1, -1, 6);
        ikiKatınaCikar(numbers);
    }
    public static  void ikiKatınaCikar(List<Integer> numbers){
        List<Integer> newNumbers= numbers.stream().filter(t->t>0).map(t->t*2).sorted().toList();
        System.out.println("newNumbers = " + newNumbers);

    }
}