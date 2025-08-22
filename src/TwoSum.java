package src;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int nums[], int target)
    {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int num=target-nums[i];
            if(map.containsKey(num))
            {
                return new int[] {map.get(num),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        TwoSum ans=new TwoSum();
        int[] arr={1,2,4,5};
        int target=3;
        System.out.print(Arrays.toString(ans.twoSum(arr, target)));

        
    }
}
