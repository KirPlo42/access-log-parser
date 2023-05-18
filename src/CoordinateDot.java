
public class CoordinateDot {
    int x;
    int y;

    public CoordinateDot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("{%d; %d}", x, y);
    }
    
}
