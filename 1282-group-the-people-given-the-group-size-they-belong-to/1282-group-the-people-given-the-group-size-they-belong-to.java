class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<Integer>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++)
        {
            hs.add(groupSizes[i]);
        }
       // System.out.println(hs);
        ArrayList<Integer> AL=new ArrayList<>(hs);
        //System.out.println(AL);
        for(int i=0;i<AL.size();i++)
        {
            
            int z=0,m=0;
            for(int k=z;k<groupSizes.length;k++)
            {
                if(AL.get(i)==groupSizes[k] && m<AL.get(i))
                {
                    ans.add(k);
                     
                     m++;
                    
                }
                if((m==AL.get(i)) &&  ans.size()!=0)
                {
                    
                    System.out.println(ans);
                    res.add(new ArrayList<>(ans));
                    ans.clear();
                    m=0;
                    
                }
                
            }
           
        }
       
        return res;
        
    }
}