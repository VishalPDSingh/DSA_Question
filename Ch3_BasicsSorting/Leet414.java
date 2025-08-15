package Ch3_BasicsSorting;



public class Leet414 {
    public static int thirdMax(int[] nums)
    {
       long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
         long third = Long.MIN_VALUE;
        for(int n:nums)
        {
            if(n==first || n==second|| n==third)
            {
                continue;
            }
            if(n>first)
            {
                third = second;
                second = first;
                first = n;
            }else if (n > second) {
                third = second;
                second = n;
            } else if (n > third) {
                third = n;
            }
        }
        return  third == Long.MIN_VALUE ? (int) first : (int) third;           
        }
    public static void main(String[] args) {
        int nums[] = {7,5,4,2,1};
        int ans = thirdMax(nums);
        System.out.println(ans);
    }
}
