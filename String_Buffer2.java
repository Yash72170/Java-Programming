public class String_Buffer2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Sachin");
        System.out.println(sb);
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(1));
        sb.setCharAt(1, 'u');
        System.out.println(sb);
    }
}
