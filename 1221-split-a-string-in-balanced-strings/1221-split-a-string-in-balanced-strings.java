class Solution {
    public int balancedStringSplit(String s) {
        Stack<Character> st=new Stack<Character>();
        int a=0;
        int b=0;
        int res=0;
        for(int i=0;i<s.length()-1;i=i+2)
        {
           if(s.charAt(i)=='R')
           {
                a++;
                System.out.println(i+" "+s.charAt(i)+" "+a);
                if(s.charAt(i+1)=='L')
                {
                    b++;
                     System.out.println(i+" "+s.charAt(i+1)+" "+b);
                }
                else if(s.charAt(i+1)=='R')
                {
                    a++;
                      System.out.println(i+" "+s.charAt(i+1)+" "+a);
                }
           }
           else if(s.charAt(i)=='L')
           {
                b++;
                System.out.println(i+" "+s.charAt(i)+" "+a);
                if(s.charAt(i+1)=='R')
                {
                    a++;
                    System.out.println(i+" "+s.charAt(i+1)+" "+b);
                }
                else if(s.charAt(i+1)=='L')
                {
                    b++;
                     System.out.println(i+" "+s.charAt(i+1)+" "+a);
                }
           }
           if(a==b)
           {
                a=0;
                b=0;
                res++;
                System.out.println(res);
           }
        }
        return res;
        
    }
}

