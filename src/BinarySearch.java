import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int val=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0, right=n-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(arr[mid]==val)
            {
                System.out.println(mid);
                return;
            }
            else if(arr[mid]>val)
            {
                right=mid-1;
            }
            else if(arr[mid]<val)
            {
                left=mid+1;
            }
        }
        System.out.println("not present");
    }
}
