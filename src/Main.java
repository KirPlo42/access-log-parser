public class Main {
    public static void main(String[] args) {

        CoordinateDot startLine1 = new CoordinateDot(1,3);
        CoordinateDot endLine1 = new CoordinateDot(5,8);
        CoordinateDot startLine2 = new CoordinateDot(10,11);
        CoordinateDot endLine2 = new CoordinateDot(15,19);

        Line line1 = Line.ofDots(startLine1, endLine1);
        Line line2 = Line.ofDots(startLine2, endLine2);
        Line line3 = Line.ofDots(endLine1, startLine2);

        //task 1
        System.out.printf("Line 1 - %s, Line 2 - %s, Line 3 - %s\n", line1, line2, line3);
        //task 2
        line3.startDot.x = 7;
        line3.endDot.y = 0;
        //task 3
        System.out.printf("After modify: Line 1 - %s, Line 2 - %s, Line 3 - %s\n", line1, line2, line3);
        //task 4
        System.out.println("Sum of lengths for the lines = " + (line1.length()+line2.length()+line3.length()));

        //line from coordinates
        Line line4 = Line.ofCoordinates(1,2,3,4);
        System.out.println(line4);
    }
}
