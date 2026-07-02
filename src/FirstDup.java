import java.util.*;
public class FirstDup {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            int num=sc.nextInt();
            if(set.contains(num))
            {
                System.out.println(num);
                return;
            }
            set.add(num);
        }
        System.out.println("No duplicates");
    }
}
