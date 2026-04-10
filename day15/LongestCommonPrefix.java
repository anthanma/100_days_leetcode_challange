class Solution {
    public String longestCommonPrefix(String[] strs) {
        for( int i=0 ; i<strs[0].length() ;i++){
            char c=strs[0].charAt(i);
            for(int j=0;j<strs.length ; j++){

                if(strs[j].length()==i ||   strs[j].charAt(i)!=c){
                    return strs[0].substring(0,i); // we didnt returned i+1 because our i will be one index ahead of the desired index by this point 
                }
            }

        }
        return strs[0]; // if out entire loop is finished then that means all the string int the array are same so we just return the first string 
    }
}
