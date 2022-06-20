package com.multithreading.sandbox.tutorials.callable_future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumObtainer {

    private final ExecutorService threadPool = Executors.newSingleThreadExecutor();

    private Double value1;
    private Double value2;

    public SumObtainer(Double value1, Double value2){
        this.value1 = value1;
        this.value2 = value2;
    }


    public Future<Double> calculateSum(){
        return threadPool.submit(()->{
            return value1+value2;
                }
                );
    }


}
