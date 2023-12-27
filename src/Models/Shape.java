package Models;

import java.util.List;

public class Shape {
    private List<point> points;

    public Shape(List<point> points) {
        this.points = points;
    }

    public double Perimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < points.size(); i++) {
            point curPoint = points.get(i);
            point nextPoint = points.get((i + 1) % points.size());
            perimeter += curPoint.distanceT(nextPoint);
        }
        return perimeter;
    }

    public double longestSide() {
        double longestSide = 0.0;
        for (point point : points) {
            for (point otherPoint : points) {
                double distance = point.distanceT(otherPoint);
                longestSide = Math.max(longestSide, distance);
            }
        }
        return longestSide;
    }

    public double averageSide() {
        return Perimeter() / points.size();
    }
}
