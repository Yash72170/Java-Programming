public class array3 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};  // will be stored in heap area
        int b=5;   // will be stored in main stack memory
        System.out.println(a);  // [I@2f92e0f4 this is not a's value nor the id it is something different
        System.out.println(b);
    }
}
