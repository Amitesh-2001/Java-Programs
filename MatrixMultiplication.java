package Programs.java;

import java.util.*;

class MyMatrix {
    int row , column;
    int[][] M;


    MyMatrix(int r , int c){
        row=r;
        column=c;
        M = new int[row][column];
    }




    void readMatrix(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of the  matrix");

        for(int i=0 ; i<row ; i++){
            for(int j = 0; j<column ; j++){
                M[i][j] = sc.nextInt();
            }
        }
    }

    void displayMatrix(){
        System.out.println("matrix:");
        for(int i=0 ; i<row ; i++){
            for(int j = 0; j<column ; j++){
                System.out.print(M[i][j]+" ");
            }
            System.out.println();
        }

    }

    void multiplyMatrix(MyMatrix P){

       MyMatrix D = new MyMatrix(this.row,P.column);
        if(this.column != P.row){
            System.out.println("matrix multiplication is not possible");
        }
        else{
            for(int i = 0 ; i< this.row ; i++){
                for(int j = 0 ; j<P.column ; j++ ){
                    for(int k = 0 ; k<this.column ; k++)
                        D.M[i][j] += this.M[i][k]*P.M[k][j];
                }
            }
        }
        D.displayMatrix();
    }
}
public class Matrix {

    public static void main(String[] args){
        System.out.println("enter the order of the 1st matrix");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("enter the order of the 2nd matrix");
        int p = sc.nextInt();
        int q = sc.nextInt();


        MyMatrix X = new MyMatrix(m,n);
        MyMatrix Y = new MyMatrix(p,q);

        X.readMatrix();
        Y.readMatrix();
        X.displayMatrix();
        Y.displayMatrix();
        X.multiplyMatrix(Y);

    }

}
