package Programs.java;

import java.util.*;

import static java.lang.System.exit;

 class Account {
     float balance_amt;
     String name;
     int accno;
     int phone_no;

     void getInput() {
         System.out.println("enter the name");
         Scanner sc = new Scanner(System.in);
         name = sc.nextLine();
         System.out.println("enter the account number");
         accno = sc.nextInt();
         System.out.println("enter the phone no.");
         phone_no = sc.nextInt();
         System.out.println("enter the balance amount");
         balance_amt = sc.nextFloat();
     }

     void Deposit() {
         System.out.println("enter the amount to be deposited");
         Scanner sc = new Scanner(System.in);
         float deposit_amt = sc.nextFloat();
         balance_amt += deposit_amt;
         System.out.println("total balance = " + balance_amt);
     }

     void Withdraw() {
         System.out.println("enter the amount to be withdrawn");
         Scanner sc = new Scanner(System.in);
         float wihdraw_amt = sc.nextFloat();
         balance_amt -= wihdraw_amt;
         System.out.println("total balance = " + balance_amt);
     }

     void DisplayDetails() {
         System.out.println("name of the user : " + name);
         System.out.println("account number : " + accno);
         System.out.println("phone number : " + phone_no);
         System.out.println("total balance : " + balance_amt);
     }
 }
public class MyAccount{
    public static void main(String[] args){
        System.out.println("enter the user details");
        Account MyAccount = new Account();
        MyAccount.getInput();
        while(true) {
            System.out.println("1.deposit\n2.withdrawl\n3.display_user_details\n4.exit");
            System.out.println("enter the choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1 : MyAccount.Deposit();
                         break;
                case 2 : MyAccount.Withdraw();
                         break;
                case 3 : MyAccount.DisplayDetails();
                         break;
                case 4 : exit(0);
            }
        }
    }
}
