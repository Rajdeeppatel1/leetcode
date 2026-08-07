class Solution {
    public int findClosest(int x, int y, int z) {
 int ans=0;
               if (Math.abs(x-z)>Math.abs(y-z)){
        ans=2;
        
        }
        if(Math.abs(x-z)<Math.abs(y-z)){
         ans=1;
        
        }
        if(Math.abs(x-z)==Math.abs(y-z)){     
               ans=0;
        
        }
        
       return ans;
        
    }
}