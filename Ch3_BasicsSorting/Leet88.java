package Ch3_BasicsSorting;

import java.util.*;
public class Leet88 {

    public static void merge(int[] nums1, int[] nums2, int m , int n)
    {
         // Step 1: Copy first m elements + all nums2 into nums1
        for(int i=0; i<n; i++)
        {
            nums1[m+i] = nums2[i];
        }

         // Step 2: Sort the whole nums1
         Arrays.sort(nums1);

         for(int arr:nums1)
         {
            System.out.println(arr);
         }
    }
    public static void main(String[] args) {
        int num1[] = {1,3,5,0,0,0};
        int num2[] = {2,4,6};
        int m=3;
        int n=3;
        merge(num1, num2, m, n);
    }
}
