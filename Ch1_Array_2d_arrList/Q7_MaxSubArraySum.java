package Ch1_Array_2d_arrList;

public class Q7_MaxSubArraySum {
     public static void subArray(int arr[])
    {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            int start = i; // 2,4,6,8
            for(int j=i; j<arr.length; j++)
            {
                int end = j; // 4,6,8
                sum = 0;
                for(int k = start; k<=end; k++)
                {
                  sum = sum+arr[k];
                  if(sum > max)
                  {
                    max = sum;
                  }
                }
                // System.out.println();
            }
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
         int arr[] = {2,4,6,8,100};
         subArray(arr);
    }
}
