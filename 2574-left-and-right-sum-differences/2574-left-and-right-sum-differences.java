import java.util.*;
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int res[]=new int[n];
        left[0]=0;
        right[n-1]=0;
        System.out.println(left[0]+" "+right[n-1]);
        for(int i=1;i<=n-1;i++)
        {
            left[i]=left[i-1]+nums[i-1];
            right[n-i-1]=right[n-i]+nums[n-i];
            System.out.println(left[i]+" "+right[n-i-1]);
        }
        for(int i=0;i<n;i++)
        {
        
            res[i]=Math.abs(left[i]-right[i]);
        }
    return res;
    }
}