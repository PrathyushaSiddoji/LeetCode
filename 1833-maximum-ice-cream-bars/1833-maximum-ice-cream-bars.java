class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int res=0;
        int sum=0;
        int n=costs.length;
        Arrays.sort(costs);
        for(int i=0;i<n;i++)
        {
            if(sum<=coins)
            {
                sum+=costs[i];
                res++;
            }
            if(sum>coins)
            {
                sum=sum-costs[i];
                res--;
            }
        }
        return res;

        
    }
}