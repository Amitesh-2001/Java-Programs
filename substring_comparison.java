import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest = largest = s.substring(0,k);

        for( int i=1 ; i<=s.length()-k ; i++){
            String string1 = s.substring(i,i+k);
            if(string1.compareTo(smallest)<0)
                smallest = string1;
            if(string1.compareTo(largest)>0)
                largest = string1;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
