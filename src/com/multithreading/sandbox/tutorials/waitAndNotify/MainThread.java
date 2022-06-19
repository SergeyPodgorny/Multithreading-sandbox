package com.multithreading.sandbox.tutorials.waitAndNotify;

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





    new Thread(()->{
        synchronized(syncThreadObj){
            System.out.println(Thread.currentThread().getName() +" on the loose!");
            syncThreadObj.notify();
        }

    }).start();


    }



}
