package Ch3_BasicsSorting;

public class Leet88TwoPointer {
    public static void merge(int[] nums1, int[] nums2, int m , int n)
    {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

       while (j>=0) {
        if(i>=0 && nums1[i] > nums2[j])
        {
            nums1[k--] = nums1[i--];
        }else
        {
            nums1[k--] = nums2[j--];
        }
       }
       for(int ans:nums1)
       {
        System.out.print(ans);
       }
    }
    public static void main(String[] args) {
         int num1[] = {1,3,5,0,0,0};
        int num2[] = {2,4,6};
        int m = 3;
        int n = 3;
        merge(num1, num2, m, n);
    }
}
