class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]>=nums[i+1])
            {
                res+=nums[i]-nums[i+1]+1;
                nums[i+1]=nums[i+1]+nums[i]-nums[i+1]+1;
            }
        }
        return res;
        
    }
}