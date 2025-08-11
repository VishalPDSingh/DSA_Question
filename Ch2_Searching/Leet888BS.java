package Ch2_Searching;

import java.util.Arrays;

public class Leet888BS {
    public static int[] fairCandySwap(int[] alice, int[] bob)
    {
        Arrays.sort(alice);
        Arrays.sort(bob);
        int sumA=0;
        int sumB=0;
        for(int a:alice)
        {
            sumA+=a;
        }
        for(int b:bob)
        {
            sumB+=b;
        }

        int diff = (sumB-sumA)/2;
        int i=0;
        int j=0;

        while(i<alice.length && j<bob.length)
        {
            int currdiff = bob[j] - alice[i];
            if(diff == currdiff)
            {
                return new int[] {alice[i],bob[j]};
            }else if(currdiff < diff)
            {
                j++;
            }else
            {
                i++;
            }
        }
        return new int[] {0,0};
    }
    public static void main(String[] args) {
        int aliceCandy[] = {1,2,5};
        int bobCandy[] = {2,4};
        int ans[] = fairCandySwap(aliceCandy, bobCandy);

        System.out.println(ans[0]+","+ans[1]);

    }
}
