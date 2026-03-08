//longest substring without repeating  characters in java leetcode 3
import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
         char [] arr=s.toCharArray();
         Set <Character> set = new HashSet<>();
         int left=0;
         int maxLen=0;
         //need a part of code that checks dupliate elements in the Array by using hashset
         for(int right=0; right<arr.length;right++){
            while(set.contains(arr[right])){
                set.remove(arr[left]);
                left ++; 
            }
            set.add(arr[right]);
            maxLen=Math.max(maxLen,right-left+1);
         }
         return maxLen;
    }
}
