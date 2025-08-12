public class string7 {
    public static void main(String[] args) {
        String s1 = "PW";
        String s2 = "PW" + 100 + 90;
        System.out.println(s2);  // it will treat all the values as String

        System.out.println("--------");
        
        String s3 = "PW";
       // s3=s3.concat(100); //this will show error bcz only String is passed in concat method
        System.out.println(s3);
    }
}
