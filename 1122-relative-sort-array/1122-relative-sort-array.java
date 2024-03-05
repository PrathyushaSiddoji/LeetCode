class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> AL=new ArrayList<>();
        int n=arr1.length;
        int k=0;
        int[] res=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            AL.add(arr1[i]);
        }
       
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<AL.size();j++)
            {
                if(arr2[i]==AL.get(j))
                {
                    res[k]=AL.get(j);
                    AL.remove(j);
                    k++;
                    j--;    
                }
            }
        }
        System.out.println(AL);
        Collections.sort(AL);
        int m=0;
        for(int i=k;i<n;i++)
        {    
            res[k]=AL.get(m);
            m++;
            k++;
        }
    return res;
        
    }
}