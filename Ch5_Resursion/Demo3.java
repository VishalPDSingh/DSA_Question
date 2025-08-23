package Ch5_Resursion;

public class Demo3 {
    public static int fun(int n)
    {
        if(n==1)
        return 0;
        else
        return 1+fun(n/2);
    }
    public static void main(String[] args) {
        int ans = fun(20);
        System.out.println(ans);
    }
}
