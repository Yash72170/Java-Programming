import java.util.Scanner;

class Farmer
{
    int pa;
    float td;
    float ri;
    float si;

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please mention the amount required : ");
        pa=sc.nextInt();
        System.out.println("Please mention the time duration : ");
        td=sc.nextFloat();
        System.out.println("Please mention the rate of Interest : ");
        ri=sc.nextFloat();
    }
    void compute()
    {
        si=(pa*ri*td)/100;
    }

    void display()
    {
        System.out.println("The Simple Interest is : "+si);
    }
}
public class static_keyword5 {
    public static void main(String[] args) {
        Farmer f1 = new Farmer();
        f1.input();
        f1.compute();
        f1.display();
        Farmer f2 = new Farmer();
        f2.input();
        f2.compute();
        f2.display();
    }
}
