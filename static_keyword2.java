public class static_keyword2 {

    static int age;
    static{
        age=18;
        System.out.println("static block");
    }
    static void disp()
    {
        System.out.println("static method");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        disp();
        
    }
}
