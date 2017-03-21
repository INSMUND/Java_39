package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        //  System.out.println("Hello World!");
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 8);
        System.out.printf("Расстояние между двумя точками с координатами (" + p1.x + "," + p1.y + ") и (" + p2.x + "," + p2.y + ") =" + p1.distance(p2));

    }




}