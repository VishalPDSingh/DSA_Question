package Ch1_Array;

public class Reverse_Array {
    public static void reverse(int nums[]) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
        for (int arr : nums)
            System.out.println(arr);
    }

    public static void main(String[] args) {
        int nums[] = { 5, 9, 3 };

        reverse(nums);
    }
}
