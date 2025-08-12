class Demo {

    static void disp1()
    {
        System.out.println("Static method");
    }
    void disp2()
    {
        System.out.println("non-static method");
    }
}
public class static_keyword3
{
    public static void main(String[] args) {
        System.out.println("main method");
        Demo.disp1();       // can be called without creating objects bcz it is the static 
        //Demo.disp2();   // can't call without creating object
    }
    }

