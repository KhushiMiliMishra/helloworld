import java.util.*;
public class RunningMin {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int minSoFar=arr[0];
        int bestProfit=0;
        for(int i=1;i<n;i++)
        {
            if(minSoFar>arr[i]) minSoFar=arr[i];
            int profit=arr[i]-minSoFar;
            bestProfit=Math.max(profit, bestProfit);
        }
        System.out.println(bestProfit);
    }
}
