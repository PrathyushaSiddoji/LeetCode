class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] b=new int[2*n];
        for(int i=0;i<n;i++)
        {
            
            b[i]=nums[i];
            b[i+n]=nums[i];
        }
        return b;
    }
}