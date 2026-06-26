import java.util.*;

public class Largest{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        arr[0]=sc.nextInt();
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int num=sc.nextInt();
            if(num>max)
            {
                max=num;
            }
        }
        System.out.println(max);
    }
}