package ISE;

import Programs.java.*;

import java.util.*;


public class IseDepartment implements Department {
    Scanner sc = new Scanner(System.in);
    Faculty f= new Faculty();
    @Override
    public void readdata(int n) {
        for (int i =0; i<n; i++) {

            System.out.println("enter the faculty name");
            f.members_name[i] = sc.nextLine();
            System.out.println("enter the age");
            f.age[i] = sc.nextInt();
            try{
                if(f.age[i]<1 || f.age[i]>58)
                    throw new Exception("invalid age.should be betwee 0 to 59");
            } catch (Exception e) {
                System.out.println("exception occured "+e);
                System.exit(0);
            }

            sc.nextLine();
            System.out.println("enter the designation (format : abc or abc,xyz,etc)");
            f.designation[i] = sc.nextLine();
            System.out.println("enter the year of experience");
            f.years_of_experience[i] = sc.nextInt();

            System.out.println("enter the no. of subjects handled");
            f.subjects_handled[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    @Override
    public void printdata(int n) {
        for (int i=0; i<n; i++){
            if(f.years_of_experience[i]>=20){
                System.out.println("faculty name : "+f.members_name[i]);
                System.out.println("age : "+f.age[i]);
                System.out.println("designation : "+f.designation[i]);
                System.out.println("year of experience : "+f.years_of_experience[i]);
                System.out.println("no. of subjects handled : "+f.subjects_handled[i]);
                print_number_designation(i);
                System.out.println("no. of consultancy projects : " + number_research_consultancy_projs(i));
            }
        }
    }

    @Override
    public void print_number_designation(int n) {
        int count = f.designation[n].length() - f.designation[n].replace(",","").length();
        System.out.println("no. of designation : "+(count+1));
    }

    @Override
    public double number_research_consultancy_projs(int n) {
        return ((f.years_of_experience[n]*f.subjects_handled[n])/4);
    }
}
