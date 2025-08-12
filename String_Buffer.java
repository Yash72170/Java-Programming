public class String_Buffer {
    public static void main(String[] args) {
        

        //new capacity = (current capacity+1)*2

        StringBuffer sb=new StringBuffer();
        System.out.println(sb.capacity());  //16

        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.capacity()); //16
        sb1.append("a b c d e f g h i j k l m n o p");
        System.out.println(sb1.capacity());
        sb1.append("q");
        System.out.println(sb1.capacity());  //34
        System.out.println(sb1.length());
    }
}
