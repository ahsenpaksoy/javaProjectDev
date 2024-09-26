package day03;

public class C01_StringManipulation {
    public static void main(String[] args) {

        //Bir String' de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız
        String str="Java her zaman guzeldir";
        String bosStr="";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))||str.charAt(i)==' '){
                bosStr+=str.charAt(i);//bosStr=bosStr+j;
            }
        }
        System.out.println("sonuc = " + bosStr);


    }
}
