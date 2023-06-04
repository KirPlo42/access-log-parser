import java.util.ArrayList;
import java.util.List;

public class BrokenLine implements Measurable{
    List<CoordinateDot> dots;

    BrokenLine(List<CoordinateDot> dots) {
        this.dots = dots;
    }

    static BrokenLine ofEmpty() {
        List<CoordinateDot> dots = new ArrayList<>();
        return new BrokenLine(dots);
    }

    static BrokenLine ofDots(List<CoordinateDot> dotsList) {
        return new BrokenLine(dotsList);
    }

    @Override
    public String toString() {
        if (dots.size() == 0) {
            return "We have empty broken line";
        }
        String result = "";
        for (CoordinateDot dot : dots) {
            result += dot.toString() + ",";
        }
        return "Line:" + result.substring(0, result.length() - 1);
    }

    public List<Line> whatLinesDoWeHaveList() {
        List<Line> result = new ArrayList<>();
        for (int i = 1; i < dots.size(); i++) {
            Line line = Line.ofDots(dots.get(i - 1), dots.get(i));
            result.add(line);
        }
        return result;
    }

    public double lengthByLines(){
        double result = 0;
        for (Line line: whatLinesDoWeHaveList()) {
             result += line.length();
        }
        return result;
    }

    public double lengthByFormula(){
        double result = 0;
        for (int i = 1; i < dots.size(); i++) {
            result += Math.sqrt(Math.pow((dots.get(i).x - dots.get(i-1).x), 2) + Math.pow((dots.get(i).y - dots.get(i-1).y), 2));
        }
        return result;
    }

    public double length(){
        return lengthByFormula();
    }
}
