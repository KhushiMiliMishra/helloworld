package src;
import java.util.*;

public class ArrayStringSort {
    public static int[] arraysort(int[] nums)
    {
        Arrays.sort(nums);
        return nums;
    }
    public static String sortstring(String s)
    {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static String[] sortStringArray(String[] str)
    {
        Arrays.sort(str);
        return str;
    }
    public static void main(String[] args) {
        int[] arr={1,4,3,5,8,6,9};
        String s="khushimilimishra";
        System.out.println(Arrays.toString(arraysort(arr)));
        System.out.println(sortstring(s));
        String[] str={"java","c","python","c++"};
        System.out.println(Arrays.toString(sortStringArray(str)));
    }
}
