import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        int kid = 0;
        int cookie = 0;
        int count = 0;
        
        while (kid < g.length && cookie < s.length) {
            
            if (s[cookie] >= g[kid]) {
                count++;       
                kid++;        
                cookie++;      
            } else {
                
                cookie++;
            }
        }
        
        return count;
    }
}
