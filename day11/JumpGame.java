class Solution {
    public boolean canJump(int[] nums) {
        //we need to find the absolute best way currently to reach the final answer that is we will apply greedy algorithm
        int maxreach=0;
        for(int i=0;i<nums.length;i++){
            if(maxreach<i){
                return false;
            }
            maxreach=Math.max(maxreach,nums[i]+i);

        }
        return true;
    }
}
