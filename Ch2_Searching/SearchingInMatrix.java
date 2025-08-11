package Ch2_Searching;

public class SearchingInMatrix {
    public static void searchArray(int nums[][], int target) {
        int i = 0;
        int j = nums[0].length - 1;

        while (i < nums.length && j >= 0) {
            if (nums[i][j] == target) {
                System.out.println(i + "," + j);
                return;
            } else if (nums[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("not found");
    }

    public static void main(String[] args) {
        int arr[][] = { { 10, 20, 30, 40 },
                { 11, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 } };
        int target = 37;
        searchArray(arr, target);
    }
}
