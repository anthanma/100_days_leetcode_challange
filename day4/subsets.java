class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(nums , ans, 0 , temp);
        return ans;
    }
    public void fun(int [] nums ,List<List<Integer>> ans,int i,List<Integer> temp ){
        if(i>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //takeing number at current index\
        temp.add(nums[i]);
        fun(nums,ans,i+1,temp);

        // not taking a number at current index
        temp.remove(temp.size()-1); // since we are not taking the number at current index that means the last number added to the temp list was the number at current index so we will just remove the last element 
        fun(nums,ans,i+1,temp);
    }
}
