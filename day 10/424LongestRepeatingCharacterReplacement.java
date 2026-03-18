class Solution {
    public int characterReplacement(String s, int k) {
        int maxLen=0;
        int mover=0;
        int maxfreq=0;
        //array for counting the frequency of characters
        int [] arr= new int [26];
        
        for(int i=0;i<s.length() ;i++){
            arr[s.charAt(i)-'A']+=1; // counting the frequency of the charater at ith index
            maxfreq=Math.max(maxfreq,arr[s.charAt(i)-'A']);
            while((i-mover+1)-maxfreq>k && mover<=i){
                arr[s.charAt(mover)-'A']-=1;
                mover++;
            }
            maxLen=Math.max(maxLen, i-mover+1);
        }
        return maxLen;

    }
}
