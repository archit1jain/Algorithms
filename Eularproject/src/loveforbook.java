import java.io.InputStreamReader;
import java.util.*; 
public class  loveforbook 
{ 
    private static String lcs(String X, String Y, int m, int n) 
    { 
        InputStreamReader bf = new InputStreamReader(System.in);
        int[][] L = new int[m+1][n+1]; 
        for (int i=0; i<=m; i++) 
        { 
            for (int j=0; j<=n; j++) 
            { 
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
                else if (X.charAt(i-1) == Y.charAt(j-1)) 
                    L[i][j] = L[i-1][j-1] + 1; 
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
            } 
        } 
        int index = L[m][n]; 
        int temp = index; 
        char[] lcs = new char[index+1]; 
        lcs[index] = ' ';
        int i = m, j = n; 
        while (i > 0 && j > 0) 
        { 
            if (X.charAt(i-1) == Y.charAt(j-1)) 
            {  lcs[index-1] = X.charAt(i-1);  
                i--;j--;index--;      
            } 
            else if (L[i-1][j] > L[i][j-1]) 
                i--; 
            else
                j--; 
        } 
        return new String(lcs);
    } 
      
    // driver program 
    public static void main (String[] args)  
    { 
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
        String s3 = sc.nextLine().trim();
        int m = s1.length(); 
        int n = s2.length(); 
        int l = s3.length();
        String d = lcs(s1,s2,m,n);
        int o = d.length();
        System.out.println(lcs(d, s3, o, l)); 
    } 
} 