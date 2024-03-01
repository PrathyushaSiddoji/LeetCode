import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        ArrayList<Boolean> res=new ArrayList<>();
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(candies[i]>k)
            {
                k=candies[i];
            }
        }
        for(int j=0;j<n;j++)
        {
            int z=extraCandies+candies[j];
            if(z>=k)
            {
                res.add(true);
            }
            else
                 res.add(false);

        }
    return res;
    }
}