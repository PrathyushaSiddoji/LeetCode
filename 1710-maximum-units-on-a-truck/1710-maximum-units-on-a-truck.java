class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int rows=boxTypes.length;
        int[] units=new int[rows];
        Set<Integer> s=new TreeSet<Integer>();
        for(int i=0;i<rows;i++)
        {
            s.add(boxTypes[i][1]);    
        }
        
        ArrayList<Integer> a=new ArrayList<>(s);
       System.out.println(a);
        
        int sum=0;
       int z=truckSize;
        for(int j=a.size()-1;j>=0;j=j-1)
        {     
            for(int i=0;i<rows;i++)
            { 
                if(boxTypes[i][1]==a.get(j) )
                {
                   System.out.println(boxTypes[i][0]+" "+boxTypes[i][1]);
                    truckSize-=boxTypes[i][0]; 
                   
                    if(truckSize>=0){

                        sum+=boxTypes[i][0]*boxTypes[i][1];
                      
                    }
                    else if(truckSize<0)
                    {  
                        System.out.println(truckSize);
                       
                         sum+=(boxTypes[i][0]-Math.abs(truckSize))*boxTypes[i][1];
                        // truckSize=truckSize+(boxTypes[i][0]-Math.abs(truckSize)); 
                        break;
                    }

                }
                if(truckSize<0)
                {
                    break;
                }
                
            }
            if(truckSize<0)
            {
                    break;
            }
       }
     return sum;
        
    }
}