package StudentPackage;
import Programs.java.*;
import java.util.*;

public class RegisterStudent {
    class CreditLimit extends Exception
    {
        CreditLimit(int i)
        {
            System.out.println("The Total credit is:"+i);
        }
    }

    public RegisterStudent() {
        Student ob = new Students();
        ob.getName();
        ob.getBranch();
        System.out.println("Enter the total numbers of credits registered");
        Scanner sc = new Scanner(System.in);
        int tot_cr = sc.nextInt();
        try {
            if (tot_cr > 30)
                throw new CreditLimit(tot_cr);
            else
                System.out.println("The Total credit is:" + tot_cr);
        } catch (Exception e) {
            System.out.println(e + "\nException : Total Credits is more than 30");
            System.exit(0);
        }
        ((Students) ob).collectMarks();
    }
}
