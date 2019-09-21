import java.util.Scanner;

public class Fibdirect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        while(n>2){
            int next = first + second;
            System.out.println(next);
            n--;
            first = second;
            second = next;
        }
    }
}
