import java.util.Scanner;
public class ternary_operator {
    public static void main(String[] args) {
        String result;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int num = sc.nextInt();
        
        // result=(num%2==0)?"Even":"Odd";
        result = (num>=18)? "Eligible for Vote":"Not eligible for Vote";
        System.out.println(result);
    }
}
