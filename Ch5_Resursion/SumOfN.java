package Ch5_Resursion;

public class SumOfN {
    public static int naturalSum(int n)
    {
        // if(n<=1)
        // return n;
        // return naturalSum(n-1)+n;
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
        
        int ans = naturalSum(5);
        System.out.println(ans);
    }
}
