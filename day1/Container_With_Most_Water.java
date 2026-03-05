import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int max_area=0;
        int l=0;
        int r=height.length-1;
        while(l<r){
             if(max_area<Math.min(height[l],height[r])*(r-l)){
                max_area=Math.min(height[l],height[r])*(r-l);
            }
            //moving the smaller height to next index while keeping the larget height to cover all possibilities
            //because moving the taller one can never increase the area if the width is shrinking
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return max_area;

    }
}
