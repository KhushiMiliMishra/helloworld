package src;
public class CompareTo {
    public static void main(String[] args) {
        String str[]={"Hells","Hello","Help"};
        for(int i=0;i<str.length;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
            for(String s : str)
                System.out.println(s);
    }
}
// funnily enough, we might expect Help to come first because it has a shorter length, 
// but the compareTo function works by comparing each character, so p>l and hence it comes later.
