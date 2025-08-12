public class method_overloading 
{
    public int add(int a,int b)
    {
        int c= a+b;
        return c;
    }
    public int add(int a,int b,int c)
    {
        int d=a+b+c;
        return d;
    }
    public static void main(String[] args)
    {
        method_overloading obj1 = new method_overloading();
        obj1.add(2,3);
        method_overloading obj2 = new method_overloading();
        obj2.add(2,3,4);
    }
}

