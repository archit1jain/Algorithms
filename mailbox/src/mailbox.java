import java.util.LinkedList;
import java.util.List;
/**
* Sendr Class.
*/
class Sendr implements Runnable {
 public List<String> message;
 private List<Integer> sharedQueue;
 private int maxSize=4; //maximum number of products which sharedQueue can hold at a time.
 int productionSize=5; //Total no of items to be sendd by each sendr
 int sendrNo;
 
 public Sendr(List<String> message,List<Integer> sharedQueue, int sendrNo) {
     this.sharedQueue = sharedQueue;
     this.sendrNo = sendrNo;
     this.message = message;
 }

 @Override
 public void run() {
     for (int i = 1; i <= productionSize; i++) { //send products.
         try {
             send(i);
         } catch (InterruptedException e) {  e.printStackTrace(); }
     }
}

 private void send(int i) throws InterruptedException {
  
    synchronized (sharedQueue) {
       //if sharedQuey is full wait until reciever recieves.
       while (sharedQueue.size() == maxSize) {
             System.out.println(Thread.currentThread().getName()+", Queue is full, sendrThread is waiting for "
                    + "recieverThread to recieve, sharedQueue's size= "+maxSize);
             sharedQueue.wait();
         }

       //Bcz each sendr must send unique product
             //Ex= sendr0 will send 1-5  and sendr1 will send 6-10 in random order
       int senddItem = (productionSize*sendrNo)+ i;  
       
       System.out.println(Thread.currentThread().getName() +" Sendd : " + message.get(senddItem));
       sharedQueue.add(senddItem);
         Thread.sleep((long)(Math.random() * 1000));
         sharedQueue.notify();
     }
 }
}

/**
* Reciever Class.
*/
class Reciever implements Runnable {
    public List<String> message;
    private List<Integer> sharedQueue;
 public Reciever(List<String> message,List<Integer> sharedQueue) {
     this.sharedQueue = sharedQueue;
     this.message=message;
 }
 
    @Override
 public void run() {
     while (true) {
         try {
             recieve();
             Thread.sleep(100);
         } catch (InterruptedException e) {  e.printStackTrace(); }
     }
 }

 private void recieve() throws InterruptedException {
   
    synchronized (sharedQueue) {
       //if sharedQuey is empty wait until sendr sends.
       while (sharedQueue.size() == 0) {
           System.out.println(Thread.currentThread().getName()+", Queue is empty, recieverThread is waiting for "
                           + "sendrThread to send, sharedQueue's size= 0");
             sharedQueue.wait();
         }

       Thread.sleep((long)(Math.random() * 2000));
         System.out.println(Thread.currentThread().getName()+", RECIEVED : "+ message.get(sharedQueue.remove(0)));
         sharedQueue.notify();
     }
 }
 
}

public class mailbox {
 public static void main(String args[]) {
  List<String> message = new LinkedList<String>();
  message.add("How");
  message.add("are");
  message.add("you");
  message.add("?");
  message.add("I");
  message.add("am");
  message.add("fine");
  message.add("My"); 
  message.add("Name");
  message.add("is"); 
  message.add("Archit"); 
  List<Integer> sharedQueue = new LinkedList<Integer>(); //Creating shared object
  Sendr sendr0=new Sendr(message,sharedQueue, 0);
  Reciever reciever0=new Reciever(message,sharedQueue);
     Thread sendrThread0 = new Thread(sendr0, "SendrThread0");
     Thread recieverThread0 = new Thread(reciever0, "RecieverThread0");
     sendrThread0.start();
     recieverThread0.start();
     System.out.println("MID");
  Sendr sendr1=new Sendr(message,sharedQueue, 1);
  Reciever reciever1=new Reciever(message,sharedQueue);
     Thread sendrThread1 = new Thread(sendr1, "SendrThread1");
     Thread recieverThread1 = new Thread(reciever1, "RecieverThread1");
     sendrThread1.start();
     recieverThread1.start();
 }
}
