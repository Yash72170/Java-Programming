import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int l1=A.length();
        int l2=B.length();
        int l3=l1+l2;
        System.out.println(l3);
        String l[] = A.split("");
        String b[] = B.split("");
        System.out.println(l[0] + " " + b[0]);
        // if(char(l[0]) > char(b[0]))
        // {
            
        // }
    }
}



