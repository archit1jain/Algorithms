class Ins{
    synchronized public void classa(String f){
    for(int i =1;i<10;i++){
        System.out.println(i+f);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
       }
    }
    public void exam(){
        System.out.println("s");
    }
}
class MyThread extends Thread{
    Ins ins;
    String f;
    MyThread(Ins ins,String f){
        this.ins=ins;
        this.f=f;
    }
    @Override
    public void run(){
        ins.classa(f);
    }
}

public class Test {
    public static void main(String[] args){
        Ins ins = new Ins();
        MyThread mt1 = new MyThread(ins,"j");
        MyThread mt2 = new MyThread(ins,"x");
        mt1.start();
        mt2.start();
        ins.exam();
    }
    
}
