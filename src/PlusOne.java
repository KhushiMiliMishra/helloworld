package src;
import java.util.*;

public class PlusOne
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] digits=new int[n];
        for(int i=0;i<n;i++)
        {
            digits[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(plusone(digits)));
        sc.close();
    }
    public static int[] plusone(int[] digits)
    {
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits=new int[n+1];
        digits[0]=1;
        return digits;
    }
}