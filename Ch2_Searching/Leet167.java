package Ch2_Searching;

public class Leet167 {
    public static int[] twoSum(int[] numbers, int target)
    {
        int start = 0;
        int end = numbers.length-1;

        while (start < end) {
            if(numbers[start] + numbers[end]>target)
            {
                end--;
            }else if(numbers[start] + numbers[end]<target)
            {
                start++;
            }
            else
            {
                return new int[]{start+1, end+1};
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        
    int nums[] = {2, 7, 11, 15};
    int target = 13;
    int ans[] = twoSum(nums, target);
    System.out.println(ans[0] + " " + ans[1]);
    }
}
