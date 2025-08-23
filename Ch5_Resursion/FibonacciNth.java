package Ch5_Resursion;

public class FibonacciNth {
    public static int fibonacciSum(int n)
    {
       if(n <=1)
       return n;
       return fibonacciSum(n-1) + fibonacciSum(n-2);    
    }
    public static void main(String[] args) {
        //int n = 5;
        int ans = fibonacciSum(3);
        System.out.println(ans);
    }
}
