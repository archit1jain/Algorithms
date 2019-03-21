import java.util.*;
public class tomRiddle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();sc.nextLine();
        List<String> l = new ArrayList<>();
        for(int i =0;i<n;i++){
            String s = sc.nextLine();
            if(l.contains(s)) System.out.println("YES");
            else{System.out.println("NO");l.add(s);}
        }
    }
}
