package Ch3_BasicsSorting;

import java.util.Arrays;


public class InbuiltSort {
    public static void main(String[] args) {
        int arr[] = {9,1,4,1,3,2,4,3,7};
        //ascending order
        Arrays.sort(arr);
        for(int ans:arr)
        {
            System.out.print(ans+" ");
        }
    }
}
