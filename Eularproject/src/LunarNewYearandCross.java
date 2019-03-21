import java.util.*;
public class LunarNewYearandCross {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<3) {System.out.println(3);return;}
        sc.nextLine();
        String[] s = new String[n];
        int count =0;
        for(int i =0;i<n;i++)
            s[i]=sc.nextLine();
        for(int i =1;i<n-1;i++){
            for(int j = 1;j<n-1;j++){
                if(s[i].charAt(j)=='X' && s[i-1].charAt(j-1)=='X' && s[i-1].charAt(j+1)=='X' && s[i+1].charAt(j-1)=='X' && s[i+1].charAt(j+1)=='X')
                    count++;
            }
        }
        System.out.println(count);
        
    }
}
