class Solution {
    public boolean containsDuplicate(int[] nums) {
        int count =0;
        boolean ans=false;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if (nums[i]==nums[i+1]){
                count++;
            }
        }
        if (count>0){
    ans=true;
        }
        else{
            ans= false;
        }
        return ans;

        
        
    }
}