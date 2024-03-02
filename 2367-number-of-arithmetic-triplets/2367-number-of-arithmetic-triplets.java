class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int n=nums.length;
        int z=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]-nums[i]==diff)
                {
                    int k=j+1;
                    while(k<n)
                    {
                        if(nums[k]-nums[j]==diff)
                        {
                           z=z+1;
                        }
                        k=k+1;
                    }
                }
            }
        }
        return z;
    }
}