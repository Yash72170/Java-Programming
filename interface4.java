interface A
{
    void show();
    default void config()
    {
        System.out.println("In config");
    }
    static void abc()
    {
        System.out.println("In abc");
    }
}
class define implements A
{
    public void show()
    {
        System.out.println("In show");
    }
}
public class interface4 {
    public static void main(String[] args) {
        A.abc();
        //A.config();    shows error bcz it is a non-static method
        A obj = new define();
        obj.show();
        obj.config();
    }
}
