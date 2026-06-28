import java.util.*;
public class DutchNationalFlag {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int low=0,med=0,high=n-1;
        
        while(med<=high)
        {
            if(arr[med]==0)
            {
                int temp=arr[med];
                arr[med]=arr[low];
                arr[low]=temp;
                low++;
                med++;
            }
            else if(arr[med]==2)
            {
                int temp=arr[med];
                arr[med]=arr[high];
                arr[high]=temp;
                high--;
            }
            else
            {
                med++;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        
    }
}
