
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ClassicProducerConsumer {
        public static class Producer implements Runnable {
                private BlockingQueue<Integer> queue;
                private int next = 0;
 
                public Producer(BlockingQueue<Integer> queue) {
                        this.queue = queue;
                }
 
                @Override
                public void run() {
                        while (true) {
                                try {
                                        queue.put(next);
                                } catch (InterruptedException e) {
                                }
                                next++;
                        }
                }
        }
        public static class Consumer implements Runnable {
                private BlockingQueue<Integer> queue;
 
                public Consumer(BlockingQueue<Integer> queue) {
                        this.queue = queue;
                }
 
                @Override
                public void run() {
                        while (true) {
                                synchronized (queue) {
                                        Integer next;
                                        try {
                                                next = queue.take();
                                                System.out.println(next);
                                        } catch (InterruptedException e) {
                                        }
                                }
                        }
                }
        }
 
        public static void main(String args[]) throws Exception {
                BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(1);
                Thread producer1 = new Thread(new Producer(queue));
                Thread producer2 = new Thread(new Producer(queue));
                Thread consumer1 = new Thread(new Consumer(queue));
                Thread consumer2 = new Thread(new Consumer(queue));
                producer1.start();
                producer2.start();
                consumer1.start();
                consumer2.start();
        }
}