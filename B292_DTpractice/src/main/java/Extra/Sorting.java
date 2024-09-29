package Extra;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public static int maxNumbers(ArrayList<Integer> numbers) {
        if (numbers == null || numbers.size() == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int temp = numbers.get(0);
        for (int number : numbers) {
            if (number > temp) {
                temp = number;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(List.of(3,5,6,1,2));
        ArrayList<Integer> newNumbers = new ArrayList<>();

        while (true){
            int temp = maxNumbers(numbers);
            numbers.remove(numbers.indexOf(temp));
            newNumbers.add(temp);
            if(numbers.size()==0){
                System.out.println(newNumbers.stream().toList());
                break;
            }

        }





    }
}
