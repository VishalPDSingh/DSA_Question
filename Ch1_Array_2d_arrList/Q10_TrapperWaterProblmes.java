package Ch1_Array_2d_arrList;

public class Q10_TrapperWaterProblmes {
    public static int trapRainWater(int arr[])
    {
      
        int res = 0;
        

        for(int i=1; i<=arr.length-2; i++)
        {
            int leftBlock = arr[i];
            for(int j=0; j<i; j++)
            {
                if(arr[j] > leftBlock)
                {
                    leftBlock = arr[j];
                }
            }
            int rightBloack = arr[i];
            for(int k = i+1; k<arr.length; k++)
            {
                if(arr[k] > rightBloack)
                {
                    rightBloack = arr[k];
                }
            }
            int minHeight;
            if(leftBlock > rightBloack)
            {
                minHeight = rightBloack;
            }else
            {
                minHeight = leftBlock;
            }
            int tapeWater = minHeight - arr[i];
            res = res+tapeWater;
        }
        return res;
    }
    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        int ans = trapRainWater(height);
        System.out.println(ans);
    }
}
