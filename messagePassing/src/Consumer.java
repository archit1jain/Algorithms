final class Consumer extends Thread {
private link withdraw;
public Consumer (link withdraw) { this.withdraw = withdraw; }
public void run () {
for (int i = 0; i<3; i++) {
Message m = (Message) withdraw.receive(); // message from
System.out.println("Consumed " + m.number);
}
}
}