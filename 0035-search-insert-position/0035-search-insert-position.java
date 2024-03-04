class Solution {
    public int searchInsert(int[] nums, int target) {
       int n=nums.length/2;
       int res=0;
       if(nums.length==1)
       {
           if(target<=nums[0])
           {
               res=0;
             
           }
           else
           {
               res=1;
               
           }
       }
      else
      {
        if(target<nums[0])
        {
            
            res=0;
                
        }
        else if (target>nums[nums.length-1])
        {
            res=nums.length;
           
        }
        
        if(nums[n-1]<target && nums[n]>target)
        {
            res=n;
            
        } 
        
        if(target<nums[n])
        {
            for(int i=0;i<n;i++)
            {
                if(target==nums[i])
                {
                    res=i;
                    break;
                   
                }
                else if(target<nums[i]) {
                    
                    res=i;
                    break;
                   
                  
                }
            }
            
        }
        else if(target>=nums[n])
        {
            
            for(int i=n;i<nums.length;i++)
            {
               
                if(target==nums[i])
                {
                    res=i; 
                    break;
                }
                else if(target<nums[i]) {
                    res=i;
                    
                     break;
                }
            }
            
        }
        
     }  
        return res; 
    }
}