package Ch1_Array_2d_arrList;

import java.util.ArrayList;
import java.util.List;

public class Leet1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
    {
        int maxCandies = Integer.MIN_VALUE;


        for(int i=0; i<candies.length; i++)
        {
          if(candies[i] > maxCandies)
          {
            maxCandies = candies[i];
          }
        }
         List<Boolean> result = new ArrayList<>();
        for(int i=0; i<candies.length; i++)
        {

            if(extraCandies+candies[i] >= maxCandies)
            {
                result.add(true);
            }else
            {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3};

        List<Boolean>ans = kidsWithCandies(candies, 3);
        System.out.println(ans);
    }
}
