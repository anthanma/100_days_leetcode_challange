class Solution {
    public int jump(int[] nums) {
        int maxreach=0;
        int currentreach=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            maxreach=Math.max(maxreach,nums[i]+i);
            if(currentreach==i && i<nums.length-1 ){
                currentreach=maxreach;
                count++;
                 
            }
        }
        return count;
    }
}
