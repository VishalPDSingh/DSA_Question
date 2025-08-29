package Ch1_Array_2d_arrList;

public class Index_of_middle_ele {
    public static int position(int arr[], int key) {
        // count number of key
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                total++;
        }

        if (total == 0)
            return 0;

        int middle = (total + 1) / 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
                if (count == middle) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 4, 6, 4, 7, 8, 4 };
        int key = 4;
        int ans = position(arr, key);
        System.out.println(ans);
    }
}
