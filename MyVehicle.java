package Programs.java;

import java.util.Scanner;

public class MyVehicle {
    public static void main(String[] args){
        Vehicle V1;
        V1 = new TwoWheeler();
        V1.getData();
        V1.putData();
        V1 = new FourWheeler();
        V1.getData();
        V1.putData();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year of manufacture of my two wheeler :");
        int year3 = sc.nextInt();
        V1 = new MyTwoWheeler(year3);
    }
}
