import java.util.*;
/**
 *
 * @author Archit
 */
public class cake {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n+1][2];
        for(int i =1;i<=2*n;i++){
            int key = sc.nextInt();
            if(a[key][0]==0)a[key][0] = i;
            else a[key][1]=i;
        }
        long sum = 0;
        int pos1=1,pos2=1;
        for(int i =1;i<=n;i++){
            int d1 = Math.abs(pos1-a[i][0]);
            int d2 = Math.abs(pos1-a[i][1]);
            int d3 = Math.abs(pos2-a[i][0]);
            int d4 = Math.abs(pos2-a[i][1]);
            int j,k;
            if(d1>d2)j=1;
            else j=0;
            if(d3>d4)k=1;
            else k=0;
            if(k==j){
                if(k==0){
                    if(d1>d3){
                        sum+=d3;
                        pos2=a[i][0];
                        sum+=d2;
                        pos1=a[i][1];
                    }
                    else{
                        sum+=d1;
                        pos1=a[i][0];
                        sum+=d4;
                        pos2=a[i][1];
                        
                    }
                }
                else{
                    if(d2>d4){
                        sum+=d4;
                        pos2=a[i][0];
                        sum+=d1;
                        pos1=a[i][1];
                    }
                    else{
                        sum+=d2;
                        pos2=a[i][0];
                        sum+=d3;
                        pos1=a[i][1];
                        
                    }
                    
                }
            }
            else{
                sum+=Math.abs(pos1-a[i][j])+Math.abs(pos2-a[i][k]);
                pos1 = a[i][j];pos2=a[i][k];
            }
            System.out.println(pos1+" "+pos2+" " +sum);
            
        }
        System.out.println(sum);
    }
}
