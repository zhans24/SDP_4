package org.example.Handlers;

import org.example.Notify;

public class SMS extends Notify {

    public SMS(int priority) {
        super(priority);
    }

    @Override
    public void send(String msg) {
        System.out.println("SMS:"+msg);
    }
}
