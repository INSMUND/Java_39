/**
 * Created by Pavel1 on 3/14/2017.
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

    public static double distance(Point p1,Point p2){
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }
}
