package com.multithreading.sandbox.tutorials.conditions;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SyncAddMethod {

    List<Long> list = new ArrayList<>();

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition writeLock = lock.newCondition();


    int MAX_CAPACITY = 10;

    public void add(Long value){
        lock.lock();
        try{
            while(list.size()==MAX_CAPACITY){
                try{
                    writeLock.await();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            list.add(value);
            writeLock.signal();
        } finally{
            lock.unlock();
        }


    }



}
