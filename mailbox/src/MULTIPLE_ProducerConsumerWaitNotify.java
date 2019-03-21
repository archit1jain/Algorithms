import java.util.LinkedList;
import java.util.List;


/**
* Producer Class.
*/

class Producer implements Runnable {
 public List<String> message;
 private List<Integer> sharedQueue;
 private int maxSize=4; //maximum number of products which sharedQueue can hold at a time.
 int productionSize=5; //Total no of items to be produced by each producer
 int producerNo;
 
 public Producer(List<String> message,List<Integer> sharedQueue, int producerNo) {
     this.sharedQueue = sharedQueue;
     this.producerNo = producerNo;
     this.message = message;
 }

 @Override
 public void run() {
     for (int i = 1; i <= productionSize; i++) { //produce products.
         try {
             produce(i);
         } catch (InterruptedException e) {  e.printStackTrace(); }
     }
}

 private void produce(int i) throws InterruptedException {
  
    synchronized (sharedQueue) {
       //if sharedQuey is full wait until consumer consumes.
       while (sharedQueue.size() == maxSize) {
             System.out.println(Thread.currentThread().getName()+", Queue is full, producerThread is waiting for "
                    + "consumerThread to consume, sharedQueue's size= "+maxSize);
             sharedQueue.wait();
         }

       //Bcz each producer must produce unique product
             //Ex= producer0 will produce 1-5  and producer1 will produce 6-10 in random order
       int producedItem = (productionSize*producerNo)+ i;  
       
       System.out.println(Thread.currentThread().getName() +" Produced : " + message.get(producedItem));
       sharedQueue.add(producedItem);
         Thread.sleep((long)(Math.random() * 1000));
         sharedQueue.notify();
     }
 }
}

/**
* Consumer Class.
*/
class Consumer implements Runnable {
    public List<String> message;
    private List<Integer> sharedQueue;
 public Consumer(List<String> message,List<Integer> sharedQueue) {
     this.sharedQueue = sharedQueue;
     this.message=message;
 }
 
    @Override
 public void run() {
     while (true) {
         try {
             consume();
             Thread.sleep(100);
         } catch (InterruptedException e) {  e.printStackTrace(); }
     }
 }

 private void consume() throws InterruptedException {
   
    synchronized (sharedQueue) {
       //if sharedQuey is empty wait until producer produces.
       while (sharedQueue.size() == 0) {
           System.out.println(Thread.currentThread().getName()+", Queue is empty, consumerThread is waiting for "
                           + "producerThread to produce, sharedQueue's size= 0");
             sharedQueue.wait();
         }

       Thread.sleep((long)(Math.random() * 2000));
         System.out.println(Thread.currentThread().getName()+", CONSUMED : "+ message.get(sharedQueue.remove(0)));
         sharedQueue.notify();
     }
 }
 
}

public class MULTIPLE_ProducerConsumerWaitNotify {

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
   
  Producer producer0=new Producer(message,sharedQueue, 0);
  Consumer consumer0=new Consumer(message,sharedQueue);

     Thread producerThread0 = new Thread(producer0, "ProducerThread0");
     Thread consumerThread0 = new Thread(consumer0, "ConsumerThread0");
     producerThread0.start();
     consumerThread0.start();
     
     System.out.println("MID");
     
  Producer producer1=new Producer(message,sharedQueue, 1);
  Consumer consumer1=new Consumer(message,sharedQueue);

     Thread producerThread1 = new Thread(producer1, "ProducerThread1");
     Thread consumerThread1 = new Thread(consumer1, "ConsumerThread1");
     producerThread1.start();
     consumerThread1.start();
 }
}