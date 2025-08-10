package Ch2_Searching;

public class Leet69 {
    public static int mySqrt(int x)
    {
        int start = 0;
        int end = x;
        int mid = -1;

        if(x == 0 || x == 1)
        {
            return x;
        }

        while (start<=end) {
            mid = start + (end - start)/2;

            if((long) mid*mid == (long)x)
            {
                return mid;
            }else if(mid*mid > x)
            {
                end = mid-1;
            }else 
            {
                start = mid + 1;
            }
        }
        return Math.round(end);
    }
    public static void main(String[] args) {

        int nums = 2147395599;
        int ans = mySqrt(nums);
        System.out.println(ans);
    }
}
