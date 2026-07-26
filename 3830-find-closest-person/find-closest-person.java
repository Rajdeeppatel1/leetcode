class Solution {
    public int findClosest(int x, int y, int z) {
        int k=0;
        if (Math.abs(x-z)>Math.abs(y-z)){
            k=2;
        
        }
        if(Math.abs(x-z)<Math.abs(y-z)){
           k=1;
        }
        if(Math.abs(x-z)==Math.abs(y-z)){
          k=0;
        }
        return k;
       
        
    }
}