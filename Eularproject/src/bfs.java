import java.util.*;
public class bfs {
 
    public static void main(String[] args){
        TreeNode<Integer> root = new TreeNode<>(2,null);
        TreeNode left  = root.addleft(1);
        TreeNode right = root.addright(3);
        TreeNode left1 = left.addleft(2);
        TreeNode right1 = left.addright(4);
        root.levelorder();
        System.out.println();
        root.preorder();
    }
}
