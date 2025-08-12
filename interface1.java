interface A
{
    void show();
}
class B implements A
{
    public void show()
    {
        System.out.println("In show");
    }
}
public class interface1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
