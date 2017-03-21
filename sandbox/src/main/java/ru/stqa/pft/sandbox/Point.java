package ru.stqa.pft.sandbox;

/**
 * Created by Pavel1 on 3/17/2017.
 */
public class Point {
    double x;
    double y;
    //  double x2;
    //  double y2;


    public Point(double x, double y ) {
        this.x = x;
        this.y = y;

    }

    public  double distance(Point p2){
        return Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
    }
}
