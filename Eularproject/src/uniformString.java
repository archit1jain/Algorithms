import java.util.*;
public class uniformString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            int n = sc.nextInt();
            int k= sc.nextInt();
            while(n>0){
             for(int j =0;j<k && n!=0;j++){
                System.out.print((char)(97+j));
                n--;
            }   
            }
            System.out.println();
            
        }
        
    }
}
