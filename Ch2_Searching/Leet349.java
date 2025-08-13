package Ch2_Searching;

import java.util.*;

public class Leet349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                // Skip duplicates in nums1
                while (i < nums1.length - 1 && nums1[i] == nums1[i + 1]) i++;
                // Skip duplicates in nums2
                while (j < nums2.length - 1 && nums2[j] == nums2[j + 1]) j++;
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 1};
        int arr2[] = {2};

        int ans[] = intersection(arr1, arr2);
        System.out.println(Arrays.toString(ans));
    }
}
