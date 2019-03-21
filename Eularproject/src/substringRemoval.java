import java.util.*;
public class substringRemoval { 
  
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        long count1=0,count2=0;
        for(int i=0;i<n;i++){
            if(str.charAt(0)==str.charAt(i)){
                ++count1;
            }
            else
                break;
        }
            for(int j=n-1;j>=0;j--){
            if(str.charAt(n-1)==str.charAt(j)){
                ++count2;
            }
            else
                break;
        }
         if(str.charAt(0)==str.charAt(n-1))
             System.out.println(((count1+1)*(count2+1))%998244353);
         else
            System.out.println(count1+count2+1);
    } 
}
