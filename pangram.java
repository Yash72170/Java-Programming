public class pangram  // THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
 {
    public static void main(String[] args) {
        boolean flag=false;
        String str = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";

        str=str.replace(" ", "");

        str=str.toLowerCase();

        char[] ch=str.toCharArray();

        int ar[]=new int[26];
        for(int i=0 ;i<ch.length-1;i++)
        {
            ar[ch[i]-65]++;
        }
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i]==0)
            {
                System.out.println("Not a Pangram!");
                flag=true;
            }
        }
        if(flag==false){
                System.out.println("It's a pangram!");
        }
    }
}
