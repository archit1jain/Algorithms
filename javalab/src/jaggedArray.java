import java.util.*;
public class jaggedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][];
        int n;
        int count =0;
        for(int i =0;i<4;i++){
            System.out.println("Enter number of slow learners in "+ (i+1) + "th batch: ");
            n = sc.nextInt();
            if(n%4==0){
                a[i] = new int[n/4];
                for(int j =0;j<a[i].length;j++)
                    a[i][j]=4;
                count+=n/4;
            }
                
            else{
                a[i] = new int[(n/4)+1];
                for(int j =0;j<a[i].length-1;j++)
                    a[i][j]=4;
                a[i][a[i].length-1]=n%4;
                count+=n/4;
            }
        }
        for(int[] i: a){
            System.out.println(Arrays.toString(i));
            System.out.println("Number of tutors required in this batch: " + i.length);
        }
            
        System.out.println("Total number of batches having exactly 4 students: "+count);
            
    }
}
