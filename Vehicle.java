package student;

public abstract class Vehicle {
	int year_of_manufacture;
	Vehicle(){
		
	}
	abstract void getData();
	abstract void putData();

}
import java.util.Scanner;

public class TwoWheeler extends Vehicle{

	int year;
	void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year of manufacture of two wheeler");
		 year = sc.nextInt();
	}
	void putData(){
		System.out.println("two wheeler yom: "+year);
	}
		
}
public final class FourWheeler extends Vehicle {
	int year;
	@Override
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the year of manufacture of four wheeler");
		 year = sc.nextInt();
		
	}

	@Override
	void putData() {
		System.out.println("four wheeler yom: "+year);
		
	}

}
public class MyTwoWheeler extends TwoWheeler {
	
		
		void initialize(){
			super.getData();
			super.putData();
		}
	
}
public class MyVehicle {

	public static void main(String[] args) {
		Vehicle obj;
		obj = new TwoWheeler();
		obj.getData();
		obj.putData();
		obj = new FourWheeler();
		obj.getData();
		obj.putData();
		obj = new MyTwoWheeler();
		obj.
	}

}
