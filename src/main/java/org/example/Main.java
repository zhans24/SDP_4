package org.example;

import org.example.Handlers.Push;
import org.example.Handlers.SMS;

public class Main {
    public static void main(String[] args) {
        Notify handler=new Push(Priority.SIMPLE);
        handler.setNext(new SMS(Priority.IMPORTANT));

        handler.notifyManager("hello", Priority.ASAP);
    }
}