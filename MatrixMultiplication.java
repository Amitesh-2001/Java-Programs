import java.util.*;

 class Matrix {
	int i,m,n,p,q;
	int j,k;
	int[][] A = new int[20][20];
	int[][] B = new int[20][20];
	int[][] C = new int[20][20];

	void readMatrix(){
		System.out.println("enter the order of the 1st matrix");
		Scanner sc = new Scanner(System.in);
		 m = sc.nextInt();
		 n = sc.nextInt();
		System.out.println("enter the elements of the 1st matrix");
		for(i=0 ; i<m ; i++){
			for(j = 0; j<n ; j++){
				A[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("enter the order of the 2nd matrix");
		 p = sc.nextInt();
		 q = sc.nextInt();
		System.out.println("enter the elements of the 2nd matrix");
		for(i=0 ; i<p ; i++){
			for(j = 0; j<q ; j++){
				B[i][j] = sc.nextInt();
			}
		}
	}
	
	void displayMatrix(){
		System.out.println("matrix1:");
		for(i=0 ; i<m ; i++){
			for(j = 0; j<n ; j++){
				System.out.print(A[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("matrix2:");
		for(i=0 ; i<p ; i++){
			for(j = 0; j<q ; j++){
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrix3:");
		for(i=0 ; i<m ; i++){
			for(j = 0; j<q ; j++){
				System.out.print(C[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	void multiplyMatrix(){
		if(n!=p){
			System.out.println("matrix multiplication is not possible");
		}
		else{
			for(i = 0 ; i< m ; i++){
				for(j = 0 ; j<q ; j++ ){
					for(k = 0 ; k<n ; k++)
						C[i][j] += A[i][k]*B[k][j]; 
				}
			}
		}	
	}
}
public class MyMatrix {

	public static void main(String[] args){
		Matrix m = new Matrix();
		m.readMatrix();
		m.multiplyMatrix();
		m.displayMatrix();
	}

}
