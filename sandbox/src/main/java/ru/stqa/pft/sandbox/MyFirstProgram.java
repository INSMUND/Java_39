package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        //  System.out.println("Hello World!");
<<<<<<< HEAD:sandbox/src/main/java/ru/stqa/pft/sandbox/MyFirstProgram.java
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 8);
        System.out.printf("Расстояние между двумя точками с координатами (" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y + ") =" + p1.distance(p2));
=======
        Point p1 = new Point(5, 7);
        Point p2 = new Point(4, 8);
        System.out.printf("Расстояние между двумя точками с координатами (" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y + ") =" + distance(p1, p2));
>>>>>>> parent of 4ea7f90... Задание 2 пункт 4:sandbox/src/main/java/MyFirstProgram.java

    }

    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }


}