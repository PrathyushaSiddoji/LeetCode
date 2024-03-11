class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int sum=0;
        HashSet<Integer> hs=new HashSet<>();   
        for(int i=0;i<n;i++)
        {
            hs.add(nums[i]);
        }
        ArrayList<Integer> AL=new ArrayList<>(hs);
        ArrayList<Integer> AL1=new ArrayList<>();
        for(int i=0;i<AL.size();i++)
        {
            for(int j=0;j<n;j++)
            {
                if(AL.get(i)==nums[j])
                {
                    sum+=1;
                }
            }
            
            AL1.add(sum);
            sum=0;

        }
        Collections.sort(AL1);
        System.out.println(AL1);
        sum=AL1.get(AL1.size()-1);
        for(int i=AL1.size()-1;i>0;i--)
        {
           if(AL1.get(i)==AL1.get(i-1))
            {
                System.out.println(sum);
                 System.out.println(i-1);
                sum+=AL1.get(i-1);
            }
            else if(AL1.get(i)!=AL1.get(i-1))
            {
                
               
                    return sum;
               

            }
           
        }
    return sum;     
    }
}