import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Fraction f1 = new Fraction(3,5);

        List<Double> list1 = new ArrayList<>();
        list1.add(2.0);
        list1.add(f1.doubleValue());
        list1.add(2.3);
        System.out.println(sumOfArray(list1));

        List<Double> list2 = Arrays.asList(3.6, new Fraction(49, 12).doubleValue(), 3.0, new Fraction(3,2).doubleValue());
        System.out.println(sumOfArray(list2));

        List<Double> list3 = Arrays.asList(new Fraction(1,3).doubleValue(), 1.0);
        System.out.println(sumOfArray(list3));
    }

    public static double sumOfArray(List<Double> list){
        double result = 0;
        for (Double el: list){
            result += el;
        }
        return result;
    }


}
