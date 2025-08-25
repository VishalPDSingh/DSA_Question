package Ch5_Resursion;

public class DigitSum {
    public static int digitSum(int n)
    {
        if(n<=1)
        return n;
        return digitSum(n/10) + n%10;
    }
    public static void main(String[] args) {
       int n= 123;
       int ans = digitSum(n);
       System.out.println(ans);
    }
}
