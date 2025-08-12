public class string3 {
    public static void main(String[] args) {
        String str1 = "PW";  // Both will have the same reference
        String str2 = "PW";   

        String str3 = new String("PWskills");  // Both will have the different reference
        String str4 = new String("PWskills");

        System.out.println("== operator :- compares the reference of the objects.");
        System.out.println(str1==str2);     //true but it will give false if the content of str1 or 2 is different
        System.out.println(str3==str4);     //false
        System.out.println(str1==str3);     //false
        System.out.println(str2==str4);     //false

        System.out.println("equals() :- compares the content of the objects.");
        System.out.println(str1.equals(str2));     //true
        System.out.println(str3.equals(str4));      //true
        System.out.println(str1.equals(str3));      //false
        System.out.println(str2.equals(str4));      //false

    }
}
