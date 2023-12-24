package Models;

import java.util.List;

public class Shape {
    private List<point> points;

    public Shape(List<point> points) {
        this.points = points;
    }

    public double calculatePerimeter() {
        double perimeter = 0.0;
        int size = points.size();
        for (int i = 0; i < size; i++) {
            point currentPoint = points.get(i);
            point nextPoint = points.get((i + 1) % size);
            perimeter += currentPoint.distanceTo(nextPoint);
        }
        return perimeter;
    }

    public double findLongestSide() {
        double longestSide = 0.0;
        int size = points.size();
        for (int i = 0; i < size; i++) {
            point currentPoint = points.get(i);
            point nextPoint = points.get((i + 1) % size);
            double distance = currentPoint.distanceTo(nextPoint);
            if (distance > longestSide) {
                longestSide = distance;
            }
        }
        return longestSide;
    }

    public double findAverageSide() {
        double totalLength = calculatePerimeter();
        int sides = points.size();
        return totalLength / sides;
    }
}
