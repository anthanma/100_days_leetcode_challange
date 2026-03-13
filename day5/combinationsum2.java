class Solution {
    //answer from me 
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        fun(ans,temp,candidates,target,0,0);
        return ans;
    }
    public void fun(List<List<Integer>> ans ,List<Integer> temp,int [] arr,int target, int i,int currentsum ){
        // base case
        if(currentsum>target || i>=arr.length){
            return;
        }
        if(currentsum==target){
            ans.add(new ArrayList<>(temp));
            return;
        }
        //recursive step
        //pick
        temp.add(arr[i]);
        fun(ans,temp,arr,target,i,currentsum+arr[i]);
        
        //not pick
        temp.remove(temp.size()-1);
        fun(ans,temp,arr,target,i+1,currentsum);


    }
}
//ans from striver
/*class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        
        fun(ans,candidates,target,new ArrayList<>(),0);
        return ans;
    }
    public void fun(List<List<Integer>> ans,int [] nums,int target,List<Integer> temp,int i){
        //base case 
        if(i>=nums.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }
        // recursive step
        //pick
        if(target>=nums[i]){
            temp.add(nums[i]);
            fun(ans,nums,target-nums[i],temp,i);
        //not picking 
             temp.remove(temp.size()-1);
        }
        fun(ans,nums,target,temp,i+1);
    }
}*/
