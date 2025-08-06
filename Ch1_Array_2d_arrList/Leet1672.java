package Ch1_Array_2d_arrList;

public class Leet1672 {

    public static int  maximumWealth(int[][] accounts)
    {
        int maxMoney = Integer.MIN_VALUE;
        for(int i=0; i<accounts.length; i++)
        {
            int sum = 0;
            for(int j=0; j<accounts[0].length; j++)
            {
                sum = accounts[i][j] + sum;
                if(maxMoney < sum)
                {
                    maxMoney = sum;
                }
            }
        }
        return maxMoney;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                       {3,2,1}};
        
        int ans = maximumWealth(arr);
        System.out.println(ans);
    }
}
