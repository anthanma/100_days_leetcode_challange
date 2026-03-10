class Solution {
    // Iterrative approach
    //while recursion and recursion + memo is a top to down approach this method is completely opposite we start at the very bottom and move out way to top
    public int fib(int n){
        if(n<=1){
            return n;
        }
        int [] dp= new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }


//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // // declaring the array to store fib(i) outside the function so that the array doesnt get renewed again and again
    // Integer [] memo =new Integer[31];
    // public int fib(int n) {
    //     //Dynamic programming approach
    //     //we need an  array to store the values at each instance of n so that we dont have to calculate the same value again and again
    //     // array is created outside the function
    //     if(n<=1){
    //         return n;
    //     }
    //     if(memo[n]!=null){
    //         return memo[n];
    //     }
    //     int ans= fib(n-1)+ fib(n-2);
    //     memo[n]=ans;
    //     return ans;
    // }

    //___________________________________________________________________________________________
    //  RECURSIVE APPROACH
     // public int fib(int n) {
    //     // base case 
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     return fib(n-2) + fib(n-1);
    // }
}
