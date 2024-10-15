package org.example;

public abstract class Notify {
    private int priority;
    private Notify next;

    public Notify(int priority) {
        this.priority = priority;
    }

    public void setNext(Notify next) {
        this.next = next;
    }

    public abstract void send(String msg);

    public void notifyManager(String msg,int level){
        if (level>=priority)
            send(msg);
        if (next!=null)
            next.notifyManager(msg, level);
    }
}
