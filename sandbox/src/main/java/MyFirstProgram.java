public class MyFirstProgram {

    public static void main(String[] args) {

        //  System.out.println("Hello World!");
        Point p1 = new Point(5, 7);
        Point p2 = new Point(4, 8);
        System.out.printf("Расстояние между двумя точками с координатами (" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y + ") =" + Point.distance(p1, p2));

    }




}
