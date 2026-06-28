import java.util.*;
public class RemoveElement {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int left=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=val)
            {
                arr[left]=arr[i];
                left++;
            }
        }
        System.out.println(left);
    }
}
