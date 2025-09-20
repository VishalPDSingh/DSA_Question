package Ch1_Array_2d_arrList;

public class Q9_KadanesAlgorithm {

    public static int kadnasesAlgorithm(int arr[])
    {
        int maxSum = 0; 
        int currSum = 0;

        for(int i=0; i<arr.length; i++)
        {
            currSum = currSum+arr[i];
            if(currSum>maxSum)
            {
                maxSum = currSum;
            }
            if(currSum < 0)
            currSum = 0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-1,-2,-3};
        int ans = kadnasesAlgorithm(arr);
        System.out.println(ans);
    }
}
