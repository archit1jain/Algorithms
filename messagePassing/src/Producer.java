final class Producer extends Thread {
        private link deposit;
        public Producer (link deposit) { this.deposit = deposit; }
        public void run () {
        for (int i = 0; i<3; i++) {
        System.out.println("Produced " + i);
        deposit.send(new
        Message(i));
        }
        }
}