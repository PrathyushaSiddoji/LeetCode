class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> AL=new ArrayList<Integer>();
        int sum=0;
        while(num>0)
        {
            AL.add(num%10);
            num=num/10;

        }
        for(int i=AL.size()-1;i>=0;i--)
        {
            if(AL.get(i)==6)
            {
                AL.set(i,9);
                break;
            }
        }
        for(int i=AL.size()-1;i>=0;i--)
        {
            sum+=AL.get(i)*Math.pow(10,i);
            System.out.println(sum);
        }
        
        return sum;
    }
}





