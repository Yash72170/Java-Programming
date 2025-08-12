public class reversing_String1 {
    public static void main(String[] args) {
         String str1 = "PW Java";
         String str2 = "";

         for(int i=str1.length()-1;i>=0;i--)
         {
            str2=str2+str1.charAt(i);
         }
         System.out.print(str2 );
    }
}
