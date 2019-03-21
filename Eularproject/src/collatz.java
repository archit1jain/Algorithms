import java.util.*;
public class collatz {
    public static void main(String[] args){
        long n = 1000000;
        int count =0;
        int max=0;
        long max1=1;
        while(n>2){
         long n1 =n;
         while(n1!=1){
            if(n1%2==0)n1/=2;
            else n1 = 3*n1+1;
            count++;
        }
         if(count>max) {
             max = count;
             max1 = n;
         }
        count=0;
        n--;
        }
        System.out.println(max1);
        System.out.println(max);
        
    }
}
