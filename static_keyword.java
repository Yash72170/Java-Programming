public class static_keyword {

    static int age;     //0

    static {
        age=19;         //19
        System.out.println("Static block first");
    }
    public static void main(String[] args) {
        //static keyword is used :
        //1) class 2)variables  3)blocks   4)methods
            System.out.println("Main method baad mein");
    
    }
}
