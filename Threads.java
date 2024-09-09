package org.example;

public class A extends Thread {
    public void run() {
        for(int i = 0; i < 6; i++){
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

public class B extends Thread {
    public void run() {
        for(int i = 0; i < 8; i++){
            System.out.println("Hello");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
