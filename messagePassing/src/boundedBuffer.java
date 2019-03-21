import java.util.*;
import java.util.function.Consumer;
public final class boundedBuffer {
public static void main (String args[]) {
link deposit = new link(); link withdraw = new link();
Producer producer = new Producer(deposit);
Consumer consumer = new Consumer(withdraw);
Buffer buffer = new Buffer(deposit,withdraw);
// buffer will be terminated when producer and consumer are finished
buffer.setDaemon(true); buffer.start();
producer.start(); consumer.start();
}
}