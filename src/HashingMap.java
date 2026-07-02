import java.util.*;
public class HashingMap {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Map<String, Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String fruit=sc.next();
            map.put(fruit,map.getOrDefault(fruit, 0)+1);
        }
        for(String a:map.keySet())
        {
            System.out.println(a+" "+map.get(a));
        }
    }
}
