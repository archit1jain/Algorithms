import java.util.*;
public class squareSegment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = (int)Math.sqrt(n);
        int j =i;
        if(j*i>=n){
            System.out.println(j+i);
            return;
        }
            
        else if((j+1)*i>=n){
            System.out.println(j+i+1);
            return;    
        }
        else{
            System.out.println(2*(i+1));
        }
    }
}
