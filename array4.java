public class array4 {
    public static void main(String[] args) {
        int nums[] = new int[4];
        nums[0]=1;
        nums[1]=6;
        nums[2]=10;
        nums[3]=16;
        // nums[4]=17;
        // nums[5]=19;
        // for(int i=0;i<6 ; i++)   // will show index out of bound error 
        // {
        //     System.out.println(nums[i]);
        // }
        for(int i=0 ; i<nums.length; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
