package Extra;

public class Mean {

    public static void main(String[] args) {
        int[] numbers = {5,5,5,5,4};
        int sum =0;
        double res = 0.0;
        for(int w:numbers){
            sum = sum + w;
        }

        res = (double) sum/numbers.length;
        System.out.println("Mean:"+res);

        System.out.println((double)5/3);


    }

}
