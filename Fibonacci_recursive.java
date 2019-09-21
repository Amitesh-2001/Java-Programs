import java.util.Scanner;

public class Fibrec {
   public static int Fibonacci(int first, int second, int n){
        int next;
        if(n>2) {
             next = first + second;
             System.out.println(next);
             n--;
            return Fibonacci(second,  next, n);
        }
        else
            return 999999;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);
        Fibonacci(first,  second, n);
    }
}
