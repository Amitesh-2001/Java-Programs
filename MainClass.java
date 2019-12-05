package Programs.java;

import ISE.*;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        System.out.println("enter the no. of faculty");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        IseDepartment obj = new IseDepartment();
        obj.readdata(n);
        obj.printdata(n);
    }
}
