import java.util.*;
public class campOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int d = sc.nextInt();
            int[] d1 = new int[d];
            int[] p1 = new int[d];
            for(int i =0;i<d;i++){
                d1[i]=sc.nextInt();
                p1[i]=sc.nextInt();
            }
            int q = sc.nextInt();
            int[] dead = new int[q];
            int[] req = new int[q];
            for(int i =0;i<q;i++){
                dead[i]=sc.nextInt();
                req[i]=sc.nextInt();
            }
            for(int i =0;i<q;i++){
                int j=0,sum =0;
                while(d1[j]<dead[i]){
                    sum+=p1[j];
                    j++;
                    
                }
                if(sum>=req[i]) System.out.println("Go Camp");
                else System.out.println("Go Sleep");
            }
            
            
            
            
            t--;
        }
    }
}
