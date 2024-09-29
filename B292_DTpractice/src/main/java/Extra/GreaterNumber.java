package Extra;

public class GreaterNumber {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 9,11, 4};
        int temp = numbers[0];
                for (int number:numbers){
                    if (number > temp){
                        temp = number;
                        System.out.println("Current Maximum number is:"+ temp);
                    }
                }
        System.out.println("Maximum number is:"+temp);
    }
}
