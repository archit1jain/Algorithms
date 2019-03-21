public abstract class channel {
public abstract void send(Object m); // send a message object
public abstract void send(); // acts as a signal to the receiver
public abstract Object receive(); // receive an object.
}

