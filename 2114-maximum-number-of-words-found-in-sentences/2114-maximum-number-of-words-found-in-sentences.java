class Solution {
    public int mostWordsFound(String[] sentences) {
        int z=0;
        for(String sentence : sentences)
        {
            int k=1;
            System.out.println(sentence);
           for(char c : sentence.toCharArray())
           {
               if(c==' ')
               {
                   k++;
                }
           }
            if(k>z)
            {
                System.out.println(k);
                z=k;

            }
        }
        return z;
    }
}