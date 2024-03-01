class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
           /* if(index[i]==i)
            {
                res[i]=nums[i];
            }
            else*/
             if(index[i]<i)
            {
                
                int k=index[i];
                int z=nums[i];
                for(int j=i;j>k;j--)
                {
                    nums[j]=nums[j-1];
                    System.out.print( j+" "+nums[j]+"    ");
                    
                   
                }
               nums[k]=z;
               System.out.print( k+" "+res[k]);
               System.out.println();

            }

           
        }
        return nums;
        
    }
}