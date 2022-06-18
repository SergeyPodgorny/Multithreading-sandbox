package com.multithreading.sandbox.tutorials.thread.locks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTutorial {

    static final ReentrantLock lock = new ReentrantLock();

    static Runnable sharedTask = ()->{

        lock.lock();

         try {
             try {
                 System.out.println("{");
                 Thread.sleep(100);
             } catch (InterruptedException e){
                 e.printStackTrace();
             }

             System.out.println("}");
         } finally{
             lock.unlock();
         }

    };


    public static void main(String[] args) {


        new Thread(sharedTask).start();

        new Thread(sharedTask).start();


    }


}
