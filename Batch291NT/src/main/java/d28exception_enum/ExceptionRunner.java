package d28exception_enum;

public class ExceptionRunner {
    public static void main(String[] args) {

        studentGrade(-55);

    } //main disi

    public static void studentGrade(int not) {
        //System.out.println(not);
        if (not < 0 || not > 100) {
            try {
                throw new InvalidStudentGradeException("Ogrenci notu sifirdan kucuk veya yuzden buyuk girilemez");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();  // Hatanin ayrintilarini gosterir. Exception ın aynisini gosterir ama durdurmaz
            }
        } else {
            System.out.println(not);
        }

    }


}