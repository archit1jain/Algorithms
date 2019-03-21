import java.util.*;
import java.io.*;
public class digitSequence {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0){
            int l = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            if(l==2){
                if(Integer.parseInt(s.substring(0,1))<Integer.parseInt(s.substring(1))){
                    System.out.println("YES");
                    System.out.println(2);
                    System.out.println(s.charAt(0)+" " + s.charAt(1));
                }
                else
                    System.out.println("NO");
            }
            else{
                    System.out.println("YES");
                    System.out.println(2);
                    System.out.println(s.charAt(0)+" " + s.substring(1));
            }
            t--;
        }
    }
}
