package Models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/tokhtar/IdeaProjects/Assignment1/src/Models/source.txt");

        Scanner sc = new Scanner(file);
        List<point> points = new ArrayList<>();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            point point = new point(x, y);
            points.add(point);
        }

        Shape shape = new Shape(points);

        System.out.println("Perimeter: " + shape.Perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }
}
