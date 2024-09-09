package org.example;


public class Main {
    public static void main(String[] args) {
        Runnable a = () -> {
            for(int i = 0; i < 6; i++){
                System.out.println("Hi");
                try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };
        Runnable b = () -> {
            for(int i = 0; i < 6; i++){
                System.out.println("Hello");
                try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
