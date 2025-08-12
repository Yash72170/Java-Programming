public class arrayindexoutofboundexception {
    public static void main(String[] args) {
        int nums[]={1,2,3,4};

        System.out.println(nums[nums.length-1]);
        System.out.println("bye");
        System.out.println("--------");


        for(int i=0 ; i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
        System.out.println("--------");

        for(int a:nums)
        {
            System.out.println(a);
        }
    }
}
