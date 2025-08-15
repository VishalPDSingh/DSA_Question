package Ch3_BasicsSorting;

public class Leet342 {
    public static boolean powerFour(int n)
    {
        if(n <=0)
        {
            return false;
        }
        while (n%4 == 0) {
            n/=4;
        }
        return n ==1;
    }
    public static void main(String[] args) {

        int n = 16;
       boolean ans = powerFour(n);
       System.out.println(ans);

       
    }
}
