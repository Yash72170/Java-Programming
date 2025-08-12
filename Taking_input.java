import java.util.Scanner;
public class Taking_input {
    public static void main(String[] args) 
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a int value: ");
    int a=sc.nextInt();
    System.out.println(a);
    System.out.println("Enter a float value: ");
    float b=sc.nextFloat();
    System.out.println(b);
    System.out.println("Enter a Double value: ");
    double c=sc.nextDouble();
    System.out.println(c);
    System.out.println("Enter a String value: ");
    String d=sc.next();
    System.out.println(d);
    System.out.println("Enter a character value: ");
    char e=sc.next().charAt(0);
    System.out.println(e);
    System.out.println("Enter a String value: ");
    String f=sc.nextLine();
    System.out.println(f);
    }
}
