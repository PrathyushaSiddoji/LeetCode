import java.util.*;
class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int es=0;
        int ds=0;
        for(int i=0;i<n;i++)
        {
          es+=nums[i];
          int k=nums[i];
         while(k>9)
         {
             ds+=k%10;
             k=k/10;   
         }
        ds+=k;
        }
        int res=Math.abs(es-ds);
        return res;
        
    }
}