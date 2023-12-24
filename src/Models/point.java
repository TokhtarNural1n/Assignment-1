package Models;

public class point {
    private double x;
    private double y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceTo(point destination) {
        double dx = this.x - destination.x;
        double dy = this.y - destination.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
