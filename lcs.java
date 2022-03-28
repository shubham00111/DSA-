
public static int lcs(String str1, String str2) {
		int n=str1.length(), m=str2.length();
        int dp[][]=new int[n+1][m+1];
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                    
                }
                else{
                    dp[i][j]=0;
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                ans=Math.max(ans,dp[i][j]);
            }
        }
        return ans;
}