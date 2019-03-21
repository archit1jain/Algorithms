import java.util.*;
public class triangular {
    static int countDivisors(int n) 
    { 
        int cnt = 0; 
        for (int i = 1; i <= Math.sqrt(n); i++) 
        { 
            if (n % i == 0) { 
                if (n / i == i) 
                    cnt++; 
                else  
                    cnt = cnt + 2; 
            } 
        } 
        return cnt; 
    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int i =1;
        int j =1;
        
        while(countDivisors(j) < n){
            i++;
            j = (i*(i+1))/2;
        }
        System.out.println(j);
        
    }
}
