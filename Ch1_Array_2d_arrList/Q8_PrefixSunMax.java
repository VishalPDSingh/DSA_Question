package Ch1_Array_2d_arrList;

public class Q8_PrefixSunMax {
    public static void perfiexSumMax(int arr[])
    {
         int sum = 0;
         int max = Integer.MIN_VALUE;
        int prefixSum[] = new int[arr.length];
        prefixSum[0] = arr[0];

        for(int i=1; i<arr.length; i++)
        {
            prefixSum[i] = prefixSum[i-1] + arr[i];
        }



        for(int i=0; i<arr.length; i++)
        {
            int start = i;
            for(int j=i; j<arr.length; j++)
            {
               int end = j;
               sum = start ==0? prefixSum[end] : prefixSum[end] - prefixSum[start -1];
               if(sum > max)
               max = sum;
            }
        }
       System.out.println(max); 
    }
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        perfiexSumMax(arr);
    }
}
