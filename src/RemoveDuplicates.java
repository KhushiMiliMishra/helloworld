import java.util.*;
public class RemoveDuplicates
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]!=arr[left])
            {
                left++;
                arr[left]=arr[i];
            }

        }
        System.out.println(left+1);
    }
}