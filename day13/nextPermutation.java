class Solution {
    public void nextPermutation(int[] nums) {
        //the next premutation of a number means the smallest number greater than our current number by arranging the digits of the current number 
        //we need 2 helper function for this first is swap and second is reverse because in question it is told if you cannot find the next permutation return the smallest permutation number 
        int a=-1;
        int b=-1;
        for( int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                a=i;
                break;
            }
        }
        if(a!=-1){
            for(int j=nums.length-1;j>=0;j--){
            if(nums[j]>nums[a]){
                b=j;
                break;
            }
        }
        }
        if(a!=-1 && b!=-1){
            swap(nums,a,b);
        }
        reverse(nums,a+1,nums.length-1);

    }
    //helper swap function 
        public void swap(int [] arr, int a, int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        //helper reverse function 
        public void reverse(int [] arr ,int left, int right){
            while(left<right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }
}
