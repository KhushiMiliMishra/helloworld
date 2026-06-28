import java.util.*;
public class SlidingWindow {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int size=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int currSum=0;
        for(int i=0;i<size;i++)
        {
            currSum+=arr[i];
        }
        int bestSum=currSum;
        for(int i=0;i<n-size;i++)
        {
            currSum=currSum-arr[i]+arr[size+i];
            bestSum=Math.max(currSum,bestSum);
        }
        System.out.println(bestSum);
    }
}
