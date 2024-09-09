package org.example;


class Table{
     synchronized public void Multiply(int n){
        for(int i = 0; i < 10; i++){
            System.out.println(i*n);
        }
    }
}

public class Main {
    Table t = new Table();
    public static void main(String[] args) {
        Runnable a = () -> {

            t.Multiply(7);
            for(int i = 0; i < 6; i++){
                System.out.println("Hi");
                try {Thread.sleep(1000);} catch (InterruptedException e) {throw new RuntimeException(e);}
            }
        };
        Runnable b = () -> {
            t.Multiply(10);
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
