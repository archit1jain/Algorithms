import java.util.*;
/*
implementing hashmap using linked list
 */
/**
 *
 * @author Archit
 */
public class hashmap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> obj[]=new LinkedList[n];
        int m = sc.nextInt();
        if(obj[m%n]==null)obj[m%n]=new LinkedList<>();
        obj[m%n].add(1);
        System.out.println(obj[m%n].getFirst());
    }
}
