import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        System.out.println("enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[30];
        int temp;

        System.out.println("enter the elements:");
        for (int i = 0 ; i < n ; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(A[j] > A[j+1]){
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
        System.out.println("sorted array is:");
        for(int i = 0 ; i < n ; i++){
            System.out.println(A[i]);
        }
    }
}
