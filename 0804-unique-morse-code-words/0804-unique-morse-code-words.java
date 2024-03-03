class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        int ans=0;
        ArrayList<String> AL=new ArrayList<>();
        String[] s={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for(String s1:words)
        {
            String k="";
            for(int i=0;i<s1.length();i++)
            {
                char z=s1.charAt(i);
              // System.out.println((int)z+" "+z);
               int l=((int)z+3)%100;
                k+=s[l];
                 
                
            }
            AL.add(k);
            

        }
        System.out.println(AL);
        HashSet hs=new HashSet();
        for(int i=0;i<AL.size();i++)
        {
              hs.add(AL.get(i));
        }
        
        return hs.size(); 
 }
      
   
}