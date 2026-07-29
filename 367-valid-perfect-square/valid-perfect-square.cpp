class Solution {
public:
    bool isPerfectSquare(int num) {
      int count=0;
      if(num==1){
        return true ;
      }else{
            for(long int j=0;j<=num/2;j++){
                if(j*j==num){
                   count++;
                }
            }
         if(count>0){
                    return true;
                }
                else{
                    return false;
                }
      }
                return{} ;
        
    }
};