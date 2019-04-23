class A {
    A(){
       System.out.println("A1");
   }
   A(int i){
       System.out.println(i);
   } 
}
class B extends A{
    B(){
       System.out.println("Hell");
       this.super();
   }
}
public class C{
    public static void main(String[] args){
       B b = new B();
   }
}
