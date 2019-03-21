import java.util.*;
public class splittingIntoDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=9){
            System.out.println(1);
            System.out.println(n);
        }
        else{
            int i;
            for(i =9;i>=1;i--){
                if(n%i==0){
                    n = n/i;
                    break;
                }
            }
            System.out.println(n);
            for(int j =0;j<n;j++) System.out.print(i+ " ");
        }
    }
}
