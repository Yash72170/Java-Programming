class calci
{
    public int add(int nums[])
    {
        int result=0;
        for(int b:nums)
        {
            result=result+b;
        }
            return result;
        }
    }
public class anonymous_array {
    public static void main(String[] args) {
    // an array without a name is called as anonymous array.
    // this type of array is used for instance use only.
    calci obj = new calci();
    int nums[]={1,2,3,4,5};
    int a=obj.add(nums);
    System.out.println(a);
    }
}
