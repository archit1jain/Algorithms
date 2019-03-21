final class Buffer extends Thread {
private link deposit, withdraw;
public Buffer (link deposit, link withdraw) { this.deposit = deposit;
this.withdraw = withdraw; }
public void run () {
while (true) {
Message m = ((Message) deposit.receive()); // message from
Producer
withdraw.send(m); // send message to Consumer
}
}
}