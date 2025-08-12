public class reversing_string3 {
    public static void main(String[] args) {
        String str1 = "PWSkills Java";
        String str2 = "";

        String arr[]=str1.split(" ");
        for(String elem : arr)
        {
            for(int i=elem.length()-1;i>=0;i--)
            {
                str2=str2+elem.charAt(i);
            }
            str2=str2+" ";
        }
        System.out.println(str2);
    }
}
