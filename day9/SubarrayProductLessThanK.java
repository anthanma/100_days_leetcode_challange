class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        int product=1;
        int mover=0;
        // for edge case where k=0
        if(k<=1){
            return 0;
        }
        // applying sliding window to this question
        for(int i=0;i<nums.length;i++){
            product=product*nums[i];
            while(product>=k && mover<=i){
                product=product/nums[mover];
                mover++;
            }
            count=count +(i-mover+1);// this counts every combination fo subarray present inside the window 
            
        }
        return count;
    }
}
