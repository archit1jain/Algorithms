final class countingSemaphore extends Thread {
private selectablePort V, P;
private int permits;
public countingSemaphore(int initialPermits) {permits = initialPermits;}
public void P() { P.send();}
public void V() {V.send();}
public void run() {
try {
selectiveWait select = new selectiveWait();
select.add(P); // alternative1
select.add(V); // alternative 2
while(true) {
P.guard(permits>0);
V.guard(true);
switch (select.choose()) {
case 1: P.receive();
--permits;
break;
case 2: V.receive();
++permits;
break;
}
}
} catch (InterruptedException e) {}
}
}