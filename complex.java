package Programs.java;

import java.util.Scanner;

import static java.lang.System.exit;

 class MyComplex {
     int real;
     int imaginary;

     MyComplex(int real, int imaginary) {
         this.real = real;
         this.imaginary = imaginary;
     }

     MyComplex() {

     }

     void sum(MyComplex C1, MyComplex C2) {
         MyComplex C4 = new MyComplex();
         C4.real = C1.real + C2.real;
         C4.imaginary = C1.imaginary + C2.imaginary;
         if (C4.imaginary < 0)
             System.out.println("sum of two complex number is: " + C4.real + " " + C4.imaginary + "i");
         else
             System.out.println("sum of two complex number is: " + C4.real + "+" + C4.imaginary + "i");
     }

     void difference(MyComplex C1, MyComplex C2) {
         MyComplex C5 = new MyComplex();
         C5.real = C1.real - C2.real;
         C5.imaginary = C1.imaginary - C2.imaginary;
         if (C5.imaginary < 0)
             System.out.println("difference of two complex number is: " + C5.real + " " + C5.imaginary + "i");
         else
             System.out.println("difference of two complex number is: " + C5.real + "+" + C5.imaginary + "i");
     }

     void multiply(MyComplex C1, MyComplex C2) {
         MyComplex C6 = new MyComplex();
         C6.real = (C1.real * C2.real) - (C1.imaginary * C2.imaginary);
         C6.imaginary = (C1.real * C2.imaginary) + (C2.real * C1.imaginary);
         if (C6.imaginary < 0)
             System.out.println("product of two complex number is: " + C6.real + " " + C6.imaginary + "i");
         else
             System.out.println("product of two complex number is: " + C6.real + "+" + C6.imaginary + "i");
     }
 }
     public class Complex {
        public static void main(String[] args) {
            System.out.println("enter the real and imaginary part of complex 1: ");
            Scanner sc = new Scanner(System.in);
            int a1 = sc.nextInt();
            int b1 = sc.nextInt();
            System.out.println("enter the real and imaginary part of complex 2: ");
            int a2 = sc.nextInt();
            int b2 = sc.nextInt();
            MyComplex C1 = new MyComplex(a1, b1);
            MyComplex C2 = new MyComplex(a2, b2);

            MyComplex C3 = new MyComplex();
            while (true) {
                System.out.println("1.sum\n2.difference\n3.product\n4.exit");
                System.out.println("enter the choice");
                int ch = sc.nextInt();

                switch (ch) {
                    case 1:
                        C3.sum(C1, C2);
                        break;
                    case 2:
                        C3.difference(C1, C2);
                        break;
                    case 3:
                        C3.multiply(C1, C2);
                        break;
                    case 4:
                        exit(0);
                }
            }
        }
    }


