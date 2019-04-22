import java.util.*;
public class codejam2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j =1;
        while(n!=0){
            long l = sc.nextLong();sc.nextLine();
            String s = sc.nextLine().trim();
            StringBuilder s1=new StringBuilder();
            for(int i =0;i<2*l-2;i++){
                if(s.charAt(i)=='E')s1.append("S");
                else s1.append("E");
            }
            System.out.println("Case #"+j+": "+s1);
            n--;j++;
        }
    }
}
