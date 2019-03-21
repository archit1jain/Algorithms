/*
import java.util.*;
/**
*
* @author Archit

public class gridway {
    static int m;
    static int n;
    static int dp[][];
    
    public static int go(int i,int j){
        if(i==n-1 && j==n-1) return 0;
        if(dp[i][j]!=0)return dp[i][j];
        dp[i][j] = 1;
        if(i<n-1 && j<n-1)
            dp[i][j] = go(i+1,j)+go(i,j+1);
        else if(i==n-1)
            dp[i][j] = 1;
        else if(j==n-1)
            dp[i][j] = 1;
        return dp[i][j];
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n][n];
        System.out.println(go(0,0));
        
    }
}*/
/**
 *
 * @author Archit
 */
public class gridway {
    static int m;
    static int n;
    static long dp[][];
    
    public static long go(int i,int j){
        if(i==n-1 && j==m-1) return 1;
        if(dp[i][j]!=0)return dp[i][j];
        dp[i][j] = 1;
        if(i<n-1 && j<m-1)
        dp[i][j] = (go(i+1,j)+go(i,j+1))%1000000007;
        else if(i==n-1)
            dp[i][j] = 1;
        else if(j==m-1)
            dp[i][j] = 1;
        return dp[i][j]%1000000007;
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
        n = sc.nextInt();
        m = sc.nextInt();
        dp = new long[n][m];
        System.out.println(go(0,0));
        
            t--;
        }
    }
}
