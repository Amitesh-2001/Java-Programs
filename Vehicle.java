package Programs.java;

public abstract class Vehicle {
    int year_of_manufacture;
    Vehicle(int year){
        System.out.println("year of manufacture : "+year);
    }

    public Vehicle() {

    }

    abstract void getData();
    abstract void putData();

}
