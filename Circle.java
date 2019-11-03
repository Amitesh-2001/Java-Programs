package Programs.java;

public class Circle {
    double R;
    Circle(double R){
        this.R=R;
    }

    public Circle() {

    }


    void areaOfCircle(){
        double area;
        area=3.14*R*R;
        System.out.println("area of circle= "+area);
    }
}
