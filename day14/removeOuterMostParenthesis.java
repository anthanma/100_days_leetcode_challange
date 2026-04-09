class Solution {
    public String removeOuterParentheses(String s) {
        int depth =0;
        StringBuilder sb= new StringBuilder();
        List<String> st= new ArrayList<>();
        for(int i=0 ; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                if(depth>0){
                    sb.append(c);
                }
                depth++;
            }
            if(c==')'){
                depth--;
                if(depth>0){
                    sb.append(c);
                }

            }

        }
        return sb.toString();
    }
}
