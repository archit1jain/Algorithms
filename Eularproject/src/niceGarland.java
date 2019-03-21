import java.util.*;
public class niceGarland {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        sc.nextLine();
        int[] a = new int[6];
        String s = sc.nextLine();
        String[] str = {"RGB","RBG","BRG","BGR","GBR","GRB"};
        
        for(int i =0;i<l;i++){
            for(int j =0;j<6;j++){
                if(s.charAt(i)!=str[j].charAt(i%3))
                    a[j]++;
                
            }
            
            
        }
        
        int d=0;
        for(int i =0;i<6;i++)
            if(min>a[i]){
                min = a[i];
                d = i;
            }
        System.out.println(min);
        for(int i =0;i<l;i++){
            System.out.print(str[d].charAt(i%3));
        }
    }
}
