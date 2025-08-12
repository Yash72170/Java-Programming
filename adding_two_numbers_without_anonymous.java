class calc
{
    public int add(int x,int y)
    {
        int result = x+y;
        return result;
    }
}
public class adding_two_numbers_without_anonymous {
    public static void main(String[] args) {
        calc obj=new calc();
        int b= obj.add(2,6);
        System.out.println(b);
    }
}
