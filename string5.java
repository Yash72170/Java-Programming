public class string5 {
    public static void main(String[] args) {
        String s1 = "PWJava";
        String s2 = s1.concat("Skills");
        String s3 = new String("PWJava");
        s3=s3.concat("Skills");
        System.out.println(s1);     // this will be in the SCP
        System.out.println(s2);   // this will be outside the SCP but inside the heap
        System.out.println(s3);    //this will be outside the SCP but inside the heap
    }
}
