public class Line implements Measurable{
    CoordinateDot startDot;
    CoordinateDot endDot;

    private Line(CoordinateDot startDot, CoordinateDot endDot) {
        this.startDot = startDot;
        this.endDot = endDot;
    }

    static Line ofDots(CoordinateDot startDot, CoordinateDot endDot){
        return new Line(startDot, endDot);
    }

    static Line ofCoordinates(int x1, int y1, int x2, int y2){
        CoordinateDot startDot = new CoordinateDot(x1,y1);
        CoordinateDot endDot = new CoordinateDot(x2,y2);
        return new Line(startDot, endDot);
    }

    @Override
    public String toString() {
        return String.format("Line from %s to %s", startDot, endDot);
    }

    public double length(){
        return Math.sqrt(Math.pow((endDot.x - startDot.x), 2) + Math.pow((endDot.y-startDot.y), 2));
    }
}
