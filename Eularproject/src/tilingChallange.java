
/**
 *
 * @author Archit
 */
import java.util.*;
public class tilingChallange {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        sc.nextLine();
        for(int i =0;i<n;i++){
            String s = sc.nextLine().trim();
            for(int j =0;j<n;j++){
                if(s.charAt(j)=='#')a[i][j]=1;
                else a[i][j]=0;
            }
        }
        for(int i =1;i<n-1;i++){
            for(int j =1;j<n-1;j++){
                if(a[i][j]==0){
                    if(a[i-1][j]==0 && a[i+1][j]==0 && a[i][j+1]==0 && a[i][j-1]==0){
                        a[i-1][j]=a[i+1][j]=a[i][j-1]=a[i][j+1]=a[i][j]=1;
                    }
                }
            }
        }
        for(int i =0;i<n;i++)
            for(int j =0;j<n;j++){
                if(a[i][j]==0){System.out.println("NO");return;}
            }
        System.out.println("YES");
    }
}
