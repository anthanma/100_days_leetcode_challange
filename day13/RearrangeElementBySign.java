class Solution {
    public int[] rearrangeArray(int[] nums) {
        //OPTIMAL APPROACH (SAME AS MY APPROACH BUT MIDDLE STEP IS SKIPPED COMLETELY)
        int x=0;
        int y=1;
        int [] ans=new int [nums.length];
        for(int n:nums){
            if(n<0){
                ans[y]=n;
                y+=2;
            }
            else{
                ans[x]=n;
                x+=2;
            }
        }
        return ans;
        
    }
}
/*
MY APROACH
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] pos= new int [nums.length/2];
        int [] neg=new int [nums.length/2];
        int x=0;
        int y=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                neg[x]=nums[i];
                x++;
            }
            else{
                pos[y]=nums[i];
                y++;
            }
        }
        // updating the value of nums
        nums[0]=pos[0];
        x=0;
        y=1;
        for( int i=1 ;i<nums.length;i++){
            if(!(i%2==0)){
                nums[i]=neg[x];
                x++;
            }
            else{
                nums[i]=pos[y];
                y++;
            }
        }
        return nums;
    }
}
*/
