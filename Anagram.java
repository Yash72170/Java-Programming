import java.util.Arrays;

public class Anagram  // keep=peek     schoolmaster=theclassroom
{
    public static void main(String[] args) {
        String str1 = "keep";
        String str2 = "peek";

        //Removing the white spaces
        str1=str1.replace(" ", "");
        str2=str2.replace(" ", "");
        // System.out.println(str1);
        // System.out.println(str2);

        //converting to either uppercase or lowercase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        // System.out.println(str1);
        // System.out.println(str2);

        //convert to an array(character array)
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        //now, sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

    //now compare both the Strings

    if(Arrays.equals(arr1,arr2))
    {
        System.out.println("It's an Anagram!");
    }else{
        System.out.println("It's not an Anagram");
    }



    }
}
