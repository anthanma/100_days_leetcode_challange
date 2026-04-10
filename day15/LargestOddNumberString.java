class Solution {
    public String largestOddNumber(String num) {
        //we have to return te largest odd integer from the integer string
        int left=0; 
        for( int i=num.length()-1; i>=0;i--){
            char c=num.charAt(i);
            if (c=='1' || c=='3' || c=='5' || c=='7' || c=='9'){
                return num.substring(left,i+1);
            }
        }
        return "";
    }
}
