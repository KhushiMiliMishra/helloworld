import java.util.*;
public class StringPalindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=str.toLowerCase();
        int left=0;
        int right=str1.length()-1;
        while(left<right)
        {
            if(str1.charAt(left)==str1.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
