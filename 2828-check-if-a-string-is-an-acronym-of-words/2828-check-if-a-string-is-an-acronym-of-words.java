class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String res="";
        for(String st: words)
        {
            res+=st.charAt(0);
        }
        if(res.equals(s))
        {
            return true;
        }
        else
        return false;
    }
}