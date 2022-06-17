package com.multithreading.sandbox.tutorials.thread.waitAndNotify;

public class MainThread {

    public static void main(String[] args) {

        Object syncThreadObj = new Object();


        new Thread(()-> {

            synchronized(syncThreadObj){

                try {
                    System.out.println(Thread.currentThread().getName() +" on the loose!");
                    syncThreadObj.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println(Thread.currentThread().getName() +" on the loose again!");
        }).start();


    try{
        Thread.sleep(100);
    } catch (InterruptedException e){
        e.printStackTrace();
    }


    new Thread(()->{
        synchronized(syncThreadObj){
            System.out.println(Thread.currentThread().getName() +" on the loose!");
            syncThreadObj.notify();
        }

    }).start();


    }



}
