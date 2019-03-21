package test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l1 = new ArrayList<>();
        l1.add(2);
        int i,j=3;
        int count =0;
        while(l1.size()!=n){
           for(i=0;i<l1.size();i++){
               if(j%l1.get(i)==0){
                   count++;
                   break;
               }
           }
           if(count==0)
               l1.add(j);
           j++;
           count =0;
        }
        int b;
        b = Collections.max(l1);
        System.out.println(b);   
    }
}
