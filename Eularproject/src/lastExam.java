import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
public class lastExam {
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      BigInteger c;
      BigInteger[] a = new BigInteger[n];
      
      a[n-1]=sc.nextBigInteger();
      a[0] = BigInteger.ZERO;
      int l=0,r=n-1;
      for(int i =1;i<n/2;i++){
          c=sc.nextBigInteger();
          if(a[r].compareTo(c) < 0){
              if((c.subtract(a[r])).compareTo(a[l]) >=0){
                  a[r-1]=a[r];
                  a[l+1]=c.subtract(a[r]);
              }
              else{
              a[l+1]=(a[l]).add(BigInteger.ONE);
              a[r-1]=c.subtract(a[l+1]);    
              }
              
          }
          else{
              a[l+1]=a[l];
              a[r-1]=c.subtract(a[l+1]);
          }
          l++;
          r--;
      }
      for(int i =0;i<n;i++)
      System.out.print(a[i]+" ");
      
  }  
}
