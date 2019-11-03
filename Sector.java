package Programs.java;

public class Sector extends Circle{
    double angle;
    Sector(double angle, double R){
        super();

        this.angle=angle;
        this.R=R;
    }
    void areaOfSector(){
        double area;
        area= 0.5 *R*R*angle;
        System.out.println("area of sector= "+area);
    }
}
