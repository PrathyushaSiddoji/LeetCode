import java.util.*;
class Solution {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> hm=new HashMap<>();
        String res="";
        int n=indices.length;
        for(int i=0;i<n;i++)
        {
            hm.put(indices[i],s.charAt(i));
            System.out.println(indices[i]+" "+hm.get(indices[i]));
        }
        for(int i=0;i<n;i++)
        {
            
            res+=hm.get(i);
        }

        return res;
        
        
    }
}