import java.util.*;
public class gameStringa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count =0;
        String s = sc.nextLine();
        Stack<Integer> st = new Stack<>();
        int l = s.length();
        for(int i =0;i<l;i++){
            if(!st.isEmpty() && (int)st.peek()==(int)s.charAt(i)){
                st.pop();
                count++;
            }
            else
                st.push((int)s.charAt(i));
          
        }
        if(count%2==0) System.out.println("No");
        else System.out.println("Yes");
    }
}
