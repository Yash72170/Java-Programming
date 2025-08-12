public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(150);
        System.out.println(sb.capacity());    // 150
        sb.append("JAVA");
        System.out.println(sb.capacity());      //150
        sb.trimToSize();
        System.out.println(sb.capacity());      //4


        System.out.println(sb.reverse());  // AVAJ
    }
}
