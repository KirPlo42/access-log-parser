import java.util.ArrayList;
import java.util.List;

public class PolyLine extends BrokenLine{
    private PolyLine(List<CoordinateDot> dots) {
        super(dots);
    }

    static PolyLine ofEmpty() {
        List<CoordinateDot> dots = new ArrayList<>();
        return new PolyLine(dots);
    }

    static PolyLine ofDots(List<CoordinateDot> dotsList) {
        return new PolyLine(dotsList);
    }

    @Override
    public List<Line> whatLinesDoWeHaveList() {
        List<Line> copy = super.whatLinesDoWeHaveList();
        Line line = Line.ofDots(dots.get(dots.size() - 1), dots.get(0));
        copy.add(line);
        return copy;
    }

    @Override
    public double lengthByFormula() {
        double temp = super.lengthByFormula();
        temp += Math.sqrt(Math.pow((dots.get(0).x - dots.get(dots.size()-1).x), 2) + Math.pow((dots.get(0).y - dots.get(dots.size()-1).y), 2));
        return temp;
    }
}
