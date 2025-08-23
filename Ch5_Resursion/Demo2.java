package Ch5_Resursion;

public class Demo2 {
    public static void hello(int n)
    {
        if(n==0)
        return;
        System.out.println("Hello World");
        hello(n-1);
        System.out.println("Vishal Singh");
    }
    public static void main(String[] args) {
        hello(5);
    }
}
