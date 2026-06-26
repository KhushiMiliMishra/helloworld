import java.util.*;
public class SecondLargest {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            if(num>max)
            {
                smax=max;
                max=num;
            }
            else if(num>smax)
            {
                smax=num;
            }
        }
        System.out.println(smax);
    }
}
