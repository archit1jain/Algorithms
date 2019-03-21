package algorithms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class normal_search {
   public static int binarysearch(int[] n,int high,int low, int b){
       if(high>=low){
       int mid = (high+low-1)/2;
       if(b==n[mid])
           return mid;
       if(b>n[mid])
           return binarysearch(n,mid-1,low,b);
       return binarysearch(n,high,mid+1,b);
       }
       return -1;
   }
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. od elements in array: ");
        int a = sc.nextInt();
        int n[] = new int[a];
        System.out.println("enter the array elements");
        for(int i =0;i<a;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("\nenter the element you want to search\n");
        int b = sc.nextInt();
        normal_search obj = new normal_search();
        
        int high = n.length;
        int low = 0;
        int result = obj.binarysearch(n,high,low,b);
        if(result != -1)
            System.out.println("No. found");
        else
            System.out.println("No. not found");
    }
    
}
