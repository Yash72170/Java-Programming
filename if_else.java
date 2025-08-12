import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("Adult");
        }
        else if(age>=12 && age<18)
        {
            System.out.println("Teenager");
        }
        else
        {
            System.out.println("Child");
        }
    }
}
