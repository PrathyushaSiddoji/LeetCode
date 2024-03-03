class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        char[] c=allowed.toCharArray();
        int res=0;
        for(String s : words)
        {
            int k=0;
            for(int i=0;i<s.length();i++)
            {
                
                for(int j=0;j<c.length;j++)
                {
                    if(s.charAt(i)==c[j])
                    {
                        
                        k++;
                    }
                }
                
            }
            if(s.length()-k==0)
            {
                res++;
            }
               
        }
        return res;
    }
}