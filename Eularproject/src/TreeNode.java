
import java.util.LinkedList;
import java.util.Queue;
public class TreeNode<E>{
        E data;
        private TreeNode<E> par;
        private TreeNode<E> leftchild;
        private TreeNode<E> rightchild;
        public TreeNode(E val,TreeNode<E> par){
            this.data = val;
            this.par = par;
            this.leftchild = null;  
            this.rightchild = null;
        }
        public TreeNode<E> addleft(E val){
            this.leftchild = new TreeNode<E>(val,this);
            return this.leftchild;
        }
        
        public TreeNode<E> addright(E val){
            this.rightchild = new TreeNode<E>(val,this);
            return this.leftchild;
        }
        public void levelorder(){
            Queue <TreeNode <E>> q = new LinkedList<>();
            q.add(this);
            while(!q.isEmpty()){
                TreeNode<E> cur = q.remove();
                if(cur!=null){
                    System.out.print(cur.data);
                    q.add(cur.leftchild);
                    q.add(cur.rightchild);
                }
            }
            
        }
        public void preorder(){
            if(this==null) return;
            System.out.print(this.data);
            if(this.leftchild!=null)
            this.leftchild.preorder();
            if(this.rightchild!=null)
            this.rightchild.preorder();
        }
}