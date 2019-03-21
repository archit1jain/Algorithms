import java.util.*;
public class doorBreaking {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        for(int i =0;i<n;i++){
            if(sc.nextInt()<=x) count++;
        }
        if(x>y) System.out.println(n);
        else{
            System.out.println((count+1)/2);
        }   
    }
}
