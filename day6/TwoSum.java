class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> store = new HashMap<>();
        int y=-1;
        for(int i=0;i<nums.length;i++){
            y=target-nums[i];
            if(store.containsKey(y)){
                return new int [] {i,store.get(y)};
            }
            else{
                store.put(nums[i],i);
            }
        }
        return new int [] {-1,-1};

    }
}
