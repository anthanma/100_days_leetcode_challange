class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();

        fun(candidates, ans, new ArrayList<>(), target, 0);

        return ans;
    }

    public void fun(int[] arr, List<List<Integer>> ans,
                    List<Integer> temp, int target, int i) {

        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(i >= arr.length || target < 0)
            return;

        // pick
        temp.add(arr[i]);
        fun(arr, ans, temp, target - arr[i], i + 1);
        temp.remove(temp.size() - 1);

        // skip duplicates
        while(i < arr.length - 1 && arr[i] == arr[i + 1])
            i++;

        // not pick
        fun(arr, ans, temp, target, i + 1);
    }
}
