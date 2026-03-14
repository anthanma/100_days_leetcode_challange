class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        // we can use numbers from 1-9 once then we will create an array that contains number 1-9
        int [] nums = new int[9];
        //inserting number 1-9 in nums
        for(int i=1;i<=nums.length;i++){
            nums[i-1]=i;
        }
        fun(ans,k,n,nums,new ArrayList<>(),0);

        return ans;
    }

    
    public void fun(List<List<Integer>> ans,int k,int n,int [] nums,List<Integer> temp,int i){
        //base case 
        if(n==0 && temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
         }
        if(i==nums.length || n<nums[i]){
            return;
        }
        if(temp.size()>k){
            return;
        }

        //recursive step
        //pick 
        temp.add(nums[i]);
        fun(ans,k,n-nums[i],nums,temp,i+1);
        //not pick
        temp.remove(temp.size()-1);
        fun(ans,k,n,nums,temp,i+1);
    }
}
