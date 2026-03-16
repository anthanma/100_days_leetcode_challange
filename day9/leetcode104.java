class Solution {
    public long countSubarrays(int[] nums, long k) {
        long count=0;
        int  mover=0;
        long score=1;
        long sum=0;


        for(int  i=0;i<nums.length;i++){
            sum=sum+(long)nums[i];
            score=sum*(i-mover+1);
            while(score>=k){
                sum=sum-(long)nums[mover];
                mover++;
                score=sum*(i-mover+1);
            }
            count=count +(i-mover+1);
        }
        return count;
    }
}
