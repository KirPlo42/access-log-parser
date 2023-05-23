import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Fraction f1 = new Fraction(1,3);
        Fraction f2 = new Fraction(2,5);
        Fraction f3 = new Fraction(7,8);
        System.out.println(f1.sum(f2).sum(f3).minus(5));





        //Block for students
        Student vasia = Student.ofName("Vasia");
        System.out.println(vasia);
        vasia.setMark(5);
        vasia.setMark(9);
        vasia.setMark(2);
        System.out.println(vasia);


        List<Integer> marks = new ArrayList<>();
        marks.add(4);
        marks.add(5);
        Student petya = Student.ofNameAndMarks("Petya", marks);
        System.out.println(petya);
        petya.setMark(3);
        petya.setMark(1);
        System.out.println(petya);
        marks.add(1);
        System.out.println(petya);
        System.out.println(petya.getMarks());

    }


}
