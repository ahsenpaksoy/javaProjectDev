package Extra;

import java.util.Arrays;

public class Programiz {

     static int[] bolumKalan(int number, int bolen){
         int i=0;
         int  bolum=0;
        while(i<=number){
            i = i + bolen;
            if (i <= number) {
                bolum ++;
            }
            else break;
        }

        int kalan = number - (i - bolen );


         return new int[] {kalan, bolum};
    }

     static int[] swap(int a, int b){
         int temp = a;
         a = b;
         b = temp;

         return new int[] {a,b};
     }

     static boolean isOdd ( int number){
         if (number % 2 == 0) return false;
         else return true;
     }

     static boolean isVowel( String chin) {
         char[] vowels = {'A','E','I','O','U'};
         for(char ch:vowels){
            if(ch == chin.toUpperCase().charAt(0))
                return true;

         }
         return false;
     }

     static int greatestNumber (int [] numbers){
         int maxNumber = numbers[0];
         for ( int number: numbers){
             if(number>maxNumber){
                 maxNumber = number;
             }
         }
         return maxNumber;
     }

     static  double[] quadricRoot (int a, int b, int c){
         int delta = (b*b - 4 * a * c) / 2;
         if (delta<0) return new double[] {-1};
         if (delta==0) return new double[] {(-b+Math.sqrt(b*b-4*a*c))/2};
         return new double[] {(-b+Math.sqrt(b*b-4*a*c))/2, b+Math.sqrt(b*b-4*a*c)/2};

     }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(bolumKalan(22,3)));
        int [] swapped = swap (5,3);
        System.out.println("Swapping: a = 5, b = 3, After swapping : a="+swapped[0]+" and b=" + +swapped[1]);
        System.out.println(isOdd(22)?"Tek sayı":"Cıft sayı");
        System.out.println(isVowel("mete"));
        System.out.println(greatestNumber(new int[] {3,2,5,8,1,-66,123}));
        System.out.println(Arrays.toString(quadricRoot(2,8,5)));

    }
}
