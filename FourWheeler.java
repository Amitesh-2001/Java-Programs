package Programs.java;

import java.util.Scanner;

public final class FourWheeler extends Vehicle {
    int year2;
    FourWheeler(int year) {
        super(year);
    }

    public FourWheeler() {

    }

    @Override
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year of manufacture of four wheeler :");
        year2 = sc.nextInt();
    }

    @Override
    void putData() {
        System.out.println("year of manufacture: "+year2);
    }
}
