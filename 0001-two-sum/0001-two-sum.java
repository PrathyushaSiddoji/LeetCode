class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int k=target-nums[i];
            
            if(hm.containsKey(k))
            {
                
                result[0]=hm.get(k);
                result[1]=i;

            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return result;
    }
}