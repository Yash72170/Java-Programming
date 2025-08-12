public class for_each_loop_2D {
    public static void main(String[] args) {
        int nums[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        for(int arr[]:nums)
        {
            for(int b:arr)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
}
