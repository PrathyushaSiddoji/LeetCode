class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<k;i++)
        {
            int max=nums[n-1];
            sum+=max;
            nums[n-1]=max+1;

        }
        return sum;
    }
}