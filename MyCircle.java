package Programs.java;

import java.util.Scanner;

public class MyCircle {
    public static void main(String[] args){
        System.out.println("enter the radius of the circle ");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        Circle C1 = new Circle(r);
        C1.areaOfCircle();
        System.out.println("enter the angle of the sector ");
        double ang = sc.nextDouble();
        Sector S1 = new Sector(ang,r);
        S1.areaOfSector();
        System.out.println("enter the length of the segment ");
        double l = sc.nextDouble();
        Segment S2 = new Segment(l,r);
        S2.areaOfSegment();
    }
}
