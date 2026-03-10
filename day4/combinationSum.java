class Solution {
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
