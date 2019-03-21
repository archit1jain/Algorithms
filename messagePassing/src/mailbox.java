import java.util.concurrent.Semaphore;
public class mailbox extends channel {
private Object message = null;
private final Object sending = new Object();
private final Object receiving = new Object();
private final binarySemaphore sent = new binarySemaphore(0);
private final binarySemaphore received = new binarySemaphore(0);
public final void send(Object sentMsg) {
if (sentMsg == null) {throw new
NullPointerException("Null message passed to send()");
}
synchronized (sending) {
message = sentMsg;
sent.V(); // signal that the message is available
received.P(); // wait until the message is received
}
}
public final void send() {
synchronized (sending) {
message = new Object();// send a null message
sent.V(); // signal that message is available
received.P(); // wait until the message is received
}
}
public final Object receive() {
Object receivedMessage = null;
synchronized (receiving) {
sent.P(); // wait for message to be sent
receivedMessage = message;
received.V(); // signal the sender that the message has
} // been received
return receivedMessage;
        }
}