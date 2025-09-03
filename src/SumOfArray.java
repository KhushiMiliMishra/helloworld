package src;

public class SumOfArray {
    public static int arraySum(int[] nums)
    {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        int[] arr={2,4,6,2,1,6,9,7};
        System.out.println(arraySum(arr));
    }
}
