package org.example.Handlers;

import org.example.Notify;

public class Push extends Notify {

    public Push(int priority) {
        super(priority);
    }

    @Override
    public void send(String msg) {
        System.out.println("Push:"+msg);
    }
}
