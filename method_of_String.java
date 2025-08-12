public class method_of_String {
    public static void main(String[] args) {
        String name1 = "Yashraj Shukla";
        String name2 = "Yashraj Shukla";
        System.out.println(name1.charAt(1));

        name1 = name1.concat(" is a good boy.");
        System.out.println(name1);

        System.out.println(name2.equals(name1));

        System.out.println(name1.equalsIgnoreCase(name2));

        System.out.println(name1.substring(1, 6));

        System.out.println(name1.length());

        System.out.println(name2.toUpperCase());

        System.out.println(name1.toLowerCase());

        System.out.println(name1.compareTo(name2));

        System.out.println(name1.indexOf("a"));

        System.out.println(name1.lastIndexOf(""));

        

    }
}
