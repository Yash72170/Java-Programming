public class string6 {
    public static void main(String[] args) {
        String s1 = "PW";
        String s2 = "PW" + "JAVA";
        String s3 = "PW" + "JAVA" + "SKILLS";
        String s4 = s1 + s2;
        System.out.println(s1);   // the below are inside SCD bcz no new keyword or builtins method or reference of variable is used 
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);    // this will be outside the SCP bcz reference of variables is used to concate
    }
}
