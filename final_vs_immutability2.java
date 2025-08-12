// final keyword:- final keyword do not change the mutability of a string i.e do not change mutable to immmutable

public class final_vs_immutability2 {
    public static void main(String[] args) {
        String s= new String("Virat");
        s=s.concat("Kholi");
        System.out.println(s);

        StringBuffer sb=new StringBuffer("Virat");
        sb.append("kholi");
        sb=new StringBuffer("good player");
        System.out.println(sb);

        final StringBuffer sb1=new StringBuffer("Virat");
        sb1.append("kholi");
        // sb1=new StringBuffer("good player");    shows error bcz not allowed
        System.out.println(sb1);
    }
}
