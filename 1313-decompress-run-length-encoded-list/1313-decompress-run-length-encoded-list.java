import java.util.*;
class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> AL=new ArrayList<Integer>();
        int n=nums.length;
        for(int i=0;i<n;i=i+2)
        {
            int fre=nums[i];
            int k=nums[i+1];
           // System.out.println(fre +" " + k);
           
            for(int z=0;z<fre;z++)
            {
                AL.add(k);
            }
            
        }
        int n1=AL.size();
        int [] res=new int[n1];
        
       for(int i=0;i<n1;i++)
       {
           res[i]=AL.get(i);
          
       }
       return res;
        
    }
}