package Programs.java;
import java.lang.Math;
public class Segment extends Circle {
    double L;
    Segment(double L, double R){
        super();
        this.L=L;
        this.R=R;
    }
    void areaOfSegment(){
        double area;
        area=(R*R*((R-L)/R)-(R-L)*Math.pow((2*R*L-L*L),0.5));
        System.out.println("area of segment= "+area);
    }
}
