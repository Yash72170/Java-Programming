public class palindrome //MADAM   NITIN    2552    2002
{
    public static void main(String[] args) {
        String str1 = "NITIN";
        String str2 ="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        //System.out.println(str2);
        if(str1.equals(str2))
        {
            System.out.println("It's Palindrome!");
        }else{
            System.out.println("It's not a Palindrome!");
        }
    }
}
