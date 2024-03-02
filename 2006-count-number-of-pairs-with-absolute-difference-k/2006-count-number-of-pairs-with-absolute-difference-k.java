import java.util.*;
class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        int z=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(Math.abs(nums[j]-nums[i])==k)
                {
                    System.out.println(nums[i]+" "+nums[j]);
                    z=z+1;
                    System.out.println(z);
                }
            }
        }
        return z;
    }
}