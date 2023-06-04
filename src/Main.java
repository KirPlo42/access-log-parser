import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //TASK 2
        List<CoordinateDot> dots = Arrays.asList(new CoordinateDot(1,5), new CoordinateDot(2,8), new CoordinateDot(5,3), new CoordinateDot(8,9));
        PolyLine poly1 = PolyLine.ofDots(dots);
        BrokenLine brokenLine = BrokenLine.ofDots(dots);
        System.out.println(poly1.lengthByLines() + " poly");
        System.out.println(brokenLine.lengthByLines() + " broken");


        //TASK 3
        System.out.println(measure(poly1) + " poly");
        System.out.println(measure(brokenLine) + " broken");
    }

    static double measure(Measurable m){
       return m.length();
    }
}
