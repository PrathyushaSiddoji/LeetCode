class Solution {
    public String truncateSentence(String s, int k) {
        String res="";
        int j=0,z=0;
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)!=' ')
            {
                z++;
               continue;
            }
            else
            {
                j++;
                z++;
                System.out.println(z);
                if(j==k)
                {
                    
                   break;
                }
            } 
        
                
        }
     
    if(j==k)
    {
        res=s.substring(0,z-1);
    }
    else
        res=s.substring(0,z);
    return res;
        
    }
}