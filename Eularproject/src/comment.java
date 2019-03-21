import java.util.*;
/**
 *
 * @author Archit
 */
public class comment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of comments: ");
        int n = sc.nextInt();sc.nextLine();
        TreeSet<String> set = new TreeSet<>();
        for(int i =0;i<n;i++){
            System.out.println("Enter comment : " );
            String comment = sc.nextLine();
            set.add(comment);
        }
        System.out.println(set);
    }
}
