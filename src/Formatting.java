package src;

public class Formatting {
    public static void main(String[] args)
    {
        int a=10;
        double b=12.3939;
        int c=29229;
        double avg=(a+b)/2;
        System.out.printf("%.3f", avg);
        System.out.printf("\n%.2f", (double) c);
    }
}
