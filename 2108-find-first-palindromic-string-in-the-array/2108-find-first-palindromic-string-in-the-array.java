class Solution {
    public String firstPalindrome(String[] words) {
        String res=""; 
        if(words.length>=1 && words.length<=100)
        {
            for(String s: words)
            { 
                if(s.length()>=1 && s.length()<=100)
                {
                //System.out.println(s);
                int n=s.length();
                String first="";
                String second="";
                
                for(int i=0;i<=n/2;i++)
                {
                    first += s.charAt(i);
                     second += s.charAt(n - 1 - i);
                    
                    
                    
                }
                
                if(first.equals(second) )
                { 
                System.out.println(first);
                System.out.println(second);
                System.out.println(s);
                res=s;
                
                    break;
                }
            }
            }   
        }
        else
        {
            res="";
        }
        
        
       return res; 
    }
}