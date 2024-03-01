class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++)
        {    
                k+=nums[i];
                res[i]=k;
        }
        return res;
        
    }
}