public class final_vs_immutability {
    public static void main(String [] args)
    {
        int a=10;
        a=20;
        System.out.println(a);  //20 bcz it gets updated

        final int b=10;
        //b=20;    not allowed
        System.out.println(b);
    }

}
