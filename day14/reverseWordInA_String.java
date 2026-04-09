class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        int i=s.length()-1;
        int right=s.length()-1;
        //2 things we have to keep in mind
        //skip the extra spaces 
        //add the words from descending order that means adding words form last to first

        while(i>=0){
            //skipping all the spaces  
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            //case for if i goes beyond the string indexing 
            if(i<0){
                break;
            }
            
            right=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            // adding space before appending word 
            if(sb.length()>0){
                sb.append(' ');
            }
            sb.append(s.substring(i+1,right+1)); // we did i+1 because our i will be on space and we did right+1 becaues our substring() function excludes the end range index 
        }
        return sb.toString();
        

    }
}
