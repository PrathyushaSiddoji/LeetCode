class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first="";
        String second="";
        for(String s: word1)
        {
            first+=s;
        }
        for(String s: word2)
        {
            second+=s;
        }
        if(first.equals(second))
        {
            return true;
        }
        else
            return false;
    }
}