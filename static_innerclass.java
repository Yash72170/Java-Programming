class A 
{
    public void show()
    {
        System.out.println("In Show");
    }
    static class B
    {
        public void display()
        {
            System.out.println("In Display");
        }
    }
}
public class static_innerclass 
{
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        //obj.display();    will give error bcz The method display is undefined for class A
        // B obj1 = new B();
        // obj1.display();    will give error bcz B cannot be resolved to a type

        A.B obj1 = new A.B();
        obj1.display();

    }
}
