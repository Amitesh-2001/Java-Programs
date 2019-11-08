package Programs.java;

import java.util.Scanner;

public class TwoWheeler extends Vehicle {
    int year1;
    TwoWheeler(int year) {
        super(year);
    }

    public TwoWheeler() {
        super();
    }

    @Override
    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year of manufacture of two wheeler :");
        year1 = sc.nextInt();
    }

    @Override
    void putData() {
        System.out.println("year of manufacture: "+year1);
    }
}
