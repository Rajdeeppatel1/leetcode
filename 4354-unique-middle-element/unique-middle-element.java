class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int half=(nums.length-1)/2;
        int count=0;
        for (int i=0;i<nums.length;i++){
       if (nums[half] ==nums[i]){
        count ++;
       }
       
       }
        
    if (count >=2)
    {
        return false;
    }
    else {
        return true;
    }
    }}
