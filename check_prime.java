import java.util.*;

public class Prime {
    public static void main(String[] args){
        System.out.println("enter a number to check if it is prime");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;

        for(int i = 2 ; i<n ; i++){
            if(n%i == 0){
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println("it is a prime number");
        else
            System.out.println("not a prime number");
    }
}
