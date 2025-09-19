package Ch1_Array_2d_arrList;

public class Q6_PrinttingSubArray {
    public static void subArray(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int start = i; // 2,4,6,8
            for(int j=i; j<arr.length; j++)
            {
                int end = j; // 4,6,8

                for(int k = start; k<=end; k++)
                {
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
        subArray(arr);
    }
}
